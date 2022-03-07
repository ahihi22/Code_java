import java.util.Scanner;

import static java.lang.System.*;
public class App90 {
    public static void main(String[] args) {
        var sc=new Scanner(in);
        String chuoi;
        char kyTu;
        var scanner = new Scanner(in);
        out.println("Nhập vào chuỗi bất kỳ: ");
        chuoi = scanner.nextLine();
        System.out.println("Các ký tự có trong chuỗi là: ");
        for (int i = 0; i < chuoi.length(); i++) {
            // trả về ký tự tại vị trí thứ i trong chuỗi
            // và gán vào cho biến kyTu
            // i chạy từ 0 đến vị trí độ dài của chuỗi - 1
            kyTu = chuoi.charAt(i);
            System.out.println(kyTu);
        }
    }
}