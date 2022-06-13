package example;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Add {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        StringTokenizer st = new StringTokenizer(str,"+");

        int sum=0;

        while(st.hasMoreTokens()){
            String token = st.nextToken();
            token = token.trim();
            sum+=Integer.parseInt(token);
        }
        System.out.println("합은 "+sum);
        s.close();
    }
}
