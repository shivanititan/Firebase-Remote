package com.titan.models.appicons;

import java.io.Serializable;

public class AppIconConfiguration implements Serializable {

    private FastrackConfigurationData icon1;
    private FastrackConfigurationData icon2;
    private FastrackConfigurationData text1;

    public FastrackConfigurationData getIcon1() {
        return icon1;
    }
    public void setIcon1(FastrackConfigurationData icon1) {
        this.icon1 = icon1;
    }

    public FastrackConfigurationData getIcon2() {
        return icon2;
    }

    public void setIcon2(FastrackConfigurationData icon2) {
        this.icon2 = icon2;
    }

    public FastrackConfigurationData getText1() {
        return text1;
    }

    public void setText1(FastrackConfigurationData text1) {
        this.text1 = text1;
    }

}
class FastrackConfigurationData implements Serializable {
    private FastrackConfiguration fastrack;

    public FastrackConfiguration getFastrack() {
        return fastrack;
    }

    public void setFastrack(FastrackConfiguration fastrack) {
        this.fastrack = fastrack;
    }
}

