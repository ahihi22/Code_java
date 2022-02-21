
import java.util.Scanner;
import static java.lang.System.*;

public class App35{
    public static void main(String[] args) {
        int number1,number2;
        var scanner= new Scanner(in);
        out.println("Nhập số thứ nhất: ");
        number1 = scanner.nextInt();
        out.println("Nhập số thứ hai: ");
        number2 = scanner.nextInt();
        if(number1>number2){
            out.println(number2);
        }
        else out.println(number1);
    }}