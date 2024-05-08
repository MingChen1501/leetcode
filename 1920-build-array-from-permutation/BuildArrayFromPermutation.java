public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        int[] result = buildArray(nums);
        showAnswer(result);
    }

    private static void showAnswer(int[] result) {
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }

    private static int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[nums[i]];
        }
        return result;
    }
}
