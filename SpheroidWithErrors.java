// An extension of Spheroid.java which produces errors when incorrect data is fed into the program

import java.util.Scanner;
import java.math.*;

public class Spheroid {
    public static void main(String[] args) {
    
        Scanner stdin = new Scanner( System.in );

        System.out.printf("Enter equatorial radius in km: ");
        double equatorial = stdin.nextDouble();
        if (equatorial <= 0) {
            System.out.println("Error: equatorial radius must be larger than 0");
            System.exit(-1);
        }
        System.out.printf("Enter polar radius in km: ");
        double polarRad = stdin.nextDouble();
        if (polarRad <= 0) {
            System.out.println("Error: polar radius must be larger than 0");
            System.exit(-1);
        }
        if (polarRad > equatorial){
            System.out.println("Error: equatorial radius must be larger than polar radius");
            System.exit(-99);
        }

        double eccentricity = Math.sqrt( 1 - ( ( polarRad * polarRad ) / ( equatorial * equatorial ) ) );
        double Volume = ( (4 * Math.PI * (equatorial * equatorial) * polarRad) / 3 );

        System.out.printf("Eccentricity = %1.3f \n", eccentricity);
        System.out.printf("Volume = %15.8e cubic km\n", Volume);

    }
}