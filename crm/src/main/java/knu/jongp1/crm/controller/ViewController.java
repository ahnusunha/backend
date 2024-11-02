package knu.jongp1.crm.controller;

import knu.jongp1.crm.entity.MemberLog;
import knu.jongp1.crm.entity.PurchaseLog;
import knu.jongp1.crm.service.MemberLogService;
import knu.jongp1.crm.service.PurchaseLogService;
import org.springframework.stereotype.Controller; // @Controller로 변경
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable; // PathVariable 추가
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller // 웹 페이지를 반환하는 컨트롤러
@RequestMapping("/views") // 뷰에 대한 경로를 설정
public class ViewController {

    private final MemberLogService memberLogService;
    private final PurchaseLogService purchaseLogService; // PurchaseLogService 추가

    public ViewController(MemberLogService memberLogService, PurchaseLogService purchaseLogService) {
        this.memberLogService = memberLogService;
        this.purchaseLogService = purchaseLogService; // PurchaseLogService 주입
    }

    @GetMapping("/member-log") // HTML 페이지를 반환하는 메서드
    public String getMemberLogsView(Model model) {
        List<MemberLog> memberLogs = memberLogService.getAllMemberLogs();
        model.addAttribute("memberLogs", memberLogs);
        return "member-log"; // HTML 뷰를 반환
    }

    @GetMapping("/purchase-log") // 구매 로그 HTML 페이지를 반환하는 메서드
    public String getPurchaseLogsView(Model model) {
        List<PurchaseLog> purchaseLogs = purchaseLogService.getAllPurchaseLogs(); // 모든 구매 로그 가져오기
        model.addAttribute("purchaseLogs", purchaseLogs); // 모델에 추가
        return "purchase-log"; // HTML 뷰 반환
    }

    // 특정 ID로 구매 로그를 조회하는 메서드
    @GetMapping("/purchase-log/{memberId}") // 특정 ID에 대한 매핑
    public String getPurchaseLogsByMemberIdView(@PathVariable Long memberId, Model model) {
        List<PurchaseLog> purchaseLogs = purchaseLogService.getPurchaseLogsByMemberId(memberId); // 특정 ID의 구매 로그 가져오기
        model.addAttribute("purchaseLogs", purchaseLogs); // 모델에 추가
        return "purchase-log"; // HTML 뷰 반환
    }
}
