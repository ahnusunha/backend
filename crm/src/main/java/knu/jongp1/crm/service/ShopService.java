
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ShopService {

    @Autowired
    private RestTemplate restTemplate;

    // 외부 API를 호출하여 사용자 통계 데이터 가져오기
    public UserStatisticsResponse getWeeklyUserInflow(String shopId) {
        String apiUrl = "http://localhost:8080/api/database/member-log";

        // 외부 API 호출
        return restTemplate.getForObject(apiUrl, UserStatisticsResponse.class);
    }
}
