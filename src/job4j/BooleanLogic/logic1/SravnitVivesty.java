package job4j.BooleanLogic.logic1;

public class SravnitVivesty {
    //Даны 4 числа типа int. Сравнить их и вывести наименьшее на консоль.

    //Рассказываю суть: заводите переменную int min, сравниваете a и b, переменной min присваиваете то, которое минимально.
    // Потом сравниваете с переменной min переменную c, если меньше, то присваиваете ее min, потом сравниваете с min d, если меньше, то присваиваете min.
    // В конце выводите min
    public void sravnit() {
        byte x = 5;
        byte y = 7;
        byte z = 3;
        byte h = 2;
        int min;

        if (x > y) {
            min = y;
        } else {
            min = x;
        }
        if ( min > z) {
            min = z;
        }
        if (min > h) {
            min = h;
        }
        System.out.println(min);
    }
}


// Использовать отдельный метод для поиска наим или наиб
//если вы хотите сравнение при поиске минимума вынести в отдельный метод, то это можно сделать так
//Тут речь идет о том, что можно весь код написать в одном методе, как это, например, у вас,
// а можно разбить его на подрограммы, например поиск минимума выделеть в одн метод (или функцию,
// как это в других языках), поиск максимума в другой. В итоге ваша программа будет состоять из
// последоватеьльного вызова этих подпрограм

//public static int minF(int n, int min){
//        if (n < min)
//            min = n;
//       return min; }


//И потом вызывать этот метод так:
//     min = minF(n2,min);
//      min = minF(n3,min);
//  Аналогично можно написать метод для максимума
