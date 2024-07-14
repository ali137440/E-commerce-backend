package com.Haider.ECommerce.controller;

import com.Haider.ECommerce.model.Image;
import com.Haider.ECommerce.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

import static org.springframework.http.MediaType.MULTIPART_FORM_DATA_VALUE;

@CrossOrigin("*")
@RestController
@RequestMapping("/image")
public class ImageController {
    @Autowired
    private ImageService imageRepository;

//    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/uploadImage", consumes = {MULTIPART_FORM_DATA_VALUE})
    public ResponseEntity<Image> uploadImage(@RequestParam("file") MultipartFile file) throws IOException {
        Image image = new Image();
        image.setImageName(file.getOriginalFilename());
        image.setImageData(file.getBytes());
        Image save = imageRepository.save(image);
        return ResponseEntity.ok(save);

    }

    @GetMapping("/gatImage/{imageName}")
//    @CrossOrigin(origins = "http://localhost:4200")
    public Image gatImageName(@PathVariable("imageName") String imageName) {
        return imageRepository.findByImageName(imageName);
    }
}
