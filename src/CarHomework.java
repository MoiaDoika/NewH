public class CarHomework {
    public static void main(String[] args) {
        Car Honda = new Car();
        System.out.println("Let's hit the road, fill up the tank");
        Honda.oilbak();
        Honda.refuel(178);
        System.out.println("-------------------------------------");
        System.out.println("Arrived at Crooked Lake");
        Honda.remainder();
        Honda.oilbak();
        Honda.refuel(155);
        System.out.println("-------------------------------------");
        System.out.println("Arrived in Zhashkov");
        Honda.remainder();
        Honda.oilbak();
        Honda.refuel(150);
        System.out.println("-------------------------------------");
        System.out.println("Arrived in Kyiv");
        Honda.remainder();
        System.out.println("-------------------------------------");
        System.out.println("Calculate the cost of fuel spent on the road.");
        Honda.FinalPrice(45.50);
    }
}



