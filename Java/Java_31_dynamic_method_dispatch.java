class phone {
    public void showtime() {
        System.out.println("Time is 08:00 am");
    }

    public void on() {
        System.out.println("Turning On the Phone......");
    }
}

class smartPhone extends phone {
    public void music() {
        System.out.println("Playing the music...");
    }

    @Override
    public void on() {
        System.out.println("Turning On the Smartphone.......");
    }
}

public class Java_31_dynamic_method_dispatch {
    public static void main(String[] args) {

        // phone obj = new phone();                                  // allowed
        // smartPhone smobj = new smartPhone();                      // allowed
        // obj.name();

        phone obj = new smartPhone();                                // no error, allowed // Dynamic method dispatch
        // reference hai phone ka aur object hai smartphone ka
        // super class ka reference = subclass ka object hai
        // smartPhone obj2 = new phone();                            // error. No it is not allowed

        obj.showtime();
        obj.on();
        // obj.music();                                              // Not allowed (error)
    }
}