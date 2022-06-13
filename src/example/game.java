package example;

import java.util.StringTokenizer;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.print("가위(1), 바위(2), 보(3), 끝내기(4)>>");
            int user = s.nextInt();
            if (user == 4) {
                System.out.println("게임을 종료합니다.");
                break;
            }
            int com = (int)(Math.random()*3+1);
            switch (user) {
                case 1:
                    if(com==1){
                        System.out.println("사용자 가위 : 컴퓨터 가위");
                        System.out.println("비겼습니다.");
                    }
                    else if (com==2){
                        System.out.println("사용자 가위 : 컴퓨터 바위");
                        System.out.println("사용자가 졌습니다.");
                    }
                    else if(com==3){
                        System.out.println("사용자 가위 : 컴퓨터 보");
                        System.out.println("사용자가 이겼습니다.");
                    }
                    break;
                case 2:
                    if(com==1){
                        System.out.println("사용자 바위 : 컴퓨터 가위");
                        System.out.println("사용자가 이겼습니다.");
                    }
                    else if (com==2){
                        System.out.println("사용자 바위 : 컴퓨터 바위");
                        System.out.println("비겼습니다.");
                    }
                    else if(com==3){
                        System.out.println("사용자 바위 : 컴퓨터 보");
                        System.out.println("사용자가 졌습니다.");
                    }
                    break;
                case 3:
                    if(com==1){
                        System.out.println("사용자 보 : 컴퓨터 가위");
                        System.out.println("사용자가 졌습니다.");
                    }
                    else if (com==2){
                        System.out.println("사용자 보 : 컴퓨터 바위");
                        System.out.println("사용자가 이겼습니다.");
                    }
                    else if(com==3){
                        System.out.println("사용자 보 : 컴퓨터 보");
                        System.out.println("비겼습니다.");
                    }
                    break;
            }
        }
    }
}
