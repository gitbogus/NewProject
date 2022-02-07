package JavaStudy;

import java.util.ArrayList;

public class Conta {
    public static void main(String[] args) {
        ArrayList<String> pocket = new ArrayList<String>();
        pocket.add("cold");
        pocket.add("hot");
        pocket.add("warm");

        if (pocket.contains("cold")) {
            System.out.println("겨울은 춥습니다");
        } else {
            System.out.println("겨울이 아닌가봐요");
        }
    }
}

