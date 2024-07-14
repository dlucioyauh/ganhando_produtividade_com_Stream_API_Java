//Desafio 14 - Encontre o maior número primo da lista
package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio14 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        int maiorPrimo = numeros.stream()
                .filter(Desafio14::isPrime)
                .max(Integer::compare)
                .orElse(-1);
        System.out.println(maiorPrimo);
    }

    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
