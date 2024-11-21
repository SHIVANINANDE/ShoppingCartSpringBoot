package com.springbootproject.ShoppingCart.dto;

import com.springbootproject.ShoppingCart.model.Product;

import java.math.BigDecimal;

public class CartItemDto {
    private Long itemId;
    private Integer quantity;
    private BigDecimal unitPrice;
    private ProductDto product;
}