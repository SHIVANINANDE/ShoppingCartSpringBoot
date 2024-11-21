package com.springbootproject.ShoppingCart.repository;

import com.springbootproject.ShoppingCart.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
    Cart findByUserId(Long userId);
}