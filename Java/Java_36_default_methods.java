interface MyCamera {
    void takeSnap();
    void recordVideo();

    private void greet() {
        System.out.println("good morning");
    }

    default void record4kVideo() {
        greet();
        System.out.println("Record in 4k.......");
    }
}

interface MyWifi {
    String[] getNetworks();
    void connectToNetworks(String network);
}

class CellPhone {
    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    void pickCall() {
        System.out.println("Connecting........");
    }
}

class MySmartphone extends CellPhone implements MyWifi, MyCamera {
    @Override
    public void takeSnap() {
        System.out.println("Taking snap....");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video....");
    }

    @Override
    public void record4kVideo() {
        System.out.println("Recording video in 4k....");
    }

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
}

public class Java_36_default_methods {
    public static void main(String[] args) {

        MySmartphone ms = new MySmartphone();
        // ms.record4kVideo();

        // ms.greet(); --> show an error
        String[] arr = ms.getNetworks();
        for (String item : arr) {
            System.out.println(item);
        }
    }
}
