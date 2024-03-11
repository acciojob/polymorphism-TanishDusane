package com.driver;

public class Main {
    // Local class Product defined inside the main method
    public static class Product{
        // Method to calculate the product of two integers
        public int product(int x, int y) {
            return x*y;
        }

        // Method to calculate the product of three integers
        public int product(int x, int y, int z) {
            return x*y*z;
        }

        // Method to calculate the product of two doubles
        public double product(double x, double y) {
            return x*y;
        }
    }
    public static void main(String[] args) {

        // Create an instance of the Product class
        Product p = new Product();

        // Call the overloaded methods of the Product class and store the results
        int ans1 = p.product(10,20); // Calls the product method that takes two integers
        int ans2 = p.product(10,20,30); // Calls the product method that takes three integers
        double ans3 = p.product(40.0,3.0); // Calls the product method that takes two doubles

        // Print the results
        System.out.println(ans1 + " " + ans2 + " " + ans3);
    }
}