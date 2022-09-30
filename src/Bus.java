import java.util.Objects;
import java.util.UUID;

public class Bus extends Transport{
    int currentPassenger;
    int fee;


    // 현재 승객
    public int get_currentPassenger() {
       return currentPassenger;
    }

    public void set_currentPassenger(int Passenger) {
        this.currentPassenger += Passenger;
    }

    // 요금
    public int get_fee() {
        return fee;
    }

    public void set_fee(int fee) {
        this.fee = fee;
    }


    // 버스 생성
    Bus() {
        this(UUID.randomUUID().toString());
    }

    Bus(String Number) {
        this.set_Number(Number);
        this.set_currentPassenger(30);
        this.set_status("운행");
        this.set_fee(1000);
    }

    public void get_Bus() {
        System.out.println("===================================");
        System.out.println("벼스번호: " + this.transNumber);
        System.out.println("");
    }
    public void set_status(String status) {
        if (get_feulVolume() < 10)
            System.out.println("현재 주유량이 " + get_feulVolume() + "L이기 때문에 주유가 필요합니다.");

        this.status = status;
    }

    public void addPassenger(int Passenger) {
        if (Objects.equals(this.get_status(), "운행")) {
            for (int i = Passenger; i > 0; i--) {
                this.set_currentPassenger(1);
                if (get_currentPassenger() > get_maxPassenger()) {
                    System.out.println("최대 탑승 인원수를 " + i + "명 초과하였습니다.");
                    return;
                }
            }
            System.out.println(Passenger + "명이 추가로 탑승하여 현재 탑승 인원은 " + get_currentPassenger() + "명 입니다.");
        } else {
            System.out.println("현재 버스가 운행중이 아닙니다.");
        }

    }


}
