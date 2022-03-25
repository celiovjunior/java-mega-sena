import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorteio {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 60; i++) {
            numeros.add(i);
        }

        Collections.shuffle(numeros);
        List<Integer> sorteados = numeros.subList(0, 6);
//
        Collections.sort(sorteados);

        System.out.println(sorteados);
    }
}
