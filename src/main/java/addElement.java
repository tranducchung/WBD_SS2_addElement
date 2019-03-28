import java.util.Scanner;

public class addElement {
    public static void main(String[] args) {
        int[] number = new int[10];
        System.out.println("Enter number you want add to array");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("Enter index of it");
        int index = scanner.nextInt();
        for(int i=0;i< number.length;i++){
            if (i==index){
                number[i]=x;
            }else if(index < 0 || index > number.length-1){
                System.out.println("please input agian index");
            }
        }
        System.out.println("Array number is");
       for (int i=0;i<number.length;i++){
           System.out.print(number[i] +"\t");
       }
    }
}
