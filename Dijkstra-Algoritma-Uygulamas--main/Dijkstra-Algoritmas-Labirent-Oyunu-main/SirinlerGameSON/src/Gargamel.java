import javax.crypto.NullCipher;
import javax.lang.model.type.NullType;

public class Gargamel extends Dusman {
    public Gargamel(Lokasyon lokasyon) {
        this.lokasyon=lokasyon;
    }


    public void HareketEt(dist dist,int x,int y ){
        int kod1=dist.ayritlar.get(0).sütün;



      //tek bir adım kaldıysa gargamel bır adım atacak ve dost karekteri yakalayacak
        if ( dusmanyollarkod[kod1][1]==y && dusmanyollarkod[kod1][2]==x){
            lokasyon.y = y;
            lokasyon.x = x;


               }
            else {

            lokasyon.y = dusmanyollarkod[dist.ayritlar.get(1).sütün][1];
            lokasyon.x = dusmanyollarkod[dist.ayritlar.get(1).sütün][2];

                }
            }
              }






