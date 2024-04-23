import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;


public class Main {
    public static void main(String[] args) throws IOException {
        readData data = new readData("loty.txt");
        LinkedList<Pasazer> pasazersLinkedList = new LinkedList<>();
        for (int i=0; i< data.size; i++){
            pasazersLinkedList.add(new Pasazer(
                            data.getCity().get(i),
                             data.getGodzinaOdlotu().get(i),
                             data.getCena_biletu().get(i),
                             data.getId().get(i),
                             data.getName().get(i),
                             data.getSurrname().get(i),
                             data.getEmail().get(i),
                             data.getNr_miejsca().get(i)));
        }

        zadanieA(pasazersLinkedList);
        zadanieB(pasazersLinkedList);
        zadanieC(pasazersLinkedList);
        zadanieD(pasazersLinkedList);
        }

        //Sortuj po nazwiskach a jak nie to po mieście
        public static void zadanieA (LinkedList <Pasazer> lista){
            lista.sort(((o1, o2) -> {
                if (o1.getMiasto().equals(o2.getMiasto())) {
                    return String.CASE_INSENSITIVE_ORDER.compare(o1.getSurrname(), o2.getSurrname());
                }
                return String.CASE_INSENSITIVE_ORDER.compare(o1.getMiasto(), o2.getMiasto());
            }));
            System.out.println("ZadanieA \n" + lista);
        }
        //wypisz ile pasazerow lata do poszczegolnych miast
        public static void zadanieB (LinkedList<Pasazer> lista){
            HashMap <String,Integer> map = new HashMap<>();
            for (Pasazer pasazer : lista) {
                map.merge(pasazer.getMiasto(), 1, Integer::sum);
            }

            var listaMiast = map.entrySet().stream().sorted((o1, o2) -> Integer.compare(o2.getValue(),o1.getValue())).toList();
            System.out.println("ZadanieB \n" + listaMiast);
        }
        //Ile lacznie wydano na loty
        public static void zadanieC (LinkedList<Pasazer> lista){
            HashMap <String,Double> map = new HashMap<>();
            for (Pasazer i:lista) {
                map.merge(i.getMiasto(),i.getCenaBiletu(),Double::sum);
            }

            var listaPosortowana = map.entrySet().stream().sorted(Comparator.comparingDouble(Map.Entry::getValue)).toList();
            System.out.println("ZadanieC \n"+listaPosortowana);
        }

        //zapisz do pliku wszystkie loty do rzymu i e-maile z ".com"
        public static void zadanieD (LinkedList<Pasazer> lista) throws IOException {
            FileWriter writer = new FileWriter("wynik.txt");
            for (Pasazer i: lista) {
                if (i.getMiasto().equals("Rzym") && i.getEmail().contains(".com")){
                    writer.write(i.toString());
                }
            }
            writer.close();
            System.out.println("Zadanie D w pliku wynik.txt");
        }
}
