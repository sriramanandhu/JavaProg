/* 20. Create a package numbers with two classes OddNumbers and EvenNumbers with two 
methods for the each class to generate random numbers and display the random 
numbers. Include another method for each class to print only odd values and even 
values respectively. Develop a java application to demonstrate the usage of package */

import numbers.EvenNumber;
import numbers.OddNumber;

class EvenOdd {
    public static void main(String[] args) {
        EvenNumber a = new EvenNumber();
        a.generateNumbers();
        a.printNumbers();
        a.printEvenNumbers();

        OddNumber b = new OddNumber();
        b.generateNumbers();
        b.printNumbers();
        b.printOddNumbers();
    }
}
