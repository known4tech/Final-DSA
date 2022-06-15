import java.util.Arrays;

public class Day3Ques {

//Q1. Find the smallest element in the given Array.
//    public static void main(String[] args) {
//        int[] arr = {7, 5, 8, 9, 6, 8, 5, 7, 4, 6};
//        findSmallest(arr);
//    }
//    public static void findSmallest(int[] arr) {
//        int min = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (min > arr[i]) {
//                min = arr[i];
//            }
//        }
//        System.out.println("Smallest element in given array is: " + min);
//    }

//Q2. Find the third-largest element in an array.
//    public static void main(String[] args) {
//        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
//        int n = arr.length;
//        System.out.println("Third Largest element of the given array is: " + getThirdLargest(arr,n));
//    }
//    public static int getThirdLargest(int[] arr, int n){
//        int temp = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = i+1; j < n; j++) {
//                if (arr[i]>arr[j])
//                {
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        return arr[n-3];
//    }


//Q3. Check if the array is sorted.
//    public static void main(String[] args) {
//        int[] arr = new int[]{1, 2, 3, 4, 5};
////    System.out.println("Answer: " + isSorted(arr));
//        if (isSorted(arr) == false) {
//            System.out.println("GIVEN ARRAY IS NOT SORTED");
//        } else {
//            System.out.println("GIVEN ARRAY IS SORTED");
//        }
//
//    }
//
//    public static boolean isSorted(int[] arr) {
//        if (arr == null || arr.length <= 1) {
//            return false;
//        }
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] > arr[i + 1]) {
//                return false;
//            }
//        }
//        return true;
//    }

//Q4. Reverse the given array.
//    public static void main(String[] args) {
//        int[] arr = {7, 5, 8, 9, 6, 8, 5, 7, 4, 6};
//        System.out.print("Original Array: ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        System.out.print("Reversed Array: ");
//        for (int i = arr.length - 1; i >= 0; i--) {
//            System.out.print(arr[i] + " ");
//        }
//    }

//Q5. Replace Elements with The Greatest Element on Right Side.
//    static void nextGreatest(int arr[])
//    {
//        int n = arr.length;
//        int max_from_right =  arr[n-1];
//        arr[n-1] = 0;
//        for (int i = n-2; i >= 0; i--)
//        {
//            int temp = arr[i];
//            arr[i] = max_from_right;
//
//            // Update the greatest element, if needed
//            if(max_from_right < temp)
//                max_from_right = temp;
//        }
//    }
//    public static void main (String[] args)
//    {
//        int arr[] = {7, 5, 8, 9, 6, 8, 5, 7, 4, 6};
//        nextGreatest (arr);
//        System.out.println("The modified array:");
//        for (int i=0; i < arr.length; i++)
//            System.out.print(arr[i]+" ");
//    }
}
