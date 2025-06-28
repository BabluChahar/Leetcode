class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<Character> list = new ArrayList<>();
        int start = 0;
        int end = 0;
        int max = 0;

        while (end < s.length()) {
            char c = s.charAt(end);
            if (!list.contains(c)) {
                list.add(c);
                end++;
                max = Math.max(max, list.size());
            } else {
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }

        return max;
    }
}




