package recursion;

import java.util.Scanner;

public class Recursion_String {
    public static void main(String[] args) {
        String test = "12345";
        System.out.println();
        System.out.println(length(test));
        printChars(test);
        printCharReverse(test);
        printInBinary(10);
    }

    // 문자열의 길이

    static int length(String str) {
        if (str.isEmpty())
            return 0;
        else
            return 1 + length(str.substring(1));
    }

    // 문자열의 프린트
    static void printChars(String str) {
        if (str.isEmpty()) {
            return;
        } else {
            System.out.print(str.charAt(0));
            printChars(str.substring(1));
        }
    }

    // 문자열 뒤집어 출력
    static void printCharReverse(String str) {
        if (str.isEmpty()) {
            return;
        } else {
            printCharReverse(str.substring(1));
            System.out.println(str.charAt(0));
        }
    }

    // 2진수로 변환하여 출력
    static void printInBinary( int n){
        if(n <2){
            System.out.print(n);
        }else {
            printInBinary(n/2);
            System.out.print(n%2);
        }
    }

    // 배열의 합 구하기
    public static int sum(int n, int[ ] data ){
        if( n<= 0)
            return 0;
        else
            return sum(n-1,data) + data[n -1];
    }

    // 데이터 파일로부터 n 개의 정수 읽어오기
    public void readForm(int n, int[] data, Scanner in){
        if (n == 0){
            return;
        }else {
            readForm(n-1 , data , in);
            data[n -1] = in.nextInt();
        }
    }
}
