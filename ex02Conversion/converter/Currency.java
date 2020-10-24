package converter;

import java.io.*;
import java.util.*;

public class Currency {
    double dollar;
    double rupee;
    double euro;
    double yen;
    double dtor;
    double etor;
    double ytor;
    double rtod;
    double rtoe;
    double rtoy;

    public void getCurrency() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter dollar: ");
        dollar = scan.nextDouble();
        System.out.print("\nEnter rupee: ");
        rupee = scan.nextDouble();
        System.out.print("\nEnter euro: ");
        euro = scan.nextDouble();
        System.out.print("\nEnter yen: ");
        yen = scan.nextDouble();
    } 
    public void convertCurrency() {
        dtor = dollar * 71.49;
        etor = euro * 79.27;
        ytor = yen * 0.67;
        rtod = rupee * 0.014;
        rtoe = rupee * 0.013;
        rtoy = rupee * 1.49;
    } 
    public void showCurrency() {
        System.out.print ("\n\n\t\tCurrency Converter");
        System.out.print ("\n" + dollar + " dollar to rupee is: " + dtor);
        System.out.print ("\n" + euro + " euro to rupee is: " + etor);
        System.out.print ("\n" + yen + " yen to rupee is: " + ytor);
        System.out.print ("\n" + rupee + " rupee to dollar is: " + rtod);
        System.out.print ("\n" + rupee + " rupee to euro is: " + rtoe);
        System.out.print ("\n" + rupee + " rupee to yen is: " + rtoy);
    }
}