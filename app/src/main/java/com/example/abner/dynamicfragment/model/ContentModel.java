package com.example.abner.dynamicfragment.model;

import java.io.Serializable;

/**
 * Created by Abner on 15/8/6.
 * QQ 230877476
 * Email nimengbo@gmail.com
 */
public class ContentModel implements Serializable {

    private static final long serialVersionUID = -26005291063869005L;

    private int postion;

    private String content;

    public int getPostion() {
        return postion;
    }

    public void setPostion(int postion) {
        this.postion = postion;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
