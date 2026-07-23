package Arrays_problems.lec44_EKO_Spoj;

public class Main {
    static boolean isValid(int[] trees, int m, int maxHeight) {
        int totalWoodColl = 0;

        for (int i = 0; i < trees.length; i++) {
            if (trees[i]>maxHeight){ // tree height more than blade height
                // so it can give some wood
                int woodCollected = trees[i] - maxHeight;
                totalWoodColl += woodCollected;

            }
        }
        if (totalWoodColl>=m){
            return true;
        }else{
            return false;
        }
    }

    static int eko_SPOJ(int[] trees, int m) {
        int n = trees.length;
        int s = 0;
        int max = -1;

        for(int h:trees){
            if (h>max){
                max=h;
            }
        }
        int e = max;
        int ans = 0;

        while(s<=e){
            int mid = s+(e-s)/2;
            if (isValid(trees,m,mid)){
                ans = mid;
                s = mid+1;
            }else {
                e = mid -1;
            }
        }
        return ans;
    }

    static void main(String[] args) {
        int[] trees = {20,15,10,17};
        System.out.println(eko_SPOJ(trees, 7));
    }
}
