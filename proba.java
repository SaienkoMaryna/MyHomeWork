class HomeWork0909 {
    public static void main (String[] args) {
        
        boolean walk= canWalk(true , false);
        
    static boolean canWalk(boolean isWeekend,boolean isRain){    
        if (isWeekend == true && isRain == false) {
            System.out.println("You can walk");
        return true;
        } else {
            System.out.println("You can`t walk");
        return false;
        }
        }
}
