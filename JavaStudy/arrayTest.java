package JavaStudy;

public class arrayTest {
    public static void main(String[] args){

        int[][] array1 = new int[3][4]; //세로길이가 3, 가로길이가 4인 int형 2차원 배열 생성
        int num = 1;

        //배열에 값을 저장
        for(int i=0; i < 3; i++){
            for(int j=0; j < 4; j++){
                array1[i][j] = num;
                        num++;
            }
        }
        // 배열에 저장된 값을 출력
        for (int i=0; i < 3; i++){
            for(int j=0; j < 4; j++)
                System.out.print(array1[i][j] + "\t");
            System.out.println();
        }
    }
}








//        int k = 10;
//        for (int i = 0; i < array1.length;i++){
//            for(int j = 0; j < array1[i].length;j++){
//                array1[i][j] = k; //인덱스를 이용한 초기화
//                k += 10;
//            }
//        }
//        for (int[] ints : array1) {
//            for (int anInt : ints) {
//                System.out.println(anInt + " ");
//            }
//            System.out.println();
//        }
//        }
//    }