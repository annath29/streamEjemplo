import java.util.ArrayList;
import java.util.List;

public class Country {
    private int idCountry;
    private String name;
    private int population;
    private String continent;
    // private int idcity;//id capital city

    private List<City> cities;
    {
        cities=new ArrayList<>();
    }

    //constructor
    public Country(int idCountry, String name, int population, String continent) {
        this.idCountry = idCountry;
        this.name = name;
        this.population = population;
        this.continent = continent;
    }


    //getter and setter
    public int getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(int idCountry) {
        this.idCountry = idCountry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return name + ":{"+
                "idCountry=" + idCountry +"," +
                "Population=" + population +", " +
                "Continent='" + continent +"}";
    }
}
