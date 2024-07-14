//Desafio 13 - Filtrar os números que estão dentro de um intervalo
package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio13 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        int min = 5;
        int max = 10;
        List<Integer> filtrados = numeros.stream()
                .filter(n -> n >= min && n <= max)
                .collect(Collectors.toList());
        System.out.println(filtrados);
    }
}
