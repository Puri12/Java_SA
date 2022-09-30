public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Bus bus1 = new Bus();


        if (bus.get_Number() == bus1.get_Number())
            System.out.println("버스 번호가 같습니다!");

        bus.add_Passenger(2);

        bus.add_feul(-50);

        bus.change_status("차고지행");

        bus.add_feul(10);

        bus.start();

        bus.add_Passenger(45);

        bus.add_Passenger(5);

        bus.add_feul(-55);

        Taxi taxi = new Taxi();
        Taxi taxi1 = new Taxi();

        if (taxi.get_Number() == taxi1.get_Number())
            System.out.println("택시 번호가 같습니다!");

        taxi.add_Passenger(2, "서울역", 2);

        taxi.add_feul(-80);

        taxi.payFee();

        taxi.add_Passenger(5);

        taxi.add_Passenger(3, "구로디지털단지역", 12);

        taxi.add_feul(-20);

        taxi.payFee();

    }
}
