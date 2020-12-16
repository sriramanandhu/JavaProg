/* 14. Create an interface named ArrangeNumbers with two methods 
ascendOrder() and descendOrder(). Develop a java program to create 
a class by implementing the ArrangeNumbers interface to arrange 
a set of values in ascending and descending order */

interface ArrangeNumbers {
    int[] ascendOrder(int[] arr);
    int[] descendOrder(int[] arr);
}

class Arrange implements ArrangeNumbers {
    @Override
    public int[] ascendOrder(int[] arr) {
        int temp = 0;
        // Bubble sort
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                // if left element is greater than right element, swap
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    @Override
    public int[] descendOrder(int[] arr) {
        int temp = 0;
        // Bubble sort
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                // if left element is less than right element, swap
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}

public class ArrangeDemo {
    public static void main(String[] args) {
        // Creation of numArr
        int[] numArr = {95, 79, 38, 89, 54, 22, 65};

        // print the array
        System.out.println("numArr:");
        for (int i : numArr) {
            System.out.print(i+" ");
        }
        System.out.println();

        Arrange arrange1 = new Arrange();
        int[] ascendArr = arrange1.ascendOrder(numArr);
        // print the array
        System.out.println("Ascending order:");
        for (int i : ascendArr) {
            System.out.print(i+" ");
        }
        System.out.println();

        int[] descendArr = arrange1.descendOrder(numArr);
        // print the array
        System.out.println("Descenging order:");
        for (int i : descendArr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
