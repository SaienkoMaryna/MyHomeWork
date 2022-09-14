/**
*  MyHomeWork1409 
*
*  @author MarynaSaienko 
*  @todo 12.09.2022
*  @date 14.09.2022
*/
class HomeWork1409 {
    public static void main (String[] args) {
        int[] myArray = new int[10];
        printArray(myArray);
        int[] maxim = {1, 7, 88, 0, 34};
        getMax(maxim);
            System.out.println(getMax(maxim));
    }    
    static void printArray (int[] array){
            System.out.print("[");         
            
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() *20);
            System.out.print(array[i]);
        if (i < array.length - 1){
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
    
}