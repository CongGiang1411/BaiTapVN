/*nhap vao 1 so nguyen duong va tinh giai thua
*/
package Cau_truc_dieu_khien;
import java.util.Scanner;
public class Bai6_Lab2 {
    public static void main(String[] args) {
        int so,giaithua=1;
        try(Scanner nhap=new Scanner(System.in)){
        do{
            System.out.print("nhap so: ");
            so=nhap.nextInt();
        }while(0>so || so-(int)so!=0);
        for(int i=1;i<=so;i++)
        {giaithua *=i;
    }
        System.out.println("giai thua cua so do la "+giaithua);
        nhap.close();
}}}
