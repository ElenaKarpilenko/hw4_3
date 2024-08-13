package com.example.hw4_3;


import java.io.Serializable;

public class DoDo implements Serializable {
    private String image;
    private String name;

    public DoDo(String image, String name) {
        this.image = image;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
