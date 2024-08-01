package JavaBasic3;

public class operator {

    //khai báo 3 biến bất kỳ
    int a = 10;
    int b = 7;
    boolean c = true;

    public void demoOperator(){
        //Toán tử quan hệ
        System.out.println("a > b: " +(a>b));
        System.out.println("a < b: " +(a<b));
        System.out.println("a = b: " +(a==b));

        //Toán tử logic
        boolean d = (a>b) && c;
        boolean e = (a<b) || c;
        System.out.println("a lớn hơn b và c: " +d);
        System.out.println("a nhỏ hơn b hoặc c: " + e);

    }
    static int number = 100; //khai báo biến number và gán = 100
    // tạo hàm truyền tham số int n
    public void getInfor(int n){
        //TH1: n == number
        if (n == number){
            System.out.println("n bằng number ");
        }
        //TH2: n < number
        else if (n < number){
            System.out.println("n nhỏ hơn number ");
        }
        //TH3: n > number
        else {
            System.out.println("n lớn hơn number " );
        }
    }

    public static void main(String[] args) {
        // Tạo 1 đối tượng
        operator op= new operator();

        //gọi lại các hàm trên
        op.demoOperator();
        op.getInfor(50);
        op.getInfor(100);
        op.getInfor(150);


    }
}
