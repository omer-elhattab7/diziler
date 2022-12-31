
import java.util.Scanner;

/*
public class Diziler{
    public static void main(String[] args) {
        
        int toplam2=0;
        
        Scanner scanner=new Scanner(System.in);
        System.out.print("dizi uzunlu");
        int n=scanner.nextInt();
        int[] sayi=new int[n];
        
        //System.out.println(sayi[sayi.length-1]);//son elman 
        System.out.println("dizinin uzunlu:"+sayi.length);
        
        //satı dizisinde dıştan değer almak 
        for(int i=0;i<=sayi.length-1;i++){
            System.out.println((i+1)+"inci sayı");
            sayi[i]=scanner.nextInt();
            
        }
        //sayi dizisi yazdırma
        for(int i=0;i<=sayi.length-1;i++){
            System.out.println(i+"inds"+sayi[i]);
            
        }
        // sayı dizi elman toplamı
        for(int i=0;i<=sayi.length-1;i++){
            toplam2+=sayi[i];
        }
        // sayı dizisi ord
        double ort=(double)toplam2/sayi.length;
       
        System.out.println("toplam:"+toplam2  );
        System.out.println("ort:"+ort);
        
                
    }
}

*/
/*
public class Diziler{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
       
        Random random=new Random();
        int zunluk;
        do{
            System.out.println("lütfen dizi uzunlu giriniz:");
            zunluk=scanner.nextInt();
        }while(0>zunluk);
       
        int[] ransayı=new  int[zunluk];
        
        for(int i=0;i<ransayı.length-1;i++){
            ransayı[i]=random.nextInt(100);
            
            
        }
        //dizi yazdırmak icin 
         for(int i=0;i<ransayı.length;i++){
             System.out.println((i+1)+"inci sayı:"+ransayı[i]);
         }   
         int min=ransayı[0];//0indexteki sayı min oldunu var saualım:
         
         
         //random sayı min olanı bulma:
         int index=0;
         for(int i=1;i<ransayı.length;i++){
             if(ransayı[i]<min){
                 min=ransayı[i];
                 index=i;
                 
             }
         }
        
         int max=ransayı[0];
         int  maxin=0;
         for(int i=1;i<ransayı.length;i++){
             if(max<ransayı[i]){
                 max=ransayı[i];
                 maxin=i;
                 
                 
             }
         }
         System.out.println("max sayı:"+max+" konumu:"+maxin);
         System.out.println("min sayı:"+min+" konumu:"+index);
         
         
         
         
         // sayoı dizisi tersten yazdırma:
        
             
         
        
    }
}
*/





// girilen bir diziyi tersten yazdırma:
/*

public class Diziler{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
       
        Random random=new Random();
        int n;
        do{
            System.out.println("lütfen dizi uzunlu giriniz:");
            n=scanner.nextInt();
        }while(0>n); 
        int[] a=new int[n];
        for(int i=0;i<a.length;i++){
            System.out.print((i+1)+"inc sayı:");
            a[i]=scanner.nextInt();
        }
        for(int i=0;i<a.length/2;i++){
            int tam=a[i];
            a[i]=a[n-i-1];
            a[n-1-i]=tam;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
        
    }
}
*/
/*
public class Diziler{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
       
       
        int n;
        do{
            System.out.print("lütfen dizi uzunlu giriniz pozitif :");
            n=scanner.nextInt();
        }while(0>n);
        
        int[] a=new int[n];
        for(int i=0;i<a.length;i++){
            System.out.println((i+1)+"incı sayı:");
            a[i]=scanner.nextInt();
            
        }
        int t=0;
        for(int i=0;i<a.length;i++){
            t=t+a[i];
        }
        
        int gecenler=0;
        double ort=(double)t/a.length;
        for(int i=0;i<a.length;i++){
            if(a[i]<ort){
                System.out.println((i+1)+"kaldı");
                
            }
            else{
                System.out.println((i+1)+"geçti");
                gecenler++;
            }
            
        }
        System.out.println(ort);
        System.out.println(gecenler+" oğrenci geçti");
        int kalanlar=a.length-gecenler;
        System.out.println(gecenler+" oğrenci kaldı");
        
        
    }
}
*/



/*
public class Diziler{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
       
       
        int zunluk;
        do{
            System.out.println("lütfen dizi uzunlu giriniz:");
            zunluk=scanner.nextInt();
        }while(0>zunluk);
        
        
         int[] dizi=new int[zunluk];
         dizi[0]=1;
         dizi[1]=1;
         for(int i=2;i<dizi.length;i++){
             dizi[i]=dizi[i-1]+dizi[i-2];
             
    }
         for (int i=0;i<dizi.length;i++){
             System.out.print(dizi[i]+" ");
         }
       
         

    }
}
 */

   


// a ve b izi kulancdan alıcak ve onları scaller carpımı yazdıran program::
/*
public class Diziler{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       
        int uza;
        do{
            System.out.print("lütfen dizi uzunlu pozitif giriniz:");
            uza=scanner.nextInt();
            
        }while(0>uza);
        int[]a=new int[uza];
        
        int uzb;
         do{
            System.out.print("lütfen b dizi uzunlu pozitif giriniz:");
            uzb=scanner.nextInt();
            
        }while(0>uzb);
        int[] b=new int [uzb];
        
        
        for(int i=0;i<a.length;i++){
            System.out.print("anın "+(i+1)+"inci terimi giriniz:");
            a[i]=scanner.nextInt();
            
            
        }
        for(int i=0;i<b.length;i++){
             System.out.print("bnın "+(i+1)+"inci terimi giriniz:");
            b[i]=scanner.nextInt();
        }
        
        
        int ort=(a.length+b.length)/2;
        
        
        int[] carp=new int[ort];
        
        
        
        for(int i=0;i<carp.length;i++){
            
            carp[i]=a[i]*b[i];
            System.out.println(a[i]+" * "+b[i]+" = "+carp[i]);
            
        }
   
    }
    
    
    
}


*/


//klavyeden girilen n uzunluklu bir dizinin artmatk geometik harmonik  ortalarması bılduran prgram:


/*
public class Diziler{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int uz ;
        do{
            System.out.print("lüyfen dizi uzunlu giriniz:");  
            uz=scanner.nextInt();

        }while(0>uz);
        
        int[] dizz=new int[uz];
        
        //kulancıdan değerleri istemek
        for(int i=0;i<dizz.length;i++){
            System.out.print("lütfen "+(i+1)+"nci değeri giriniz: ");
            dizz[i]=scanner.nextInt();
        }
        
        
        int dizi_toplam =0;  int dizi_carpımı=1;
        
        double ha_toplamı=0;  int dizi_karetop=0;
        
        for(int i=0;i<dizz.length;i++){
            
           dizi_toplam+=dizz[i];
           
           dizi_carpımı*=dizz[i];
           
           ha_toplamı+=1/dizz[i];
           
           dizi_karetop+=Math.pow(dizz[i],2);
           
        }
        
        double aritmatik=dizi_toplam/dizz.length;
        
        double gemotik=Math.pow(dizi_carpımı, dizz.length);
        
        double haromik=dizz.length/ha_toplamı;
        
        double kontraha=dizi_karetop/dizi_toplam;
        
        System.out.println("----------------- ARTMATİK --------------------");
                       System.out.println("TOPLAMI: "+aritmatik);
        System.out.println("------------------ ******** -------------------");
        
        System.out.println("----------------- GEOMETRİK -------------------");
                          System.out.println("TOPLAMI: "+gemotik);
        
        System.out.println("-------------------- ******** ------------------");
        
        System.out.println("------------------ HARNOMİK --------------------");
                           System.out.println("TOPLAMI: "+haromik);
        
        System.out.println("--------------------*******--------------------");
        
        System.out.println("------------------KONTRAHOMİNK-----------------");
                           System.out.println("TOPLAMI: "+kontraha);
        
        System.out.println("--------------------*******------------------");
        
 
    }
}

*/
//POLİNOM KATSAYILARI HİSABLAMA:
/*
public class Diziler{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int uzunluk;
        do{
            System.out.print("lütfen polimonun dercesi giriniz pozitif giriniz:");
            uzunluk=scanner.nextInt();
        }while(0>uzunluk);
        
        int[] polinom=new int[uzunluk];
        
        
        for(int i=0;i<polinom.length;i++){
            System.out.print("lütfen x^"+(i+1)+"katsayısı giriniz:");
            polinom[i]=scanner.nextInt();
        }
        System.out.print("hisablancak x değeri:");
        double b=scanner.nextDouble();
        double t=polinom[0];
        for(int i=0;i<polinom.length;i++){
            t+=polinom[i]*Math.pow(b, i);
        }
        System.out.println(t);
        
        
    }
   
}
*/



//girilen dizi terimleri pozit ve negatif ayıran program:


// neden iki deva tanımliyor:  ++ yazıldı zaman?
/*
public class Diziler{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int uzu;
        do{
            System.out.print("lütfen dizi uzunlu giriniz: ");
            uzu=scanner.nextInt();
        }while(0>uzu);
        
        
        int[] dizi=new int[uzu];

        
        for(int i=0;i<dizi.length;i++){
            System.out.print((i+1)+" inci terimi giriniz: ");
                  
            dizi[i]=scanner.nextInt();
            
        }
        
        int[] poztf=new int[uzu/2];
          int[] negatif=new int[uzu/2];
        
        for(int i=0;i<dizi.length;i++){
           
            if(dizi[i]>0){
                for(int k=0;k<poztf.length-1;k++){
                    poztf[k]=dizi[i];
                    System.out.println(poztf[k]+ " pozitif sayıdır .");
                }
            }
            if(dizi[i]<0){
                
                for( int j=0;j<negatif.length;j+=1){
                    negatif[j]=dizi[i];
                     System.out.println(negatif[j]+" negatif sayıdır.");
                   
                
                 }
                
            } 
 
            
        }
      
    }
    
    
}
*/


// kalan para ustu:
/*
public class Diziler{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("lütfen kesilecek değer giriniz");
        double kesilecel_miktar=scanner.nextDouble();
        
        System.out.print("lütfen para miktarı giriniz:");
       double verilen_miktar=scanner.nextDouble();
        
       double para_ustu=verilen_miktar-kesilecel_miktar;
        System.out.println(para_ustu);
        int sayac=0;
        
        double[] para_degerler= new double[]{200,100,50,20,10,5,1,1/2,1/4,1/10,1/20};
        
        double[] bolen=new double[11];
        
        for(int i=0;i<11;i++){
            if(para_ustu>=para_degerler[i]){
                bolen[i]=para_ustu/para_degerler[i];
               para_ustu%=para_degerler[i];
                
            }
    
        }
        for (int i = 0; i < 11; i++) {
            if (bolen[i] != 0) {
                sayac++;
                System.out.println(bolen[i]);
                
            }
            
        }
        System.out.println(sayac);
        
        
 
    }
   
}
*/
/*
public class Diziler{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Anapara giriniz :");
        double anapara = scanner.nextDouble();
        
        System.out.println("Kesilecek miktarı giriniz : ");
        double borc = scanner.nextDouble();
        
        double pustu = anapara-borc;
        double sayac = 0;
        for(int i=0;i<anapara-borc;i++){
            
            if(pustu>=100){
                pustu = pustu-100;
                sayac++;
            }
            else if(pustu>=50 && pustu<100){
                pustu = pustu -50;
                sayac++;
            }
            else if(pustu>=20 && pustu<50){
                pustu -= 20;
                sayac++;
            }
            else if(pustu>=10 && pustu<20){
                pustu -=10;
                sayac++;
            }
            else if(pustu>=5 && pustu<10){
                pustu -=5;
                sayac++;
            }
            
            
            
            
            
            
            
            
            
            
            if(pustu == 0){
                break;
           }

        }
                    
        
        System.out.println("Kaç Parça : "+sayac);

        
        
    }
}

*/

//klavyeden girlen a ve b icin  tanımlı oldu işlemleri adar girilmesidir
/*
public class Diziler{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int z;
        do {
            System.out.println("lütfen n değeri giriniz: ");
            z=scanner.nextInt();
            
        } while (z<0);
        int[] a=new int[z];
        int[] b=new int[z];
        
        for(int i=1;i<a.length;i++){
          
            a[i]=i;
            b[i]=i;
            
        }
        int t1=0; int t2=0;  int t3=0; int t4=0;  int t5=0;
        int c1=1; int c2=1;
        
        for(int i=1;i<a.length;i++){
            t1+=Math.pow(a[i], 2);
            t2+=a[i]*b[i];
            t3+=b[i];
            t4+=a[i];
            c1*=Math.pow(b[i], 1/2);
            c2*=a[i];
            t5+=Math.log(b[i]);
            
            
            
        }
        double f=(t1+2*t2+Math.pow(t3, 2)+3*c1)/(Math.pow(t4, 1/2)+(z*t5)-c2);
        
        System.out.println("---------------------------------------------");
        System.out.println("sonucunuz:  "+f);
                
     
        
        
    }
    

    
}
*/


// kulancıdan alınann uzulşu kadar yine kulancısdan alınan  değerlei hic tekrarlanmayan uğeler:
/*
public class Diziler{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int uzu;
        do {     
            System.out.println("lütfen dizi uzunluğu pozitif girniz: ");                    
                uzu=scanner.nextInt();
                
            
        } while (uzu<0);
        int[] a=new int[uzu];
        for(int i=0;i<a.length;i++){
            System.out.println(i+1+",nci terimi giriniz: ");
            a[i]=scanner.nextInt();
            
        }
        //ai deki değerler başka bir yerde tanımlanmışmı diye bakmak için tüm 
        //değrleri kkontrol yapmak icin ic ice for yapmamız gerek
        
        for(int i=1;i<a.length;i++){
            
            for(int k=1;k<i;k++){
                 
                if(a[i]%a[k]==1){
                    System.out.println( a[i]+ "tekrarlanmamış değerdir:");
                    
                }
                
              
                
            }
        }
        
        
        
    }
}
*/

//Bir Diziyi azalan Düzende Sıralamak için Java Programı


/*
public class Diziler{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int uzu;
        do {     
            System.out.println("lütfen dizi uzunluğu pozitif girniz: ");                    
                uzu=scanner.nextInt();
                
            
        } while (uzu<0);
        int[] a=new int[uzu];
        for(int i=0;i<a.length;i++){
            System.out.println(i+1+",nci terimi giriniz: ");
            a[i]=scanner.nextInt();    
        }
        int gec;
        for(int i=0;i<a.length;i++){
            for(int k=0;k<a.length;k++){
                if(a[i]>a[k]){
                    gec=a[i];
                    a[i]=a[k];
                    a[k]=gec;
                   
                }
                
               
            }
           
                
            }
        System.out.println("--------dizinin sıralanmış hali:-------");
         for(int i=0;i<a.length;i++){
             System.out.print(a[i]+" ");
                     
            
            
        }
        
 
    }
}
*/


//Bir Diziyi Belirtilen Konumdan Bölmek için Java Programı

/*
public class Diziler{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int uzu;
        do {     
            System.out.println("lütfen dizi uzunluğu pozitif girniz: ");                    
                uzu=scanner.nextInt();
                
            
        } while (uzu<0);
        int[] a=new int[uzu];
        for(int i=0;i<a.length;i++){
            System.out.println(i+1+",nci terimi giriniz: ");
            a[i]=scanner.nextInt();    
            
        }
        System.out.println("lütfen bolmek istdiniz sırayı seçiniz: ");
        int s=scanner.nextInt();
        
       
        int[] b=new  int[s];
        for(int i=0;i<b.length;i++){
            b[i]=a[i];
            
        }
         System.out.print(" izinin ilk yarı:");
         for(int i=0;i<b.length;i++){
            
             System.out.print(b[i]+" ");
        }
         System.out.println("");
         System.out.println("dizininin kalan yarısı");
                 
          for(int i=s;i<a.length;i++){
   
             System.out.print(a[i]+" ");
             
        }
        
       
        
    }
} 

*/

//Bir Diziyi artan Düzende Sıralamak için Java Programı
/*

public class Diziler{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int uzu;
        do {     
            System.out.println("lütfen dizi uzunluğu pozitif girniz: ");                    
                uzu=scanner.nextInt();
                
            
        } while (uzu<0);
        int[] a=new int[uzu];
        for(int i=0;i<a.length;i++){
            System.out.println(i+1+",nci terimi giriniz: ");
            a[i]=scanner.nextInt();    
        }
        int gec;
        for(int i=0;i<a.length;i++){
            for(int k=0;k<a.length;k++){
                if(a[i]<a[k]){
                    gec=a[i];
                    a[i]=a[k];
                    a[k]=gec;
                   
                }
                
               
            }
           
                
            }
        System.out.println("--------dizinin sıralanmış hali:-------");
         for(int i=0;i<a.length;i++){
             System.out.print(a[i]+" ");
                     
            
            
        }
         System.out.println("");
        
 
    }
}
*/


// girilen n tane elmandan en buyuk ve en en kucuk fark bulduran program:
/*
public class Diziler{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int uzu;
        do {     
            System.out.println("lütfen dizi uzunluğu pozitif girniz: ");                    
                uzu=scanner.nextInt();
                
            
        } while (uzu<0);
        int[] a=new int[uzu];
        for(int i=0;i<a.length;i++){
            System.out.println(i+1+",nci terimi giriniz: ");
            a[i]=scanner.nextInt();    
        }
        int max_fark;
        int max_sa=a[0];
        int min_sa=a[0];
        
        for(int i=0;i<a.length;i++){
            if(a[i]>max_sa){
                max_sa=a[i];
            }
            if(a[i]<min_sa){
                min_sa=a[i];
                
                
            }
       
        }
        max_fark=max_sa-min_sa;
        System.out.println("dizlerinizde en buytuk fark ");
        System.out.print(max_fark+" dir ");
        
        
    }
}

 */   

// bir dizide en kucuk farkı bulduran program 
/*
public class Diziler{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int uzu;
        do {     
            System.out.println("lütfen dizi uzunluğu pozitif girniz: ");                    
                uzu=scanner.nextInt();
                
            
        } while (uzu<0);
        int[] a=new int[uzu];
        for(int i=0;i<a.length;i++){
            System.out.println(i+1+",nci terimi giriniz: ");
            a[i]=scanner.nextInt();    
        }
        int min1=a[0];
        int min2=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min1){
                min1=a[i];
            }
            
        }
        
        for(int i=0;i<a.length;i++){
            if(a[i]<min2&&a[i]!=min1){
                min2=a[i];
                
            }
        }
        int fark=min2-min1;
        System.out.println("");
                
    
        
        
       
    }
}
*/






