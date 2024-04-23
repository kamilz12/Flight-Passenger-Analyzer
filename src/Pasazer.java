public class Pasazer extends Lot{
    //id,imie,nazwisko,email,miasto,godzina_odlotu,cena_biletu,numer_miejsca
    //1,Oran,Ousby,oousby0@sphinn.com,Warszawa,7:45,$432.06,43

    public int id;
    public String name;
    public String surrname;
    public String email;
    public int numermiejsca;

    public Pasazer(String miasto, String godzinaOdlotu, double cenaBiletu, int id, String name, String surrname, String email, int numermiejsca) {
        super(miasto, godzinaOdlotu, cenaBiletu);
        this.id = id;
        this.name = name;
        this.surrname = surrname;
        this.email = email;
        this.numermiejsca = numermiejsca;
    }

    @Override
    public String toString() {
        return "Pasazer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surrname='" + surrname + '\'' +
                ", email='" + email + '\'' +
                ", numermiejsca=" + numermiejsca +
                ", miasto='" + miasto + '\'' +
                ", godzinaOdlotu='" + godzinaOdlotu + '\'' +
                ", cenaBiletu=" + cenaBiletu +
                '}' + "\n";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurrname() {
        return surrname;
    }

    public String getEmail() {
        return email;
    }

    public int getNumermiejsca() {
        return numermiejsca;
    }


}
