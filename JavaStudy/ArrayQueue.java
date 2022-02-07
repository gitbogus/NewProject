package JavaStudy;

class MyQueue {
    private int[] arr;
    private int firstindex;
    private int lastindex;
    private int QueueSize;


    public MyQueue(int QueueSize) {
        firstindex = -1;
        lastindex = -1; //초기값
        arr = new int[QueueSize];
        this.QueueSize = QueueSize;
    }

    public boolean queueisEmpty() { //queue에 아무것도 들어있지 않은지 판단하는 함수
        return firstindex == lastindex;
    }

    public boolean queueisFull() {    //queue가 가득 차 공간이 없는지 판단하는 함수
        return (this.lastindex == this.QueueSize -1);
    }

    public void push(int data) {
        if (queueisFull()) {
            System.out.println("더이상 데이터를 넣을수 없습니다.");
            return;
        }
        lastindex = (lastindex+1) % this.QueueSize;
        arr[lastindex] = data;

    }

    public int pop() {
        if (queueisEmpty()) {
            System.out.println("현재 갖고있는 데이터가 없습니다.");
            return -1;
        }
        // firstindex 포인터는 삭제할 위치에 있는 상태이므로 다음과 같이 (firstindex + 1) % size 로 설정.
        // firstindex + 1 로 설정하면 firstindex 포인터가 마지막 요소에 위치했을 경우,
        // ArrayOutOfBoundException이 발생하기 때문에 (firstindex + 1) % QueueSize 로 설정해줌.
        // ex) 큐의 size가 5일 때 (index 범위는 0 ~ 4)
        // index of firstindex 3: (3 + 1) % 5 = 4
        // index of firstindex 4: (4 + 1) % 5 = 0
        //int tmp = firstindex;
        int tmp = firstindex;
        firstindex = (firstindex + 1) % this.QueueSize;
        //arr[tmp--] = 0;
        return firstindex;
    }

    public void display() {
        for (int i = 0; i <=arr.length -1; i++) {
            System.out.println(arr[i]);
        }
    }
}


public class ArrayQueue {
    public static void main(String[] args) {
        MyQueue myque = new MyQueue(10);
        System.out.println("----------------------------------");
        myque.push(1);
        myque.push(2);
        myque.push(3);
        myque.push(4);
        myque.push(5);
        myque.push(6);
        myque.display();
        System.out.println("----------------------------------");
        System.out.println("추출된 값 : " + myque.pop());
        System.out.println("추출된 값 : " + myque.pop());
        System.out.println("추출된 값 : " + myque.pop());
        System.out.println("----------------------------------");
        System.out.println("----------------------------------");

        System.out.println("현재 있는 데이터 값");
        myque.display();
        System.out.println("----------------------------------");
    }
}

