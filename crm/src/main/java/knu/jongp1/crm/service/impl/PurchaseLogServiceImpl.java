package knu.jongp1.crm.service.impl;

import knu.jongp1.crm.entity.PurchaseLog;
import knu.jongp1.crm.repository.PurchaseLogRepository;
import knu.jongp1.crm.service.PurchaseLogService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseLogServiceImpl implements PurchaseLogService {
    private final PurchaseLogRepository purchaseLogRepository;

    public PurchaseLogServiceImpl(PurchaseLogRepository purchaseLogRepository) {
        this.purchaseLogRepository = purchaseLogRepository;
    }

    @Override
    public List<PurchaseLog> getAllPurchaseLogs() {
        return purchaseLogRepository.findAll();
    }

    @Override
    public List<PurchaseLog> getPurchaseLogsByMemberId(Long memberId) {
        return purchaseLogRepository.findByMemberId(memberId);
    }
}
