//Desafio 5 - Média dos Números Maiores que 5
package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Desafio5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        OptionalDouble media = numeros.stream()
                .filter(n -> n > 5)
                .mapToInt(Integer::intValue)
                .average();
        System.out.println(media.isPresent() ? media.getAsDouble() : "Nenhum número maior que 5");
    }
}
