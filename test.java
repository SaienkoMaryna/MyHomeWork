class test {
    public static void main (String[] args) {
        
        int [] Vsenaoborot = {0, 0, 1, 1 ,0, 1 ,0, 0};
        printArray (Vsenaoborot);
        printArray (inventArray(Vsenaoborot));
    }  
       
    static int[] inventArray (int[] oborot) { 
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