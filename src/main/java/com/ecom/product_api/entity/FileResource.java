package com.ecom.product_api.entity;

import java.sql.Blob;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Embeddable
public class FileResource {
    @Lob
    private Blob hash;
    @Lob
    private Blob fileName;
    @Lob
    private Blob resourceUrl;
    @Lob
    private Blob directory;
}
