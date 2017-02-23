package sorting;

/**
 * Created by Jeremy Timothy Brown on 2/23/2017.
 */
public class JumpSearch {

    /**
     * Jump search implementation, array must be sorted
     * @param array integer array
     * @param x the integer to be round
     * @return the index of the integer, return -1 if not found
     */
    public static int jump_search(int[] array, int x){
        int size = array.length;
        int previous = 0;
        int jump = (int) Math.floor(Math.sqrt(size));
        // this loop finds the section of the array that is less than the value to be found
        while(array[Math.min(size, jump) - 1] < x){
            previous = jump;
            jump += (int) Math.floor(Math.sqrt(size));
            if(previous >= size){
                return -1;
            }
        }
        //linear search after correct start index is found
        while(array[previous] <= x){
            if(array[previous] == x){
                return previous;
            }
            previous ++;
        }
        return -1;
    }
}
