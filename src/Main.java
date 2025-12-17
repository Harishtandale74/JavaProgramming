import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(s);
        sc.close();


        for (int i = 0; i < 5; i++) {
            System.out.println(s);

        }

        for (int i = 0; i < 6; i++) {
            System.out.println("*");

        }

        for (int i = 0; i < 6; i++) {
            System.out.print("*");
            System.out.println("");

        }

        for (int i = 0; i < 6; i++) {
            System.out.print("*");
            for (int j = 0; j < 6; j++) {
                System.out.println("");

            }

        }

        int sum =0;
        for (int i = 0; i <5 ; i++) {
            sum = sum+i;
            System.out.println(sum);

        }
        sc.close();
    }
}






//void main() {
//    System.out.println("Hello World");
//}
