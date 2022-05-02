// A simple Java Program to calculate the Eccentricity and Volume of a speroid given its equatorial and polar radius

import java.util.Scanner;
import java.math.*;

public class Spheroid {
    public static void main(String[] args) {
    
        Scanner stdin = new Scanner( System.in );

        System.out.printf("Enter equatorial radius in km: ");
        double equatorial = stdin.nextDouble();
        System.out.printf("Enter polar radius in km: ");
        double polarRad = stdin.nextDouble();

        double eccentricity = Math.sqrt( 1 - ( ( polarRad * polarRad ) / ( equatorial * equatorial ) ) );
        double Volume = ( (4 * Math.PI * (equatorial * equatorial) * polarRad) / 3 );

        System.out.printf("Eccentricity = %1.3f \n", eccentricity);
        System.out.printf("Volume = %5.5e cubic km \n", Volume);

}
}