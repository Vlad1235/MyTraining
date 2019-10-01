package Arrays.arrays2;

public class MnogomNesemetrMassivy {
    /*
    Многомерные и несимметричные массивы
    Создаются многомерные массивы в Java аналогичным способом.
    Количество квадратных скобок указывает на размерность.
Примеры создания массивов фиксированной длины:
int[][] a = new int[5][5];// двумерный массив
int[][][] b = new int[3][4][5];// трехмерный массив
int[][][][] c = new int[2][4][5][5];// четырехмерный массив

Кстати, не обязательно изначально указывать размер на всех уровнях, можно указать размер только на первом уровне.
int[][] a1 = new int[5][];// двумерный массив с 5 строками
     Задача: В данном случае, пока неизвестно сколько будет элементов в каждой строке,
     это можно определить позже, причем, массив может содержать в каждой строке разное
     количество элементов, то есть быть несимметричным.
     */
    public void mnogomNesemtrMassiv1(){
        // Определим количество элементов в каждой строке для массива a1
        int[][] a1;
        a1 = new int [5][];// указыываем на количество строк массива

        a1[0] = new int [1];
        a1[1] = new int [2];
        a1[2] = new int [3];
        a1[3] = new int [4];
        a1[4] = new int [5];

        for(int i = 0; i<a1.length; i++){
            for(int j = 0; j<a1[i].length; j++){
                System.out.print(a1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/*
При создании массива его элементы автоматически инициализируются нулями,
поэтому в это примере на экран выведены нули.

0
0 0
0 0 0
0 0 0 0
0 0 0 0 0

 */