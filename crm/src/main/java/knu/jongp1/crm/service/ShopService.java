package knu.jongp1.crm.service;

import knu.jongp1.crm.entity.Shop;
import knu.jongp1.crm.repository.ShopRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopService {

    private final ShopRepository shopRepository;

    public ShopService(ShopRepository shopRepository) {
        this.shopRepository = shopRepository;
    }

    public List<Shop> getAllShops() {
        return shopRepository.findAll();
    }
}
