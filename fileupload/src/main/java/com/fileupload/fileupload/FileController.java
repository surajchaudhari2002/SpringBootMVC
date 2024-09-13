package com.fileupload.fileupload;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
@RestController

public class FileController {
    @Value("${location}")
    String location;

    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile (@RequestParam("file") MultipartFile file){
        if(file.isEmpty()){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("File Not Found..!");
        }


        try {
            String filepath=location+ "" +File.separator + file.getOriginalFilename();
            File dest=new File(filepath);
            file.transferTo(dest);

            return ResponseEntity.ok("File uploaded Succesfully..!"+ file.getOriginalFilename());
        } catch (IOException e) {
            e.getStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("file upload Failed");
        }

    }

}
