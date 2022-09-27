import java.util.Random;
import java.util.Scanner;
/**
*  MyHomeWork  # 4
*
*  @author MarynaSaienko 
*  @todo 19.09.2022
*  @date 27.09.2022
*/
class FieldOfMiracles  {
    public static void main (String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
            String [] words = {"door", "week", "beer", "food", "tree"};
            char[] mask = {'#', '#', '#', '#'};
            String word = words[random.nextInt(words.length)];
            int counter = 0;
            int letterCounter = 0;
            
        do { 
            counter++;
            
            System.out.println("Quess the word: [ " + new String(mask) + " ]:");
            char letter = scanner.next().charAt(0);
            for (int i = 0; i < word.length(); i++) {
                if (letter == word.charAt(i) && mask[i] == '#') {
                    mask[i] = letter;
                    letterCounter++;
                } 
                      
            } 
        }            
            while (letterCounter < word.length());
                System.out.println(" You quess the word:[ " + word + " ], attemps :" + counter);
        }
            
    }

