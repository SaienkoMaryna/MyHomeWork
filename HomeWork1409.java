/**
*  MyHomeWork1409 
*
*  @author MarynaSaienko 
*  @todo 12.09.2022
*  @date 14.09.2022
*/
class HomeWork1409 {
    public static void main (String[] args) {
        int[] myArray = {11, 22, 56, 78, 99};
        printArray(myArray);
        
        //task2
        
        int[] maxim = {1, 7, 88, 0, 34};
        getMax(maxim);
            System.out.println(getMax(maxim));
            
        //task3
        
        int[] Vsenaoborot = {0, 0, 1, 1 ,0, 1 ,0, 0};
        printArray(Vsenaoborot);
        printArray(inventArray(Vsenaoborot));
      
    }    
    static void printArray (int[] array){
           System.out.print("[");         
         
         for(int i = 0; i < array.length; i++) {
        // array[i] = (int) (Math.random() *20);
            System.out.print(array[i]);
        if(i < array.length - 1) {
            System.out.print(" ,");
        }
        }                
            System.out.print("]");
            System.out.println();            
    }        
   
        // task 2
        
    static int getMax(int[] maxarray) {
            int max = maxarray[0];
        for (int i = 1; i < maxarray.length; i++) {
        if (maxarray[i] > max) {
                max = maxarray[i];                
        }
        }       
            return max;   
    }  

        // task 3
    static int[] inventArray(int[] oborot) { 
        int[] result  = new int[oborot.length];
        for (int i = 0; i < oborot.length; i++) {
        if (oborot[i] == 0)  {
            result[i] = 1;
        } else {
            result[i] = 0;
        }   
        }
            return result;        
    }
}
