import java.util.List;

public class Drzewo {

    private List<Lisc> liscie;
    private double wysokosc;
    private int liczbaGalezi;
    private double wiek;

    public int getLiczbaGalezi(){
        return this.liczbaGalezi;
    }

    public int zwiekszLiczbeGalezi(int galezie){
        this.liczbaGalezi = this.liczbaGalezi+galezie;
        return this.liczbaGalezi;
    }

    public void dodajLisc(Lisc nowyLisc){
       liscie.add(nowyLisc);
    }

}

