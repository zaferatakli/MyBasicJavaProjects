package WaterTemperature;

import java.util.Scanner;

public class WaterTemperature {
    public static void main(String[] args) {
        /*Water Temperature Project */

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter water temperature: ");
        int waterTemperature = input.nextInt();

        if (waterTemperature < 0) {
            System.out.println("Temperature of Water: " + waterTemperature + " Water is solid.");
        } else if (waterTemperature >= 0 && waterTemperature <= 100) {
            System.out.println("Temperature of Water: " + waterTemperature + " Water is in liquid form.");
        } else {
            System.out.println("Temperature of Water: " + waterTemperature + " Water is in gaseous state.");
        }

    }
}
