// 영어 알파벳으로 이루어진 문자열 str이 주어집니다. 
// 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.

import java.util.Scanner;

public class basic04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        //String[] arr = a.split(""); // 한 문자씩 배열에 저장
        for(int i=0; i < a.length(); i++){
            //char ch = arr[i];
            char ch = a.charAt(i);
            if(ch >= 'a' && ch <='z'){
                char ch2 = Character.toUpperCase(ch);
                System.out.print(ch2);
            } else if(ch >= 'A' && ch <= 'Z') {
                char ch2 = Character.toLowerCase(ch);
                System.out.print(ch2);
            }
        }
    }
}