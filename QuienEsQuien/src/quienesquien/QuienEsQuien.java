package quienesquien;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class QuienEsQuien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        boolean gafas, bigote, gorro, barba, perilla, pelo;
        int jugar;
        System.out.println("Quieres jugar a ¿Quién es quién? Introduce 1 para jugar o 2 para salir");
        jugar= sc.nextInt();
        if (jugar==1){
            System.out.println("¿El personaje tiene gafas? True or False");
            gafas= sc.nextBoolean();
            System.out.println("¿El personaje tiene bigote? True or False");
            bigote= sc.nextBoolean();
            System.out.println("¿El personaje tiene sombrero? True or False");
            gorro= sc.nextBoolean();
            System.out.println("¿El personaje tiene barba? True or False");
            barba= sc.nextBoolean();
            System.out.println("¿El personaje tiene perilla? True or False");
            perilla= sc.nextBoolean();
            System.out.println("¿El personaje tiene pelo? True or False");
            pelo= sc.nextBoolean();
            if (gafas==true && bigote==false && gorro==false && barba==false && perilla==false && pelo==false){
                System.out.println("El personaje es Lupas");
            }
            else if (gafas==false && bigote==false && gorro==false && barba==false && perilla==false && pelo==true){
                System.out.println("El personaje es Mónica");
            }
            else if (gafas==false && bigote==true && gorro==false && barba==false && perilla==false && pelo==false){
                System.out.println("El personaje es Nike");
            }
            else if (gafas==false && bigote==false && gorro==false && barba==true && perilla==false && pelo==false){
                System.out.println("El personaje es Medinilla");
            }
            else if (gafas==false && bigote==false && gorro==true && barba==false && perilla==false && pelo==true){
                System.out.println("El personaje es Kiko");
            }
            else if (gafas==false && bigote==false && gorro==true && barba==false && perilla==true && pelo==false){
                System.out.println("El personaje es Alejandro");
            }

      
        else{
            System.out.println("Ese personaje no existe. Prueba otra vez.");
                
            }
        }
        
        else {
            System.out.println("Cerrando aplicación...");
        }
        
        
    }
    
  }

