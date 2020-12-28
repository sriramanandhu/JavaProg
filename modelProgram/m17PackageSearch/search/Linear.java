package search;

public class Linear {
    public static int linearSearch(int lst[], int target) {
        for (int i = 0; i < lst.length; i++) {
            if (lst[i] == target) {
                return i;
            }
        }
        return -1; // not found -> -1
    }
}
