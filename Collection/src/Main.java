/*
  Scrivere un programma che chieda all'utente di inserire un intero N che rappresenti il numero di elementi da inserire
  e poi gli chieda di inserire N parole. Il programma dovrà:
   - stampare tutte le parole duplicate
   - stampare il numero di parole distinte
   - stampare l'elenco delle parole distinte
  Utilizzare l'interfaccia Set e l'implementazione HashSet
*/

import entities.Casual;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();

        // #Esercizio 1
        System.out.println("====================================== ESERCIZIO 1 ======================================");
        System.out.print("Inserisci il numero di elementi da inserire: ");
        int N = scanner.nextInt();
        scanner.nextLine();

        List<String> lista = new ArrayList<>();          // crea una lista ordinata di stringhe con dupl e accesso per i
        for (int i = 0; i < N; i++) {
            System.out.print("Inserisci la parola n. " + (i + 1) + ": ");
            String elemento = scanner.nextLine();
            lista.add(elemento);
        }

        Set<String> viste = new LinkedHashSet<>();       // crea un insieme di parole senza duplicati con ordine d'ins.
        Set<String> duplicate = new LinkedHashSet<>();   // crea un insimee di parole duplicate senza ripetizioni
        for (String parola : lista) {                    // per ogni parola della lista
            if (!viste.add(parola)) {                    // se la parola è duplicata
                duplicate.add(parola);                   // aggiunge la parola all'insieme di duplicati
            }
        }

        if (duplicate.isEmpty()) {
            System.out.println("\nNon ci sono parole duplicate");
        } else {
            System.out.println("\nLe parole duplicate sono: " + duplicate);
        }

        System.out.println("Le parole distinte sono: " + viste.size());
        System.out.println("Ovvero: " + viste + "\n");

        // #Esercizio 2
        System.out.println("====================================== ESERCIZIO 2 ======================================");
        System.out.print("Inserisci quanti numeri casuali vuoi visualizzare: ");
        int n = scanner.nextInt();

        List<Integer> list = Casual.randomGenerator(n);
        System.out.println("Numeri casuali ordinati: " + list);

        scanner.close();
    }
}