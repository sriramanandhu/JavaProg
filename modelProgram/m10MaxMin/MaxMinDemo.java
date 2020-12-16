// 10. Create an interface named MaxMin with two methods maxValue() and minValue(). 
// Develop a java program to create a class by implementing the MaxMin interface to 
// find the maximum and minimum value from a set of values

interface MaxMin {
    int maxValue(int[] arr);
    int minValue(int[] arr);
}

public class MaxMinDemo implements MaxMin {
    @Override
    public int maxValue(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    @Override
    public int minValue(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        System.out.println("hello");
        int[] numArr = {1, 3, 2, 5, 4};

        int mx = new MaxMinDemo().maxValue(numArr);
        int mn = new MaxMinDemo().minValue(numArr);

        System.out.println("max "+mx+"\tmin "+mn);
    }
}
