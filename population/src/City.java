public class City{
    private int idcity;
    private boolean capital;
    private int idCountry;
    private String name;
    private int population;
    private String continent;

    public City(int idCountry, String name, int population, String continent, int idcity,boolean capital) {
        this.idCountry=idCountry;
        this.name=name;
        this.population=population;
        this.continent=continent;
        this.idcity=idcity;
        this.capital=capital;
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

    public int getIdcity() {
        return idcity;
    }

    public void setIdcity(int idcity) {
        this.idcity = idcity;
    }

    public boolean isCapital() {
        return capital;
    }

    public void setCapital(boolean capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        return name + ":{"+
                "idcity=" + idcity +","  +
                "idCountry=" + idCountry +"," +
                "Population=" + population +", " +
                "Continent=" + continent +"}";
    }
}
