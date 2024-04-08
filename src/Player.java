public class Player {
    private String name;
    private int points;
    private double money;

    public Player(String name){
        this.name = name;
        points = 0;
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

    public void spendMoney(double amt){
        if(money - amt >= 0){
            money -= amt;
        } else {
            System.out.println("You don't have enough money! ");
        }
    }

    public void displayPoints() {
        System.out.println("Current Points: " + points);
    }

}
