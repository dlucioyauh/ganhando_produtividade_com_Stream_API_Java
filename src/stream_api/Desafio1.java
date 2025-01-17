//Desafio 1 - Ordem Numérica
package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio1 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> sortedNumbers = numeros.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedNumbers);
    }
}
