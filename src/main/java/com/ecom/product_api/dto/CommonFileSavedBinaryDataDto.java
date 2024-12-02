package com.ecom.product_api.dto;

import java.sql.Blob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonFileSavedBinaryDataDto {
    private Blob hash;
    private Blob fileName;
    private Blob resourceUrl;
    private Blob directory;
}
