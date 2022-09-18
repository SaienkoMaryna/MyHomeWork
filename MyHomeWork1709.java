import java.util.Random;
import java.util.Scanner;
/**
*  MyHomeWork1709 
*
*  @author MarynaSaienko 
*  @todo 14.09.2022
*  @date 18.09.2022
*/
class MyHomeWork1709  {
    public static void main (String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int number = 0;
        int quess = -1;
        
        do {
        number = random.nextInt(10);               
        for (int i = 0; i < 3; i++) {        
            System.out.print(" quess the number [0..9] : " );
            quess = scanner.nextInt();
            if(quess < number) {
                System.out.println("your number is less");
            } else if (quess > number) {
                System.out.println("your number is bigger");
            } else {
                System.out.println("your WIN , you quess my number"); 
             break;                
            }         
        }      
           
            if(number != quess) {
                System.out.println("your lose");   
            }
                System.out.println("repeat the game? yes 1 or no 0 ");
                String otvet = scanner.next();  
        }  
           while (scanner.nextInt() == 1);
    }
}
      