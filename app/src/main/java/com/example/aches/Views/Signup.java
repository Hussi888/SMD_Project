package com.example.aches.Views;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.aches.R;
import com.example.aches.Models.User;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;

public class Signup extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private FirebaseDatabase mDatabase;
    private static final String TAG = "Signup";
    EditText name;
    EditText email;
    EditText password;
    Button signUpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup);

        //XML Initialising
        name = findViewById(R.id.name_layout_sign_up);
        email = findViewById(R.id.email_layout_sign_up);
        password = findViewById(R.id.password_layout_sign_up);
        signUpBtn = findViewById(R.id.submitBtn_layout_sign_up);

        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();

        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createAccount(email.getText().toString(), password.getText().toString());
            }
        });

    }
    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        updateUI(currentUser);
    }
    public void createAccount(String email, String password) {
        final String email_final = email;
        final String password_final = password;
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d(TAG, "createUserWithEmail:success");
                            FirebaseUser user = mAuth.getCurrentUser();
                            User currentUser = new User(name.getText().toString(),email_final, password_final);
                            mDatabase = FirebaseDatabase.getInstance();
                            mDatabase.getReference("Users")
                                    .child(mAuth.getCurrentUser().getUid())
                                    .setValue(currentUser)
                                     .addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {
                                    if  (task.isSuccessful()) {
                                        Toast.makeText(getApplicationContext(), "Registration Successful.",
                                                Toast.LENGTH_SHORT).show();
                                    }
                                    else
                                        Toast.makeText(getApplicationContext(), "Registration Failed.",
                                                Toast.LENGTH_SHORT).show();
                                }
                            });
                            updateUI(user);
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w(TAG, "createUserWithEmail:failure", task.getException());
                            Toast.makeText(getApplicationContext(), "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                            updateUI(null);
                        }

                        // ...
                    }
                });
    }
    public void sign_in_page(View view)
    {
        startActivity(new Intent(this,Login.class));
    }
    public void proceed(View view) { startActivity(new Intent(this,Home.class)); }
    //Change UI according to user data.
    public void  updateUI(FirebaseUser account){
        if(account != null){
            Toast.makeText(this,"Loged In successfully",Toast.LENGTH_LONG).show();
            startActivity(new Intent(this, MainScreen.class));
        }
        else {
            Toast.makeText(this,"Log In failed",Toast.LENGTH_LONG).show();
        }
    }

}
