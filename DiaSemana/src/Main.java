import java.util.Scanner;

public class Main {
    /**
     * @author: Hejociara
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.print("Ingresa el día: ");
        String diaSemana = entrada.next();

        if(diaSemana.equalsIgnoreCase("domingo"))
            System.out.println(1);
            
        }

        entrada.close();

    }


}

