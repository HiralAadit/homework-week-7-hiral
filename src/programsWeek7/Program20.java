package programsWeek7;

public class Program20 {
    public static boolean contains(int[] arr, int items) {
        for (int n : arr) {
            //int n==arr;
            if (items == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] my_array1 = {11, 12, 13, 14, 15, 17, 18};
        System.out.println(contains(my_array1, 15));
        System.out.println(contains(my_array1, 20));
    }

}