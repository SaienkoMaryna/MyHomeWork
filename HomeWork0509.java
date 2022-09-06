/***
*  MyHomeWork0509 version 06.09.2022
*  Author MarynaSaienko 
*
*/

class HomeWork0509 {
    public static void main(String[] args){
        int a; // katet pryamougolnogo ravnobedrennogo treugolnika
        int b; // gipotenuza pryamougolnogo treugolnika
        a = 4;
        b = 7;
        int p = b+ a * 2;
        int s = a * b / 2; // S=1/2*(a*h), t.e. ravna  polovine proizvedeniya gipotenuzy (osnovaniya) na vysotu.   
                           // t.k. treugolnik pryamougolniy, to S=1/2*(a*b),t.k. katety perpendikulyarni i ravny,
                           // to odin katet - eto visota, provedennaya ko vtoromu katetu.     
        System.out.println("ZADACHA 1");
        System.out.println("p =" + p);
        System.out.println("s =" + s);
        System.out.println();
        System.out.println(" ZADACHA 2 ");
        int x;
        int y;
        x = 5;
        y = 3;
        int c = x + y;
        int d = x - y;
        float e = x / y;
        System.out.printf("c = %d, d = %d, e =%f", c,d,e);
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
    