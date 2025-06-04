package com.example.uploadImage.services.impl;

import com.example.uploadImage.services.fileService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;

@Service
public class fileServiceImpl implements fileService {
    @Override
    public String uploadImage(String path, MultipartFile file) throws IOException {

        // file name
        String name=file.getOriginalFilename();


        String randomUUid= UUID.randomUUID().toString();
        String fileName1=randomUUid.concat(name.substring(name.lastIndexOf(".")));


        //full path
        String filePath=path+ File.separator+fileName1;



        //create folder if not created
        File file1=new File(path);
        if (!file1.exists()){
            file1.mkdir();
        }
        Files.copy(file.getInputStream(), Paths.get(filePath));
        return name;
    }
}
