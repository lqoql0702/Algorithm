import java.util.Scanner;

public class ex15 {

    public String solution(int n, int[] a, int[] b){
        String answer = "";
        for(int i=0; i<n; i++){
            if(a[i] == b[i]) answer+="D";
            else if(a[i]==1 && b[i]==3) answer+="A";
            else if(a[i]==2 && b[i]==1) answer+="A";
            else if(a[i]==3 && b[i]==2) answer+="A";
            else answer+="B";
        }
        return answer;
    }

    public static void main(String[] args){
        ex15 T = new ex15();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];

        for(int i = 0; i < n; i++){
            A[i] = in.nextInt();
        }
        for(int i = 0; i < n; i++){
            B[i] = in.nextInt();
        }
        System.out.println(T.solution(n, A, B));

    }
}
