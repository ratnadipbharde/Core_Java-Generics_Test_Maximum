public class Main {
    public static void main(String[] args) {
        System.out.println("Find Maximum Problem using Generics");
        Integer a = 60;
        Integer b = 90;
        Integer c = 100;
        Float d=1.3f;
        Float e=5.6f;
        Float f=6.4f;
        Main main = new Main();
        System.out.println("Max Number (Integer) is : "+main.checkMax(a, b, c));
        System.out.println("Max Number (Float) is : "+main.checkMax(d, e, f));
    }

    private Integer checkMax(Integer a, Integer b, Integer c) {
        Integer MAX=a;
        if (b.compareTo(MAX) > 0)
            MAX = b;
        if (c.compareTo(MAX) > 0)
            MAX = c;
        return MAX;
    }
    private Float checkMax(Float a, Float b, Float c) {
        Float MAX=a;
        if (b.compareTo(MAX) > 0)
            MAX = b;
        if (c.compareTo(MAX) > 0)
            MAX = c;
        return MAX;
    }

}

