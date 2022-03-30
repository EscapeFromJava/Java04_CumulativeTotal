import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Старый массив >> " + Arrays.toString(arr));
        System.out.println("Новый массив >> " + Arrays.toString(GetCumulativeTotal(arr)));
    }

    public static int[] GetCumulativeTotal(int[] arr) {
        int[] newArr = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            newArr[i] = sum;
        }
        return newArr;
    }
}
