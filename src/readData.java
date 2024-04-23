import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class readData {
    public String path;
    LinkedList <Integer> id = new LinkedList<>();
    LinkedList <String> name = new LinkedList<>();
    LinkedList <String> surrname = new LinkedList<>();
    LinkedList <String> email = new LinkedList<>();
    LinkedList <String> city = new LinkedList<>();
    LinkedList <String> godzinaOdlotu = new LinkedList<>();
    LinkedList <Double> cena_biletu = new LinkedList<>();
    LinkedList <Integer> nr_miejsca = new LinkedList<>();
    int size;
    //id,imie,nazwisko,email,miasto,godzina_odlotu,cena_biletu,numer_miejsca
    //1,Oran,Ousby,oousby0@sphinn.com,Warszawa,7:45,$432.06,43
    public readData(String path) throws IOException {
        this.path = path;
        FileReader reader = new FileReader(path);
        BufferedReader bfreader = new BufferedReader(reader);
        String line;
        while ((line = bfreader.readLine()) != null){
            String [] splitedlines = line.split(",");
            id.add(Integer.parseInt(splitedlines[0]));
            name.add(splitedlines[1]);
            surrname.add(splitedlines[2]);
            email.add(splitedlines[3]);
            city.add(splitedlines[4]);
            godzinaOdlotu.add(splitedlines[5]);
            double tempCenaOdlotu = Double.parseDouble(splitedlines[6].substring(1));
            cena_biletu.add(tempCenaOdlotu);
            nr_miejsca.add(Integer.parseInt(splitedlines[7]));
            size++;
        }
        bfreader.close();
        reader.close ();
    }
    public LinkedList<Integer> getId() {
        return id;
    }

    public LinkedList<String> getName() {
        return name;
    }

    public LinkedList<String> getSurrname() {
        return surrname;
    }

    public LinkedList<String> getEmail() {
        return email;
    }

    public LinkedList<String> getCity() {
        return city;
    }

    public LinkedList<String> getGodzinaOdlotu() {
        return godzinaOdlotu;
    }

    public LinkedList<Double> getCena_biletu() {
        return cena_biletu;
    }

    public LinkedList<Integer> getNr_miejsca() {
        return nr_miejsca;
    }


}
