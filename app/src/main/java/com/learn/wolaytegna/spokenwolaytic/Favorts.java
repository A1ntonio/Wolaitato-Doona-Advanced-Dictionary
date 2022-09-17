package com.learn.wolaytegna.spokenwolaytic;

public class Favorts {
   String english, wolaytegna;
   int image_id;


    public Favorts(String english, String wolaytegna, int image_id) {
        this.english = english;
        this.wolaytegna = wolaytegna;
        this.image_id = image_id;
    }

    public int getImage_id() {
        return image_id;
    }

    public void setImage_id(int image_id) {
        this.image_id = image_id;
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
}
