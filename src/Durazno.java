import java.util.Scanner;
public class Durazno {
    public static void main(String[] args) {
        String nombre="diego", apellido;
        int op;
        Scanner leer=new Scanner(System.in);
        System.out.println("escriba un apellido con la letra D");
        apellido=leer.nextLine();
        String[] animal=new String[5];
        animal[3]="Dinosaurio";

        System.out.println("elija un color 1.dorado \n 2.Durazno pastel");
        op=leer.nextInt();
        switch(op){
            case 1:
                System.out.println("usted eligio el color dorado");
                break;
             case 2:
             System.out.println("usted eligio el color durazno pastel"); 
             break;  
             
        }
 

    }
}
