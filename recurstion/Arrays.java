
import java.util.ArrayList;

public class Arrays {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 6, 7, 4, 9};
        // System.out.println(isSorted(arr, 0));
        // System.err.println(linearSearch(arr, 0, 6));
        // System.err.println(findAllIndexs(arr, 0, 4, new ArrayList<>()));
        System.err.println(findAllIndexs(arr, 0, 4));

    }

    public static ArrayList<Integer> findAllIndexs(int[] arr, int i, int t) {
        ArrayList<Integer> list = new ArrayList<>();
        if (i == arr.length) {
            return list;
        }
        if (arr[i] == t) {
            list.add(i);
        }

        list.addAll(findAllIndexs(arr, i + 1, t));
        return list;
    }

    public static ArrayList<Integer> findAllIndexs(int[] arr, int i, int t, ArrayList<Integer> list) {
        if (i == arr.length) {
            return list;
        }
        if (arr[i] == t) {
            list.add(i);
        }
        return findAllIndexs(arr, i + 1, t, list);
    }

    public static int linearSearch(int[] arr, int i, int tar) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == tar) {
            return i;
        }
        return linearSearch(arr, i + 1, tar);

    }

    public static boolean isSorted(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        return (arr[i] <= arr[i + 1]) && (isSorted(arr, i + 1));
    }
}
