public class Transport {
   String  transNumber;           // 고유 번호
   int feulVolume = 100;      // 주유량
   int currentSpeed = 0;      // 현재속도
   int changedSpeed;          // 속도 변경
   int maxPassenger;          // 최대 승객수
   String status;             // 상태


   // 고유번호
   public String  get_Number() {
      return transNumber;
   }

   public void set_Number(String  transNumber) {
      this.transNumber = transNumber;
   }

   // 주유량
   public int get_feulVolume() {
      return feulVolume;
   }

   public void set_feulVolume(int feulVolume) {
      this.feulVolume -= feulVolume;
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

   // 상태
   public String get_status() {
      return status;
   }

   public void set_status(String status) {
      this.status = status;
   }


   //기능 시작

   //운행 시작
   public void startOperation() {
      System.out.println(this.status + "을 시작합니다.");
   }

}