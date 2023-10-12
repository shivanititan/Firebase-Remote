package com.titan.models.appicons;

import java.io.Serializable;

public class RootData implements Serializable {
    private IconData icon1;
    private IconData icon2;
    private TextData text1;

    // Getters and setters for the main fields

    @Override
    public String toString() {
        return "RootData{" +
                "icon1=" + icon1 +
                ", icon2=" + icon2 +
                ", text1=" + text1 +
                '}';
    }
}
