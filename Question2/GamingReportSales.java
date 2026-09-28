/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamingreportsales;

/**
 *
 * @author khumomoloantoa
 */
public class GamingReportSales {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Select the console type:");
        System.out.println("1. PS5");
        System.out.println("2. XBOX");
        System.out.println("3. SWITCH");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        input.nextLine();

        String consoleType;
        if (choice == 1) {
            consoleType = "PS5";
        } else if (choice == 2) {
            consoleType = "XBOX";
        } else {
            consoleType = "SWITCH";
        }

        System.out.print("Enter the store name: ");
        String store = input.nextLine();

        System.out.print("Enter total sales for " + consoleType + ": ");
        int sales = input.nextInt();

        ConsoleSales report = new ConsoleSales(consoleType, store, sales);
        report.printReport();

        input.close();
    }
}