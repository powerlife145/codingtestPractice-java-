import java.util.Scanner;

public class Baekjoon_2884 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x =sc.nextInt();
        int y =sc.nextInt();

        if(y-45>=0){
            if(x==0){
                System.out.println(0);
                System.out.println(y-45);
            } else {
                System.out.println(x);
                System.out.println(y-45);
            }
        } else if (y-45<0){
            if(x==0){
                System.out.println(23);
                System.out.println(y+15);
            } else {
                System.out.println(x-1);
                System.out.println(y+15);
            }
        }

    }
}
