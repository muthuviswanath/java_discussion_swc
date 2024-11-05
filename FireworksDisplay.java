import java.util.Random;
import java.util.concurrent.TimeUnit;

public class FireworksDisplay {

    private static final int WIDTH = 50;
    private static final int HEIGHT = 20;
    private static final Random random = new Random();

    public static void main(String[] args) throws InterruptedException {
        // Clear screen
        // System.out.print("\033[H\033[2J");
        System.out.flush();
        
        while (true) {
            // Generate random position for the firework explosion
            int x = random.nextInt(WIDTH);
            int y = random.nextInt(HEIGHT / 2);

            // Show the launch
            for (int i = HEIGHT - 1; i > y; i--) {
                printFirework(x, i, "|");
                TimeUnit.MILLISECONDS.sleep(50);
                clearScreen();
            }

            // Show the explosion and scatter effect
            showExplosion(x, y);

            // Display "Happy Diwali" message after each firework explosion
            displayMessage("We from the CareerSteersman Team, \nWish you all a Happy and Prosperous Diwali 2024!");
            TimeUnit.MILLISECONDS.sleep(1500);
            clearScreen();
        }
    }

    private static void printFirework(int x, int y, String symbol) {
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                if (i == y && j == x) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void showExplosion(int x, int y) throws InterruptedException {
        String[] colors = { "\033[0;31m", "\033[0;32m", "\033[0;33m", "\033[0;34m", "\033[0;35m" };
        String color = colors[random.nextInt(colors.length)];

        // Explosion center
        System.out.print(color);
        printFirework(x, y, "*");
        System.out.print("\033[0m");
        TimeUnit.MILLISECONDS.sleep(200);
        clearScreen();

        // Scatter effect
        for (int i = 1; i <= 5; i++) {
            scatterParticles(x, y, i, color);
            TimeUnit.MILLISECONDS.sleep(200);
            clearScreen();
        }
    }

    private static void scatterParticles(int x, int y, int step, String color) {
        System.out.print(color);
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                // Randomly scatter particles around the center within step range
                if (isWithinScatterRange(x, y, j, i, step)) {
                    System.out.print(getRandomParticleSymbol());
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.print("\033[0m");
    }

    private static boolean isWithinScatterRange(int centerX, int centerY, int x, int y, int step) {
        int dx = Math.abs(centerX - x);
        int dy = Math.abs(centerY - y);
        return (dx <= step && dy <= step && random.nextBoolean());
    }

    private static String getRandomParticleSymbol() {
        String[] symbols = { "*", "." ,"\\"};
        return symbols[random.nextInt(symbols.length)];
    }

    private static void displayMessage(String message) {
        int padding = (WIDTH - message.length()) / 2;
        System.out.print("\033[1;33m"); // Set color to bright yellow
        for (int i = 0; i < HEIGHT / 2; i++) {
            System.out.println();
        }
        // Center-align the message
        for (int i = 0; i < padding; i++) {
            System.out.print(" ");
        }
        System.out.println(message);
        System.out.print("\033[0m"); // Reset color
    }

    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
