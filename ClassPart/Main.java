package ClassPart;

class BubbleSort {
    private final int[] datas;

    BubbleSort(int[] datas) {
        this.datas = datas;
    }

    public void sort() {
        for (int i = 0; i < this.datas.length - 1; i++) {
            for (int j = 0; j < this.datas.length - 1 - i; j++) {
                if (datas[j] > datas[j + 1]) {
                    int tempNumber = datas[j];
                    datas[j] = datas[j + 1];
                    datas[j + 1] = tempNumber;
                }
            }
        }
    }

    public void display() {
        for (int number : datas) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public int[] getDatas() {
        return this.datas;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 4, 3, 2, 1};
        BubbleSort bubbleSort = new BubbleSort(arr);
        System.out.println("====before sort====");
        bubbleSort.display();
        System.out.println("====after sort====");
        bubbleSort.sort();
        bubbleSort.display();
    }
}