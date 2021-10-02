public class Karakter {
     private  String Id;
     private String Ad;
     private boolean KarakterTur;
    public Lokasyon lokasyon;



    public Karakter(String id, String ad, boolean karakterTur, Lokasyon lokasyon) {
        Id = id;
        Ad = ad;
        KarakterTur = karakterTur;
        this.lokasyon = lokasyon;
    }
    public void HareketEt(int yon,Lokasyon lokasyon,int[][] matris) {
    }

















    public Karakter() {
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getAd() {
        return Ad;
    }

    public void setAd(String ad) {
        Ad = ad;
    }

    public boolean isKarakterTur() {
        return KarakterTur;
    }

    public void setKarakterTur(boolean karakterTur) {
        KarakterTur = karakterTur;
    }

    public Lokasyon getLokasyon() {
        return lokasyon;
    }

    public void setLokasyon(Lokasyon lokasyon) {
        this.lokasyon = lokasyon;
    }

    public void EnKısaYol(){

     }

}
