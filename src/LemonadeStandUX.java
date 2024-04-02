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
        while(!gameOver){
            Inventory inventory = new Inventory();
            customer.greeting();
            customer.order();
            System.out.println(enterOrder());
            ui.menu();
            System.out.print("Enter choice: ");
            int option = scan.nextInt();
            if (option == 1){
                customer.order();
            } else if (option == 2){
                inventory.printInventory();
            } else if (option == 3){
                enterOrder();
            } else if (option == 4){
                gameOver = true;
            } else {
                System.out.println("Enter a valid number please!");
            }
        }
        System.out.println("You got " + numCorrect + " // 5 of the order right!");
    }

    private Customer duckOrPigeon(){
        int num = (int) (Math.random()*2)+1;
        if (num == 1){
            return new Duck();
        } else {
            return new Pigeon();
        }
    }

    private String enterOrder() {
        String error = "";
        System.out.println("Complete the order!");
        System.out.println("How many cups?");
        int enteredCups = scan.nextInt();
        if (enteredCups == customer.getOrder()[0]) {
            numCorrect++;
        } else if (enteredCups > customer.getOrder()[0]){
           error = "Uh oh! That was too many cups!";
            System.out.println();
        } else {
            error = "Uh oh! Not enough cups!";
            System.out.println();
        }
        System.out.println("How many lemons?");
        int enteredLemons = scan.nextInt();
        if (enteredLemons == customer.getOrder()[1]) {
            numCorrect++;
        } else if (enteredLemons > customer.getOrder()[1]) {
            error += "Too many lemons...";
            System.out.println();
        } else {
            error += "Not enough lemons!";
            System.out.println();
        }
        System.out.println("How many sugar cubes?");
        int enteredSugar = scan.nextInt();
        if (enteredSugar == customer.getOrder()[2]) {
            numCorrect++;
        } else if (enteredSugar > customer.getOrder()[2]) {
            error += "Sugar rush! Way too sweet!";
            System.out.println();
        } else {
            error += "So bitter.. Not enough sugar";
            System.out.println();
        }
        System.out.println("How many ice cubes?");
        int enteredIce = scan.nextInt();
        if (enteredIce == customer.getOrder()[3]) {
            numCorrect++;
        } else if (enteredIce > customer.getOrder()[3]) {
            error += "B-brr.. Too cold!";
            System.out.println();
        } else {
            error += "Ew! It's so warm..";
            System.out.println();
        }
        System.out.println("Pink lemonade? (Enter yes/no)");
        String enteredPink = scan.nextLine();
        if ((enteredPink.equals("yes") && customer.getPink()) || (enteredPink.equals("no") && !(customer.getPink()))) {
            numCorrect++;
        } else if ((enteredPink.equals("yes") && !(customer.getPink()))) {
            error += "Why is it pink??";
            System.out.println();
        } else if ((enteredPink.equals("no") && (customer.getPink()))) {
            error += "What happened to the pink :(";
            System.out.println();
        } else {
            error += "That wasn't a yes or no...";
            System.out.println();
        }
        return error;
    }

    private boolean isGameOver(){
        for (int quan)
    }
}
