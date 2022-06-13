package example;

import java.util.Scanner;

public class backjon_ex1 {
    public static void main(String [] args){
        int x, y;
        Scanner s = new Scanner(System.in);
        x = Integer.parseInt(s.next());
        y = Integer.parseInt(s.next());
        System.out.println(x*(y%10));
        System.out.println(x*((y%100-y%10)/10));
        System.out.println(x*(y/100));
        System.out.println(x*y);
    }
}
