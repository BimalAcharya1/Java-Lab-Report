// 3.Write a java program to sort array element in ascending order. 

public class question3{
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 2, 1, 4}; // Example array
        

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                 
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        

        System.out.println("Sorted array in ascending order:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
