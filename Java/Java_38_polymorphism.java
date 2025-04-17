interface MyCamera2 {
    void takeSnap();
    void recordVideo();

    private void greet() {
        System.out.println("good morning");
    }

    default void record4kVideo() {
        greet();
        System.out.println("Recording in 4k.......");
    }
}

interface MyWifi2 {
    String[] getNetworks();
    void connectToNetworks(String network);
}

class CellPhone2 {
    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    // void pickCall() {
    //    System.out.println("Connecting........");
    // }
}

class MySmartphone2 extends CellPhone2 implements MyWifi2, MyCamera2 {
    @Override
    public void takeSnap() {
        System.out.println("Taking snap....");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video....");
    }

    // @Override
    // public void record4kVideo() {
    //     System.out.println("Recording video in 4k....");
    // }

    @Override
    public String[] getNetworks() {
        System.out.println("Getting list of networks");
        String[] netWorkList = { "Shiv", "shubham", "Ram", "Rahul" };
        return netWorkList;
    }

    @Override
    public void connectToNetworks(String netWork) {
        System.out.println("Connecting to " + netWork);
    }

    public void sampleMeth() {
        System.out.println("meth");
    }
}

public class Java_38_polymorphism {
    public static void main(String[] args) {

        // Polymorphism: Reference is of MyCamera2 interface, but object is of MySmartphone2
        MyCamera2 cam2 = new MySmartphone2();                // this is a smartphone but, use it as a camera   
        // cam2.getNetworks();                               // not allowed
        // cam2.sampleMeth();                                // not allowed
        cam2.record4kVideo();

        MySmartphone2 s = new MySmartphone2();
        s.sampleMeth();
        s.getNetworks();
        s.recordVideo();
        s.takeSnap();
        s.callNumber(564);
    }
}