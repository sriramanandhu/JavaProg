package converter;

import java.io.*;
import java.util.*;

public class Distance {
    double miles;
    double kmeters;
    double meter;
    double kmtomt;
    double kmtom;
    double mttokm;
    double mtokm;

    public void getDistance() {
        Scanner scan = new Scanner (System.in);
        System.out.print ("\nEnter meter: ");
        meter = scan.nextDouble ();
        System.out.print ("\nEnter miles: ");
        miles = scan.nextDouble ();
        System.out.print ("\nEnter kilometer: ");
        kmeters = scan.nextDouble ();
    } 

    public void convertDistance () {
        mttokm = meter * 0.001;
        mtokm = miles * 1.609;
        kmtomt = kmeters * 1000;
        kmtom = kmeters * 0.621;
    } 
    public void showDistance () {
        System.out.println ("\t\t Distance Conversion");
        System.out.println (meter + " meter in to kilometer is: " + mttokm);
        System.out.println (miles + " miles in to kilometer is: " + mtokm);
        System.out.println (kmeters + " kilometer in to meter is: " + kmtomt);
        System.out.println (kmeters + " kilometer in to mile is: " + kmtom);
    }
}