import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class ArrayTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /***
         * 최적화 문제 중 최대값 구하기
         */

        System.out.println("다음 시험에서 1등 학생의 이름과 점수를 구하시오.");

        System.out.println("시험에 응시한 학생 수는 몇 명입니까?");
        int numberOfStudent = sc.nextInt();
        String[] names = new String[numberOfStudent];
        int[] scores = new int[numberOfStudent];
        int max = 0;

        for (int i = 0; i < names.length; i++) {

            System.out.println("응시한 학생의 이름을 입력하세요.");
            String name = sc.next();
            names[i] = name;

            System.out.println("점수를 입력하세요.");
            int score = sc.nextInt();
            scores[i] = score;

            if (scores[i] > max) {
                max = scores[i];
            }
        }

        System.out.println("1등은 " + names[i] + "이고, 점수는 " + max + "다.");
    }
}


//        if (arr[0]>arr[1]&&arr[0]>arr[2]){
//            System.out.printf("입력된 값 중 최대값은 "+arr[0]);
//        }else if (arr[0]>arr[2]&&arr[0]>arr[1]){
//            System.out.printf("입력된 값 중 최대값은 "+arr[0]);
//        }else if (arr[1]>arr[2]&&arr[1]>arr[0]){
//            System.out.println("입력된 값 중 최대값은 " + arr[1]);
//        }else{
//            System.out.println("입력된 값 중 최대값은 " +arr[2]);
//                }