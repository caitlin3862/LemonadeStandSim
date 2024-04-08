public class Customer {
    private int[] order;
    //    private boolean pink;
//    private boolean blue;
//    private boolean regular;
    private String flavor;

    public Customer() {
        order = new int[4];
        order[0] = randNum(); // cups
        order[1] = randNum(); // lemons
        order[2] = randNum(); // sugar cubes
        order[3] = randNum(); // ice cubes
//        pink = false;
//        blue = false;
//        regular = false;
        flavor = pinkOrBlue();
    }

    public String getType() {
        return "Customer";
    }
    public int[] getOrder() {
        return order;
    }

    public String getFlavor() {
        return flavor;
    }

//    public boolean getPink() {
//        return pink;
//    }
//
//    public boolean getBlue() { return blue; }
//
//    public boolean getRegular() { return regular; }

    public void order(){
        System.out.print("May I get "
                + order[0] + " cups of Lemonade with "
                + order[1] + " lemons, "
                + order[2] + " sugar cubes, "
                + order[3] + " ice cubes and");
        if (flavor.equals("pink")) {
            System.out.print(" make that pink please!\n");
        } else if (flavor.equals("blue")) {
            System.out.println(" make that blue please!\n");
        } else {
            System.out.print(" regular lemonade, thank you.\n");
        }
    }


    public void greeting(){
        System.out.print("Hello! ");
    }

    private int randNum(){
        return (int) (Math.random()*4) + 1;
    }

    private String pinkOrBlue() {
        int num = (int)(Math.random() * 3) + 1;
        if (num == 1) {
            return "pink";
        } else if (num == 2) {
            return "blue";
        } else {
            return "regular";
        }
    }





}
