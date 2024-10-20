package knu.jongp1.crm.controller;

import knu.jongp1.crm.entity.Shop;
import knu.jongp1.crm.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/shops")
public class ShopController {

    @Autowired
    private ShopService shopService;

    // 모든 쇼핑몰 정보를 조회하여 HTML 페이지에 전달
    @GetMapping
    public String getAllShops(Model model) {
        List<Shop> shops = shopService.getAllShops();
        model.addAttribute("shops", shops);
        return "ShopList"; // ShopList.html을 반환
    }

    // 특정 쇼핑몰 ID로 조회하는 엔드포인트
    @GetMapping("/{id}")
    public Shop getShopById(@PathVariable Long id) {
        return shopService.getShopById(id);
    }
}
