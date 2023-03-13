/*nhap cac so nguyen va tinh tong neu tong >100 thi ket thuc va in ra tong
*/
package Cau_truc_dieu_khien;
import java.util.Scanner;
public class Bai5_Lab2 {
    public static void main(String[] args) {
        float tong=0,so=0;
        try(Scanner nhap=new Scanner(System.in)){
        while(tong<=100){
            System.out.print("Nhap so nguyen : ");
            so=nhap.nextFloat();
            if(so-(int)so==0){
                tong=tong+so;
                System.out.println("tong cac so nguyen hien tai la :"+tong);
            }
        }
        System.out.println("tong cac so da nhap: "+tong);
        nhap.close();
        }}}
        
   
