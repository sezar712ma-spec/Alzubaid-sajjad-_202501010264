public class Main {
    public static void main(String[] args) {
        // Test LG Washing Machine
        Appliances lgWashingMachine = new WashingMachine("LG");
        lgWashingMachine.displayBrand();
        lgWashingMachine.turnOn();
        lgWashingMachine.operate();
        lgWashingMachine.turnOff();

        System.out.println(); // Space between outputs

        // Test Panasonic Refrigerator
        Appliances panasonicFridge = new Refrigerator("Panasonic");
        panasonicFridge.displayBrand();
        panasonicFridge.turnOn();
        panasonicFridge.operate();
        panasonicFridge.turnOff();
    }
}