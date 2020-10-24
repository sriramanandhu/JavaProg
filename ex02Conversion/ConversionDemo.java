import java.io.*;
import java.util.*;

import converter.Currency;
import converter.Distance;
import converter.Time;

class ConversionDemo {
    public static void main (String[]args) {
        Currency c1 = new Currency ();
        c1.getCurrency ();
        c1.convertCurrency ();
        c1.showCurrency ();

        Distance d1 = new Distance ();
        d1.getDistance ();
        d1.convertDistance ();
        d1.showDistance ();
        
        Time t1 = new Time ();
        t1.getTime ();
        t1.convertTime ();
        t1.showTime ();
    }
}
