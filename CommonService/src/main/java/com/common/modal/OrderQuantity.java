package com.common.modal;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderQuantity {
    Integer quantityId;
    public Product product;
    public Integer quantity;
}
