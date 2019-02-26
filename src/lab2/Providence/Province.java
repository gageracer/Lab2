package lab2.Providence;



public class Province{

    

    private static final int DEFAULT_POPULATION_MILLIONS = 4;
    private static final String DEFAULT_CAPITAL = "Victoria";
    private static final String DEFAULT_PROVINCE = "British Columbia";
    private String name;
    private String capital;
    private int populationInMillions;
    private static String[] province ={"Alberta","British Columbia","Manitoba","New Brunswick","Newfoundland and Labrador","Nova Scotia","Ontario","Prince Edward Island","Quebec","Saskatchewan"};
    private static String[] city ={"Edmonton","Victoria","Winnipeg","Fredericton","St. John's","Halifax","Toronto","Charlottetown","Quebec City","Regina"};
    
        // !(if 1 && 2 && 3)
        // if !1 || !2 || !3
    public Province(String name, String capital, int population) {
        if(!setCapital(capital) || !setName(name) || !setPopulationInMillions(population))
        {
            this.populationInMillions = DEFAULT_POPULATION_MILLIONS;
            this.name = DEFAULT_PROVINCE;
            this.capital = DEFAULT_CAPITAL;
        }
   }

    private boolean isValidPopulation(int population){
        boolean isvalid = false;
        if( population  >= 0 && population <=38){
            isvalid = true;
            
        }
        
        
        return isvalid;
    }

    private boolean isValidProvince(String province){
        boolean isvalid = false;


        return isvalid;
    }

    /**
     * @return the populationInMillions
     */
    public int getPopulationInMillions() {
        return populationInMillions;
    }

    /**
     * @param populationInMillions the populationInMillions to set
     */
    public boolean setPopulationInMillions(int populationInMillions) {
        boolean isvalid = false;
        if( populationInMillions  >= 0 && populationInMillions <= 38){
            this.populationInMillions = populationInMillions;
            isvalid = true;
        }
        return isvalid;
    }

    /**
     * @return the capital
     */
    public String getCapital() {
        return capital;
    }

    /**
     * @param capital the capital to set
     */
    public boolean setCapital(String capital) {
        boolean isin = false;
        for(String elem: city){
            if(capital == elem)
            isin = true;
        }
        if(isin)
        this.capital = capital;

        return isin;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public boolean setName(String name) {
        boolean isin = false;
        for(String elem: province){
            if(name == elem)
            isin = true;
        }
        if(isin)
        this.name = name;
        
        return isin;
    }

    public String getDetails(){
        String details = String.format("The capital of %s (pop. %d million) is %s.", getName(),getPopulationInMillions(),getCapital());
        return details;
    }
}