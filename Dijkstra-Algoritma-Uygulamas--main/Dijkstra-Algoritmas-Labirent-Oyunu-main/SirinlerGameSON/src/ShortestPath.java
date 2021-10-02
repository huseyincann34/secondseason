import jdk.swing.interop.SwingInterOpUtils;

import java.security.PublicKey;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;

public class ShortestPath {
    public int minDistance(ArrayList<dist> distler , Boolean b[]){
        int min=Integer.MAX_VALUE,index=-1;
        for(int x=0;x<78;x++){
            if (b[x]==false && distler.get(x).yol<=min) {
                min=distler.get(x).yol;
                index=x;
            }
        }
        return index;
    }
    public  void printGraph(ArrayList<dist> distler,int x){

        System.out.println("Distance from source to Destination is");
        for(int i=0;i<78;i++){
            System.out.println(i+"---------------"+distler.get(i).yol);
        }
    }

    public dist dijkstra(int graph[][],int src,int istenen){

        ArrayList<dist> distler=new ArrayList<dist>(78);
        //mapx=sutün , mapy=satir
         dist dist1=new dist();dist dist2=new dist();dist dist3=new dist();dist dist4=new dist();dist dist5=new dist(); dist dist6=new dist();  dist dist7=new dist(); dist dist8=new dist();  dist dist9=new dist();
        dist dist10=new dist(); dist dist11=new dist(); dist dist12=new dist();  dist dist13=new dist(); dist dist14=new dist(); dist dist15=new dist();  dist dist16=new dist();  dist dist17=new dist();
        dist dist18=new dist();  dist dist19=new dist();  dist dist20=new dist();dist dist21=new dist();  dist dist22=new dist();dist dist23=new dist();  dist dist24=new dist();  dist dist25=new dist();
        dist dist26=new dist();dist dist27=new dist(); dist dist28=new dist(); dist dist29=new dist(); dist dist30=new dist(); dist dist31=new dist();   dist dist32=new dist();  dist dist33=new dist();
        dist dist34=new dist();  dist dist35=new dist(); dist dist36=new dist(); dist dist37=new dist();  dist dist38=new dist();   dist dist39=new dist();  dist dist40=new dist();  dist dist41=new dist();   dist dist42=new dist();
        dist dist43=new dist();   dist dist44=new dist(); dist dist45=new dist();     dist dist46=new dist();    dist dist47=new dist();    dist dist48=new dist();  dist dist49=new dist();  dist dist50=new dist();
        dist dist51=new dist(); dist dist52=new dist();   dist dist53=new dist(); dist dist54=new dist();  dist dist55=new dist();  dist dist56=new dist();   dist dist57=new dist(); dist dist58=new dist();
        dist dist59=new dist();dist dist60=new dist(); dist dist61=new dist();   dist dist62=new dist();    dist dist63=new dist();  dist dist64=new dist();  dist dist65=new dist(); dist dist66=new dist();
        dist dist67=new dist(); dist dist68=new dist();   dist dist69=new dist();  dist dist70=new dist();   dist dist71=new dist();   dist dist72=new dist(); dist dist73=new dist();   dist dist74=new dist();
        dist dist75=new dist();dist dist76=new dist();  dist dist77=new dist(); dist dist78=new dist();


         distler.add(dist1);distler.add(dist2);distler.add(dist3);distler.add(dist4); distler.add(dist5);distler.add(dist6); distler.add(dist7);distler.add(dist8);distler.add(dist9);distler.add(dist10); distler.add(dist11);distler.add(dist12); distler.add(dist13);distler.add(dist14);distler.add(dist15);distler.add(dist16); distler.add(dist17);distler.add(dist18); distler.add(dist19);distler.add(dist20);distler.add(dist21);distler.add(dist22); distler.add(dist23);distler.add(dist24); distler.add(dist25);distler.add(dist26);distler.add(dist27);distler.add(dist28); distler.add(dist29);distler.add(dist30); distler.add(dist31);distler.add(dist32);distler.add(dist33);distler.add(dist34); distler.add(dist35);distler.add(dist36);
         distler.add(dist37);distler.add(dist38);distler.add(dist39);distler.add(dist40); distler.add(dist41);distler.add(dist42); distler.add(dist43);distler.add(dist44);distler.add(dist45);distler.add(dist46); distler.add(dist47);distler.add(dist48); distler.add(dist49);distler.add(dist50);distler.add(dist51);distler.add(dist52); distler.add(dist53);distler.add(dist54); distler.add(dist55);distler.add(dist56);distler.add(dist57);distler.add(dist58); distler.add(dist59);distler.add(dist60); distler.add(dist61);distler.add(dist62);distler.add(dist63);distler.add(dist64); distler.add(dist65);distler.add(dist66); distler.add(dist67);distler.add(dist68);distler.add(dist69);distler.add(dist70); distler.add(dist71);distler.add(dist72);
        distler.add(dist73);distler.add(dist74);distler.add(dist75);distler.add(dist76); distler.add(dist77);distler.add(dist78);

        //Bizim dist 74 tane
        int dist[]=new int[78];
        Boolean b[]=new Boolean[78];

        for(int i=0;i<78;i++){
            distler.get(i).yol=Integer.MAX_VALUE;
            b[i]=false;
        }

        distler.get(src).yol=0;
        for(int count=0;count<78;count++){

            int u=minDistance(distler,b);
            b[u]=true;
            for(int x=0;x<78;x++){
                if(!b[x]&&graph[u][x]!=0 && distler.get(u).yol!=Integer.MAX_VALUE  &&  distler.get(u).yol+graph[u][x]<distler.get(x).yol ){




                            distler.get(x).ayritlar.clear();
                    distler.get(x).ayritlar.addAll(0,distler.get(u).ayritlar);
                    distler.get(x).yol=distler.get(u).yol+graph[u][x];
                    ayrit ayrit=new ayrit();
                     ayrit.satir=u;
                     ayrit.sütün=x;
                     distler.get(x).ayritlar.add(ayrit);




                }
            }

        }
        return distler.get(istenen);
    }
    public dist yolbulucu(int dusman,int dost) {
         Matris matris=new Matris();
        int graph[][]= new int[78][78];
        graph=matris.matris;
        dist istenendist=new dist();
        //src B olsun
        istenendist=dijkstra(graph,dusman,dost);
         return istenendist;


    }
}
