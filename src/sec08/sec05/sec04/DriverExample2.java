package sec08.sec05.sec04;

public class DriverExample2 {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();
        //vehicle.checkFare(); 접근 불가

        Bus bus = (Bus) vehicle;
        bus.checkFare();
    }
}
