public class GozlukluSirin extends Oyuncu {

    public GozlukluSirin(String id, String ad, boolean karakterTur, Lokasyon lokasyon, String oyuncuId, String oyuncuAdi, boolean oyuncuTur, int skor) {
        super(id, ad, karakterTur, lokasyon, oyuncuId, oyuncuAdi, oyuncuTur, skor);
    }

    @Override
    public void PuaniGoster() {
        System.out.println("gozluklu sırın puan");
        super.PuaniGoster();
    }


    //bu hareket et fonksiyonunu tum herkes kullanacak oyunzden karakter sınıfına koymamız gerek
     Operasyonlar operasyonlar=new Operasyonlar();
    @Override
    public void HareketEt(int yon, Lokasyon lokasyon,int[][] matris) {
        super.HareketEt(yon, lokasyon,matris);
            if (yon==38 ) {
                //yukarıya dogru gıderken aslında matrisde sutunda azalma olucak
                lokasyon.y=lokasyon.y-2;
                // ıkıncı ve esıtlıgını duvarı atlamasın dıye koyuyorum
                if(operasyonlar.DuvarVarMı(matris,lokasyon)==false && matris[lokasyon.y+1][lokasyon.x]==1){
                    System.out.println("yukari gitti");
                }
                else{
                    lokasyon.y = lokasyon.y + 2;
                    System.out.println("Duvar var bu yonde ilerleyemessiniz.");
                }
            } else if (yon==40) {
                lokasyon.y=lokasyon.y+2;
                if(operasyonlar.DuvarVarMı(matris,lokasyon)==false && matris[lokasyon.y-1][lokasyon.x]==1){
                    System.out.println("asagi gitti ");
                }
                else{
                    lokasyon.y = lokasyon.y - 2;
                    System.out.println("Duvar var bu yonde ilerleyemessiniz.");
                }
            } else if (yon==39) {
                lokasyon.x=lokasyon.x+2;
                if(operasyonlar.DuvarVarMı(matris,lokasyon)==false && matris[lokasyon.y][lokasyon.x-1]==1){
                    System.out.println("saga gitti ");
                }
                else{
                    lokasyon.x = lokasyon.x - 2;
                    System.out.println("Duvar var bu yonde ilerleyemessiniz.");
                }

            } else if(yon==37){
                lokasyon.x=lokasyon.x-2;
                if(operasyonlar.DuvarVarMı(matris,lokasyon)==false && matris[lokasyon.y][lokasyon.x+1]==1){
                    System.out.println("sola gitti ");
                }
                else{
                    lokasyon.x = lokasyon.x + 2;
                    System.out.println("Duvar var bu yonde ilerleyemessiniz.");
                }
            }

    }
}


