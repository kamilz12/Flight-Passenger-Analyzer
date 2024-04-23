public class Lot {
    //postać danych w pliku do odczytu
    //id,imie,nazwisko,email,miasto,godzina_odlotu,cena_biletu,numer_miejsca
    //1,Oran,Ousby,oousby0@sphinn.com,Warszawa,7:45,$432.06,43
    String miasto;
    String godzinaOdlotu;
    double cenaBiletu;

    public Lot(String miasto, String godzinaOdlotu, double cenaBiletu) {
        this.miasto = miasto;
        this.godzinaOdlotu = godzinaOdlotu;
        this.cenaBiletu = cenaBiletu;
    }

    public String getMiasto() {
        return miasto;
    }

    public String getGodzinaOdlotu() {
        return godzinaOdlotu;
    }

    public double getCenaBiletu() {
        return cenaBiletu;
    }
}
