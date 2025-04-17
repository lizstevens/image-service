package com.example.image_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@RestController
@RequestMapping("/api/images")
public class ImageController {
    @Autowired
    private ImageService imageService;

    @GetMapping("/test")
    public String test() {
        return "Hello";
    }

    // Method to call service handler for fetching and saving images
    @PostMapping
    public ResponseEntity<?> fetchAndSaveImages(@RequestParam String imageType, @RequestParam int count) {
        try {
            List<Image> images = imageService.fetchImages(imageType, count);
            imageService.saveImages(images);        
            return ResponseEntity.ok(images);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());        
        }
    }

    // Method for calling repo getting the latest saved image from DB 
    @GetMapping("/latest")
    public ResponseEntity<?> fetchLatest() {
        try {
            Image image = imageService.fetchLatest();
            if (image != null) {
                return ResponseEntity.ok(image);
            }
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("No images");  
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());  
        }
    }
    

}