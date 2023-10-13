package com.titan.models.appicons;

import java.io.Serializable;

public class AppIconConfiguration implements Serializable {

    private FastTrackData icon1;
    private FastTrackData icon2;
    private FastTrackData text1;

    public FastTrackData getIcon1() {
        return icon1;
    }

    public void setIcon1(FastTrackData icon1) {
        this.icon1 = icon1;
    }

    public FastTrackData getIcon2() {
        return icon2;
    }

    public void setIcon2(FastTrackData icon2) {
        this.icon2 = icon2;
    }

    public FastTrackData getText1() {
        return text1;
    }

    public void setText1(FastTrackData text1) {
        this.text1 = text1;
    }



}
class FastTrackData implements Serializable {
    private FastTrack fastrack;

    public FastTrack getFastrack() {
        return fastrack;
    }

    public void setFastrack(FastTrack fastrack) {
        this.fastrack = fastrack;
    }
}

