public class Main {
    public static void main(String[] args) {
        System.out.println("Find Maximum Problem using Generics");
        Integer a = 60;
        Integer b = 90;
        Integer c = 100;
        Main main = new Main();
        System.out.println("Max Number is : "+main.checkMax(a, b, c));
    }

    private Integer checkMax(Integer a, Integer b, Integer c) {
        Integer MAX=a;
        if (b.compareTo(MAX) > 0)
            MAX = b;
        if (c.compareTo(MAX) > 0)
            MAX = c;
        return MAX;
    }
}

