package com.xulu.common.dto;

import java.awt.image.BufferedImage;

public class ImageCode {

    BufferedImage image;//图片
    String sRand;//随机数

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public String getsRand() {
        return sRand;
    }

    public void setsRand(String sRand) {
        this.sRand = sRand;
    }
}