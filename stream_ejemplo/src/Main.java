import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Empleado e = new Empleado("Oscar Blancarte", "Systems");
        Empleado e2 = new Empleado("Liliana Castro", "Systems");
        Empleado e3 = new Empleado("Fernanda Martinez", "Systems");
        Empleado e4 = new Empleado("Manuel López", "RH");
        Empleado e5 = new Empleado("Rebeca Pérez", "Systems");
        Empleado e6 = new Empleado("Oscar Blancarte", "Systems");

        e.setEdad(20);
        e3.setEdad(40);
        e6.setEdad(31);
        List<Empleado> lista = new ArrayList<Empleado>();

        lista.add(e);
        lista.add(e2);
        lista.add(e3);
        lista.add(e4);
        lista.add(e5);
        lista.add(e6);

        lista.stream()
                .filter(empleado -> empleado.getArea().equals("Systems"))
                .sorted(new CompararNombre())
                .distinct()
                .forEach(empleado -> System.out.println(empleado.getNombre()));

        System.out.println("MAP");
        //MAP
        List<Integer> number = Arrays.asList(2, 3, 4, 5);
        List<Integer> square = number.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());
        //square.forEach(System.out::println);
        square.forEach(n -> {
            n = n + 2;
            System.out.println(n);
        });

        System.out.println(" ");
        //imprimir edades
        System.out.println(" ");
        System.out.println("EDADES");
        lista.stream()
                .map(Empleado::getEdad)
                .forEach(System.out::println);
        //sorted
        System.out.println(" ");
        System.out.println("SORTED");
        List<String> names = Arrays.asList("Reflection", "Collection", "Stream");
        List<String> result = names.stream().sorted().collect(Collectors.toList());
        result.forEach(System.out::println);

        //Reduce
        System.out.println(" ");
        System.out.println("REDUCE");
        number.stream()
                .reduce((n1, n2) -> n1 + n2)
                .ifPresent(System.out::println);

        //fatmap: metodo que se puede utilizar en casos en los que
        // tengamos un stream de streams
        //y queremos simplificarlo en un solo stream

        System.out.println("");
        System.out.println("FLATMAP");
        List<String> a = Arrays.asList("Hola", "como estas");
        List<String> b = Arrays.asList("Adios", "Hasta luego");

        List<List<String>> cordialidad = Arrays.asList(a, b);
        cordialidad.stream()
                .flatMap(listAux -> listAux.stream())
                .map(saludo -> saludo + ":)")
                .forEach(System.out::println);

        System.out.println(" ");
        System.out.println("Collector");
        List<Integer> numeros = Arrays.asList(2, 3, 4, 5);
        List<Integer> numerosModificados = numeros.stream()
                .map(x -> x + 1)
                .collect(Collectors.toList());
        List<Integer> ListaNumerosModificados = numeros.stream()
                .map(x -> x + 1)
                .collect(Collectors.toUnmodifiableList());//Retornar una lista que no se puede modificar

        Set<Integer> numeroNuevo = numeros.stream().collect(Collectors.toSet());

        //tocollection
        LinkedList<Integer> numeroArray = numeros.stream().collect(Collectors.toCollection(LinkedList::new));
        //supplier es un metodo que no recibe parametros para retornar algo
        numeroArray.forEach(System.out::println);

        //to map gurda stream en map
        Map<String, Integer> mapa = numeros.stream()
                .collect(Collectors.toMap(n -> Integer.toString(n), Integer::valueOf));
        mapa.forEach((n, k) -> {
            System.out.println(n + "," + k);
        });
    }
}