package Arrays_problems.lec40;

public class Main {
    static int sqrt(int n) {
        int s = 0;
        int e = n - 1;
        int ans = -1;
        if (n == 1) {
            return 1;
        }
        while (s <= e) {
            int mid = s + (e - s) / 2;
            long sq = (long) mid * mid;
            if (sq > n) { // move left
                e = mid - 1;
            } else if (sq < n) {
                ans = mid;
                s = mid + 1;
            } else {
                return mid;
            }
        }
        return ans;
    }

    static void main(String[] args) {
        System.out.println(sqrt(56));
    }
}
