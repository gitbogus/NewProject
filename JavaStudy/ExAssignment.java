package JavaStudy;

public class ExAssignment {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 20;
        int d = 25;
        int e = 30;
        int f = 35;
        int g = 40;
        int h = 45;
        int i = 50;
        int j = 55;
        int k = 60;
        int l = 65;

        a = b + 2; // 왼쪽의 피연산자에 오른쪽의 피연산자를 대입함.
        b += a + 2; // 왼쪽의 피연산자에 오른쪽의 피연산자를 더한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
        c -= b - 2; // 왼쪽의 피연산자에서 오른쪽의 피연산자를 뺀 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
        d *= b; // 왼쪽의 피연산자에 오른쪽의 피연산자를 곱한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
        e /= b; // 왼쪽의 피연산자를 오른쪽의 피연산자로 나눈 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
        f %= b; // 왼쪽의 피연산자를 오른쪽의 피연산자로 나눈 후, 그 나머지를 왼쪽의 피연산자에 대입함.
        g &= b; // 왼쪽의 피연산자를 오른쪽의 피연산자와 비트 AND 연산한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
        h |= b; // 왼쪽의 피연산자를 오른쪽의 피연산자와 비트 OR 연산한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
        i ^= b; // 왼쪽의 피연산자를 오른쪽의 피연산자와 비트 XOR 연산한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
        j <<= a; // 왼쪽의 피연산자를 오른쪽의 피연산자만큼 왼쪽 시프트한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
        k >>= c; //왼쪽의 피연산자를 오른쪽의 피연산자만큼 부호를 유지하며 오른쪽 시프트한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
        l >>>= d; //왼쪽의 피연산자를 오른쪽의 피연산자만큼 부호에 상관없이 오른쪽 시프트한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.

        System.out.println("a = b + 2 : a = " + a);
        System.out.println("b += a + 2 : b = " + b);
        System.out.println("c -= b - 2 : c = " +c);
        System.out.println("d *= b : d = " + d);
        System.out.println("e /= b : e = " + e);
        System.out.println("f %= b : f = " + f);
        System.out.println("g &= b : g = " + g);
        System.out.println("h |= b : h = " +h);
        System.out.println("i ^= b : i = " +i);
        System.out.println("j <<= a : j = " +j);
        System.out.println("k >>= c : k = " +k);
        System.out.println("l >>>= d : l = " +l);

    }
}








//        a *= b;
//        a /= b;
//        a %= b;
//        a &= b;
//        a |= b;
//        a ^= b;
//        a <<= b;
//        a >>= b;
//        a >>>= b;