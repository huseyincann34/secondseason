public class Oyuncu extends Karakter{
      public String oyuncuId;
       public String oyuncuAdi;
       //Buradaki oyuncu tur gozlukmu yoksa tembel sırınmı onun ıcın herhalde
       public boolean oyuncuTur;
      public int Skor;


       public void PuaniGoster(){
       }
       public void HareketEt(String yon,Lokasyon lokasyon){

       }

    public Oyuncu(String id, String ad, boolean karakterTur, Lokasyon lokasyon, String oyuncuId, String oyuncuAdi, boolean oyuncuTur, int skor) {
        super(id, ad, karakterTur, lokasyon);
        this.oyuncuId = oyuncuId;
        this.oyuncuAdi = oyuncuAdi;
        this.oyuncuTur = oyuncuTur;
        Skor = skor;
    }

    public Oyuncu() {
    }

    public String getOyuncuId() {
        return oyuncuId;
    }

    public void setOyuncuId(String oyuncuId) {
        this.oyuncuId = oyuncuId;
    }

    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

    public boolean isOyuncuTur() {
        return oyuncuTur;
    }

    public void setOyuncuTur(boolean oyuncuTur) {
        this.oyuncuTur = oyuncuTur;
    }

    public int getSkor() {
        return Skor;
    }

    public void setSkor(int skor) {
        Skor = skor;
    }
}
