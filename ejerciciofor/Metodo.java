
package ejerciciofor;

import java.util.Scanner;


public class Metodo {
   private int num;
    private int suma;
    private int cont = 0;
    Scanner sc = new Scanner(System.in);
      
    
    public int pedirDatos(){
     System.out.print("Teclea numero: ");
     num= sc.nextInt();
     return num;
    }
    
    public void sumarParesFor(){
        int acu = 0;
        
        for (int cont = 0, i= 10; cont <5 && num%2==0; cont++){
            num=pedirDatos();
            if (num%2==0)
                acu = acu + num;
      }
        System.out.println("suma pares="+ acu);
        
     
    }
}
    

