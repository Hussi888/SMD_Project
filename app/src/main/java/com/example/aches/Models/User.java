package com.example.aches.Models;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class User {
    public String userID;
    public String name;
    public String email;
    public String password;
    public String displayPicture;
    public String country;
    public String dateOfBirth;
    List<Badge> badges;
    List<Question> questions;
    List<User> followers;
    List<User> following;

    public User(String _userID, String _name, String _email, String _password) {
        userID = _userID;
        name = _name;
        email = _email;
        password = _password;
    }

    void setDisplayPicture(String _displayPicture) {
        displayPicture = _displayPicture;
    }

    void setCountry(String _country) {
        country = _country;
    }

    void setDateOfBirth(String _dateOfBirth) {
        dateOfBirth = _dateOfBirth;
    }

    void AddBadge(Badge _badge) {
        if (badges == null)
            badges = new ArrayList<Badge>();

        badges.add(_badge);
    }

    void addQuestion(Question userQuestion) {
        if (questions != null) {
            questions = new ArrayList<>();
        }
        questions.add(userQuestion);
    }

}
