public class Customer {

    public void order(){
        System.out.print("May I get "
                + randNum() + " cups of Lemonade with "
                + randNum() + " lemons,"
                + randNum() + " sugar cubes, "
                + randNum() + " ice cubes and");
        if (pinkOrNo()){
            System.out.print(" make that pink please!");
        } else {
            System.out.print(" no pink lemonade, thank you.");
        }
    }

    public void greeting(){
        System.out.println("Hello");
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
