import java.util.Scanner;

public class ex08 {
    public String solution(String s){
        String answer="NO";
        s=s.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp=new StringBuilder(s).reverse().toString();
        if(s.equals(tmp)) answer="YES";
        return answer;
    }

    public static void main(String[] args){
        ex08 T = new ex08();
        Scanner kb = new Scanner(System.in);
        String str=kb.nextLine();
        System.out.print(T.solution(str));
    }

}
