package com.project.shopapp.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {
    String storeFile(MultipartFile file) throws IOException;
}