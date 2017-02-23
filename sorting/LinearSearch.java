package sorting;

/**
 * Created by Jeremy Timothy Brown on 2/23/2017.
 */
public class LinearSearch {

    /**
     * Linear search for a list of integers, with time complexity O(n)
     * @param array list of integers
     * @param size the size of the array
     * @param x the integer to search for
     * @return the index of the integer, returns -1 if not found
     */
    public static int linear_search_int(int[] array, int x){

        for(int i = 0; i <= array.length - 1; i++){
            if(x == array[i]){
                return i;
            }
        }
        return -1;
    }

    /**
     * Linear search for a list of strings, with time complexity O(n)
     * @param array list of strings
     * @param size the size of the array
     * @param x the string to search for
     * @return the index of the integer, returns -1 if not found
     */
    public static int linear_search_string(String[] array, String x){

        for(int i = 0; i <= array.length - 1; i++){
            if(x.compareTo(array[i]) == 0){
                return i;
            }
        }
        return -1;
    }

}
