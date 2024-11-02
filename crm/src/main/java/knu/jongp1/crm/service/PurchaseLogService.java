package knu.jongp1.crm.service;

import knu.jongp1.crm.entity.PurchaseLog;

import java.util.List;

public interface PurchaseLogService {
    List<PurchaseLog> getAllPurchaseLogs(); // 모든 구매 로그를 가져오는 메서드
    List<PurchaseLog> getPurchaseLogsByMemberId(Long memberId); // 특정 사용자의 구매 로그를 가져오는 메서드
}
