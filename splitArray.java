import java.util.Scanner;
public class splitArray {

    public boolean splitarray(int[] arr){
        int index = 0;
        int sum1 = 0;
        int sum2 = 0;
        return recArray(arr,index,sum1,sum2);
    }

    private boolean recArray(int[] arr,int index, int sum1, int sum2){
        if(index >= arr.length){
            return sum1==sum2;
        }
        int value = arr[index];
        return (recArray(arr,index+1,sum1+value,sum2)|| recArray(arr,index+1,sum1,sum2+value));

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(arr[i]<0){
                System.out.println("Invalid Input");
                System.exit(0);
            }
        }

        splitArray obj = new splitArray();
        System.out.println(obj.splitarray(arr));

    }
}
