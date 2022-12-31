
package diziler;
import java.util.Scanner;

//kuklancıldan gşiirilen a v b iki boyutlu diziler icin topamı yazdıran program

/*
public class dizod {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen satır sayısını giriniz:");
        int satır =scanner.nextInt();
        System.out.println("lütfen sutun sayısını giriniz:");
        int sut =scanner.nextInt();
        
        int [][] a= new int[satır][sut];
        int [][] b= new int [satır][sut];
        
        // a dizisine değer girmşiek icin 
        System.out.println(" lütfen a dizisisini  değerleri giriniz:  ");
        for(int i=0;i<satır;i++){
            for(int k=0;k<sut;k++){
                System.out.println("lütfen "+i+"  inci satrı "+k+" sutunu giriniz: ");
                a[i][k]=scanner.nextInt();
            }
        }
          System.out.println(" lütfen b dizisisini  değerleri giriniz:  ");
        for(int i=0;i<satır;i++){
            for(int k=0;k<sut;k++){
                System.out.println("lütfen "+i+"  inci satrı "+k+" sutunu giriniz: ");
                b[i][k]=scanner.nextInt();
            }
        }
        int [][] cıkarım  =new int[satır][sut];
        int [][] toplam  =new int[satır][sut];
        //lburdada ikisinin toplamı:
        System.out.println("lütfen hangi işilem yaptırmak istedimnizi seciniz:"
                + "\n iki dizi toplamı icin lütfen 1 girin,iz:"
                + "\n iki matris cıkarımı icin 2 giriniz");
               
        int iselm=scanner.nextInt();
        
        if(iselm==1){
            for(int i=0;i<satır;i++){
            for(int k=0;k<sut;k++){
                
                toplam[i][k]=a[i][k]+b[i][k];
            }
        }
             System.out.println("iki dizinin toplamı ");
        for(int i=0;i<satır;i++){
            for(int k=0;k<sut;k++){
                
                System.out.print(toplam[i][k]+"  ");
            }
            System.out.println("");
        }
            
           
    }
        else if(iselm==2){
            
              for(int i=0;i<satır;i++){
            for(int k=0;k<sut;k++){
                
                cıkarım[i][k]=a[i][k]-b[i][k];
            }
        }
              System.out.println("");
        System.out.println("iki dizinin cıkarımı:");
        for(int i=0;i<satır;i++){
            for(int k=0;k<sut;k++){
                
                System.out.print(cıkarım[i][k]+"  ");
            }
            System.out.println("");
        }
       }
       
        System.out.println("");
   

    }
    
}
*/
//klavyeden girilen nxn bir dizilik ortasını kestikten sonra al kısmdaki kalanlar 
//yazdıran program 
/*
public class dizod{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("lütfen nxn linin satır sayısı giriniz: ");
        int satır=scanner.nextInt();
        int[][] n=new int[satır][satır]; 
        int toalt=0,toust=0;
        for(int i=0;i<satır;i++){
            for(int j=0;j<satır;j++){
                System.out.println("lütfen "+i+"  inci satrı "+j+" sutunu giriniz: ");
                n[i][j]=scanner.nextInt();
            }
            
        }
        for(int i=0;i<satır;i++){
            for(int j=0;j<satır;j++){
                System.out.print(n[i][j]+" ");
               
            }
            System.out.println("");
            
        }
        
         for(int i=0;i<satır;i++){
            for(int j=0;j<satır;j++){
                if(i>j){
                    toalt+=n[i][j];
                }
                else if(i<j){
                    toust+=n[i][j];
                }

            }
            
        }
         System.out.println(" alt taraf toplamınız: "+toalt);
         System.out.println("uüst taraf: "+toust);
        
        
    }
    
}
*/

//klavyeden girilen nxn matrisin sol ust tarafın sayılar toplamı:
/*
public class dizod{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("lütfen nxn linin satır sayısı giriniz: ");
        int satır=scanner.nextInt();
        int[][] n=new int[satır][satır]; 
        int toust=0;
        for(int i=0;i<satır;i++){
            for(int j=0;j<satır;j++){
                System.out.println("lütfen "+i+"  inci satrı "+j+" sutunu giriniz: ");
                n[i][j]=scanner.nextInt();
            }
       
        }
          for(int i=0;i<satır;i++){
            for(int j=0;j<satır;j++){
                if((i+j)<5){
                    toust+=n[i][j];
                }
            }
    }
          System.out.println("üst taraf toplamı:"+toust);
}
}
*/
//klavyeden girişlen nxn bire dizideki sutunlerden ve satırlardan bir oncekileri yazdıran program


/*
public class dizod{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen n değer, giriniz");
        int satır=scanner.nextInt();
        int [][] n=new int[satır][satır];
        int toplam =0;
        for(int i=0;i<satır;i++){
            for(int j=0;j<satır;j++){
                System.out.println("lütfen "+i+"  inci satrı "+j+" sutunu giriniz: ");
                n[i][j]=scanner.nextInt();
            }
       
        }
        System.out.println("diziniz: ");
        for(int i=0;i<satır;i++){
            for(int j=0;j<satır;j++){
                System.out.print(n[i][j]+" ");
            }
            System.out.println("");
       
        }
        for(int i=0;i<satır-1;i++){

            
            toplam+=n[i][satır-2]+n[satır-2][i];
            
            
        }
 
        System.out.println(toplam);
        
                
                
        
    }
    
    
}

*/


//klavyeden girilen nxn matristeki sağ ust uçgen alıb b matrisi uluşturan pro
/*
public class dizod{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen n değer, giriniz");
        int satır=scanner.nextInt();
        int [][] n=new int[satır][satır];
        int [][] b=new int [satır][satır];
       
        for(int i=0;i<satır;i++){
            for(int j=0;j<satır;j++){
                System.out.println("lütfen "+i+"  inci satrı "+j+" sutunu giriniz: ");
                n[i][j]=scanner.nextInt();
            }
       
        }
        System.out.println("diziniz: ");
        for(int i=0;i<satır;i++){
            for(int j=0;j<satır;j++){
                System.out.print(n[i][j]+" ");
            }
            System.out.println("");
       
        }
        //yeni dizimiz uluşturma yeri 
        for (int i = 0; i <satır; i++) {
            for(int k=0;k<satır;k++){
                if(k>=i){
                  b[i][k]=n[i][k];
                }
                else{
                    b[i][k]=0;
                }
                
            }
    
        }
          for (int i = 0; i <satır; i++) {
            for(int k=0;k<satır;k++){
                  System.out.print(b[i][k]+" ");
            }
              System.out.println("");
          }
            }
        
        
        
        
        
        
    }
}
*/

//klavyeden girilen matriin alt ucgen oluşturan program
/*
public class dizod{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen n değer, giriniz");
        int satır=scanner.nextInt();
        int [][] n=new int[satır][satır];
        int [][] b=new int [satır][satır];
       
        for(int i=0;i<satır;i++){
            for(int j=0;j<satır;j++){
                System.out.println("lütfen "+i+"  inci satrı "+j+" sutunu giriniz: ");
                n[i][j]=scanner.nextInt();
            }
       
        }
        System.out.println("diziniz: ");
        for(int i=0;i<satır;i++){
            for(int j=0;j<satır;j++){
                System.out.print(n[i][j]+" ");
            }
            System.out.println("");
       
        }
        //yeni dizimiz uluşturma yeri 
        for (int i = 0; i <satır; i++) {
            for(int k=0;k<satır;k++){
                if(i>=k){
                  b[i][k]=n[i][k];
                }
                else{
                    b[i][k]=0;
                }
                
            }
    
        }
          for (int i = 0; i <satır; i++) {
            for(int k=0;k<satır;k++){
                  System.out.print(b[i][k]+" ");
            }
              System.out.println("");
          }
            }
        
        
    
    }
*/
// klavyede girilen matrisin  x=x oldunda koşeli matris oluşturanporo:
/*
  public class dizod{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen n değer, giriniz");
        int satır=scanner.nextInt();
        int [][] n=new int[satır][satır];
        int [][] b=new int [satır][satır];
       
        for(int i=0;i<satır;i++){
            for(int j=0;j<satır;j++){
                System.out.println("lütfen "+i+"  inci satrı "+j+" sutunu giriniz: ");
                n[i][j]=scanner.nextInt();
            }
       
        }
         for(int i=0;i<satır;i++){
            for(int j=0;j<satır;j++){
                if(i==j){
                    b[i][1]=n[i][j];
                }
               
            }
         }
         System.out.println("diziniz: ");
        for(int i=0;i<satır;i++){
            for(int j=0;j<satır;j++){
                System.out.print(n[i][j]+" ");
            }
            System.out.println("");
       
        }
         for(int i=0;i<satır;i++){
             System.out.println(b[i][1]+" ");
         }
    }
  }
*/
// klavyeden girilen nxn bir dizi birincş satır carparak yeni diziye atan pro
/*
public class dizod{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen n değer, giriniz");
        int satır=scanner.nextInt();
        int [][] n=new int[satır][satır];
        int [] b=new int [satır];
        
       
        for(int i=0;i<satır;i++){
            for(int j=0;j<satır;j++){
                System.out.println("lütfen "+i+"  inci satrı "+j+" sutunu giriniz: ");
                n[i][j]=scanner.nextInt();
            }
       
        }
        System.out.println("diziniz: ");
        for(int i=0;i<satır;i++){
            for(int j=0;j<satır;j++){
                System.out.print(n[i][j]+" ");
            }
            System.out.println("");
       
        }
        
        for(int i=0;i<satır;i++){
            b[i]=1;
            for(int j=0;j<satır;j++){
                
                b[i]*=n[j][i];
            }
            
          }
       
        
        
        
        
         for(int i=0;i<satır;i++){
            
                System.out.println((i+1)+" nci satır çarpımı "+b[i]);
            
            
    }
}
}
*/



//klavyeden girilen nxn tipindeki a matrisin 1 sutun bir sonrakile 2 sutun bir sonrakile 
//carpan yeni, sutune ekleyen pro:
/*
public class dizod{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen n değer, giriniz");
        int satır=scanner.nextInt();
        int [][] n=new int[satır][satır];
        int [][] b=new int [satır][satır-1];
        
       
        for(int i=0;i<satır;i++){
            for(int j=0;j<satır;j++){
                System.out.println("lütfen "+i+"  inci satrı "+j+" sutunu giriniz: ");
                n[i][j]=scanner.nextInt();
            }
       
        }
        System.out.println("diziniz: ");
        for(int i=0;i<satır;i++){
            for(int j=0;j<satır;j++){
                System.out.print(n[i][j]+" ");
            }
            System.out.println("");
       
        }
        for(int i=0;i<satır;i++){
            for(int j=0;j<satır-1;j++){
                b[i][j]=n[i][j]*n[i][j+1];
                System.out.print(b[i][j]+" ");
            }System.out.println("");
            }
        
        
    }
}
*/
//klavyeden girilen nxn bir dizi  simetri olub olmadı hisablayan program
/*
public class dizod{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen n değer, giriniz");
        int satır=scanner.nextInt();
        int [][] n=new int[satır][satır];
        int [][] b=new int [satır][satır-1];
        
       
        for(int i=0;i<satır;i++){
            for(int j=0;j<satır;j++){
                System.out.println("lütfen "+i+"  inci satrı "+j+" sutunu giriniz: ");
                n[i][j]=scanner.nextInt();
            }
       
        }
        System.out.println("diziniz: ");
        for(int i=0;i<satır;i++){
            for(int j=0;j<satır;j++){
                System.out.print(n[i][j]+" ");
            }
            System.out.println("");
       
        }
        int sayac=0;
         for(int i=0;i<satır;i++){
            for(int j=0;j<satır;j++){
                if(n[1][j]==n[j][1]){
                    sayac++;
                }
                
            }
         }
         System.out.println(sayac);
        
    }
}
*/
//klavyeden girilen nxn bir matrisin  her satır kendi aralında 
//sırayla listeleyen program 
/*
public class dizod{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen n değer, giriniz");
        int satır=scanner.nextInt();
        int [][] n=new int[satır][satır];
        int [][] b=new int [satır][satır-1];
        
       
        for(int i=0;i<satır;i++){
            for(int j=0;j<satır;j++){
                System.out.println("lütfen "+i+"  inci satrı "+j+" sutunu giriniz: ");
                n[i][j]=scanner.nextInt();
            }
       
        }
        System.out.println("diziniz: ");
        for(int i=0;i<satır;i++){
            for(int j=0;j<satır;j++){
                System.out.print(n[i][j]+" ");
            }
            System.out.println("");
       
        }
        System.out.println("dizinin sıralnmış hali:");
        
        for(int i=0;i<satır;i++){
            int maxsay=0;
                    
            for(int k=0;k<satır;k++){
                if(n[i][k]>n[i][k+1]){
                    maxsay=n[i][k];
                    n[i][k]=n[i][k+1];
                    n[i][k+1]=maxsay;
                    
                }
            }
        }
        
        
    }
}
*/

