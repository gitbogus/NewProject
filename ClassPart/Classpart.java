package ClassPart;

public class Classpart {
    int studentID;
    String studentName;
    int grade;
    String address;

//    public Classpart() {       //default 생성자
//
//    }
    public void showStudentInFor() {
        System.out.println(studentName + "," + address);
    }
    public String getstudentName(){
        return studentName;
    }
    public void setStudentName(String name) {
        studentName = name;
    }
    public static void main(String[] args){
        Classpart studentLee = new Classpart();
        studentLee.studentName = "이순신";
        studentLee.address = "서울시 서초구 서초동";

        studentLee.showStudentInFor();

        System.out.println();
        System.out.println();
    }
}
