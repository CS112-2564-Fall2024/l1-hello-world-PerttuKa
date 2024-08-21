import java.util.Scanner;

public class Main {
    //Used walkthrough video as a guide/reference
    public static void main(String[] args) {


        
            System.out.println("Hello world!");
            System.out.println("What do you want to do in this World?");
            String answer = GetInput();
            CheckInput(answer);
            System.out.println("You want to " + answer + "?");
            System.out.println("What do you want to be called?");
            Name player = new Name(GetInput());
            Name playerDup = new Name(player);

            if (player.equals(playerDup)) {
                System.out.println("Your name is " + player + ", and has been duplicated");
            } else {
                System.out.println("Your name is " + player + ", but failed to duplicate!");
            }
            
        //will continue to ask you what you want to do
    }

    public static String GetInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
        //gets user input meathod
    }

    public static void CheckInput(String answer) {
            if (answer == null) {
                System.out.println("Bad answer :(");
            }
        //responds to user input
    }

}
