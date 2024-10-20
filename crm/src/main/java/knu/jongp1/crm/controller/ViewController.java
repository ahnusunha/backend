package knu.jongp1.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/shops")
    public String showShopListPage() {
        // ShopList.html 파일을 반환
        return "ShopList"; // templates/ShopList.html
    }
}

