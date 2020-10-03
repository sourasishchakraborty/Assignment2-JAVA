import java.util.Scanner;

public class Pairstar {
    static  String result = "";
    static void pairStar(String input, int i ){
        result = result + input.charAt(i);
        if(i == input.length()-1){
            return;
        }
        if(input.charAt(i)==input.charAt(i+1)){
            result = result + '*';
        }
        pairStar(input,i+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Pairstar obj = new Pairstar();
        obj.pairStar(s,0);
        System.out.println(result);
    }
}
