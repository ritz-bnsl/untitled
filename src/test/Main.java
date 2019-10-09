package test;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        final Scanner scanner=new Scanner(System.in);
        int numberOfLeds=Integer.parseInt(scanner.nextLine());
        Led[] array =new Led[numberOfLeds];
        for (int i = 0; i < array.length; i++) {
            String colourName =scanner.next().trim();
            boolean working=scanner.nextBoolean();

            array[i]=new Led(colourName,working);

        }
       Ledstrip strip =new Ledstrip(array);
        strip.printStripStatus();
        scanner.close();
    }
}
