package L07_ObjectsAndClasses_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05_VehicleCatalogue {
    static class Vehicle {
        private String type;
        private String model;
        private String color;
        private int horsePower;

        public void setType(String type) {
            this.type = type;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setHorsePower(int horsePower) {
            this.horsePower = horsePower;
        }

        public String getType() {
            return type;
        }

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        public int getHorsePower() {
            return horsePower;
        }

        public Vehicle(String type, String model, String color, int horsePower) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            String typeVehicle = type.equals("car") ? "Car" : "Truck";
            return "Type: " + typeVehicle + "\n" +
                    "Model: " + model + "\n" +
                    "Color: " + color + "\n" +
                    "Horsepower: " + horsePower;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Vehicle> vehicles = new ArrayList<>();

        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            vehicles.add(new Vehicle(tokens[0], tokens[1], tokens[2], Integer.parseInt(tokens[3])));
            input = scanner.nextLine();
        }

        String model = scanner.nextLine();
        double sumCar = 0;
        double sumTruck = 0;
        int countCar = 0;
        int countTruck = 0;

        while (!model.equals("Close the Catalogue")) {
            for (Vehicle vehicle : vehicles) {
                if (vehicle.getModel().equals(model)) {
                    System.out.println(vehicle);
                }
            }
            model = scanner.nextLine();
        }

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getType().equals("car")) {
                sumCar += vehicle.getHorsePower();
                countCar++;
            } else if (vehicle.getType().equals("truck")) {
                sumTruck += vehicle.getHorsePower();
                countTruck++;
            }
        }

        double avgCars = sumCar / countCar;
        if (countCar == 0) {
            avgCars = 0;
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", avgCars);
        double avgTrucks = sumTruck / countTruck;
        if (countTruck == 0) {
            avgTrucks = 0;
        }
        System.out.printf("Trucks have average horsepower of: %.2f.%n",avgTrucks);

    }
}
