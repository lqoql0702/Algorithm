import java.util.Scanner;


public class ex01 {
    public static void main(String[] args){
        ex01 ex01 = new ex01();
        Scanner in=new Scanner(System.in);
        String input1 = in.next().toLowerCase();
        char input2 = in.next().toLowerCase().charAt(0);

        System.out.println(ex01.solution(input1,input2));
    }

    public int solution(String str, char c){
        int count = 0;
//        for(int i = 0; i < str.length(); i++){
//            if(str.charAt(i) == c)
//                count++;
//        }
        for(char x : str.toCharArray()){
            if(x == c)
                count++;
        }

        return count;
    }
}
