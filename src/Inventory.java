class Inventory {
    private int[][] stock;

    public Inventory() {
        stock = new int[3][4]; // 3 rows for different flavors, 4 columns for different ingredients
        initializeStock();
    }

    private void initializeStock() {
        for (int i = 0; i < stock.length; i++) {
            for (int j = 0; j < stock[i].length; j++) {
                stock[i][j] = (int) (Math.random() * 21);
            }
        }
    }

    public void printInventory() {
        System.out.println("Inventory:");
        String[] flavors = {"Regular", "Pink", "Blue"};
        String[] ingredients = {"Cups", "Lemons", "Sugar Cubes", "Ice Cubes"};
        for (int i = 0; i < stock.length; i++) {
            System.out.println(flavors[i] + ":");
            for (int j = 0; j < stock[i].length; j++) {
                System.out.println("  " + ingredients[j] + ": " + stock[i][j]);
            }
            System.out.println();
        }
    }

    public void updateInventory(String ingredient, int quantity) {
        if (ingredient.equals("Cups")) {
            for (int i = 0; i < stock.length; i++) {
                stock[i][0] += quantity;

                if (stock[i][0] < 0) {
                    stock[i][0] = 0;
                }
            }
        } else if (ingredient.equals("Lemons")) {
            for (int i = 0; i < stock.length; i++) {
                stock[i][1] += quantity;
                if (stock[i][1] < 0) {
                    stock[i][1] = 0;
                }
            }
        } else if (ingredient.equals("Sugar Cubes")) {
            for (int i = 0; i < stock.length; i++) {
                stock[i][2] += quantity;
                if (stock[i][2] < 0) {
                    stock[i][2] = 0;
                }
            }
        } else if (ingredient.equals("Ice Cubes")) {
            for (int i = 0; i < stock.length; i++) {
                stock[i][3] += quantity;
                if (stock[i][3] < 0) {
                    stock[i][3] = 0;
                }
            }
        }
    }
}