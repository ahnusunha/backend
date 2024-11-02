package knu.jongp1.crm.service.impl;

import knu.jongp1.crm.entity.Product;
import knu.jongp1.crm.repository.ProductRepository;
import knu.jongp1.crm.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll(); // 모든 상품을 반환
    }
}
