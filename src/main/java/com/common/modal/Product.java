package com.common.modal;

import lombok.*;



@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class Product {
    private Long id;
    private String name;
    private Integer price;
}
