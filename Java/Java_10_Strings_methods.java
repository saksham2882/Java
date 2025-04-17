public class Java_10_Strings_methods {
    public static void main(String[] args) {

        String name = "Saksham";
        System.out.println(name);

        int value = name.length();
        System.out.println(value);

        String lString = name.toLowerCase();
        System.out.println(lString);

        String uString = name.toUpperCase();
        System.out.println(uString);

        String nonTrimmedString = "      Saksham       ";
        System.out.println(nonTrimmedString);

        String TrimmedString = nonTrimmedString.trim();
        System.out.println(TrimmedString);

        System.out.println(name.substring(2));
        System.out.println(name.substring(2, 6));

        System.out.println(name.replace('m', 'i'));
        System.out.println(name.replace("ham", "hi"));

        System.out.println(name.startsWith("sa"));
        System.out.println(name.endsWith("am"));

        System.out.println(name.charAt(5));
        System.out.println(name.indexOf("a"));
        System.out.println(name.indexOf("ak", 2));
        System.out.println(name.lastIndexOf("am"));
        System.out.println(name.lastIndexOf("am", 4));

        System.out.println(name.equals("saksham"));
        System.out.println(name.equalsIgnoreCase("saksham"));

        System.out.println("I am escape sequence\tdouble quote");
        System.out.println("I am escape sequence \n double quote");
        System.out.println("I am escape sequence \\ double quote");
    }
}