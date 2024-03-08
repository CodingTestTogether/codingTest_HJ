// 덧셈식 출력하기
// 두 정수 a, b가 주어질 때 다음과 같은 형태의 계산식을 출력하는 코드를 작성해 보세요.
// a + b = c
// 제한사항) 1 ≤ a, b ≤ 100

import java.util.Scanner;

public class basic06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;

        if(1 <= a && a <= 100 && 1<= b && b <= 100){
            System.out.println(a + " + " + b + " = " + sum);
        } else {
            System.out.println("제한사항: 1 <= a, b <= 100");
        }
    }
}
