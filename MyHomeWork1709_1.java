import java.util.Random;
import java.util.Scanner;
/**
*  MyHomeWork1709_1 
*
*  @author MarynaSaienko 
*  @todo 14.09.2022
*  @date 18.09.2022
*/
class MyHomeWork1709_1  {
    public static void main (String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        do{
        System.out.println("You shoud thinkig of a number [0...10], if ready write : yes");
        String otvet = scanner.next();
        int number = random.nextInt(10);
        System.out.println(" please, add the same number if ready write : yes");
        otvet = scanner.next();
        int result = number + number;
        System.out.println(" please, divide by intention number if ready write : yes");
        otvet = scanner.next();
        int result2 = result / number;
        System.out.println("i think that your number is 2.");
        
        if(result2 != 2) {
                System.out.println("I am lose");   
            }
                System.out.println("repeat the game? yes - 1 or no  - 0 ");
         
        }  
           while (scanner.nextInt() == 1 );
    }
}