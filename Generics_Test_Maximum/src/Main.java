public class Main {
    public static void main(String[] args) {
        System.out.println("Find Maximum Problem using Generics");
        Integer i1 = 60;
        Integer i2 = 90;
        Integer i3 = 100;
        Float f1 = 7.1f;
        Float f2 = 8.1f;
        Float f3 = 9.1f;
        String s1="gujrat";
        String s2="nagpur";
        String s3="mumbai";

        Main main = new Main();
        System.out.println("Max Number (Integer) is : " + main.checkMax(i1, i2, 3));
        System.out.println("Max Number (Float) is : " + main.checkMax(f1, f2, f3));
        System.out.println("Max String (String) is : " + main.checkMax(s1, s2, s3));
    }

    private Integer checkMax(Integer a, Integer b, Integer c) {
        Integer MAX = a;
        if (b.compareTo(MAX) > 0)
            MAX = b;
        if (c.compareTo(MAX) > 0)
            MAX = c;
        return MAX;
    }

    private Float checkMax(Float a, Float b, Float c) {
        Float MAX = a;
        if (b.compareTo(MAX) > 0)
            MAX = b;
        if (c.compareTo(MAX) > 0)
            MAX = c;
        return MAX;
    }

    private String checkMax(String a, String b, String c) {
        String MAX = a;
        if (b.compareTo(MAX) > 0)
            MAX = b;
        if (c.compareTo(MAX) > 0)
            MAX = c;
        return MAX;
    }
}

