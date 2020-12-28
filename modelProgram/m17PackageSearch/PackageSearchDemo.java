/* 17. Create a package named search with two classes Linear and Binary with a 
method to perform linear and binary search operation respectively. Develop 
a java program to perform the above operation by importing the package. */

import search.Linear;

import java.util.Arrays;
import java.util.Scanner;

import search.Binary;

public class PackageSearchDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Array : ");
        System.out.println(Arrays.toString(numArr));

        System.out.print("Enter the element to search : ");
        int e = scan.nextInt();

        int index = Linear.linearSearch(numArr, e);
        System.out.println(e+" at index "+index);

        index = Binary.binarySearch(numArr, e);
        System.out.println(e+" at index "+index);
    }
}
