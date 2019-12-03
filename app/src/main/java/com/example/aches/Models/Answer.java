package com.example.aches.Models;

import java.util.List;

public class Answer {
    public String answerID;
    public String questionID;
    public String answerText;
    public int upvotes;
    public int downvotes;
    public List<String> images;

    public Answer(String _answerID, String _questionID, String _answerText) {
        answerID = _answerID;
        questionID = _questionID;
        answerText = _answerText;
        upvotes = 0;
        downvotes = 0;
    }
}
