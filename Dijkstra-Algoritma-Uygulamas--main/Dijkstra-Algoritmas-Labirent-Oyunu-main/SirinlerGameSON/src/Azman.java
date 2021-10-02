public class Azman extends Dusman {
    public Azman(Lokasyon lokasyon) {
        this.lokasyon=lokasyon;
    }


    public void HareketEt(dist dist) {

        int kod=dist.ayritlar.get(0).sütün;
        lokasyon.y=dusmanyollarkod[kod][1];
        lokasyon.x=dusmanyollarkod[kod][2];

    }












}
