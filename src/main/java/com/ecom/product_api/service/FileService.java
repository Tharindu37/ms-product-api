package com.ecom.product_api.service;

import java.io.IOException;
import java.sql.SQLException;

import org.springframework.web.multipart.MultipartFile;

import com.ecom.product_api.dto.CommonFileSavedBinaryDataDto;

public interface FileService {
    public CommonFileSavedBinaryDataDto create(MultipartFile file, String directory, String bucket) throws IOException, SQLException;
    public void delete(String directory, String fileName, String bucket);
}
