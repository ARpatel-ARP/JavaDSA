package Arrays_problems.lec42_PPP;

public class Main {
    static boolean isValid(int[] nums, int mid, int k){
        int painterCount = 1;
        int time = 0;

        for(int i=0; i<nums.length; i++){
            if(time + nums[i] <= mid){
                time += nums[i];
            }else{
                painterCount++;
                if(painterCount > k || nums[i] > mid){
                    return false;
                }else{
                    time = 0;
                    time += nums[i];
                }
            }
        }
        return true;
    }
    static int PPP(int[] nums, int k) {
        int s = 0;
        int sum = 0;
        for(int num:nums){
            s = Math.max(s,num);
            sum += num;
        }
        int e = sum;
        int ans = -1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(isValid(nums,mid,k)){
                ans = mid;
                e = mid-1;
            }else{
                s = mid +1;
            }
        }
        return ans;
    }

    static void main(String[] args) {
        int[] nums = {10,20,30,50};
        System.out.println(PPP(nums, 2));
    }
}
