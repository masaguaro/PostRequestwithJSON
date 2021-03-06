package com.learntodroid.postrequestwithjson;

import com.google.gson.annotations.SerializedName;

public class Comment {
    @SerializedName("title")
    private String title;

    @SerializedName("comment")
    private String comment;

    @SerializedName("author")
    private String author;

    public Comment(String title, String comment, String author) {
        this.title = title;
        this.comment = comment;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getComment() {
        return comment;
    }

    public String getAuthor() {
        return author;
    }
}
