//import java.util.Scanner;
//
//public class Bai_tap {
//    public static void main (String[] args) {
//        int num1, num2, sum;
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Nhap so thu nhat:");
//        num1 = sc.nextInt();
//
//        System.out.println("Nhap so thu hai:");
//        num2 = sc.nextInt();
//
//        sum = num1 + num2;
//
//        // Thêm khoảng trắng giữa "Tong" và giá trị của sum
//        System.out.println("Tong: " + sum);
//
//        sc.close();  // Đóng đối tượng Scanner sau khi sử dụng
//    }
//}

public class Main {
    public static void main(String[] args) {
        // Khởi tạo tổng và biến đếm
        int tong = 0;
        int count = 0;
        int i = 2;

        // Sử dụng vòng lặp while để tính tổng 10 số chẵn đầu tiên
        while (count < 10) {
            tong += i;
            i += 2;
            count++;
        }

        // In ra kết quả
        System.out.println("Tổng của 10 số chẵn đầu tiên là: " + tong);
    }
}
