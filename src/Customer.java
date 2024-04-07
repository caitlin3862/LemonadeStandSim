public class Customer {
    private int[] order;
    private boolean pink;

    public Customer() {
        order = new int[4];
        order[0] = randNum(); // cups
        order[1] = randNum(); // lemons
        order[2] = randNum(); // sugar cubes
        order[3] = randNum(); // ice cubes
        pink = pinkOrNo();
    }
    
    public int[] getOrder() {
        return order;
    }

    public boolean getPink() {
        return pink;
    }

    public void order(){
        
        System.out.print("May I get "
                + order[0] + " cups of Lemonade with "
                + order[1] + " lemons,"
                + order[2] + " sugar cubes, "
                + order[3] + " ice cubes and");
        if (pink){
            System.out.print(" make that pink please!\n");
        } else {
            System.out.print(" no pink lemonade, thank you.\n");
        }
    }

    public void greeting(){
        System.out.println("Hello!");
    }

    private int randNum(){
        return (int) (Math.random()*4) + 1;
    }

    private boolean pinkOrNo(){
        if (randNum() > 2){
            return true;
        }
        return false;
    }

}
