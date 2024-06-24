package exceptions;

public class Main_HW {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] arr1 = new int[5];
        try {
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = arr[i + 1];
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Выход за массив");
        }

    }
}
