package C_StackAndQues03.Exercises;

import java.util.*;

public class Robotics06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] robotsTokens = scanner.nextLine().split(";");

        String[] robots = new String[robotsTokens.length];
        int[] processTime = new int[robotsTokens.length];
        int[] robotsCounter = new int[robotsTokens.length];

        for (int i = 0; i < robotsTokens.length; i++) {
            String[] robotArgs = robotsTokens[i].split("-");
            robots[i] = robotArgs[0];
            processTime[i] = Integer.valueOf(robotArgs[1]);
        }

        String[] timeTokens = scanner.nextLine().split(":");
        long hh = Integer.valueOf(timeTokens[0]) * 60 * 60;
        long mm = Integer.valueOf(timeTokens[1]) * 60;
        long ss = Integer.valueOf(timeTokens[2]);
        long time = hh + mm + ss;

        Deque<String> products = new ArrayDeque<>();

        String product = "";
        while (!("End".equals(product = scanner.nextLine()))) {
            products.add(product);
        }

        while (!products.isEmpty()) {
            for (int i = 0; i < robots.length; i++) {
                if (robotsCounter[i] > 0) {
                    robotsCounter[i]--;
                }
            }
            time++;
            String currentProduct = products.poll();
            boolean isProductTaken = false;

            for (int i = 0; i < robots.length; i++) {
                if (robotsCounter[i] == 0) {
                    robotsCounter[i] = processTime[i];
                    System.out.printf("%s - %s [%s]%n", robots[i], currentProduct, convertSecondsToHMmSs(time));
                    isProductTaken = true;
                    break;
                }
            }
            if (!isProductTaken) {
                products.offer(currentProduct);
            }
        }
    }

    private static String convertSecondsToHMmSs(long seconds) {
        long s = seconds % 60;
        long m = (seconds / 60) % 60;
        long h = (seconds / (60 * 60)) % 24;
        return String.format("%02d:%02d:%02d", h, m, s);
    }
}
