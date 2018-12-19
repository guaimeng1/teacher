package com.tt.teacher.pojo;

import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

public class User implements Serializable{
    private String name;
    private MultipartFile filePhoto;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MultipartFile getFilePhoto() {
        return filePhoto;
    }

    public void setFilePhoto(MultipartFile filePhoto) {
        this.filePhoto = filePhoto;
    }

}
