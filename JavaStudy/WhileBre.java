package JavaStudy;

public class WhileBre {
    public static void main(String[] args) {
        int mousecatch = 10;
        int mousetrap = 500;

        while (mousetrap > 0) {
            System.out.println("쥐덫을 구매하였으니 쥐를 잡습니다.");
            mousecatch--;
            System.out.println("남은 쥐는 " + mousecatch + "마리 입니다.");
            if (mousecatch == 0) {
                System.out.println("쥐를 모두 잡았습니다. 소탕에 성공하셨습니다.");
                break;
            }
        }
    }
}
