//Desafio 18 - Verifique se todos os números da lista são iguais
package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio18 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
        boolean todosIguais = numeros.stream()
                .distinct()
                .count() == 1;
        System.out.println(todosIguais);
    }
}
