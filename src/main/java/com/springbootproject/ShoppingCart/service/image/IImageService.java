package com.springbootproject.ShoppingCart.service.image;

import com.springbootproject.ShoppingCart.dto.ImageDto;
import com.springbootproject.ShoppingCart.model.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IImageService {
    Image getImageById(Long id);
    void deleteImageById(Long id);
    List<ImageDto> saveImages(Long productId, List<MultipartFile> files);
    void updateImage(MultipartFile file,  Long imageId);
}