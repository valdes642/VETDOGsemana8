/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetdog;

import modelo.Cuidador;
import modelo.Mascota;
import vista.VistaLogin;

/**
 *
 * @author Santo Tomas
 */
public class VETDOG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // 3 cuidadores
        
        // INSTANCIA - INVOCAR CLASES
        Cuidador c1 = new Cuidador(1, "Marcela", "12", 200);
        c1.setNombre("a");
        
        Cuidador c2 = new Cuidador(2, "1", "15", 20);        
        Cuidador c3 = new Cuidador(3, "a", "13", 60);
        
        Mascota m1 = new Mascota(10, "loki", "Perro", c1);
        Mascota m2 = new Mascota(11, "thor", "gatp", c2);
        Mascota m3 = new Mascota(12, "goku", "pez", null);
        
        // cuidador de la mascota 1
        System.out.println(" " + m1.getNombre());
        System.out.println("" + m1.getCuidador().getNombre());
        
        
        VistaLogin vistaLogin = new VistaLogin();
        vistaLogin.setVisible(true);
        
    }
    
}
