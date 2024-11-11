import java.util.List;
import java.util.Map;

// 최상위 클래스: 최근 6개월 데이터
public class UserStatisticsResponse {
    private String period;  // 기간 (예: "2024-04-01 to 2024-10-01")
    private List<WeeklyData> weeklyData;  // 주별 데이터 리스트

    // Constructor, getters, and setters
    public UserStatisticsResponse(String period, List<WeeklyData> weeklyData) {
        this.period = period;
        this.weeklyData = weeklyData;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public List<WeeklyData> getWeeklyData() {
        return weeklyData;
    }

    public void setWeeklyData(List<WeeklyData> weeklyData) {
        this.weeklyData = weeklyData;
    }
}

// 주별 데이터 클래스
class WeeklyData {
    private String week;  // 주차 (예: "2024-W39")
    private Map<String, AgeGroupData> ageGroups;  // 나이대별 데이터 (10-19, 20-29 등)

    // Constructor, getters, and setters
    public WeeklyData(String week, Map<String, AgeGroupData> ageGroups) {
        this.week = week;
        this.ageGroups = ageGroups;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public Map<String, AgeGroupData> getAgeGroups() {
        return ageGroups;
    }

    public void setAgeGroups(Map<String, AgeGroupData> ageGroups) {
        this.ageGroups = ageGroups;
    }
}

// 나이대별 성별 데이터 클래스
class AgeGroupData {
    private int male;  // 남성 사용자 수
    private int female;  // 여성 사용자 수

    // Constructor, getters, and setters
    public AgeGroupData(int male, int female) {
        this.male = male;
        this.female = female;
    }

    public int getMale() {
        return male;
    }

    public void setMale(int male) {
        this.male = male;
    }

    public int getFemale() {
        return female;
    }

    public void setFemale(int female) {
        this.female = female;
    }
}