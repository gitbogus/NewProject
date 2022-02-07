package JavaStudy;

public class Whao {
    public static void main(String[] args) {
        int mousecatch = 0;
        while (mousecatch < 10) {
            mousecatch++;
            System.out.println("쥐를  " + mousecatch + "번 잡았습니다.");
            if (mousecatch == 10) {
                System.out.println("남은쥐가 없습니다.");
            }
        }
    }
}