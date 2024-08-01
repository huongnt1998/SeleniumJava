package JavaBasic5;

import java.util.ArrayList;

public class BT5_ArrayList {

    public static void main(String[] args) {
        //BT 5 với ArrayList
        System.out.println("bài tập phần collection");
        //tạo arraylist
        ArrayList<Integer> list = new ArrayList<Integer>();
        //vòng lặp for để in ra các số chẵn từ 0 đến 50
        for (int i = 0; i <= 50; i++) {
            int result = i % 2;
            if (result == 0) {
                System.out.println(i);
                //lưu số chẵn vào mảng
                list.add(i);
            }
        }
        //show list
        System.out.println("các số chẵn trong list:");
        for (int a = 0; a < list.size(); a++) {
            System.out.print(list.get(a) + " ");
        }


    }

}
