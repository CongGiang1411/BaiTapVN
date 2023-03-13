/*nhap vao 1 day so nguyen n in ra trung binh cong
*/
package Mang_chuoi_kitu;
import java.util.Scanner;
public class Bai8_Lab2 {
    public static void main(String[] args) {
        int n,tong=0;
        try(Scanner nhap=new Scanner(System.in)){
        do{
            System.out.print("day so gom so ptu la: ");
            n=nhap.nextInt();
        }while(n<0 );
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("nhap so thu"+(i+1)+": ");
            a[i]=nhap.nextInt();
            tong=tong+a[i];
        }
        int trungbinhcong=tong/n;
        System.out.print("trung binh cong cua day so la: "+trungbinhcong);
        nhap.close();
    }}
    
}
