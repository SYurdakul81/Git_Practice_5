package Hello;
import java.util.Scanner;
public class Hello_World {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number for number of printing Hello World");
        int num=input.nextInt();
        for (int i = 0; i <num ; i++) {
            System.out.println("Hello World "+(i+1));
        }
        //Comment1: this loop to print out some message
    }
}
