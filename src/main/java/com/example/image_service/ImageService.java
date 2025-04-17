package com.example.image_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class ImageService {
    @Autowired
    private ImageRepository imageRepository;

    @Autowired RestTemplate restTemplate;

    private String CAT_API = "https://api.thecatapi.com/v1/images/search";
    private String DOG_API = "https://api.thedogapi.com/v1/images/search";


    public List<Image> fetchImages(String imageType, int count) {
        List<Image> imageObjectArray = new ArrayList<>();
        String url = "";

        if (imageType.equalsIgnoreCase("cat")) {
            url = CAT_API;
        } else if (imageType.equalsIgnoreCase("dog")) {
            url = DOG_API;
        } else {
            throw new IllegalArgumentException("Invalid imageType provided. Please use 'cat' or 'dog'.");
        }

        for(int i = 0; i < count; i++) {
            Image[] images = restTemplate.getForObject(url, Image[].class);
            imageObjectArray.add(images[0]);
        }
        
        return imageObjectArray;
    }

    public void saveImages(List<Image> images) {
        for (Image image : images) {
            imageRepository.save(image);        
        }
    }

    public Image fetchLatest() {
        return imageRepository.findTopByOrderByIdDesc().orElse(null);
    }
}