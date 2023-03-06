/*nhap 1 so nguyen va kiem tra chan hay le
*/
package Cau_truc_dieu_khien;
import java.util.Scanner;
public class Bai2_Lab2 {
    public static void main(String[] args) {
        float songuyen=0;
        Scanner nhap=new Scanner(System.in);
        do{
        System.out.print("Nhap so nguyen: ");
        songuyen=nhap.nextFloat();
        }while( songuyen-(int)songuyen!=0);
        if(songuyen%2==0){
            System.out.println(songuyen+ " la so nguyen chan");
        }
        else{
            System.out.println(songuyen+ " la so nguyen le");
        }
                
    }
}
