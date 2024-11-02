package knu.jongp1.crm.repository;

import knu.jongp1.crm.entity.MemberLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberLogRepository extends JpaRepository<MemberLog, Long> {
}
