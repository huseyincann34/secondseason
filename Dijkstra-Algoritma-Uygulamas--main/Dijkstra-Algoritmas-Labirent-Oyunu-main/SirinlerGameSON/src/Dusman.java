import javax.print.DocFlavor;
import java.util.ArrayList;

public class Dusman extends Karakter{
     public String dusmanId;
     public String dusmanAd;
     public int dusmantur;

    public Dusman(String id, String ad, boolean karakterTur, Lokasyon lokasyon, String dusmanId, String dusmanAd, int dusmantur, int[][] dusmanyollarkod) {
        super(id, ad, karakterTur, lokasyon);
        this.dusmanId = dusmanId;
        this.dusmanAd = dusmanAd;
        this.dusmantur = dusmantur;
        this.dusmanyollarkod = dusmanyollarkod;
    }

    public Dusman() {
    }

    public int[][] dusmanyollarkod=new int[][]{{0,0,3}, {1,0,10}, {2,1,1}, {3,1,2}, {4,1,3}, {5,1,4}, {6,1,6}, {7,1,7}, {8,1,8}, {9,1,9}, {10,1,10}, {11,1,11}, {12,2,1}, {13,2,3}, {14,2,4}, {15,2,5}, {16,2,6},
    {17,2,7},{18,2,8}, {19,2,11}, {20,3,1}, {21,3,2}, {22,3,3}, {23,3,4}, {24,3,6}, {25,3,8}, {26,3,9}, {27,3,11}, {28,4,1}, {29,4,3},{30,4,6}, {31,4,8}, {32,4,11}, {33,5,0}, {34,5,1}, {35,5,3},
    {36,5,4}, {37,5,5}, {38,5,6}, {39,5,8}, {40,5,10}, {41,5,11}, {42,6,1}, {43,6,4}, {44,6,5}, {45,6,6}, {46,6,8}, {47,6,9}, {48,6,10}, {49,6,11}, {50,7,1}, {51,7,3}, {52,7,4}, {53,7,5}, {54,7,6}, {55,7,7}, {56,7,8},
    {57,7,9}, {58,7,10}, {59,7,11}, {60,7,12}, {61,8,1}, {62,8,3}, {63,8,9}, {64,8,10}, {65,8,11}, {66,9,1}, {67,9,2}, {68,9,3}, {69,9,4}, {70,9,5}, {71,9,6}, {72,9,7}, {73,9,8}, {74,9,9}, {75,9,10}, {76,9,11},
    {77,10,3}};


    public String getDusmanId() {
        return dusmanId;
    }

    public void setDusmanId(String dusmanId) {
        this.dusmanId = dusmanId;
    }

    public String getDusmanAd() {
        return dusmanAd;
    }

    public void setDusmanAd(String dusmanAd) {
        this.dusmanAd = dusmanAd;
    }

    public int getDusmantur() {
        return dusmantur;
    }

    public void setDusmantur(int dusmantur) {
        this.dusmantur = dusmantur;
    }




}

