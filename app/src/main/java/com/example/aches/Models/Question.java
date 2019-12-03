package com.example.aches.Models;

import java.util.List;

public class Question {
    public String questionID;
    public String userID;
    public String questionTitle;
    //public String questionDescp;
    public String category;
    public int upvotes;
    public int downvotes;
    private List<User> requested;
    List<Answer> answers;

    public Question(String _questionID, String _userID, String _questionTitle, String _category) {
        questionID = _questionID;
        userID = _userID;
        questionTitle = _questionTitle;
        //questionDescp  =_questionDescp;
        category = _category;
        upvotes = 0;
        downvotes = 0;
    }
}

