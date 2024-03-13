// Q4) 공배수
// [문제 설명]
// 정수 number와 n, m이 주어집니다. 
// number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 return하도록 solution 함수를 완성해주세요.

public class basic17 {
    public int solution(int number, int n, int m) {
        int answer = 0;
        int common = 0;
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        
        if(max % min == 0){
            common = max;
        } else {
            common = n*m;
        }
        
        if(number % common == 0){
            answer = 1;
        }
        
        return answer;
    }
}