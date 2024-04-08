import java.util.Scanner;
public class LemonadeStandUX {
    private Scanner scan;
    private LemonadeStandUI ui;
    private Customer customer;
    private int numCorrect;
    private boolean gameOver;
    private Player player;
    private Inventory inventory;
    public LemonadeStandUX(){
        scan = new Scanner(System.in);
        ui = new LemonadeStandUI();
        customer = duckOrPigeon();
        gameOver = false;
        inventory = new Inventory();
    }

    public void start(){
        ui.logo();
        Utility.timedClearScreen(5000);
        System.out.print("Hello! What's your name? ");
        String playerName = scan.nextLine();
        System.out.println("Nice to meet you, " + playerName + ". Thanks for signing up for the job.");
        Utility.sleep(2500);
        System.out.println("Let me run through your tasks real quick!");
        Utility.sleep(2500);
        System.out.println("So your goal is to serve your customers lemonade.");
        Utility.sleep(2500);
        System.out.println("Each customer has different orders so make sure you get them right!");
        Utility.sleep(2500);
        System.out.println("Have fun : )");
        Utility.timedClearScreen(5000);
        player = new Player(playerName);
    }

    public void play(){
        start();
        while(!gameOver){
            Inventory inventory = new Inventory();
            customer.greeting();
            ui.menu();
            System.out.print("Enter choice: ");
            int option = scan.nextInt();
            if (option == 1){
                customer.order();
            } else if (option == 2){
                System.out.println(enterOrder());
                player.displayPoints();
            } else if (option == 3){
                Utility.timedClearScreen(0);
                inventory.printInventory();
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
        System.out.println("What kind of lemonade?? (Enter 1 for regular/2 for pink/3 for blue)");
        int enteredType = scan.nextInt();
        if ((enteredType == 1 && customer.getRegular()) || (enteredType == 2 && (customer.getPink())) || (enteredType == 3 && (customer.getBlue()))) {
            numCorrect++;
            player.addPoints();
        } else if ((enteredType == 2 && !(customer.getPink()))) {
            error += "Why is it pink?? " + "\n";
            System.out.println();
        } else if ((enteredType == 1 && !(customer.getRegular()))) {
            error += "What happened to my flavor :( " + "\n";
            System.out.println();
        } else if ((enteredType == 3 && !(customer.getBlue()))) {
            error += "Why is it blue??" + "\n";
        } else {
            error += "That wasn't a yes or no..." + "\n";
            System.out.println();
        }
        System.out.println("How many cups?");
        int enteredCups = scan.nextInt();
        if (enteredCups == customer.getOrder()[0]) {
            numCorrect++;
        } else if (enteredCups > customer.getOrder()[0]){
           error = "Uh oh! That was too many cups! " + "\n";
            System.out.println();
        } else {
            error = "Uh oh! Not enough cups! " + "\n";
            System.out.println();
        }
        System.out.println("How many lemons? ");
        int enteredLemons = scan.nextInt();
        if (enteredLemons == customer.getOrder()[1]) {
            numCorrect++;
        } else if (enteredLemons > customer.getOrder()[1]) {
            error += "Too many lemons... " + "\n";
            System.out.println();
        } else {
            error += "Not enough lemons! " + "\n";
            System.out.println();
        }
        System.out.println("How many sugar cubes? ");
        int enteredSugar = scan.nextInt();
        if (enteredSugar == customer.getOrder()[2]) {
            numCorrect++;
        } else if (enteredSugar > customer.getOrder()[2]) {
            error += "Sugar rush! Way too sweet! " + "\n";
            System.out.println();
        } else {
            error += "So bitter.. Not enough sugar " + "\n";
            System.out.println();
        }
        System.out.println("How many ice cubes? ");
        int enteredIce = scan.nextInt();
        if (enteredIce == customer.getOrder()[3]) {
            numCorrect++;
        } else if (enteredIce > customer.getOrder()[3]) {
            error += "B-brr.. Too cold! " + "\n";
            System.out.println();
        } else {
            error += "Ew! It's so warm.. " + "\n";
            System.out.println();
        }

        return error;
    }


    private boolean isGameOver(){
        return false;
    }
}
