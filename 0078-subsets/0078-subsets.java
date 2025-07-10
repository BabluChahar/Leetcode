class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resultset = new ArrayList<>();
        backtracking(resultset, new ArrayList<>(), nums, 0);
        return resultset;
    }

    void backtracking(List<List<Integer>> resultset, List<Integer> tempset, int[] nums, int start) {
        resultset.add(new ArrayList<>(tempset));
        for (int i = start; i < nums.length; i++) {
            tempset.add(nums[i]);
            backtracking(resultset, tempset, nums, i + 1);
            tempset.remove(tempset.size() - 1);
        }
    }
}
