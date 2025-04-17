package com.example.image_service;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ImageServiceTest {
    @Mock
    private ImageRepository imageRepository;

    @InjectMocks
    private ImageService imageService;

    @Test
    public void testSaveImages_valid_and_success() {
        List<Image> images = List.of(new Image(null, "https://cdn2.thedogapi.com/images/Qyu31V_J-.jpg"));
        imageService.saveImages(images);
        verify(imageRepository, times(1)).save(images.get(0));
    }

    @Test
    public void testSaveImages_empty_and_success() {
        List<Image> images = new ArrayList<>();
        imageService.saveImages(images);
        verify(imageRepository, times(0)).save(any(Image.class));
    }

    @Test
    public void testSaveImages_repo_ThrowsException() {
        List<Image> images = List.of(new Image("1", "http://example.com/cat.jpg"));
        when(imageRepository.save(any(Image.class))).thenThrow(new RuntimeException("Database error"));
        assertThrows(RuntimeException.class, () -> {
            imageService.saveImages(images);
        });
        verify(imageRepository, times(1)).save(images.get(0)); 
    }


}
