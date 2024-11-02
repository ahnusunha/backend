package knu.jongp1.crm.repository;

import knu.jongp1.crm.entity.PurchaseLog;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PurchaseLogRepository extends JpaRepository<PurchaseLog, Long> {
    List<PurchaseLog> findByMemberId(Long memberId); // 특정 사용자의 구매 로그를 찾는 메서드
}
