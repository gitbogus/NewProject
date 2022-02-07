package ClassPart;

import java.util.Scanner;

public class GuguInput {


    public static void main(String[] args) {
        System.out.println("보고 싶은 구구단을 입력해주세요");
        Scanner sc = new Scanner(System.in);
        int dan = sc.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.println(dan + "*" + i + "=" + dan * i);
        }
    }
}
