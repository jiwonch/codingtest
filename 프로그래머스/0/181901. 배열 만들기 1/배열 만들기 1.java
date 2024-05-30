/**
* @brief n이하의 정수 중에서 k의 배수를 오름차순으로 저장한 배열을 리턴하는 함수
* @param1 Integer n
* @param2 Integer k
* @return Integer answer
*/

class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        for(int i = 1; i <= n; i++){
            if (i % k == 0){
                answer[i/k-1] = i;
            }
        }
        return answer;
    }
}