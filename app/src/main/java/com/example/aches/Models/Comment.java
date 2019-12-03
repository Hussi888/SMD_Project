package com.example.aches.Models;

public class Comment {
    public String commentID;
    public String userID;
    public String questionID;
    public String commentText;

    public Comment(String _commentID, String _userID, String _questionID, String _commentText) {
        commentID = _commentID;
        userID = _userID;
        questionID = _questionID;
        commentText = _commentText;
    }
}
