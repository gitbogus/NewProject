package JavaStudy;

public class Study2Java {
    static boolean result1 = true;
    static boolean result2 = true;
    static boolean result3 = true;
    static boolean result4 = true;

    public static void main(String[] args) {

        int a = 10;
        int b = -10;

        result1 = (a > b) && (a < b);
        result2 = (b <= a) || (b > a);
        result3 = (a > b) & (a < b);
        result4 = (b <= b) | (b > a);

        System.out.println("(a > b) && (a < b) -> " + result1);
        System.out.println("(b <= a) || (b > a) -> " + result2);
        System.out.println("(b <= a) || (b > a) -> " + !result2);
        System.out.println("(a > b) & (a < b) -> " + result3);
        System.out.println("(b <= b) | (b > a) -> " + result4);

    }
}

