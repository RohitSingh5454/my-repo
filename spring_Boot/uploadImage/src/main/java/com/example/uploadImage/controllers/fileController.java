package com.example.uploadImage.controllers;

import com.example.uploadImage.payLoad.FileResponse;
import com.example.uploadImage.services.fileService;
import com.example.uploadImage.services.impl.fileServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/file")
public class fileController {
    @Autowired
    fileServiceImpl fileService;
    @Value("${project.image}")
    private String path;
    @PostMapping("/upload")
    public ResponseEntity<FileResponse> fileUpload(@RequestParam("image") MultipartFile images) {
        String fileName= null;
        try {
            fileName = this.fileService.uploadImage(path,images);
        } catch (IOException e) {
            return new ResponseEntity<>
                    (new FileResponse(null,"Image is not uploaded successfully"),HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(new FileResponse(fileName,"Images successfully update"),
                 HttpStatus.OK);
    }
}
