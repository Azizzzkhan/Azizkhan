import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class Document {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Test2");
        var scan = new Scanner(file);
    String line = scan.nextLine();
    String[] numbersString = line.split(" ");
    int[] numbers = new int[10];
    int counter = 0;
    for(String num: numbersString){
        numbers[counter++] = Integer.parseInt(num);
    }
        System.out.println(Arrays.toString(numbers));
        scan.close();
        printSumDigits(file);

    }
    public static void printSumDigits(File file){
        for(int i=0;i<=10;i++){
            break;
        }
        System.out.printf("");
    }
}
