/***
*  MyHomeWork0509 
*
*  @author MarynaSaienko 
*  @todo 05.09.2022
*  @date 06.09.2022
*  @update 09.09.2022
*
*/

class HomeWork0509 {
    public static void main(String[] args){
        int a; 
        int b; 
        a = 4;
        b = 7;
        int p = (b+ a) * 2;
        int s = a * b; 
        System.out.println("ZADACHA 1");
        System.out.println("p =" + p);
        System.out.println("s =" + s);
        System.out.println();
        System.out.println(" ZADACHA 2 ");
        int x;
        int y;
        a = 5;
        b = 3; 
        System.out.printf("%d + %d = %d\n", a, b, a+b);
        System.out.printf("%d - %d = %d\n", a, b, a-b);
        System.out.printf("%d /%d = %f\n", a, b, (float)a/b);
        System.out.printf("%d * %d = %d\n", a, b, a*b);
        System.out.println();
        System.out.println();
        System.out.println("ZADACHA 3 ");       
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 5;
        array[2] = 9;
        array[3] = 15;
        array[4] = -9;        
        System.out.println(array[4]);
        System.out.println(array[3]);
        System.out.println(array[2]);
        System.out.println(array[1]);
        System.out.println(array[0]);
        System.out.println();
        System.out.println("ZADACHA 4");
        int diametrPiccy;
        diametrPiccy = 20;
        int radiusPiccy = diametrPiccy / 2;
        double ploszhadPiccy = radiusPiccy * radiusPiccy * 3.14;
        double kalloriynost = ploszhadPiccy * 40;
        System.out.println("Kaloriynost piccy =" +kalloriynost+ "kall");
        
        
        
    
}
}
    