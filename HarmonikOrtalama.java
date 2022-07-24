/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package harmonikortalama;

/**
 *
 * @author Samsung
 */
public class HarmonikOrtalama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] liste={1,2,3,4,5};
        double harOrt=0;
        double sum=0.0;
        for(double i:liste){
            sum+= ( 1/i );
        }
        harOrt=liste.length/sum;
        System.out.println(harOrt);
    }
    
}
