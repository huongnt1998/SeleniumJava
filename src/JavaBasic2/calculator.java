package JavaBasic2;

public class calculator {

    //hàm tính tổng 2 số nguyên
    public int sumCalc(int a, int b) {
        return a+b;
    }

    //hàm tính tích 2 số nguyên
    public double multiCalc(double c, double d) {
        return c*d;
    }

    public static void main(String[] args) {
        calculator calc = new calculator();
        int sum = calc.sumCalc(10, 20);
        double multiplication = calc.multiCalc(5.5, 15);
        System.out.println("tổng 2 số nguyên là: " +sum);
        System.out.println("Tích 2 số thực là: " +multiplication);
    }
}
