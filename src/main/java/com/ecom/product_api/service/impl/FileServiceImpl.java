package com.ecom.product_api.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.ecom.product_api.dto.CommonFileSavedBinaryDataDto;
import com.ecom.product_api.service.FileService;

@Service
public class FileServiceImpl implements FileService {

    @Override
    public CommonFileSavedBinaryDataDto create(MultipartFile file, String directory, String bucket) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public void delete(String directory, String fileName, String bucket) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
