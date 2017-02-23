package sorting;

public class Main {

    public static void main(String[] args) {

        int[] int_array = {1,3,7,10,22,33,55,64,89,105,403,407,409,586,623,1000,1098};
        String[] string_array = {"dog", "cat", "bat"};

        System.out.println("Linear Search");
        for (int x : int_array) {
            System.out.print(LinearSearch.linear_search_int(int_array, x)+" ");
        }
        System.out.println();
        for (int x : int_array) {
            System.out.print(LinearSearch.linear_search_int(int_array, x + 1)+" ");
        }

        System.out.println("\nBinary Search");
        for (int x : int_array) {
            System.out.print(BinarySearch.binary_search(int_array, x)+" ");
        }
        System.out.println();
        for (int x : int_array) {
            System.out.print(BinarySearch.binary_search(int_array, x + 1)+" ");
        }

        System.out.println("\nJump Search");
        for (int x : int_array) {
            System.out.print(JumpSearch.jump_search(int_array, x)+" ");
        }
        System.out.println();
        for (int x : int_array) {
            System.out.print(JumpSearch.jump_search(int_array, x + 1)+" ");
        }

        System.out.println("\nInterpolation Search");
        for (int x : int_array) {
            System.out.print(InterpolationSearch.interpolation_search(int_array, x)+" ");
        }
        System.out.println();
        for (int x : int_array) {
            System.out.print(InterpolationSearch.interpolation_search(int_array, x + 1)+" ");
        }

        System.out.println("\nTernary Search");
        for (int x : int_array) {
            System.out.print(TernarySearch.ternary_search(int_array, x)+" ");
        }
        System.out.println();
        for (int x : int_array) {
            System.out.print(TernarySearch.ternary_search(int_array, x + 1)+" ");
        }

        System.out.println("\nExponential Search");
        for (int x : int_array) {
            System.out.print(ExponentialSearch.exponential_search(int_array, x)+" ");
        }
        System.out.println();
        for (int x : int_array) {
            System.out.print(ExponentialSearch.exponential_search(int_array, x + 1)+" ");
        }

    }
}
