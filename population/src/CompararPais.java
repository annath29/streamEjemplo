import java.util.Comparator;

public class CompararPais implements Comparator<Country> {

    @Override
    public int compare(Country o1, Country o2) {
        return (Integer.compare(o1.getCities().size(),o2.getCities().size()))*-1;
    }
}
