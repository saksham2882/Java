// NOTE: We can use multiple interfaces, but we cannot use more than one abstract class
interface Bicycle {                                    // force to implement below commands or method
    int a = 45;

    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBicycle {
    int b = 55;

    void blowHorn2020();
    void blowHorn5050();
}

class AvonCycle implements Bicycle, HornBicycle {
    @Override
    public void applyBrake(int decrement) {
        System.out.println("Applying Brake!");
    }

    @Override
    public void speedUp(int increment) {
        System.out.println("Applying SpeedUp!");
    }

    @Override
    public void blowHorn2020() {
        System.out.println("Blow Horn 2020");
    }

    @Override
    public void blowHorn5050() {
        System.out.println("Blow Horn 5050");
    }
}

public class Java_35_Interface {
    public static void main(String[] args) {
        
        AvonCycle cycleSamsung = new AvonCycle();
        cycleSamsung.applyBrake(2);

        // you can create properties in interface
        // System.out.println(cycleSamsung.a);
        System.out.println(AvonCycle.a);
        // you cannot modify the properties in interfaces as they are final
        // cycleSamsung.a = 454;
        // System.out.println(cycleSamsung.a);

        cycleSamsung.blowHorn2020();
        cycleSamsung.blowHorn5050();
        
        // System.out.println(cycleSamsung.b);
        System.out.println(AvonCycle.b);
    }
}
