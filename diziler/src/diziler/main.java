
package diziler;

import java.util.Random;
import java.util.Scanner;
/*

public class main {

    public static void main(String[] args) {
      Scanner scanner =new Scanner(System.in);
        System.out.print("lütfen satır sayısı giriniz");
        int satı =scanner.nextInt();
        System.out.print("lütfen sütün sayısı giriniz");
        int sut=scanner.nextInt();
        int [][] a=new int[satı][sut];
        int[][] b=new int[satı][sut];
        
        
        for(int i=0;i<satı;i++){
        for(int j=0;j<sut;j++){
            System.out.println("a nın  "+i+" inci satırı "+j+" inci sutunu");
            a[i][j] =scanner.nextInt();
             
            
        }
    }
        for(int i=0;i<satı;i++){
        for(int j=0;j<sut;j++){
            
             System.out.println("b  nın  "+i+" inci satırı "+j+" inci sutunu");
             b[i][j]=scanner.nextInt();
            
        }
    }
        
        int [][] toplam =new int[satı][sut];
        
        for(int i=0;i<satı;i++)
        {
            for(int j=0;j<sut;j++){
                
                toplam[i][j]= a[i][j] + b[i][j];
            }
        }
        System.out.println("iki matris toplamı:  ");
        for(int i=0;i<satı;i++)
        {
            for(int j=0;j<sut;j++){
                System.out.print(toplam[i][j]);
            }
            System.out.println("");
        }
        
        
              

    }
    
}
*/

/*
public class main{
   
    
    public static void main(String[] args) {
         Scanner scanner =new Scanner(System.in);
        System.out.println("lütfen satır sayısı giriniz");
        int satır1 =scanner.nextInt();
        System.out.println("lütfen sütün sayısı giriniz");
        int sut=scanner.nextInt();
        int [][] a=new int[satır1][sut];
        
        System.out.println(" b nin satır ssayısı girinz:");
        int satır2=scanner.nextInt();
        System.out.println("b nin sutunu giriniz:");
        int sutun2=scanner.nextInt();
        int[][] b=new int[satır2][sutun2];
        
        for(int i=0;i<satır1;i++){
          for(int j=0;j<sut;j++){
            System.out.println("a nın  "+i+" inci satırı "+j+" inci sutunu");
            a[i][j] =scanner.nextInt();
            
            
        }
    }
        for(int i=0;i<satır1;i++){
           for(int j=0;j<sut;j++){
           
             System.out.println("b  nın  "+i+" inci satırı "+j+" inci sutunu");
             b[i][j]=scanner.nextInt();
            
        }
    }
            System.out.println("Axb nin çarpımı");
                int [][] carpım=new int[satır1][sut];
                
                for(int i=0;i<satır1;i++){
                    for(int j=0;j<sutun2;j++){
                        for(int k=0;k<sutun2;k++){
                        carpım[i][j]+=a[i][k]*b[i][k];

                        }
                       
                    }
                }
               for(int i=0;i<satır1;i++){
                   for(int  j=0;j<sutun2;j++){
                       System.out.print(carpım[i][j]+" ");
                   }
                   System.out.println("");
               }

        
     
        
        
    }
}
*/
    // matrisin ust kısmı yazdırma
/*
public class main{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen a matris satırı giriniz:");
        int n=scanner.nextInt();
         
         int[][] a=new int[n][n];
         System.out.println(" a matrisi:");
         for(int i=0;i<n;i++){
             for(int k=0;k<n;k++){
                 System.out.println("a nın  "+i+" inci satırı "+k+" inci sutunu");
                 a[i][k]=scanner.nextInt();
             }
         }
         int sum=0;
         for(int i=0;i<n;i++){
             for(int k=0;k<n;k++){
                 if(k>i){
                     sum+=a[i][k];
                 }
             }
         }
         System.out.println("toplam :"+sum);
         
       
        
        
    }
        
    }
*/

/*
public class main{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen n giriniz:");
        int n=scanner.nextInt();
        int[][] a =new int[n][n];
        
        
        for(int i=0;i<n;i++){
            for(int k=0;k<n;k++){
                System.out.println("a nın  "+i+" inci satırı "+k+" inci sutunu");
                a[i][k]=scanner.nextInt();
                
            }
        }
        int maxrow=0,maxcol=0,minrow=0,mincol=0;
        int kucuk=a[0][0];
        int buyk=a[0][0];
        
        for(int i=0;i<n;i++){
            for(int k=0;k<n;k++){
                if(a[i][k]<kucuk){
                    kucuk=a[i][k];
                    minrow=i;
                    mincol=k;

                }
                if(a[i][k]>buyk){
                    maxrow=i;
                    maxcol=k;
                    buyk=a[i][k];
                }
                
            }
        }
        System.out.println("en kucuk sayı "+ kucuk+"konumu "+minrow+" x "+mincol);
        System.out.println("en buyul sayı "+buyk+"konumu "+maxrow +"x "+maxcol);
              
        
        
        
    }
    
}
*/

//13 14 16 17 18 21 22  27 28 






/*
public class main{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen ders giriniz:");
        int ders=scanner.nextInt();
        System.out.println("lütfem ogr giriniz:");
        int ogr=scanner.nextInt();
        
        
        int[][] notlar=new int[ders][ogr];
        int[] id=new int[ogr];
        double[] ort=new double[ders];
        int[][] rapor=new int[ders][4];
        
                
        
        
        
        //random öğrenci id oluşturma
        Random r=new Random();
        
        for(int i=0;i<ogr;i++){
            id[i]=(int)(10000+(20000-10000)*r.nextDouble());
        }
        
        //0-100 arasında rasgeke not dizisi atmaka gerek
        for(int i=0;i<ders;i++){
            for(int k=0;k<ogr;k++){
                notlar[i][k]=r.nextInt(100);
            }
           
            
        }
        //dersler oralama
        for(int i =0;i<ders;i++){
            int toplam =0;
            for(int j=0;j<ogr;j++){
                toplam+=notlar[i][j];
            }
            ort[i]=(double)toplam/ogr;
        }
       for ( int i =0;i<ders;i++){
          int max=notlar[i][0],min=notlar[i][0];
            int maxid=0;int minid=0;
            for(int j=0;j<ogr;j++){
            if(notlar[i][j]>max){
                max=notlar[i][j];
                maxid =id[j];
            }
            if(notlar[i][j]<min){
                min=notlar[i][j];
                minid=id[j];
            }
            
           }
            rapor[i][0]=max;rapor[i][1]=maxid;rapor[i][2]=min;rapor[i][3]=minid;
        
        
        
        
        
        
    }
        for(int i=0;i<4;i++){
            System.out.println(rapor[i][i]);
        }
    
    }
}
*/
