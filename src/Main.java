import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите кол-во элементов в массиве");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = GetRandomArray(n);
        System.out.println("Старый массив >> " + Arrays.toString(arr));
        System.out.println("Новый массив >> " + Arrays.toString(GetCumulativeTotal(arr)));
    }

    public static int[] GetRandomArray(int n){
        Random rand = new Random();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = rand.nextInt(1000);
        return array;
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
