import java.util.Scanner;

public class ex14 {

    public static int solution(int n, int[] arr){
        int max = 0;
        int count = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
                count++;
            }
        }
        return count;
    }
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = in.nextInt();
            }
            System.out.println(solution(n, arr));
        }

}
