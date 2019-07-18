package by.epam.java_introduction.module2;

// Сортировка обменами. Дана последовательность чисел
//a1  a2  an
//.Требуется переставить числа в
//порядке возрастания. Для этого сравниваются два соседних числа
//i i+1 a и a
//. Если
//ai  ai+1
//, то делается
//перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
//Составить алгоритм сортировки, подсчитывая при этом количества перестановок

public class Sort4 {
    public static void main (String[] args) {
        ArrayBubble array = new ArrayBubble(10);
        array.into(4, 1, 0, 8, 2, 9, 20, 4, 7, 5);
        array.printer();
        array.bubbleSorter();
        array.printer();
    }
}

class ArrayBubble{
    private int[] a;   //ссылка на массив
    private int elems;  //количество элементов в массиве
    private int countOfPermutation = 0;

    public ArrayBubble(int max){    //конструктор класса
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

    public void bubbleSorter(){     //МЕТОД ПУЗЫРЬКОВОЙ СОРТИРОВКИ
        for (int out = elems - 1; out >= 1; out--){  //Внешний цикл
            for (int in = 0; in < out; in++){       //Внутренний цикл
                if(a[in] > a[in + 1]) { //Если порядок элементов нарушен
                    toSwap(in, in + 1);  //вызвать метод, меняющий местами
                    countOfPermutation++;
                }
            }
        }
    }
}

