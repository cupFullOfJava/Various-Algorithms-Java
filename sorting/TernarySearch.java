package sorting;

/**
 * Created by Jeremy Timothy Brown on 2/23/2017.
 */
public class TernarySearch {
    /**
     * This search is an suggested improvement of binary search, although it is not always the best to use.
     * @param array pre sorted integer array
     * @param x integer to be found
     * @return the index of x, -1 if not found
     */
    public static int ternary_search(int[] array, int x){
        int start_index = 0;
        int end_index = array.length - 1;

        while(start_index <= end_index) {
            int middle1 = start_index + (end_index - start_index)/3;
            int middle2 = middle1 + (end_index - start_index)/3;
            if (array[middle1] == x) {
                return middle1;
            }
            if (array[middle2] == x) {
                return middle2;
            }
            if(array[middle1] > x){
                end_index = middle1 - 1;
            }
            else if(array[middle2] < x){
                start_index = middle2 + 1;
            }
            else{
                start_index = middle1 + 1;
                end_index = middle2 - 1;
            }
        }



        return -1;
    }
}
