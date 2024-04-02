import java.util.Scanner;
public class LemonadeStandUX {
    private Scanner scan;
    private LemonadeStandUI ui;
    public LemonadeStandUX(){
        scan = new Scanner(System.in);
        ui = new LemonadeStandUI();
    }

    public void start(){
        ui.logo();
        Utility.timedClearScreen(500);
        System.out.print("Hello! What's your name? ");
        String playerName = scan.nextLine();
        System.out.println("Nice to meet you, " + playerName + ". Thanks for signing up for the job.");
        Utility.sleep(500);
        System.out.println("Let me run through your tasks real quick!");
        Utility.sleep(500);
        System.out.println("So your goal is to serve your customers lemonade.");
        Utility.sleep(500);
        System.out.println("Each customer has different orders so make sure you get them right!");
        Utility.sleep(500);
        System.out.println("If you have any questions, just enter in Q!");
        Utility.sleep(500);
        System.out.println("Have fun : )");
        Utility.timedClearScreen(1500);
        Player player = new Player(playerName);
    }

    public void play(){
        Inventory inventory = new Inventory();
    }

    private Customer duckOrPigeon(){
        int num = (int) (Math.random()*2)+1;
        if (num == 1){
            return new Duck();
        } else {
            return new Pigeon();
        }
    }
}
