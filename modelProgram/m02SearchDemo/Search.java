/**
 * LinearSearchExample
 */
interface LinearSearchExample {
    public static int linearSearch(int lst[], int e) {
        for (int i = 0; i < lst.length; i++) {
            if (lst[i] == e) {
                return i;
            }
        }
        return -1; // not found -> -1
    }
}

public class Search implements LinearSearchExample {
    public static void main(String[] args) {
        int numArr[] = { 1, 3, 4, 6, 7, 8 };
        int e = 5;
        int index = LinearSearchExample.linearSearch(numArr, e);
        // int index = linearSearch(numArr, e);/
        System.out.println(index);
    }
}
