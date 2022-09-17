package com.learn.wolaytegna.spokenwolaytic;

public class Categories {
    String english, wolaytegna;
    Integer imUrl;


    public Categories(String english, String wolaytegna, Integer imUrl) {
        this.english = english;
        this.wolaytegna = wolaytegna;
        this.imUrl = imUrl;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getWolaytegna() {
        return wolaytegna;
    }

    public void setWolaytegna(String wolaytegna) {
        this.wolaytegna = wolaytegna;
    }

    public Integer getImUrl() {
        return imUrl;
    }

    public void setImUrl(Integer imUrl) {
        this.imUrl = imUrl;
    }
}
