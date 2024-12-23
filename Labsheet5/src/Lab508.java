import javax.swing.JOptionPane;

public class Lab508 {

    public static void main(String[] args) {
        int[] nums = {25, 78, 41, 22, 36, 85, 37};
        
        int index = Integer.parseInt(JOptionPane.showInputDialog("Input index of array:"));
        while (!checkIndex(nums, index)) {
            index = Integer.parseInt(JOptionPane.showInputDialog("Input index of array, again:"));
        }

        int current = currentData(nums, index);
        String previous = (index > 0) ? "nums[" + (index - 1) + "] is " + prevData(nums, index) : "No previous data";
        String next = (index < nums.length - 1) ? "nums[" + (index + 1) + "] is " + nextData(nums, index) : "No next data";

        String message = "Current data, nums[" + index + "] is " + current + "\n" +
                         "Previous data: " + previous + "\n" +
                         "Next data: " + next;
        JOptionPane.showMessageDialog(null, message);
    }

    public static boolean checkIndex(int[] nums, int index) {
        return index >= 0 && index < nums.length;
    }

    public static int currentData(int[] nums, int index) {
        return nums[index];
    }

    public static int prevData(int[] nums, int index) {
        return nums[index - 1];
    }

    public static int nextData(int[] nums, int index) {
        return nums[index + 1];
    }
}
