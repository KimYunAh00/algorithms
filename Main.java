import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Scanner scanner = new Scanner(System.in);

        System.out.println("ID:");
        String ID = scanner.next();

        System.out.println("비번:");
        String password = scanner.next();

        System.out.println("비번 확인:");
        String passwordCheck = scanner.next();

        System.out.println("이름:");
        String name = scanner.next();

        System.out.println("주민번호:");
        String socialNumber = scanner.next();

        System.out.println("전화번호:");
        String phoneNumber = scanner.next();

        System.out.println("주소:");
        String adress = scanner.next();

        System.out.println("직업:");
        String job = scanner.next();

        System.out.println("ID:"+ID);
        System.out.println("비번:"+password);
        System.out.println("비번 확인:"+passwordCheck);
        System.out.println("이름:"+name);
        System.out.println("주민번호:"+socialNumber);
        System.out.println("전화번호:"+phoneNumber);
        System.out.println("주소:"+adress);
        System.out.println("직업:"+job);
    }
}