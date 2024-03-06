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