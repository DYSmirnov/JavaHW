package HW3.exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        int[] arrr1 = new int[]{1, 2, 3, 4, 5};
        //ex1(arrr1);
        //ex2();
        //ex3();
        //ex4();
        ex5();
    }

    public static void ex1(int[] arr) {
        System.out.println("Задание 1");
        boolean result = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1])
                result = true;
            else {
                result = false;
                System.out.println("Please, try again");
                break;
            }
        }
        if (result)
            System.out.println("OK");
        System.out.println("------------");
    }

    public static int[] ex2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длинну массива: ");
        int arrLength = scan.nextInt();
        int[] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            System.out.println("Введите число для " + (i + 1) + " элемена массива:");
            arr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void ex3() {
        int[] arr = ex2();
        int firstElement = arr[0];
        int lastElement = arr[arr.length - 1];
        arr[0] = lastElement;
        arr[arr.length - 1] = firstElement;
        System.out.println("Новый массив: ");
        System.out.println(Arrays.toString(arr));
    }

    public static void ex4() {
        int[] arr = new int[]{1, 2, 3, 1, 2, 4};
        for (int i : arr) {
            int count = 0;
            for (int j : arr) {
                if (i == j)
                    count++;
            }
            if (count == 1) {
                System.out.println(i);
                break;
            }
        }
    }

    public static void ex5() {
        int arrLength = 2 + (int) (Math.random() * 10);
        int[] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println("Рандомный массив:");
        System.out.println(Arrays.toString(arr));
        int[] newArr = splitArr(arr);
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(newArr));

    }

    public static int[] splitArr(int[] arr) {

        //делим массив пополам
        if (arr.length < 2)
            return arr;
        int arrMid = arr.length / 2;
        int[] leftArr = new int[arrMid];
        int[] rightArr;
        if (arr.length % 2 == 0 || arrMid == 1)
            rightArr = new int[arrMid];
        else
            rightArr = new int[arrMid + 1];

        //записываем значения в правую и левую часть массива
        for (int i = 0; i < arrMid; i++) {
            leftArr[i] = arr[i];
        }
        for (int j = 0; j < rightArr.length; j++) {
            rightArr[j] = arr[arrMid + j];
        }
        System.out.println(Arrays.toString(leftArr));
        System.out.println(Arrays.toString(rightArr));
        //
        leftArr = splitArr(leftArr);
        rightArr = splitArr(rightArr);
        return mergeParts(leftArr, rightArr);
    }

    private static int[] mergeParts(int[] leftArr, int[] rightArr) {
        int[] resultArr = new int[leftArr.length + rightArr.length];
        int leftPoint = 0;
        int rightPoint = 0;
        int resultPoint = 0;
        while (leftPoint < leftArr.length || rightPoint < rightArr.length) {
            if (leftPoint < leftArr.length && rightPoint < rightArr.length) {
                if (leftArr[leftPoint] < rightArr[rightPoint]) {
                    resultArr[resultPoint++] = leftArr[leftPoint++];
                } else
                    resultArr[resultPoint++] = rightArr[rightPoint++];
            }
            else if (rightPoint < rightArr.length)
                resultArr[resultPoint++] = rightArr[rightPoint++];
            else if (leftPoint < leftArr.length)
                resultArr[resultPoint++] = leftArr[leftPoint++];
        }
        return resultArr;
    }
}
