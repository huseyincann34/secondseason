#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#include<locale.h>
//sona ekleme
struct node{
 char data[50];
 int adet;
 struct node  *next;
};
struct node* start=NULL;
struct node* temp=NULL;
struct node* q=NULL;
struct node* start2=NULL;
struct node* q2=NULL;

//q gezmemize yarýyan bir dugum
//sona ekleme iþlemi
//ana fonksiyon ılk baglı listemize elemanları atan ve elemanları sayan fonksiyonumuzdur.
void ana_fonk(char veri[]){
struct node* eklenecek=(struct node*)malloc(sizeof(struct node));
//eklenecek->data=veri;
strcpy(eklenecek->data,veri);
eklenecek->adet=1;
eklenecek->next=NULL;
int varmi=0;

if(start==NULL){

    start=eklenecek;

}
else{
      q=start;

    if(q->next==NULL){

         if(strcmp(q->data,eklenecek->data)==0){
            varmi++;
            q->adet=q->adet+1;

         }
         else{

            q->next=eklenecek;
            varmi++;


         }}


        else{


    while(q->next !=NULL){
            if(strcmp(q->data,eklenecek->data)==0){
                     q->adet=(q->adet)+1;
                     varmi++;

            }


          q=q->next;

    }
     if(q->next==NULL){

          if(strcmp(q->data,eklenecek->data)==0){
                     q->adet=q->adet+1;
                     varmi++;

            }

    }




        if(varmi==0){
            q->next=eklenecek;
            //degıstırıldı

        }


} } }

//Bu fonksiyonda internetten faydalandık.
void basa_ekle(char veri[],int adet){

 struct node *basaGelecek=(struct node*)malloc(sizeof(struct node));
 strcpy(basaGelecek->data,veri);
 basaGelecek->adet=adet;

 basaGelecek->next=start2;
 start2=basaGelecek;
 /*2 7 8
 3 2 7 8
 basa gelecek olan eski startý gosterecek ve 3 yený basagelen oldugu için yeni start o olacak mantiken
 */
}
//Bu fonksiyonda internetten faydalandık.
void araya_ekle(int adet,char veri[],int eklenecekadet){

   struct node* arayaeklenecek=(struct node*)malloc(sizeof(struct node));
    arayaeklenecek->adet=eklenecekadet;
   strcpy( arayaeklenecek->data,veri);

   q2=start2;
   while(q2->next->adet!=adet){
    q2=q2->next;
   }
  struct node* onune=(struct node*)malloc(sizeof(struct node));
  onune=q2->next;
  q2->next=arayaeklenecek;
  arayaeklenecek->next=onune;

}
//Bu fonksiyonda internetten faydalandık.
void sona_ekle(char veri[],int adet){




struct node* eklenecek = (struct node*)malloc(sizeof(struct node));
strcpy(eklenecek->data,veri);
eklenecek->adet=adet;
eklenecek->next=NULL;
if(start2==NULL){
    start2=eklenecek;
    }
else{
q2=start2;
    while(q2->next!=NULL){
            q2=q2->next;
    }
    q2->next=eklenecek;

}
}
void yazdir(){

q2=start2;
while(q2->next !=NULL){

    printf("%s adet:%d\n ",q2->data,q2->adet);
    q2=q2->next;
}


printf("%s adetir:%d",q2->data,q2->adet);

}


void sirali_ekle(char veri[],int adet){
      q2=start2;
    if(q2==NULL){
            //2.link list bossa atanacak ilk eleman 3 tane ekleme fonksiyonundan herhangibiri calıstırılabilir;
     basa_ekle(veri,adet);
    }
    //dizide 1 eleman varsa ya basa eklenir yada sona eklenir.
   else if(q2->next==NULL){

        if(q2->adet>=adet){

          sona_ekle(veri,adet);

        }
        else{
            basa_ekle(veri,adet);

        }

   }
  else  {
    while(q2->next!=NULL && q2->next->adet>=adet){
        q2=q2->next;
    }
    //SONA EKLEME DURUMU(SAYİ EN KUCUK OLURSA)
   if(q2->next==NULL){

        if(q2->adet>=adet){
    sona_ekle(veri,adet);
        }



   }
   //BASA EKLEME DURUMU (SAYİ EN BUYUK OLURSA)
  else if(q2==start2){

        if(adet>=start2->adet){
        basa_ekle(veri,adet);
        }
        else{
                //diziye gonderilen 3.elemanın araya eklenme durumu ıcın
                //dizide 2 eleman varsa ve araya elaman eklenecekse ozel bir durum olusuyor alttakı else ın ıcıne gırmıyor o yuzden fonksiyon ekleme ıslemı yapamıyor burayada aynı araya ekle fonksiyonunu bu yuzden cagırıyoruz

                 araya_ekle(q2->next->adet,veri,adet);

        }
  }

   else{
        //q2 nextının adedı yapıldı

        araya_ekle(q2->next->adet,veri,adet);

   }
   }


}
//1.link listi yazdıran fonksiyon
void yazdir2(){
q=start;
while(q->next !=NULL){

    printf("%s adet:%d\n ",q->data,q->adet);
    q=q->next;

}
printf("%s adet :%d \n",q->data,q->adet);

}



int main()

{
    char data[50];
    FILE *dosya;
   dosya= fopen("okunacak.txt","r");
   if(dosya==NULL){
    printf("Dosya yok");
   }
   else{
    while(fscanf(dosya,"%s",&data)!=EOF){


        ana_fonk(data);

    }
   }
   fclose(dosya);

 printf("Birinci link list:\n");
 printf("**********************\n");

      yazdir2();
      printf("\n");
      printf(" Ikinci link list: \n");
       printf("**********************\n");

  //fonksiyondan q son elemanı gosteriyor o yuzden bastan baslatıyoruz
         q=start;
         while(q->next!=NULL){


          sirali_ekle(q->data,q->adet);
        q=q->next;

      }
      //son elemanı eklsin diye birdaha calıstırdık.
       sirali_ekle(q->data,q->adet);

       yazdir();
    return 0;
}
