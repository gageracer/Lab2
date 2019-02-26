package app;

import lab2.Country.Country;
import lab2.Providence.Province;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello Java");
        Province bc = new Province("British Columbia", "Victoria", 24);
        Province wrong = new Province("Alberta", "Dick", 28);
        System.out.println(bc.getDetails());
        System.out.println(wrong.getDetails());
        
        Country ca = new Country();
        ca.displayAllProvinces();
        
    }
}