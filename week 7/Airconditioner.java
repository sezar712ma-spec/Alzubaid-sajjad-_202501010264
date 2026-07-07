public class Airconditioner extends Appliances {
    public Airconditioner(String brand) {
        super(brand);
    }

    @Override
    public void operate() {
        System.out.println("Cooling the room...");
    }
}