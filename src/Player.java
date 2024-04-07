public class Player {
    private String name;
    private int points;

    public Player(String name){
        this.name = name;
        points = 0;
    }

    public void addPoints() {
        points += 4;
    }

    public void displayPoints() {
        System.out.println("Current Points: " + points);
    }

}
