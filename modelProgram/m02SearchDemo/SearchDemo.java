// 2. Create an interface named Search with two methods linearSearch() and
// binarySearch(). Develop a java program to create a class by implementing
// the search interface to perform linear and binary search operation from a set of values

import java.util.Scanner;

interface Search {
    int linearSearch(int lst[], int e);
    int binarySearch(int lst[], int e);
}

class SearchDemo implements Search {
    @Override
    public int linearSearch(int lst[], int e) {
        for (int i = 0; i < lst.length; i++) {
            if (lst[i] == e) {
                return i;
            }
        }
        return -1; // not found -> -1
    }

    @Override
    public int binarySearch(int lst[], int e) {
        int pos, start = 0, end = lst.length - 1;

        while (start <= end) {
            pos = start + (end - start)/2;
            if (lst[pos] == e) {
                return pos;
            } else if (lst[pos] > e) {
                end = pos - 1;
            } else {
                start = pos + 1;
            }
        }
        return -1; // not found -> -1
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //new int[10];

        System.out.print("Enter value to search: ");
        int element = scan.nextInt();

        int index = new SearchDemo().linearSearch(numArr, element);
        System.out.println(index);

        index = new SearchDemo().binarySearch(numArr, element);
        System.out.println(index);
    }
}
