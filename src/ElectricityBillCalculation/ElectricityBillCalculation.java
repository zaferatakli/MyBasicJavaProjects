package ElectricityBillCalculation;

import java.util.Scanner;

public class ElectricityBillCalculation {
    public static void main(String[] args) {
        /*ELECTRICITY BILL CALCULATION PROJECT*/

        Scanner input = new Scanner(System.in);
        System.out.print("Enter New Consumption Value: ");
        int newConsumption = input.nextInt();
        System.out.print("Enter old Consumption Value: ");
        int firstConsumption = input.nextInt();
        int electricityConsumption = Math.abs(newConsumption - firstConsumption);
        float monthlyBill = 0;
        if (electricityConsumption > 0 && electricityConsumption <= 100) {
            monthlyBill = (float) (electricityConsumption * 1.1);
        } else if (electricityConsumption >= 101 && electricityConsumption <= 200) {
            monthlyBill = (float) (electricityConsumption * 1.3);
        } else if (electricityConsumption >= 201 && electricityConsumption <= 300) {
            monthlyBill = (float) (electricityConsumption * 1.5);
        } else if (electricityConsumption >= 301 && electricityConsumption <= 400) {
            monthlyBill = (float) (electricityConsumption * 1.7);
        } else if (electricityConsumption >= 401 && electricityConsumption <= 500) {
            monthlyBill = (float) (electricityConsumption * 1.9);
        } else {
            monthlyBill = (float) (electricityConsumption * 2.3);
        }
        System.out.println("This month's electricity consumption: " + electricityConsumption + "kWh" + " " + "Your Bill: " + monthlyBill + "$");

    }
}
