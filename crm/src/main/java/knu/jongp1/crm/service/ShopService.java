package knu.jongp1.crm.service;

import knu.jongp1.crm.entity.Shop;
import knu.jongp1.crm.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopService {

    @Autowired
    private ShopRepository shopRepository;

    // 모든 쇼핑몰을 조회하는 메서드
    public List<Shop> getAllShops() {
        return shopRepository.findAll();
    }

    // 특정 ID로 쇼핑몰을 조회하는 메서드
    public Shop getShopById(Long id) {
        return shopRepository.findById(id).orElse(null);
    }
}
