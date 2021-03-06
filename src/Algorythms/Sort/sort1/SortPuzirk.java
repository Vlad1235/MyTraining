package Algorythms.Sort.sort1;

public class SortPuzirk {
    /*
    Создайте массив из 20 случайных чисел (числа должны быть в диапазоне от 0 до 1000)
    и отсортируйте массив по убыванию при помощи сортировки пузырьком.
     */
    public void sortPuzirk1() {
        // создаем произвольны массив чисел до 20 со значениями 0-1000
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000); //умножаем на 1000 так как нам нужны трехзначные числа
            System.out.print(arr[i] + " ,");
        }
        System.out.println();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) { // именно от этого присвоения < или > зависит будет ли по возрастанию или всетаки по убывани.
                    // три след строки как константа, они будут одинаковы и при убыв и при возраст сортировке:
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ,");
        }
    }
}
/*
143 ,339 ,363 ,310 ,188 ,814 ,28 ,576 ,967 ,520 ,333 ,44 ,703 ,298 ,514 ,224 ,598 ,457 ,947 ,609 ,
967 ,947 ,814 ,703 ,609 ,598 ,576 ,520 ,514 ,457 ,363 ,339 ,333 ,310 ,298 ,224 ,188 ,143 ,44 ,28 ,

 */