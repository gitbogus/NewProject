package JavaStudy;

import java.util.ArrayList;

public class KaTalk {

    public static void main(String[] args) {
        boolean computer = true;
        ArrayList<String> pocket = new ArrayList<String>();
        pocket.add("cellphone");
        pocket.add("handphone");

        if (pocket.contains("phone")) {
            System.out.println("핸드폰으로 카톡을 합니다.");
        }else if(computer) {
            System.out.println("컴퓨터로 카톡을 합니다.");
        }else {
            System.out.println("지금은 연락할수 없군요");
        }
    }
}



