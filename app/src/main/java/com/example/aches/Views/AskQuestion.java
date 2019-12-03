package com.example.aches.Views;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.aches.Models.Category;
import com.example.aches.Models.Question;
import com.example.aches.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AskQuestion extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private FirebaseDatabase mDatabase;
    Spinner dropdown;
    String categorySelected;
    String questionString;
    Question ask_question;
    EditText askEdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_question);

        //Set XML
        Button askBtn = findViewById(R.id.AskBtn_layout_ask_question);
        askEdt = findViewById(R.id.AskEdt_layout_ask_question);

        Category categories = Category.getInstance();
        //get the spinner from the xml.
        dropdown = findViewById(R.id.spinner1);
        dropdown.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, categories.categoriesList));

        //Add question to firebase
        mAuth = FirebaseAuth.getInstance();
        mDatabase = FirebaseDatabase.getInstance();

        askBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                questionString = askEdt.getText().toString();
                getCategory();

                if (questionString != null && categorySelected != null) {

                    ask_question = new Question(mDatabase.getReference("Questions").getKey(), mAuth.getCurrentUser().getUid(), questionString, categorySelected);

                    DatabaseReference ref = mDatabase.getReference("Users");
                    
                    mDatabase.getReference("Questions")
                            .child(mAuth.getCurrentUser().getUid())
                            .setValue(ask_question)
                            .addOnCompleteListener(new OnCompleteListener<Void>() {
                                    @Override
                                    public void onComplete(@NonNull Task<Void> task) {
                                  if (task.isSuccessful()) {
                                      Toast.makeText(getApplicationContext(), "Question Added.",
                                              Toast.LENGTH_SHORT).show();
                                            updateUI();
                                  }
                                  else
                                            Toast.makeText(getApplicationContext(), "Question Not Added.",
                                                    Toast.LENGTH_SHORT).show();
                                    }
                            });
                }
                else
                    Toast.makeText(getApplicationContext(), "Wrong Input.",
                                Toast.LENGTH_SHORT).show();
            }
        });

    }

    //Change UI according to user data.
    public void  updateUI(){
        if(ask_question != null){
            Toast.makeText(this,"Asked question successfully",Toast.LENGTH_LONG).show();
            startActivity(new Intent(this, Answer.class));
        }
        else {
            Toast.makeText(this,"Question failed",Toast.LENGTH_LONG).show();
        }
    }

    public String getCategory() {

        dropdown.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                categorySelected = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //Another interface callback
                categorySelected = null;
            }
        });
        return categorySelected;
    }


}
