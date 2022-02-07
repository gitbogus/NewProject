package JavaStudy;

//void push(int data)를 구현하세요.
//int pop()을 구현하세요.
class MyStack {
    private int[] arr;
    private int top = -1;
    private int stackSize;

    public MyStack(int stackSize) {
        top = -1;
        arr = new int[stackSize];
        this.stackSize = stackSize;
    }

    public void push(int data) {
        if (top == arr.length -1 ) {
            System.out.println("더이상 데이터를 넣을수 없습니다.");
        } else {
            arr[++top] = data;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("추출할 데이터가 없습니다.");
            return -1;
        } else {
            int tmp = arr[top];
            arr[top--] = 0;
            return tmp;
        }
    }

    public void display() {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}


public class StakEx {
    public static void main(String[] args) {
        MyStack myStack = new MyStack(10);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        myStack.push(7);
        myStack.push(8);
        myStack.push(9);
        myStack.push(10);
        myStack.push(11);

        System.out.println("----------------------------------");
//        System.out.println("추출된 값 : " + myStack.pop());
//        System.out.println("추출된 값 : " + myStack.pop());
//        System.out.println("추출된 값 : " + myStack.pop());
        System.out.println("----------------------------------");
        myStack.display();
        System.out.println("----------------------------------");
        System.out.println("현재 데이터값");
        System.out.println("----------------------------------");
    }
}
