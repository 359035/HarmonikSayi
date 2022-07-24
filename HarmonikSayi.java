/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package harmoniksayi;

/**
 *
 * @author Samsung
 */
import java.util.Scanner;
public class HarmonikSayi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp=new Scanner(System.in);
        System.out.print("N Sayisini Giriniz: ");
        int n=inp.nextInt();
        double total=0.0;
        
        for(int i=1;i<=n;i++){
            total+=(1.0/i);
        }
        System.out.println("Harmonik Sayi:"+total);
    }
    
}
