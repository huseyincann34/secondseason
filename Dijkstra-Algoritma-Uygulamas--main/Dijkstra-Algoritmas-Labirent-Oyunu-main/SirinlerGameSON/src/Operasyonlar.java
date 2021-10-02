import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Operasyonlar {

   /* public boolean OyunBittimi(){

        return true;
    }*/
    public boolean DuvarVarMı(int[][] matris,Lokasyon lokasyon){
        //0 lar duvar 1 ler gecıs olabılecek noktalar
        if(matris[lokasyon.y][lokasyon.x]==0){
            return true;
        }
         else{
             return false;
        }
    }
    public int OyunBittiMi(Lokasyon lokasyon,Oyuncu oyuncu){

         if(oyuncu.Skor<=0 || (lokasyon.y==7 && lokasyon.x==12)){
             return 1;
         }
     return -1;
    }
         //Dusman classımızın ıcındekı matrisi kullanmak istiyoruz
          Dusman dusman=new Dusman();
    //Bu bize lokasyon kodlarını yolbulucu algoritmanın anlaması ıcın kodlara donusturuyor
     public int LokasyonÇevirici(int y,int x){

        for(int a=0;a<78;a++){
                if(dusman.dusmanyollarkod[a][1]==y && dusman.dusmanyollarkod[a][2]==x){
                    return dusman.dusmanyollarkod[a][0];
                }
        }

        return -1;
     }
//tur 1 se tembel sırını baslatır
    public JPanel yolÇiz(int tur,dist dist,dist dist1, JPanel jPanel,JPanel[][] alanlar,int y,int x,int gx,int gy,int ax,int ay,altin[] altinlar,mantar mantar) throws IOException {


                    for(int a=1;a<dist.ayritlar.size();a++){
            int kod=dist.ayritlar.get(a).sütün;
            int c=dusman.dusmanyollarkod[kod][1];
            int b=dusman.dusmanyollarkod[kod][2];
            alanlar[c][b].setBackground(Color.blue);
        }

             for(int a=2;a<dist1.ayritlar.size();a++){
                 int kod2=dist1.ayritlar.get(a).sütün;
                 int t=dusman.dusmanyollarkod[kod2][1];
                 int d=dusman.dusmanyollarkod[kod2][2];
                 alanlar[t][d].setBackground(Color.green);
             }


         //bizim oldugumuz lokasyonu kırmızı ıle işaretler
        BufferedImage tembel = ImageIO.read(new File("src/image/tembel.jpeg"));
        BufferedImage azman = ImageIO.read(new File("src/image/azman.jpeg"));
        BufferedImage gargamel = ImageIO.read(new File("src/image/gargamel.jpeg"));
        BufferedImage gozluklu = ImageIO.read(new File("src/image/gozluklu.jpeg"));
        BufferedImage sirine = ImageIO.read(new File("src/image/sirine.jpeg"));
        BufferedImage altin= ImageIO.read(new File("src/image/altin.jpeg"));
        BufferedImage mantarr= ImageIO.read(new File("src/image/mantar.jpeg"));
        JLabel jLabel=new JLabel(new ImageIcon(tembel));
        JLabel jLabel1=new JLabel(new ImageIcon(azman));
        JLabel jLabel2=new JLabel(new ImageIcon(gargamel));
        JLabel jLabel3=new JLabel(new ImageIcon(gozluklu));
        JLabel jLabel4=new JLabel(new ImageIcon(sirine));
        JLabel jLabel5=new JLabel(new ImageIcon(altin));
        JLabel jLabel6=new JLabel(new ImageIcon(altin));
        JLabel jLabel7=new JLabel(new ImageIcon(altin));
        JLabel jLabel8=new JLabel(new ImageIcon(altin));
        JLabel jLabel9=new JLabel(new ImageIcon(altin));
        JLabel jLabel10=new JLabel(new ImageIcon(mantarr));
        JLabel puanlabel=new JLabel();
        jLabel.setSize(76,63);
        jLabel1.setSize(76,63);
        jLabel2.setSize(76,63);
        jLabel3.setSize(76,63);
        jLabel4.setSize(76,63);
        jLabel5.setSize(76,63);
        jLabel6.setSize(76,63);
        jLabel7.setSize(76,63);
        jLabel8.setSize(76,63);
        jLabel9.setSize(76,63);
        jLabel10.setSize(76,63);


      /*  Font f=new Font("sansserif", Font.BOLD, 33);
        puanlabel.setFont(f);

        puanlabel.setText(String.valueOf(puan));

        alanlar[0][12].setBackground(Color.white);
        alanlar[0][12].add(puanlabel);
*/

        //bizim oldugumuz lokasyonu kırmızı ıle işaretler
        alanlar[y][x].setBackground(Color.red);
        alanlar[gy][gx].setBackground(Color.red);
        alanlar[ay][ax].setBackground(Color.red);
        alanlar[7][12].setBackground(Color.red);
        alanlar[gy][gx].add(jLabel2);
        alanlar[ay][ax].add(jLabel1);
        alanlar[7][12].add(jLabel4);
        if(tur==1){
            alanlar[y][x].add(jLabel);
        }
        else {
            alanlar[y][x].add(jLabel3);
        }
        alanlar[altinlar[0].y][altinlar[0].x].setBackground(Color.red);
        alanlar[altinlar[1].y][altinlar[1].x].setBackground(Color.red);
        alanlar[altinlar[2].y][altinlar[2].x].setBackground(Color.red);
        alanlar[altinlar[3].y][altinlar[3].x].setBackground(Color.red);
        alanlar[altinlar[4].y][altinlar[4].x].setBackground(Color.red);
        alanlar[mantar.y][mantar.x].setBackground(Color.red);
        alanlar[altinlar[0].y][altinlar[0].x].add(jLabel5);
        alanlar[altinlar[1].y][altinlar[1].x].add(jLabel6);
        alanlar[altinlar[2].y][altinlar[2].x].add(jLabel7);
        alanlar[altinlar[3].y][altinlar[3].x].add(jLabel8);
        alanlar[altinlar[4].y][altinlar[4].x].add(jLabel9);
        alanlar[mantar.y][mantar.x].add(jLabel10);




        return jPanel;

     }
     //matrisimizde 1 olan  yani yol olan her yeri temizler
     public JPanel yolTemizle( JPanel jPanel,JPanel[][] alanlar,int[][] matris){
         for(int a=0;a<11;a++){
             for(int b=0;b<13;b++){
                 if(matris[a][b]==1){
                     alanlar[a][b].setBackground(Color.white);
                     alanlar[a][b].removeAll();

                 }
             }
         }

         return jPanel;
     }
    public JPanel haritaciz(int tur,dist dist,dist dist1, JPanel jPanel,JPanel[][] alanlar,int y,int x,int gx,int gy,int ax,int ay) throws IOException {


                     for(int a=0;a<dist.ayritlar.size();a++){
            int kod=dist.ayritlar.get(a).sütün;
            int c=dusman.dusmanyollarkod[kod][1];
            int b=dusman.dusmanyollarkod[kod][2];
            alanlar[c][b].setBackground(Color.blue);
        }

        for(int a=0;a<dist1.ayritlar.size();a++){
            int kod2=dist1.ayritlar.get(a).sütün;
            int t=dusman.dusmanyollarkod[kod2][1];
            int d=dusman.dusmanyollarkod[kod2][2];
            alanlar[t][d].setBackground(Color.green);
        }

        BufferedImage tembel = ImageIO.read(new File("src/image/tembel.jpeg"));
        BufferedImage azman = ImageIO.read(new File("src/image/azman.jpeg"));
        BufferedImage gargamel = ImageIO.read(new File("src/image/gargamel.jpeg"));
        BufferedImage gozluklu = ImageIO.read(new File("src/image/gozluklu.jpeg"));
        BufferedImage sirine = ImageIO.read(new File("src/image/sirine.jpeg"));

        JLabel jLabel4=new JLabel(new ImageIcon(sirine));
        JLabel jLabel=new JLabel(new ImageIcon(tembel));
        JLabel jLabel1=new JLabel(new ImageIcon(azman));
        JLabel jLabel2=new JLabel(new ImageIcon(gargamel));
        JLabel jLabel3=new JLabel(new ImageIcon(gozluklu));
        jLabel.setSize(76,63);
        jLabel1.setSize(76,63);
        jLabel2.setSize(76,63);
        jLabel3.setSize(76,63);
        jLabel4.setSize(76,63);



        //bizim oldugumuz lokasyonu kırmızı ıle işaretler
        alanlar[y][x].setBackground(Color.red);
        alanlar[gy][gx].setBackground(Color.red);
        alanlar[ay][ax].setBackground(Color.red);
        alanlar[7][12].setBackground(Color.red);
        alanlar[gy][gx].add(jLabel2);
        alanlar[ay][ax].add(jLabel1);
        alanlar[7][12].add(jLabel4);
        if(tur==1){
            alanlar[y][x].add(jLabel);
        }
        else {
            alanlar[y][x].add(jLabel3);
        }

        return jPanel;

    }













}
