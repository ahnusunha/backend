package knu.jongp1.crm.controller;

import knu.jongp1.crm.entity.Product;
import knu.jongp1.crm.entity.MemberLog;
import knu.jongp1.crm.entity.PurchaseLog;
import knu.jongp1.crm.service.MemberLogService;
import knu.jongp1.crm.service.PurchaseLogService;
import knu.jongp1.crm.service.ProductService; // ProductService 임포트
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/database")
public class ApiController {

    private final MemberLogService memberLogService;
    private final PurchaseLogService purchaseLogService;
    private final ProductService productService; // ProductService 추가

    public ApiController(MemberLogService memberLogService, PurchaseLogService purchaseLogService, ProductService productService) {
        this.memberLogService = memberLogService;
        this.purchaseLogService = purchaseLogService;
        this.productService = productService; // 주입받은 ProductService 초기화
    }

    @GetMapping("/member-log")
    public List<MemberLog> getMemberLogs() {
        return memberLogService.getAllMemberLogs();
    }

    @GetMapping("/purchase-log")
    public List<PurchaseLog> getPurchaseLogs() {
        return purchaseLogService.getAllPurchaseLogs();
    }

    @GetMapping("/purchase-log/{memberId}")
    public List<PurchaseLog> getPurchaseLogsByMemberId(@PathVariable Long memberId) {
        return purchaseLogService.getPurchaseLogsByMemberId(memberId);
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getAllProducts(); // 모든 상품을 반환
    }

}
