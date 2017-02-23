package sorting;

/**
 * This class is an iterative implementation of the interpolation search algorithm.
 * Must be passed a pre-sorted integer array.
 * Created by Jeremy Timothy Brown on 2/23/2017.
 */
public class InterpolationSearch {

    /**
     *
     * @param array pre sorted integer array
     * @param x the variable to find
     * @return the index of the variable, returns -1 if not found
     */
    public static int interpolation_search(int[] array, int x){
        int start_index = 0;
        int end_index = array.length - 1;
        while(start_index <= end_index && end_index >= start_index && x <= array[end_index] && x >= array[start_index]) {
            int position = start_index +
                    ((x - array[start_index]) *
                            (end_index - start_index) /
                            (array[end_index] - array[start_index]));       //improved "middle" position that is used in binary searching

            if(array[position] == x){
                return position;
            }

            if(array[position] > x){
                end_index = position - 1;
            }
            else{
                start_index = position + 1;
            }
        }
        return -1;
    }
}
