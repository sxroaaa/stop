import java.util.Scanner;

public class Medusa {
    public static void main(String[] args) {
        String apellido, color="blanco";
        String[][] nombre=new String[2][3];
        nombre [1][1] = "Mariana";
        Scanner leer=new Scanner(System.in);
        System.out.println("escriba el apellido");
        apellido=leer.nextLine();

        for(int i=0; i<3; i++){
            System.out.println("Mandarina");
        }

        if(!color.equals("blanco")){
            System.out.println("tu color puede ser correcto");
            leer.close();
        }
    }
    
}
