package com.ecom.product_api.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.ecom.product_api.dto.request.RequestProductDto;
import com.ecom.product_api.dto.response.ResponseProductDto;
import com.ecom.product_api.dto.response.paginate.ResponseProductPaginate;
import com.ecom.product_api.service.ProductService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{

    @Override
    public void createProduct(RequestProductDto dto, MultipartFile file) {
        
    }

    @Override
    public void updateProduct(RequestProductDto dto, String productId) {
       
    }

    @Override
    public void deleteProduct(String productId) {
        
    }

    @Override
    public ResponseProductDto findProductById(String productId) {
        
    }

    @Override
    public ResponseProductPaginate searchAllProducts(String searchText, int page, int size) {
        
    }

    @Override
    public void updateImage(String imageId, MultipartFile file) {
        
    }

    @Override
    public void deleteImage(String imageId) {
        
    }

}
