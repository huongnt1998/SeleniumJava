package JavaBasic1;

public class SinhVien {

    //Static variable
    static String Class = "67DCHT21";

    //Instance variable
    String major;
    //Constructor
    public SinhVien(String major){
        this.major = major;
    }
    public void getInfor(){
        //local variable
        int Score = 20;
        System.out.println("Lớp: " +Class);
        System.out.println("Khoa:" +major);
        System.out.println("Điểm: " +Score);
        System.out.println("Tên: " +ThongTin.name);
        System.out.println("Tuổi: " +ThongTin.age);
        System.out.println("Trường: " +ThongTin.school);
    }

    public static void main(String[] args) {
        //Tạo 1 đối tượng sinh viên
       SinhVien sv = new SinhVien("IT");
       //gọi lại hàm
       sv.getInfor();
    }
}
