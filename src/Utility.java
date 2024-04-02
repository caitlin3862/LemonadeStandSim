public class Utility {
    public static void sleep(int milliseconds){
        try {
            Thread.sleep(milliseconds);
        } catch (Exception e) {
            System.out.println("error");
        }
    }

    public static void timedClearScreen(int milliseconds){
        try {
            Thread.sleep(milliseconds);
        } catch (Exception e) {
            System.out.println("error");
        }
        System.out.print("\033\143");
        System.out.flush();
    }
}
