import java.util.Scanner;

public class DigitSum {
    static int countRec(int n, int sum){
        if(n==0){
            return sum == 0 ?1:0;
        }
        if(sum==0){
            return 1;
        }
        int ans=0;
        for(int i=0;i<=9;i++){
            if(sum-i >=0){
                ans+= countRec(n-1,sum-i);


            }

        }
        return ans;
    }
    static int finalCount(int n, int sum){
        int ans=0;
        for(int i=1;i<=9;i++){
            if(sum-i >=0){
                ans += countRec(n-1,sum-i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DigitSum obj = new DigitSum();
        int n = sc.nextInt();
        int sum = sc.nextInt();

        System.out.println(obj.finalCount(n,sum));
    }
}
