import java.util.Scanner;
import java.util.Random;
public class StonePaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter 0 for Stone");
        System.out.println("Enter 1 for Paper");
        System.out.println("Enter 2 for Scissor");
        System.out.print("Enter the Number of Rounds do you want to play:  ");
        int R = sc.nextInt();
        int uscore = 0;
        int cscore = 0;
        while (R>0) {
            int comp = random.nextInt(3);
            int user = sc.nextInt();
            System.out.println(comp);

            if (comp == user) {
                System.out.println("Draw, No one win in this round:|");
            } else if ((comp == 0 && user == 1) || (comp == 1 && user == 2) || (comp == 2 && user == 0)) {
                System.out.println("You Winnn:)");
                uscore++;
            } else {
                System.out.println("You Lose:(");
                cscore++;
            }
            System.out.println("Your score is: "+uscore+"\nComputer score is: "+cscore);

            R--;
        }
        System.out.println("RESULTS ARE\n");
        if (uscore>cscore){
            System.out.println("You Win!!!!");
        }else if (cscore>uscore){
            System.out.println("You Lose:(");
        }else {
            System.out.println("Ohh its a Draw");
        }

    }
}