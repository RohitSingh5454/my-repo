package com.example.uploadImage.services;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public interface fileService {
   String uploadImage(String path, MultipartFile file) throws IOException;
}
