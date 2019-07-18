package by.epam.java_introduction.module2;

//5. Сортировка вставками. Дана последовательность чисел
//n a ,a , ,a 1 2 
//. Требуется переставить числа в порядке
//возрастания. Делается это следующим образом. Пусть
//a a ai
//, , , 1 2  - упорядоченная последовательность, т. е.
//a1  a2  an
//. Берется следующее число
//i+1 a
//и вставляется в последовательность так, чтобы новая
//последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
//не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
//с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.

public class Sort5 {
    public static void main (String[] args) {
        InsertionSort array = new InsertionSort(10);
        array.into(4, 1, 0, 8, 95, 0, 20, 8, 7, 5);
        array.printer();
        array.insertionSort();
        array.printer();
    }
}

class InsertionSort {
    private int[] a;   //ссылка на массив
    private int elems;  //количество элементов в массиве
    private int countOfPermutation = 0;

    public InsertionSort(int max){    //конструктор класса
        a = new int[max];          //создание массива размером max
        elems = 0;                  //при создании массив содержит 0 элементов
    }

    public void into(int ... num){                //метод вставки элементов в массив
        for (int x = 0; x < num.length; x++) {    //добавляем все переданные элементы в массив
            a[x] = num[x];
        }
        elems += num.length;
    }

    public void printer(){          //метод вывода массива в консоль
        for (int i = 0; i < elems; i++){    //для каждого элемента в массиве
            System.out.print(a[i] + " ");   //вывести в консоль
        }
        System.out.println();
        System.out.println("--- Количество перестановок: " + countOfPermutation + " ---");
    }

    private void toSwap(int first, int second){ //метод меняет местами пару чисел массива
        int dummy = a[first];      //во временную переменную помещаем первый элемент
        a[first] = a[second];       //на место первого ставим второй элемент
        a[second] = dummy;          //вместо второго элемента пишем первый из временной памяти
    }

    public void insertionSort () {
        for (int x = 1; x < elems; x++) {
            for (int z = x; z > 0 && a[z-1] > a[z]; z--) {
                toSwap(z-1, z);
                countOfPermutation++;
            }
        }
    }
}
