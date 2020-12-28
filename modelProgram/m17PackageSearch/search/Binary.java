package search;

public class Binary {
    public static int binarySearch(int lst[], int target) {
        int pos, start = 0, end = lst.length - 1;

        while (start <= end) {
            pos = start + (end - start)/2;
            if (lst[pos] == target) {
                return pos;
            } else if (lst[pos] > target) {
                end = pos - 1;
            } else {
                start = pos + 1;
            }
        }
        return -1; // not found -> -1
    }
}
