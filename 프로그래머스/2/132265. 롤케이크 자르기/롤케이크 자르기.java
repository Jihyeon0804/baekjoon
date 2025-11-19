import java.util.*;

class Solution {
    public int solution(int[] topping) {
        
        int answer = 0;

        Set<Integer> pre = new HashSet<>();
        Set<Integer> post = new HashSet<>();
        int[] cnt = new int[topping.length];
        
        for (int i = 0; i < topping.length; i++) {
            pre.add(topping[i]);
            cnt[i] = pre.size();
        }

        for (int i = topping.length - 1; i > 0; i--) {
            post.add(topping[i]);
            if (cnt[i - 1] == post.size()) {
                answer++;
            }
        }

        return answer;
    }
}
