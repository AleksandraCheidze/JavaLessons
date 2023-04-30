public class MultiplicationTable {
    public static void main(String[] args) {

        int []arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int [] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 1; i < arr1.length+1; i++) {
            for (int j = 1; j < arr2.length+1; j++) {
                System.out.print((i*j) + "\t");
            }
            System.out.println();

        }
    }
}
