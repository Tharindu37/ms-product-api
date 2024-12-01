package com.ecom.product_api.dto.response.paginate;

import java.util.List;

import com.ecom.product_api.dto.response.ResponseProductDto;

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
public class ResponseProductPaginate {
    private long count;
    private List<ResponseProductDto> dataList;
}
