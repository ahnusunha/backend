package knu.jongp1.crm.controller;

import knu.jongp1.crm.service.ShopService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShopController {

    private final ShopService shopService;

    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }
    @GetMapping("/shops")
    public String getShops(Model model) {
        model.addAttribute("shops", shopService.getAllShops());
        return "ShopList";
    }
}
