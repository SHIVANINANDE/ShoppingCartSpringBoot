package com.springbootproject.ShoppingCart.repository;

import com.springbootproject.ShoppingCart.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    void deleteAllByCartId(Long id);
}