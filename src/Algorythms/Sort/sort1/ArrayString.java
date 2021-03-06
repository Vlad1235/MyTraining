package Algorythms.Sort.sort1;

import java.util.Arrays;
    /*
    В этом примере массив имен сортируется в порядке от А до Я. Для того
    чтобы отсортировать массив в обратном порядке, необходимо в
    методе sort() указать Collections.reverseOrder().
     */

public class ArrayString {
    public static void main(String[] args) {
            String[] names = new String[]{"Masha", "Dasha", "Nastya", "Olya", "olesya"};
            arrayString(names);
    }
        public static void arrayString(String[] names) {
            for (int index = 0; index < names.length; index++) {
                names[index].toLowerCase();
            }
            Arrays.sort(names);
            for (int i = 0; i < names.length; i++) {
                System.out.print(names[i] + " ,");
            }
        }
}
/*
Dasha ,Masha ,Nastya ,Olya ,olesya ,
 */

/*
К сожалению, по умолчанию метод sort() сортирует только примитивные типы данных и строки.
Как сортировать массив из собственно созданных объектов, будет рассмотрено в следующих уроках,
поскольку это требует более углубленных знаний.
 */


/*
заметил во втором задании,что сначала сортируются названия машин с заглавной буквы,а потом с маленькой.
вы наблюдательный))) В Java символы верхнего и нижнего регистра считаются разными символами,
то есть М и м — разные буквы, следовательно Мазда и мазда — разные слова.
Чтобы вас не смущала такая сортировка приведите сначала все символы в строках к одному регистру,
например, к нижнему с помощью метода toLowerCase() из пакета java.lang. Пример использования
String str = "МаМа МЫЛА раму";
str = str.toLowerCase();

После этого, все символы в строке станут маленькими.
После того, как все строки будут в нижнем регистре, проводите сортировку.
 */