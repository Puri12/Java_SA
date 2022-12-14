import java.util.Objects;

public class Transport {
    String transNumber;         // 고유 번호
    int feulVolume = 100;       // 주유량
    int currentSpeed = 0;       // 현재속도
    int changedSpeed;           // 속도 변경
    int maxPassenger;           // 최대 승객수
    int currentPassenger;       // 탑승 승객수
    String status;              // 상태
    int fee;


    // 요금
    public int get_fee() {
        return fee;
    }

    public void set_fee(int fee) {
        this.fee = fee;
    }


    // 고유번호
    public String get_Number() {
        return transNumber;
    }

    public void set_Number(String transNumber) {
        this.transNumber = transNumber;
    }

    // 주유량
    public int get_feulVolume() {
        return feulVolume;
    }

    public void set_feulVolume(int feulVolume) {
        this.feulVolume = feulVolume;
    }

    // 속도
    public int get_currentSpeed() {
        return currentSpeed;
    }

    public void set_currentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    // 속도 변경
    public int get_changedSpeed() {
        return changedSpeed;
    }

    public void set_changedSpeed(int changedSpeed) {
        this.changedSpeed = changedSpeed;
    }

    // 최대 승색수
    public int get_maxPassenger() {
        return maxPassenger;
    }

    public void set_maxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    // 탑승 승객수
    public int get_currentPassenger() {
        return currentPassenger;
    }

    public void set_currentPassenger(int passenger) {
        this.currentPassenger = passenger;
    }

     // 상태
    public String get_status() {
        return status;
    }

    public void set_status(String status) {
        this.status = status;
    }


    // 기름 관리
    public void add_feul(int feul) {
        feulVolume += feul;
        System.out.println("주유량 = " + get_feulVolume());
    }

    public void add_Passenger(int passenger) {
        if (passenger > get_maxPassenger()) {
            System.out.println("최대 승객 수 초과");
        }
    }

    // 기름 체크
    private boolean check_feul() {
        return get_feulVolume() >= 10;
    }

    // 운행시작
    public void start() {
        if (Objects.equals(get_status(), "운행")) {
            System.out.println("이미 " + get_status() + "중인 상태입니다.");
        } else {
            if (check_feul()) {
                set_status("운행");
            } else {
                System.out.println("기름이 부족하여 변경할 수 없습니다.");
            }
        }
    }


    // 상태 변경
    public void change_status(String status) {
        if (Objects.equals(get_status(), status)) {
            System.out.println("이미 " + get_status() + "상태 입니다.");
        } else {
            set_status(status);
            System.out.println("상태 = " + get_status());
        }
        System.out.println();
    }


    // 속도 변경
    public void change_speed(int speed) {
        if (check_feul()) {
            set_currentSpeed(speed);
        } else {
            System.out.println("기름이 부족하여 " + speed + "로 속도 변경이 불가능 합니다.");
        }
    }


}