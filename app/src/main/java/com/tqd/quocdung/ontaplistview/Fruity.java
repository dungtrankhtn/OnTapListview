package com.tqd.quocdung.ontaplistview;

/**
 * Created by Lep on 8/16/2017.
 */

public class Fruity {
    private int postition;
    private String name, decription;

    public Fruity(int postition, String name, String decription) {
        this.postition = postition;
        this.name = name;
        this.decription = decription;
    }

    public int getPostition() {
        return postition;
    }

    public void setPostition(int postition) {
        this.postition = postition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }
}
