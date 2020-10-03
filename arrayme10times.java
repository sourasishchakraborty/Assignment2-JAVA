import java.util.Scanner;

public class arrayme10times {

    public boolean checkArray(int[] num,int index){
        if(index >= num.length-1){
            return false;
        }
        if(num[index+1]==num[index]*10){
            return true;
        }
        return checkArray(num, index+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element you want to store: ");
        int n = sc.nextInt();
        int[] Array = new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            Array[i]=sc.nextInt();
            if(Array[i]<0){
                System.out.println("Invalid Input");
                System.exit(0);
            }
        }
        arrayme10times obj = new arrayme10times();
        boolean answer = obj.checkArray(Array,0);
        System.out.println(answer);
    }
}
