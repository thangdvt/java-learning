import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap vao ten");
        String hoTen = sc.nextLine();
        System.out.println("ma sinh vien");
        long maSinhVien = sc.nextLong();
        System.out.println("nhap vao ma lop hoc");
        int maLopHoc = sc.nextInt();
        System.out.println("-------------");
        System.out.println("ho va ten " + hoTen + "co " +maSinhVien +"hoc o lop co ma"+ maLopHoc);
        System.out.println("nhap vao ten");

    }
}
