package com.nasr.orderservice.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DecreaseProductQuantityRequest {

    private Long productId;
    private Long productNumber;
}
