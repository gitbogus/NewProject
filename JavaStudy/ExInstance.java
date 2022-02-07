package JavaStudy;

class Salad {
}

class ChickenSalad extends Salad {
}

public class ExInstance {
    public static void main(String[] args) {
        Salad parent = new Salad();
        ChickenSalad child = new ChickenSalad();
        System.out.println(parent instanceof Salad);
        System.out.println(child instanceof Salad);
        System.out.println(parent instanceof ChickenSalad);
        System.out.println(child instanceof ChickenSalad);
    }
}

