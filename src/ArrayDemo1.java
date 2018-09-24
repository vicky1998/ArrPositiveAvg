
    import java.util.ArrayList;
    import java.util.Scanner;

    public class ArrayDemo1 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            ArrayList al = new ArrayList();
            System.out.println("enter value");
            int sum=0;
            while(true) {

                  int temp=sc.nextInt();


                if(temp<=0){
                    break;
                }

                al.add(temp);
                sum=sum+temp;

            }
            System.out.println(al);
            System.out.println("sum is->"+sum);
            System.out.println("the avg is"+sum/al.size());



        }
    }