/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamingsalesreport;

/**
 *
 * @author khumomoloantoa
 */
public class GamingSalesReport {

    public static void main(String[] args) {
 
        // city names
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        
        // 2D Array 
        int[][] sales = {
            {1000, 2000, 3000},   // Cape Town
            {2000, 3000, 4000},   // Port Elizabeth
            {1500, 1100, 1200}    // Pretoria
        };
        
        // Print main report header
        System.out.println("---------------------------------------------");
        System.out.println("          GAMING CONSOLE REPORT");
        System.out.println("---------------------------------------------");
        System.out.printf("%-20s %-10s %-10s %-10s%n", "", "PS5", "XBOX", "SWITCH");
        
        // Print each city's sales
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s %-10d %-10d %-10d%n",
                    cities[i],
                    sales[i][0],
                    sales[i][1],
                    sales[i][2]);
        }
        
        // Calculatons
        System.out.println("\n---------------------------------------------");
        System.out.println("    CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("---------------------------------------------");
        
        int highestTotal = 0;
        String topCity = "";
        
        for (int i = 0; i < cities.length; i++) {
            int cityTotal = sales[i][0] + sales[i][1] + sales[i][2];
            System.out.printf("%-20s %d%n", cities[i], cityTotal);
            
            if (cityTotal > highestTotal) {
                highestTotal = cityTotal;
                topCity = cities[i];
            }
        }
        
        // Output Final result
        System.out.println("\n---------------------------------------------");
        System.out.println("CITY WITH THE MOST SALES: " + topCity);
        System.out.println("---------------------------------------------");
    }
}
