/***
*  MyHomeWork0509 
*
*  @author MarynaSaienko 
*  @todo 05.09.2022
*  @date 09.09.2022
*  
*/
class HomeWork0909 {
    public static void main (String[] args) {
        checkWeather();
        canWalk();
        int summa = add(8, 4);
        System.out.println(summa);
        int raznost = sub(8, 4);
        System.out.println(raznost);
        int delenie = del(8, 4);
        System.out.println(delenie);
        int umnozh = umn(8, 4);
        System.out.println(umnozh);
        } 
                
        // 1
    static void checkWeather(){
        int temperature = 39;
        if (temperature > 0 && temperature <=18) {
            System.out.println("It`s cold");
        } else if (temperature < 0 ) {
            System.out.println("It`s frost");
        } else if (temperature >=19 && temperature <=28 ) {
            System.out.println("It`s warm");
        } else {
            System.out.println("It`s Hot");
        }
    }
        // 2
         
    static void canWalk(){    
        boolean isWeekend = true;
        boolean isRain = !false;
        if (isWeekend && isRain ) {
            System.out.println("You can walk");
        } else {
            System.out.println("You can`t walk");
        }
    }
    
        // 3
    
    static int add(int a, int b) {
        int c = a + b;
        return(c);
    }  
    static int sub(int a, int b) {
        int d = a - b;
        return(d);
    }    
    static int del(int a, int b) {
        int x = a / b;
        return(x);
    }
    static int umn(int a, int b) {
        int e = a * b;
        return(e);
    } 
    } 