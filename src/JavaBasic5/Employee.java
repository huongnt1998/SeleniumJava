//Khai báo các biến thông tin của nhân viên
//khai báo 1 hàm add các thông tin đó vào 1 arraylist
//gọi hàm để in

package JavaBasic5;
import java.util.ArrayList;
import java.util.List;

public class Employee {
    //khai báo các biến thông tin cho nhân viên
    String name;
    int age;
    String department;
    List<Employee> List = new ArrayList<>();
    //constructor
    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    //Khai báo 1 hàm để add thông tin nhân viên vào arrayList
    public void addEmployee(String name, int age, String department) {
        Employee emp = new Employee(name, age, department);
        List.add(emp);
    }

    public static void main(String[] args) {
        Employee empl = new Employee("", 0, "");
        //Thêm nhân viên
        empl.addEmployee("Nguyễn Văn A", 26, "IT");
        empl.addEmployee("Nguyễn Văn B", 30, "Sale");
        empl.addEmployee("Nguyễn Thị C", 23, "HR");
        //In ra thông tin của nhân viên
        for (Employee employee : empl.List) {
            System.out.println(employee);
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                '}';
    }
}
