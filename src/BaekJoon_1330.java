import java.util.Scanner;
public class BaekJoon_1330 {

    public static void main(String[] args) {
        //백준 1330번 문제
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b){
            System.out.println(">");
        } else if (a<b) {
            System.out.println("<");
        } else if (a==b) {
            System.out.println("==");
        }


    }
}
