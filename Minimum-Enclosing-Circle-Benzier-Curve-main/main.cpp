#include <graphics.h>
#include <stdlib.h>
#include <stdio.h>
#include <graphics.h>
#include <math.h>
#include <conio.h>
struct nokta{
float x;
float y;
};

struct daire{
struct nokta p;
float r;
};

float uzaklik_bul(struct nokta a,struct nokta b){
//Burada pisagor ile iki nokta arasýndaki uzaklýgý bulucam(Bir üççgen olustruyormus gibi.
          return    sqrt(pow((a.x-b.x),2)+pow((a.y-b.y),2))  ;
}

struct nokta merkezbul(struct nokta a,struct nokta b){
struct nokta p;
 p.x= (a.x+b.x)/2.0;
   p.y=(a.y+b.y)/2.0;
   return p;
}

struct daire  cevrelcembermerkezi(struct nokta A,struct nokta B,struct nokta C){
struct nokta ananokta;

float d= 2*((A.x*(B.y-C.y))+(B.x*(C.y-A.y))+(C.x*(A.y-B.y)));

ananokta.x=(((pow(A.y,2)+pow(A.x,2))*(B.y-C.y))+((pow(B.y,2)+pow(B.x,2))*(C.y-A.y))+((pow(C.y,2)+pow(C.x,2))*(A.y-B.y)))/d;
ananokta.y=(((pow(A.y,2)+pow(A.x,2))*(C.x-B.x))+((pow(B.y,2)+pow(B.x,2))*(A.x-C.x))+((pow(C.y,2)+pow(C.x,2))*(B.x-A.x)))/d;

float r=uzaklik_bul(ananokta,A);
struct daire anadaire;
anadaire.p.x=ananokta.x;
anadaire.p.y=ananokta.y;
anadaire.r=r;

return anadaire;

}

struct daire daire_ver(struct nokta allnokta[],int size){
int birinciindex=0;
        int ikinciindex=0;
float uzaklik=0;
struct nokta enuzaknokta;
//En uzak iki noktayı bulan for dongusu.
for(int a=0;a<size;a++){
   for(int b=a+1;b<size;b++){
    if(uzaklik<uzaklik_bul(allnokta[a],allnokta[b])){
        uzaklik=uzaklik_bul(allnokta[a],allnokta[b]);

         birinciindex=a;
         ikinciindex=b;


   }}}
  // printf("birinci %d   ikinci  %d %f",birinciindex,ikinciindex);
    struct nokta merkez=merkezbul(allnokta[birinciindex],allnokta[ikinciindex]);
//merkez noktasından tum noktaların uzaklıkların ıbul uzaklık/2 den buyukse onu farklı fonk gonderecez
// tum indexleri gezmeyecek en uzak 2 nokta icinde olmadan gezmesi gerekir.
//yani birinciindex ve ikinci index olmayacak

for(int a=0;a<size;a++){
        if(!(a==birinciindex || a==ikinciindex)){
    if(uzaklik/2<uzaklik_bul(allnokta[a],merkez)){

    enuzaknokta=allnokta[a];
    struct daire daire=cevrelcembermerkezi(allnokta[birinciindex],allnokta[ikinciindex],enuzaknokta);;
             return daire;

    }

}
}

  struct daire d;
            d.p=merkez;
            d.r=uzaklik/2;

            return d;
}


int fact(int n) {
    if(n==0){
        return 1;
    }
    else
        return n*fact(n-1);
  }
  int comb(int n, int r) {
  return (fact(n) / (fact(n-r)*fact(r)));

  }
  void sirala(struct nokta allnokta[],int size){
      //selection sort
  int i,j;
  int minimumindex;
  for(i=0;i<size;i++){
    minimumindex=i;
    for(j=i;j<size;j++){
        if(allnokta[j].x<allnokta[minimumindex].x){
            minimumindex=j;
        }
    }
    struct nokta temp=allnokta[i];
    allnokta[i]=allnokta[minimumindex];
    allnokta[minimumindex]=temp;

  }
     }




int main()
{
 struct nokta allnokta[5];
 int size=5;
      FILE *filep=fopen("noktalar.txt","r");

      if(filep==NULL){
        printf("Dosya yok");
      }
      int i=0;
    while(!feof(filep)){

        fscanf(filep,"%f %f",&allnokta[i].x,&allnokta[i].y);

i++;

    };
fclose(filep);
    for(int i=0;i<size;i++){
    printf("%.0f %.0f \n ",allnokta[i].x,allnokta[i].y);}
    printf("\n");




    initwindow(600,600);

     struct daire daire=daire_ver(allnokta,size);
        printf("  Merkez noktalari :x%.3f    y%.3f    r%.3f ",daire.p.x, daire.p.y,daire.r);
        daire.p.x=daire.p.x*15+300;
       daire.p.y= 300-daire.p.y*15;
       daire.r=daire.r*15;
    circle(daire.p.x,daire.p.y,daire.r);
for(int a=0;a<size;a++){
       int x= allnokta[a].x*15+300;
      int y =300-allnokta[a].y*15;
    putpixel(x,y,14);

}
for(int x=0;x<40;x++){

    line(x*15,295,x*15,305);
}
for(int x=0;x<40;x++){

    line(295,x*15,305,x*15);
}


        line(0,300,600,300);
        line(300,0,300,600);


 //b-SPLİNE
  //girilen nokta sayıdı n ama n-1 gondermemiz lazım .
    int n=size-1;
    float t;
  sirala(allnokta,size);
    for(t=0.0;t<1.0;t+=0.0001){
float xx=0.0;
  float yy=0.0;
        for(int i=0;i<=n;i++){

            xx=xx+comb(n,i)*pow(t,i)*pow(1-t,n-i)*allnokta[i].x;
            yy=yy+comb(n,i)*pow(t,i)*pow(1-t,n-i)*allnokta[i].y;
        }

        putpixel(xx*15+300,300-yy*15,14);


    }

    getch();
    closegraph();
    return 0;
}
