package converter;

import java.io.*;
import java.util.*;

public class Time {
    int hour;
    int minute;
    int second;
    int htom;
    int htos;
    double mtoh;
    double stoh;

    public void getTime () {
        Scanner scan = new Scanner (System.in);
        System.out.print ("\nEnter an hour: ");
        hour = scan.nextInt ();
        System.out.print ("\nEnter minutes: ");
        minute = scan.nextInt ();
        System.out.print ("\nEnter seconds: ");
        second = scan.nextInt ();
    } 
    public void convertTime () {
        htom = hour * 60;
        htos = hour * 60 * 60;
        mtoh = minute / 60.0;
        stoh = second / 3600.0;
    } 
    public void showTime () {
        System.out.println ("\t\t Time Conversion");
        System.out.println (hour + " hour in to minute is: " + htom);
        System.out.println (hour + " hour in to second is: " + htos);
        System.out.println (minute + " minutes in to hour is: " + mtoh);
        System.out.println (second + " seconds in to hour is: " + stoh);
    }
}