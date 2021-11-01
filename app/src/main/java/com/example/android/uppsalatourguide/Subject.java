package com.example.android.uppsalatourguide;

public class Subject {

    private final String subject;
    private final int imageId;

    public Subject(String subject, int imageId) {
        this.subject = subject;
        this.imageId = imageId;
    }

    public String getSubject() {
        return subject;
    }

    public int getImageId() {
        return imageId;
    }
}
