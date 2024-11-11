import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopController {

    @Autowired
    private ShopService shopService;

    // shopId에 따른 사용자 통계 데이터 조회
    @GetMapping("/api/customer/influx")
    public UserStatisticsResponse getWeeklyUserInflow(@RequestParam String shopid) {
        return shopService.getWeeklyUserInflow(shopid);
    }
}
