import java.util.Scanner;

public class ex02 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input = in.next();

        char[] ch = input.toCharArray();
        String result = new String();
        
        for(char ch1 : ch){
            if(Character.isLowerCase(ch1)){
                result += Character.toUpperCase(ch1);
            }else{
                result += Character.toLowerCase(ch1);
            }
        }

        System.out.println(result);
    }
}
