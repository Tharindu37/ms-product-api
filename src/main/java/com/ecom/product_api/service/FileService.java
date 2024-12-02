package com.ecom.product_api.service;

import org.springframework.web.multipart.MultipartFile;

import com.ecom.product_api.dto.CommonFileSavedBinaryDataDto;

public interface FileService {
    public CommonFileSavedBinaryDataDto create(MultipartFile file, String directory, String bucket);
    public void delete(String directory, String fileName, String bucket);
}
