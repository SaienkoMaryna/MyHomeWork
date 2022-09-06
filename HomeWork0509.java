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
        System.out.println(p);
        System.out.println(s);
    
}
}
    