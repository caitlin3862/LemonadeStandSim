public class LemonadeStandUI {
    public void stand() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println(" \\                                                                            /");
        System.out.println("  \\                                                                          /");
        System.out.println("   --------------------------------------------------------------------------");
        for (int i = 0; i < 15; i++) {
            System.out.println("   |      |                                                          |      |");
        }
        System.out.println("   ---------------------------------------------------------------------------");
        System.out.println("  /                                                                           \\");
        System.out.println(" -------------------------------------------------------------------------------");
    }

    public void logo(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println(" \\                                                                            /");
        System.out.println("  \\                                                                          /");
        System.out.println("   --------------------------------------------------------------------------");
        for (int i = 0; i < 7; i++) {
            System.out.println("   |      |                                                          |      |");
        }
        System.out.println("   |      |                Lemonade Stand Simulator : )              |      |");
        for (int i = 0; i < 7; i++) {
            System.out.println("   |      |                                                          |      |");
        }
        System.out.println("   ---------------------------------------------------------------------------");
        System.out.println("  /                                                                           \\");
        System.out.println(" -------------------------------------------------------------------------------");

    }

    public void menu(){
        System.out.println("1. Talk with customer");
        System.out.println("2. Start order");
        System.out.println("3. Check inventory");
        System.out.println("4. Quit Game");
    }

}
