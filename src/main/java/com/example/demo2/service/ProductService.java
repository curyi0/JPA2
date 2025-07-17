package com.example.demo2.service;

import com.example.demo2.entity.Product;
import com.example.demo2.repository.ProductRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ProductService {

    private final ProductRepository productRepository;
    /**
     * 컨트롤러에서 Product 객체를 받아 DB에 저장하는 로직을 수행합니다.
     */
    @Transactional
    public Product createProduct(Product product) {
        // A. ID 중복 방지 및 의도 명확화
        if (product.getId() != null && productRepository.existsById(product.getId())) {
            throw new IllegalArgumentException("이미 존재하는 상품 Id입니다: "+ product.getId());
        }

        // B. 데이터 저장 및 ID 자동 생성 발생
        return productRepository.save(product);
    }



    // 전체 상품 조회
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}