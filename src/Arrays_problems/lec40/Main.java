package Arrays_problems.lec40;

public class Main {
    static double sqrt(int n) {
        int s = 1;
        int e = n;
        double ans = -1;
        if (n == 0) {
            return 0;
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
        // for precise values
        double factor = 1;
        int totalPrecision = 4;

        for (int i = 0; i < totalPrecision; i++) {
            factor = factor / 10;
            for (int j = 0; j < 10; j++) {
                double newAns = ans + factor;
                if (newAns*newAns<n){
                    ans = newAns;
                } else if (newAns*newAns==n) {
                    return newAns;
                }else{
                    break;
                }
            }
            System.out.println("answer of this round: " + Math.round(ans*1000.0)/1000.0);
        }
        System.out.print("final answer: ");
        return  (Math.round(ans*1000.0)/1000.0);
    }


    static void main(String[] args) {
        System.out.println(sqrt(8));
    }
}
