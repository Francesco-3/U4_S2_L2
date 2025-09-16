package entities;
/*
  Scrivere una funzione che accetti un intero N e restituisca una lista ordinata N interi casuali da 0 a 100.
  Scrivere una seconda funziuone che accetti una lista e restituisca una nuova lista composta dagli elementi della prima
  lista seguiti dagli stessi elementi disposti in ordine inverso. Scrivere una terza funzione che accetti una lista ed
  un booleano: se il booleano è true stampa i valori in posizioni pari, altrimenti stampa i valori in posizioni dispari.
  Creare un main che utilizzi le tre funzioni. Utilizzare l'interfaccai List e l'implementazione ArrayList.
*/

import java.util.*;

public class Casual {
    public static List<Integer> randomGenerator(int n) {
        Random r = new Random();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(r.nextInt(101));
        }

        Collections.sort(list);
        return list;
    }
}
