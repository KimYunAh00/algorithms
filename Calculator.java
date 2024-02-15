import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자?");
        String number1 = sc.next();

        System.out.println("두 번째 숫자?");
        String number2 = sc.next();

        System.out.println("+,-,*,/을 입력");
        String opcode = sc.next();

        int result = 0;
        int intNumber1 = Integer.parseInt(number1);
        int intNumber2 = Integer.parseInt(number2);

        if(opcode.equals("+")){
            result = intNumber1 + intNumber2;
        }else if(opcode.equals("-")){
            result = intNumber1 - intNumber2;
        }else if(opcode.equals("*")) {
            result = intNumber1 * intNumber2;
        }else if(opcode.equals("/")) {
            result = intNumber1 / intNumber2;
        }else{
            System.out.println("잘못된 연산기호입니다.");
        }

        System.out.println("첫 번째 숫자: "+intNumber1);
        System.out.println("두 번째 숫자: "+intNumber2);
        System.out.println("결과: "+result);
    }
}
