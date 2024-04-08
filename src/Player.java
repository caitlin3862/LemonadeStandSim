public class Player {
    private String name;
    private int points;
    private double money;

    public Player(String name){
        this.name = name;
        points = 0;
        money = 20.0;
    }

    public double getMoney(){
        return money;
    }

    public void addPoints() {
        points += 4;
    }

    public void addMoney(double amt){
        money += amt;
    }


    public void displayPoints() {
        System.out.println("Current Points: " + points);
    }

}
