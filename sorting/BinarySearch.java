package sorting;

/**
 * This class is an iterative implementation of the binary search algorithm.
 * It must be passed a pre-sorted integer array.
 * Created by Jeremy Timothy Brown on 2/23/2017.
 */
public class BinarySearch {

    /**
     * Binary Search Method
     * @param array sorted array of integers
     * @param x the integer to locate
     * @return the index of the integer, returns -1 if not found
     */
    public static int binary_search(int[] array, int x){
        int start_index  = 0;
        int end_index = array.length - 1;
        while(start_index <= end_index){
            int middle_index = start_index + (end_index - start_index)/2;

            if(x == array[middle_index]){
                return middle_index;
            }

            // change the start index if the variable to be found is greater than the middle value
            if(x > array[middle_index]){
                start_index = middle_index + 1;
            }
            // change the end index if the variable to be found is less than than the middle value
            else{
                end_index = middle_index - 1;
            }
        }
        return -1;
    }
}
