public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int x = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = x;
        System.out.println(nums[0] + nums[nums.length/2]);
    }
}
