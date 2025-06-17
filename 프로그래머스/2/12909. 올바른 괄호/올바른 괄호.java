class Solution {
    boolean solution(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                sum++;
            } else {
                sum--;
            }
            if (sum < 0) {
                return false;
            }
        }
        return sum == 0;
    }
}