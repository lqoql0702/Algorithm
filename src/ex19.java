import java.util.Scanner;

public class ex19 {

//    public static int solution(int n, int[] arr){
//        int[] result = new int[n];
//        int sum = 0;
//
//        if(arr[0] == 1) {
//            result[0] = 1;
//            sum += 1;
//        }
//        for(int i=1; i<n; i++){
//            if(arr[i] == 1){
//                result[i] = result[i-1] + 1;
//                sum += result[i];
//            }
//        }
//
//        return sum;
//    }

    public static int solution(int n, int[] arr){
        int answer =0, cnt=0;
        for(int i=0; i<n; i++){
            if(arr[i]==1){
                cnt++;
                answer+=cnt;
            }else{
                cnt=0;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        ex19 T = new ex19();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int number = in.nextInt();
            arr[i] = number;
        }

        System.out.print(T.solution(n, arr));
    }
}
