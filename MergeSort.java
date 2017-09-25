public class FindBug {

    public static void main(String[] args) {
        FindBug f = new FindBug();
        int[] nums = new int[]{12, 30, 5, 2, 34, 21};
        int[] result = f.mergeSort(nums);
        for (int i : result) {
            System.out.println(i);
        }
    }

    public void merge(int[] nums, int l, int m, int r, int[] nums2) {
        int i = l, j = m;
        for (int k = l; k < r; k++) {
            if (i < m && (j >= r || nums[i] <= nums[j])) {
                nums2[k] = nums[i];
                i = i + 1;
            } else {
                nums2[k] = nums[j];
                j = j + 1;
            }
        }
    }

    public int[] mergeSort(int[] nums) {
        int[] res = new int[nums.length];
        //要copy每个元素，当数组只剩下最后一个元素的时候是直接return的
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i];
        }
        mergeSort(nums, 0, nums.length, res);
        return res;
    }

    public void mergeSort(int[] nums, int left, int right, int[] nums1) {
        if (right - left < 2) {
            return;
        }
        int mid = (right + left) / 2;
        //这里nums与nums1是交错开来的，因为最后merge是在nums的基础上得到nums1,所以上面是要对nums进行改变。
        mergeSort(nums1, left, mid, nums);
        mergeSort(nums1, mid, right, nums);
        merge(nums, left, mid, right, nums1);
    }
}