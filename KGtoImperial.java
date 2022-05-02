// A simple Java Program to calculate the imperial weight of a given weight in kg

import java.text.DecimalFormat;
import java.util.Scanner;

class Weight {
  public static void main(String[] args) {
    try (Scanner stdin = new Scanner( System.in )) {
      System.out.printf("Enter weight in kilograms: ");
      double weight = stdin.nextDouble();
      weight = weight * 2.205;
      double ounce = weight - Math.floor(weight);
      ounce = ounce * 16;
      weight = Math.floor(weight);
      DecimalFormat f = new DecimalFormat("##.#");
      DecimalFormat g = new DecimalFormat("##");
      System.out.printf("Equivalent imperial weight is " + g.format(weight) + " lb " + f.format(ounce) + " oz\n");
    }
  }
}
