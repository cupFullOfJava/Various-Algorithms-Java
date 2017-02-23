package sorting;

/**
 * Created by Jeremy Timothy Brown on 2/23/2017.
 */
public class ExponentialSearch {

    /**
     * This method uses the exponential approach to find the end index to start the binary search algorithm at
     * @param array pre sorted integer array
     * @param x the integer to find
     * @return index of x, returns -1 if not found
     */
    public static int exponential_search(int[] array, int x){

        if(array[0] == x){
            return 0;
        }
        int end_index = 1;
        while(end_index < array.length && array[end_index] <= x){
            end_index = end_index*2;
        }

        // Binary Search
        end_index = Math.min(array.length - 1, end_index);
        int start_index = end_index / 2;
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
