package knu.jongp1.crm.service.impl;

import knu.jongp1.crm.entity.MemberLog;
import knu.jongp1.crm.repository.MemberLogRepository;
import knu.jongp1.crm.service.MemberLogService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service // 이 어노테이션이 필요합니다.
public class MemberLogServiceImpl implements MemberLogService {
    private final MemberLogRepository memberLogRepository;

    public MemberLogServiceImpl(MemberLogRepository memberLogRepository) {
        this.memberLogRepository = memberLogRepository;
    }

    @Override
    public List<MemberLog> getAllMemberLogs() {
        return memberLogRepository.findAll();
    }
}
