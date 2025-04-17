package com.example.image_service;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Document ( collection = "images")
public class Image {
    @Id
    @JsonIgnore
    private String id;

    private String url;

    public Image() {}
    
    public Image(String id, String url) {
        this.id = id;
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() { 
        return url; 
    } 

    public void setUrl(String url) { 
        this.url = url; 
    }

}
