import java.util.Scanner;

class Inventory {
    private int[][] stock;
    private Scanner scan;

    public Inventory() {
        stock = new int[3][4]; // 3 rows for different flavors, 4 columns for different ingredients
        initializeStock();
        scan = new Scanner(System.in);
    }

    private void initializeStock() {
        for (int i = 0; i < stock.length; i++) {
            for (int j = 0; j < stock[i].length; j++) {
                stock[i][j] = (int) (Math.random() * 21);
            }
        }
    }

    public void printInventory() {
        String[] flavors = {"Regular", "Pink", "Blue"};
        String[] ingredients = {"Cups", "Lemons", "Sugar Cubes", "Ice Cubes"};

        System.out.println("Inventory:");
        System.out.println();
        printColors();
        System.out.print("What flavor inventory do you want to see? (Enter number) ");
        int flavor = scan.nextInt();
        if (flavor == 1){
            printIngredients(0);
        } else if (flavor == 2){
            printIngredients(1);
        } else if (flavor == 3){
            printIngredients(2);
        } else {
            System.out.println("Please enter a valid number!");
        }
        Utility.sleep(6000);
//        for (int i = 0; i < stock.length; i++) {
//            System.out.println(flavors[i] + ":");
//            for (int j = 0; j < stock[i].length; j++) {
//                System.out.println("  " + ingredients[j] + ": " + stock[i][j]);
//            }
//            System.out.println();
//        }
    }

    public void updateInventory(int flavor, String ingredient, int quantity, Player player) {
        if (ingredient.equals("cups")) {
                stock[flavor-1][0] += quantity;

                if (stock[flavor-1][0] < 0) {
                    System.out.println("You've run out of cups! Refill for $2");
                    // figure out how to subtract player money
                    player.addMoney(-2);
                    stock[flavor-1][0] += 5;
                }

        } else if (ingredient.equals("lemons")) {
                stock[flavor-1][1] += quantity;
            if (stock[flavor-1][1] < 0) {
                System.out.println("You've run out of lemons! Refill for $5");
                stock[flavor-1][1] += 10;
                player.addMoney(-5);
            }
        } else if (ingredient.equals("sugar cubes")) {
                stock[flavor-1][2] += quantity;
                if (stock[flavor-1][2] < 0) {
                    System.out.println("You've run out of sugar cubes! Refill for $4");
                    stock[flavor-1][2] += 10;
                    player.addMoney(-4);
                }
        } else if (ingredient.equals("ice cubes")) {
                stock[flavor-1][3] += quantity;
                if (stock[flavor-1][3] < 0) {
                    System.out.println("You've run out of ice cubes! Refill for $3");
                    stock[flavor-1][3] += 10;
                    player.addMoney(-3);
                }
        }
    }


    public void printIngredients(int row){
        System.out.println(Utility.RED + "     ____________   " + Utility.YELLOW + "      __.---.-.__      " + Utility.RESET + "       ,_.__._,          " + Utility.CYAN + "    __________" + Utility.RESET);
        System.out.println(Utility.RED + "    (____________)  " + Utility.YELLOW + "     /   .    . .\\    " + Utility.RESET + "       /.___*./|          " + Utility.CYAN + "   /         /|" + Utility.RESET);
        System.out.println(Utility.RED + "    |            |  " + Utility.YELLOW + "   _/ . .   .    .\\_  " + Utility.RESET + "    ,_.| *.  .||_._,      " + Utility.CYAN + "  /_________/ |" + Utility.RESET);
        System.out.println(Utility.RED + "    |            |  " + Utility.YELLOW + "  {|.  .   .   .   |}  " + Utility.RESET + "  /.__|*.__._|/_*/|      " + Utility.CYAN + "  |         | |--__" + Utility.RESET);
        System.out.println(Utility.RED + "    |            |  " + Utility.YELLOW + "    \\    .    . . /   " + Utility.RESET + "   |.* .  ||.* .  || *    " + Utility.CYAN + "  |         | /     \\" + Utility.RESET);
        System.out.println(Utility.RED + "     \\__________/  " + Utility.YELLOW + "      \\.___.____._/    " + Utility.RESET + " * |___*_.||___*_.|/ ..*  " + Utility.CYAN + "  |_________|/  ,____/" + Utility.RESET);
        System.out.println(Utility.CYAN + "                                                                                \\__/ " + Utility.RESET);
        System.out.println("    Cups: " + stock[row][0] + "            Lemons: " + stock[row][1] + "              Sugar cubes: " + stock[row][2] + "            Ice Cubes: " + stock[row][3]);
    }

    public void printColors(){
        System.out.println(Utility.YELLOW + "      __.---.-.__     " + Utility.PINK + "          /\\     " + Utility.BLUE + "             /\\"+ Utility.RESET);
        System.out.println(Utility.YELLOW + "     /   .    . .\\   " + Utility.PINK + "          /  \\    " + Utility.BLUE + "            /  \\"+ Utility.RESET);
        System.out.println(Utility.YELLOW + "   _/ . .   .    .\\_ " + Utility.PINK + "         /____\\   " + Utility.BLUE + "           /____\\"+ Utility.RESET);
        System.out.println(Utility.YELLOW + "  {|.  .   .   .   |} " + Utility.PINK + "       /      \\  " + Utility.BLUE + "          /      \\"+ Utility.RESET);
        System.out.println(Utility.YELLOW + "    \\    .    . . /  " + Utility.PINK + "       |        |  " + Utility.BLUE + "        |        |"+ Utility.RESET) ;
        System.out.println(Utility.YELLOW + "     \\.___.____._/   " + Utility.PINK + "        \\______/  " + Utility.BLUE + "          \\______/"+ Utility.RESET);
        System.out.println();
        System.out.print("  Regular Flavor: 1       Pink Flavor: 2      Blue Flavor: 3");
        System.out.println();
    }


}