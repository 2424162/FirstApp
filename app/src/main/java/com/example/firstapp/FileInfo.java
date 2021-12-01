package com.example.firstapp;

public class FileInfo {
    private String name;
    private String size;
    private int imgId;

    public  FileInfo(String name,String size,int imgId){
        this.name = name;
        this.size = size;
        this.imgId = imgId;

    }
    public String getName(){
        return name;
    }
    public String getSize(){
        return size;
    }
    public int getImgId(){
        return imgId;
    }

}

