import java.util.Scanner;

public class ex16 {

    public void solution(int n){

        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        int i = 2;

        while(i != n){
            arr[i] = arr[i-2] + arr[i-1];
            i++;
        }

        for(int a: arr){
            System.out.print(a);
            System.out.print(" ");
        }
    }

    public static void main(String[] args){
        ex16 T = new ex16();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        T.solution(n);
    }
}
