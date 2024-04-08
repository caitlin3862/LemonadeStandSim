public class Customer {
    private int[] order;
    private boolean pink;
    private boolean blue;

    private boolean regular;

    public Customer() {
        order = new int[4];
        order[0] = randNum(); // cups
        order[1] = randNum(); // lemons
        order[2] = randNum(); // sugar cubes
        order[3] = randNum(); // ice cubes
        pink = false;
        blue = false;
        regular = false;
    }
    
    public int[] getOrder() {
        return order;
    }

    public boolean getPink() {
        return pink;
    }

    public boolean getBlue() { return blue; }

    public boolean getRegular() { return regular; }

    public void order(){
        pinkOrBlue();
        System.out.print("May I get "
                + order[0] + " cups of Lemonade with "
                + order[1] + " lemons,"
                + order[2] + " sugar cubes, "
                + order[3] + " ice cubes and");
        if (pink) {
            System.out.print(" make that pink please!\n");
        } else if (blue) {
            System.out.println(" make that blue please!\n");
        } else {
            System.out.print(" regular lemonade, thank you.\n");
        }
    }

    public void greeting(){
        System.out.println("Hello!");
    }

    private int randNum(){
        return (int) (Math.random()*4) + 1;
    }

    private void pinkOrBlue() {
        if (randNum() > 0.6) {
            pink = true;
        } else if (randNum() > 0.3) {
            blue = true;
        } else {
        regular = true;
        }
    }





}
