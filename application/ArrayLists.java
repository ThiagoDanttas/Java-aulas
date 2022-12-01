package application;
import java.util.*;
import java.util.stream.Collectors;

public class ArrayLists {

    public static void main(String[] args){

        List<String> list = new ArrayList<>(){{
            add("Maria");
            add("Alex");
            add("Bob");
            add("Anna");
            add(2, "Marco");
        }};

        // Retorna todos os elementos na lista
        for (String x: list) System.out.println(x);

        // Retorna o tamanho da lista
        System.out.println(list.size());

        System.out.println("--------------------");

        // remove uma elemento usando um filtro
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x: list) System.out.println(x);

        System.out.println("--------------------");

        // retorna o index de uma elemento
        System.out.println("index of Bob: " + list.indexOf("Bob"));

        System.out.println("--------------------");

        // filtra um elemento utilizando stream e convertendo para list
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').toList();
        for (String x: result) System.out.println(x);

        System.out.println("--------------------");

        // encontra um único elemento utilizando verificação
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse("null");
        System.out.println(name);
    }

}
