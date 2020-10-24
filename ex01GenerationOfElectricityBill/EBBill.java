import java.io.*;
import java.util.*;

class EBBill {
  int con_no;
  String con_name;
  int pre_reading;
  int cur_reading;
  int current_consum;
  char type;
  double amount;

  void getConsumer ()
  {
    Scanner scan = new Scanner (System.in);
      System.out.print ("Enter consumer number: ");
      con_no = scan.nextInt ();
      System.out.print ("\nEnter consumer name: ");
      con_name = scan.next ();
      System.out.print ("\nEnter previous month reading: ");
      pre_reading = scan.nextInt ();
      System.out.print ("\nEnter current month reading: ");
      cur_reading = scan.nextInt ();
      System.out.print ("\nEnter d for domestic c for commercial: ");
      type = scan.next ().charAt (0);
  }

  void calcBill ()
  {
    current_consum = cur_reading - pre_reading;
    if (type == 'd') { // domestic connection
      if (current_consum > 500) {
        amount = (current_consum - 500) * 6 + 1550;
      }
      else if (current_consum <= 100) {
        amount = current_consum;
      }
      else if (current_consum > 100 && current_consum <= 200) {
        amount = (current_consum - 100) * 2.50 + 100;
      }
      else
        amount = (current_consum - 200) * 4 + 350;
    }
    else { // commercial connection
      if (current_consum > 500) {
        amount = (current_consum - 500) * 7 + 2450;
      }
      else if (current_consum <= 100) {
        amount = current_consum * 2;
      }
      else if (current_consum > 100 && current_consum <= 200) {
        amount = (current_consum - 100) * 4.50 + 200;
      }
      else
        amount = (current_consum - 200) * 6 + 650;
    }
  }
  void showBill ()
  {
    System.out.println ("\t\tElectricity Bill");
    System.out.println ("Consumer Number : " + con_no);
    System.out.println ("Consumer Name : " + con_name);
    System.out.println ("Consumed Units : " + current_consum);
    System.out.println ("Connection Type : " + (type == 'c' ? "Commercial" : "Domestic"));
    System.out.println ("Bill Amount : " + amount);
  }
  public static void main (String[]args)
  {
    EBBill eb_bill = new EBBill ();
    eb_bill.getConsumer ();
    eb_bill.calcBill ();
    eb_bill.showBill ();
  }
}
