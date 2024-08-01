package JavaBasic4;

public class BT4 {
    public static void main(String[] args) {
        System.out.println("bài tập phần vòng lặp for và mảng");
        int index = 0;
        //tạo mảng
        int arr[] = new int[26];
        //Tạo vòng lặp for để in ra các số chẵn từ 0 đến 50
        for (int i = 0; i <= 50; i++){
            int result = i%2;
            if (result == 0){
                System.out.println(i +" ");

                //lưu số chẵn vào mảng
                arr[index] = i;
                index++; // tăng giá trị của index để lưu số tiếp theo vào mảng
            }
        }

        //duyệt mảng
        System.out.println("các số chẵn trong mảng:");
        for (int a : arr){
            System.out.print(a + " ");
        }

        System.out.println("\ncách 2:");
        for (int b = 0; b < arr.length; b++){
            System.out.print(arr[b] + " ");
        }
    }

    }
