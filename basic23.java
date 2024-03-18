// 주사위 게임2

// 1부터 6까지 숫자가 적힌 주사위가 세 개 있습니다. 세 주사위를 굴렸을 때 나온 숫자를 각각 a, b, c라고 했을 때 얻는 점수는 다음과 같습니다.

// 세 숫자가 모두 다르다면 a + b + c 점을 얻습니다.
// 세 숫자 중 어느 두 숫자는 같고 나머지 다른 숫자는 다르다면 (a + b + c) × (a2 + b2 + c2 )점을 얻습니다.
// 세 숫자가 모두 같다면 (a + b + c) × (a2 + b2 + c2 ) × (a3 + b3 + c3 )점을 얻습니다.
// 세 정수 a, b, c가 매개변수로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.



class basic23 {
    public int solution(int a, int b, int c) {
        int answer = 0;
        double result = 1;
        if(a!=b && b!=c && c!=a){
            result = a+b+c;
        } else if(a==b && b==c){
            for(int i=0; i<3; i++){
                result *= (Math.pow(a,i+1) + Math.pow(b,i+1) + Math.pow(c,i+1));
            }
        } else {
            for(int i=0; i<2; i++){
                result *= (Math.pow(a,i+1) + Math.pow(b,i+1) + Math.pow(c,i+1)); 
            }
        }
        answer = (int) result;
        return answer;
    }
}