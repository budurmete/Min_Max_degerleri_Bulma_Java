import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);

        System.out.print("Kaç Adet Sayı Gireceksiniz=  ");
        int istenilenSayi= imp.nextInt();
        int sayi=0,min=0,max=0;

        for (int i=1;i<=istenilenSayi;i++)
        {
            System.out.print(i+". Sayıyı Giriniz=  ");
            sayi = imp.nextInt();
            if (sayi<min || min==00){min=sayi;}
            if (sayi>max ){max=sayi;}
        }
System.out.println("Girilen Sayılar arasında en küçük değer=  "+min);
System.out.print("Girilen Sayılar arasında en büyük değer=  "+max);
    }
}