package by.epam.java_introduction.module2;

// 6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
//Делается это следующим образом: сравниваются два соседних элемента
//ai и ai+1
//. Если
//ai  ai+1
//, то продвигаются
//на один элемент вперед. Если
//ai  ai+1
//, то производится перестановка и сдвигаются на один элемент назад.
//Составить алгоритм этой сортировки.

public class Sort6 {
    public static void main(String[] args) {
        ShellSort array = new ShellSort(10);
        array.into(4, 1, 0, 8, 95, 0, 20, 8, 7, 5);
        array.printer();
        array.shellSort();
        array.printer();
    }
}

class ShellSort {
    private int[] a;   //ссылка на массив
    private int elems;  //количество элементов в массиве
    private int countOfPermutation = 0;

    public ShellSort(int max){    //конструктор класса
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

    public void shellSort() {
        int h = 1;
        while (h*3 < a.length)
            h = h * 3 + 1;
        while(h >= 1) {
            insertSort(h);
            h = h/3;
        }
    }

    private void insertSort(int h) {
        int length = a.length;
        for (int i = h; i < length; i++) {
            for (int j = i; j >= h; j = j - h) {
                if (a[j] < a[j - h]) {
                    toSwap(j, j - h);
                    countOfPermutation++;
                } else {
                    break;
                }
            }
        }
    }
}
