package com.titan.models.appicons;

import java.io.Serializable;

public class TextData implements Serializable {
    public static class FastTrackData implements Serializable {
        private String name;
        private String content;

        // Getters and setters for FastTrackData
    }

    private FastTrackData fastrack;

    // Getter and setter for the main field

    @Override
    public String toString() {
        return "TextData{" +
                "fastrack=" + fastrack +
                '}';
    }
}
