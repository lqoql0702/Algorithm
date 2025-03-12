import java.util.ArrayList;
import java.util.Scanner;

public class ex18 {

//    public void solution(int n){
//        String result = "";
//
//        while(n != 0){
//            result+= n%10;
//            n = n/10;
//        }
//
//        int prime = Integer.parseInt(result);
//
//        for(int i=2; i <= prime; i++){
//            if(prime%i == 0 && prime!=2){
//                break;
//            }
//            if(i == prime - 1 || prime == 2){
//                System.out.print(prime);
//                System.out.print(" ");
//            }
//        }
//
//    }

    public boolean isPrime(int num){
        if (num==1) return false;
        for(int i=2; i<num; i++){
            if(num%i == 0) return false;
        }
        return true;
    }

    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i<n; i++){
            int tmp = arr[i];
            int res = 0;
            while(tmp > 0){
                int t = tmp%10;
                res = res*10+t;
                tmp=tmp/10;
            }
            if(isPrime(res)) answer.add(res);
        }

        return answer;
    }

    public static void main(String[] args){
        ex18 T = new ex18();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        for(int x: T.solution(n,arr)){
            System.out.print(x+ " ");
        }

    }
}
