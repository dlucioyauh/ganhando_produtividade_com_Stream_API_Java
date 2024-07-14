//Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem)
package stream_api;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Desafio9 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        boolean todosDistintos = numeros.stream()
                .allMatch(new HashSet<>()::add);
        System.out.println(todosDistintos);
    }
}
