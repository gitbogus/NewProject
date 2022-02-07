package JavaStudy;

public class SwitChh {
    public static void main(String[] args) {
        int mouse = 3;
        String mouseString = "";
        switch (mouse) {
            case 1:
                mouseString = "1마리의 쥐를 잡았습니다.";
                break;
            case 2:
                mouseString = "2마리의 쥐를 잡았습니다.";
                break;
            case 3:
                mouseString = "3마리의 쥐를 잡았습니다.";
                break;
            case 4:
                mouseString = "4마리의 쥐를 잡았습니다.";
                break;
            case 5:
                mouseString = "5마리의 쥐를 잡았습니다.";
                break;
            case 6:
                mouseString = "6마리의 쥐를 잡았습니다.";
                break;
            case 7:
                mouseString = "7마리의 쥐를 잡았습니다.";
                break;
            case 8:
                mouseString = "8마리의 쥐를 잡았습니다.";
                break;
            default:
                mouseString = "쥐를 잡을 준비가 되었습니다 1~8마리까지 잡을수 있습니다.";
                break;
        }
        System.out.println(mouseString);
    }
}

