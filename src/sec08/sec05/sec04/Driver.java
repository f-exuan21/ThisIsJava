package sec08.sec05.sec04;

public class Driver {
    public void drive(Vehicle vehicle) {
        if (vehicle instanceof Bus) { //vehicle 매개변수가 참조하는 객체가 Bus인지 조사
            Bus bus = (Bus) vehicle; //Bus일 경우 안전하게 강제 타입 변환시킴
            bus.checkFare();
        }
        vehicle.run();
    }
}
