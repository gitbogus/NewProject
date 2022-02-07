package JavaStudy;

public class javastudy {
    int global = 10;
    static int staticVal = 10;
    public void scopeTest(int value) {
        int localScope = 20;

        System.out.println(global);
        System.out.println(localScope);
        System.out.println(value);
    }
    public void scopeTest2(int value2) {
        System.out.println(global);
        //System.out.println(localScope);
        //System.out.println(value);
        System.out.println(value2);
        System.out.println(staticVal);
    }
    public static void main(String[] args){
        //클래스는 인스턴스화 하지않은채로 사용할수없다.
        //System.out.println(globalScope);
        //System.out.println(localScope);
        //System.out.println(value);
        System.out.println(staticVal);

    }
}
