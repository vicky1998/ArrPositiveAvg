import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {

        int[] array = new int[10];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("please enter the element->");
            int temp = sc.nextInt();
            if (temp >= 0) {
                array[i] = temp;
            } else {
                int sum = 0, count = 0;
                for (int j = 0; j < i; j++) {

                    sum = sum + array[j];
                    count++;
                }
                System.out.println(" total is->" + sum);
                System.out.println("avg->" + sum / count);


            }
        }

        System.out.println("the elements in array are:->");
        for (int i = 0; i < 10; i++) {
            //int[] array = new int[i];
            System.out.println(array[i]);
        }
    }
}

