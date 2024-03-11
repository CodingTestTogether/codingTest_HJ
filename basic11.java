// 문자열 섞기
// 길이가 같은 두 문자열 str1과 str2가 주어집니다.
// 두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.
class basic11 {
    public String solution(String str1, String str2) {
        String[] arr1 = str1.split(""); // 한 글자씩 배열에 저장
        String[] arr2 = str2.split("");
        String answer = "";
        for(int i=0; i < str1.length(); i++){
            answer += arr1[i] + arr2[i];
        }
        
        return answer;
    }
}