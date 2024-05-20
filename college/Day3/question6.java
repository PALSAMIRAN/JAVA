package college.Day3;

import java.util.ArrayList;
import java.util.List;

class Car {
    private String carNumber;
    private int hoursOfBooking;

    public Car(String carNumber, int hoursOfBooking) {
        this.carNumber = carNumber;
        this.hoursOfBooking = hoursOfBooking;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public int getHoursOfBooking() {
        return hoursOfBooking;
    }
}

class CarParking {
    private List<Car> parkedCars;
    private double parkingRatePerHour;
    private double totalParkingCharge;

    public CarParking(double parkingRatePerHour) {
        this.parkingRatePerHour = parkingRatePerHour;
        parkedCars = new ArrayList<>();
    }

    public void addCar(Car car) {
        parkedCars.add(car);
        totalParkingCharge += calculateParkingCharge(car);
    }

    public void receiveParkingCharge(double amount) {
        totalParkingCharge += amount;
    }

    public int getNumberOfCars() {
        return parkedCars.size();
    }

    public int getTotalCarsParked() {
        return parkedCars.size();
    }

    public double getTotalParkingCharge() {
        return totalParkingCharge;
    }

    private double calculateParkingCharge(Car car) {
        return car.getHoursOfBooking() * parkingRatePerHour;
    }
}

public class question6 {
    public static void main(String[] args) {
        double parkingRatePerHour = 5.0;  
        CarParking carParking = new CarParking(parkingRatePerHour);

        Car car1 = new Car("ABC123", 3);
        Car car2 = new Car("XYZ789", 5);

        carParking.addCar(car1);
        carParking.addCar(car2);

        double additionalCharge = 50.0;
        carParking.receiveParkingCharge(additionalCharge);
        System.out.println("Number of cars present in the parking lot: " + carParking.getNumberOfCars());
        System.out.println("Total number of cars parked: " + carParking.getTotalCarsParked());
        System.out.println("Total parking charge collection: " + carParking.getTotalParkingCharge());
    }
}

