package rzd.company;
/*
 В примере из урока доработать алгоритм получения случайных элементов из одного массива
 и вставка их в другой массив, дублирующих элементов в конечном массиве быть не должно.
 */
import java.util.Arrays;

public class DemoArrays {
    public static void main(String[] args) {
        int arr[] = new int[10];
        for (var i = 0;i < arr.length;i++){
            arr[i] = (int) (Math.random() * 10);
        }
        int b[] = new int[arr.length];// второй массив
        b = Arrays.copyOf(arr,arr.length);// копируем элементы из первого массива во второй

        int s = 0;
        for(var item : arr){
            System.out.print(item + "\t");//выводим 1-ый массив
            s += item;//сумма элементов
        }
        System.out.println();
        for(var item : b) {
            System.out.print(item + "\t");//выводим 2-ой массив
        }
        System.out.println("\nСумма элементов массива = " + s);
    }
}

