package lab2.Country;

import lab2.Providence.Province;

public class Country {

    private String name;
    private Province[] provinces;

    public Country(){
        this.name = "Canada";
        this.provinces = new Province[] {
            new Province("Alberta","Edmonton",4),
            new Province("British Columbia","Victoria",5),
            new Province("Manitoba","Winnipeg",1),
            new Province("New Brunswick","Frederiction",1),
            new Province("Newfoundland and Labrador","St. John's",1),
            new Province("Nova Scotia","Halifax",1),
            new Province("Ontario","Toronto",13),
            new Province("Prince Edward Island","Charlottetown",0),
            new Province("Quebec","Quebec City",8),
            new Province("Saskatchewan","Regina",1)
        };
    }

    public void displayAllProvinces(){
        for(Province elem: this.provinces){
            System.out.println(elem.getDetails());
        }

    }
    public int howManyHaveThisPopulation(int min, int max){
        int many = 0;
        for(Province elem: this.provinces){
            if (elem.getPopulationInMillions() >= min && elem.getPopulationInMillions() <= max)
            many++;
        }

        return many;
    }
}