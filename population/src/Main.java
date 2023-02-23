import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Cities
        City city1 =new City(57,"Bogota",150,"america",1,true);
        City city2=new City(33,"Lyon",234,"Europa",3,false);
        City city3 =new City(57,"Medellin",159,"america",2,false);
        City city4=new City(36,"Berlin",340,"Europa",4,true);
        City city5=new City(54,"Lima",320,"america",5,true);

        List<City> cities=Arrays.asList(city1,city2,city3,city4,city5);

        //Counties
        Country fr =new Country(33,"Francia",518,"Europa");
        Country al =new Country(36,"Alemania",650,"Europa");
        Country co=new Country(57,"Colombia",510,"america");
        Country pe=new Country(54,"Peru",530,"america");

        List<City> lista1=Arrays.asList(city1,city3);
        List<City> lista2=Arrays.asList(city2);
        List<City> lista3=Arrays.asList(city4);
        List<City> lista4=Arrays.asList(city5);

        co.setCities(lista1);
        fr.setCities(lista2);
        al.setCities(lista3);
        pe.setCities(lista4);

        //co.getCities().stream().map(city -> city.getName()).forEach(System.out::println);
        //fr.getCities().stream().map(city -> city.getName()).forEach(System.out::println);

        //ciudad mas poblada de c/pais
        System.out.println(" ");
        System.out.println("Ciudad mas poblada de cada Pais:");
        System.out.print("\t"+co.getName()+" -> ");
        co.getCities().stream().max((c1,c2)->c1.getPopulation()-c2.getPopulation()).ifPresent(System.out::println);
        System.out.print("\t"+fr.getName()+" -> ");
        fr.getCities().stream().max((c1,c2)->c1.getPopulation()-c2.getPopulation()).ifPresent(System.out::println);
        System.out.print("\t"+al.getName()+" -> ");
        al.getCities().stream().max((c1,c2)->c1.getPopulation()-c2.getPopulation()).ifPresent(System.out::println);
        System.out.print("\t"+pe.getName()+" -> ");
        pe.getCities().stream().max((c1,c2)->c1.getPopulation()-c2.getPopulation()).ifPresent(System.out::println);


        //ciudad mas poblada de c/continente
        System.out.println(" ");
        System.out.println("Ciudad mas poblada de cada continente:");
        System.out.print("\tAmerica -> ");
        cities.stream()
                .filter(ciudades->ciudades.getContinent().equals("america"))
                .max((c1,c2)-> c1.getPopulation()-c2.getPopulation()).ifPresent(System.out::println);

        System.out.print("\tEuropa -> ");
        cities.stream()
                .filter(ciudades->ciudades.getContinent().equals("Europa"))
                .max((c1,c2)-> c1.getPopulation()-c2.getPopulation()).ifPresent(System.out::println);

        //encontrar la capital más poblada
        System.out.println(" ");
        System.out.println("La capital más poblada es:");
        System.out.print("\t");
        cities.stream()
                .filter(ciudades->ciudades.isCapital()==true)
                .max((c1,c2)-> c1.getPopulation()-c2.getPopulation()).ifPresent(System.out::println);

        //encontrar los paises por cantidad de ciudades y ponerlos en orden ascendente
        List<Country> countries=Arrays.asList(co,al,pe,fr);
        System.out.println(" ");
        System.out.println("Paises por cantidad de ciudades en orden ascendente");
        countries.stream()
                .sorted(new CompararPais())
                .forEach(paises-> System.out.println("\t"+paises.getName()+" -> "+" Cantidad ciudades: "+paises.getCities().size()+"\n\t"+paises.getCities()));
    }
}