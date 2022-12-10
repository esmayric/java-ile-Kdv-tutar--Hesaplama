import java.util.Scanner;
public class KdvHesaplama {
    public static void main(String[] args) {
        double tutar,KdvliFiyat=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("ücret tutarını giriniz: ");
        tutar = sc.nextDouble();

        if(tutar>=0 && tutar<=1000) {
            KdvliFiyat= tutar+ (tutar*0.18);
        } if (tutar>1000) {
            KdvliFiyat= tutar+ (tutar*0.08);
        }
        System.out.print("ürünün Kdv'li fiyatı: " +KdvliFiyat);
    }
}