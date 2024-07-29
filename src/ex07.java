import java.util.Scanner;

public class ex07 {
    public String solution(String str){
        String answer="YES";
        str=str.toUpperCase();
        int len=str.length();
        for(int i=0; i<len/2; i++){
            if(str.charAt(i)!=str.charAt(len-i-1)) answer="NO";
        }
        return answer;
    }

    public static void main(String[] args){
        ex07 T = new ex07();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.print(T.solution(str));
    }

}
