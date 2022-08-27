import java.lang.ref.PhantomReference;
import java.sql.Array;
import java.util.Scanner;
import javax.swing.text.html.parser.TagElement;

public class principal{
    static int ero = 0;
    static String[] array = new String[10];
    static int cont = 0;
    public static void main(String[] args){
        System.out.println("Bienvenido al registro hospitalario.");
        boolean op = true;
        while (op){
            menu(); //el menu jaja
            switch (ero){
                case 1:
                doc();
                break;

                case 2:
                doc();
                break;
    
                case 3:
                pacient();
                break;

                case 4:
                for(int i = 0; i < cont; i++){
                    System.out.println(array[i]);
                }

                break;

                case 5:
                op = false; //se cierra el while
                break;
            }

            cont = (cont + 1);
          
        }
        System.out.println("Gracias por usar mi programa c:");
    }


    public static void menu(){ 
        Scanner reader = new Scanner(System.in);
        System.out.println("Por favor, selecciones el número de la opción que deseas: ");
        System.out.println("1. Agregar doctor(a). \n2. Agregar enfermero(a). \n3. Agregar paciente. \n4. Mostrar a todas las personas. \n5. Salir.");
        int num = reader.nextInt();
        System.out.println("NOTA: POR FAVOR NO AGREGAR ESPACIOS EN LO QUE SE LE SOLICITA, GRACIAS.");
        ero = num;
    }

    public static void doc(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Por favor, ingresa su ID: ");
        int id = reader.nextInt();
        System.out.println("Ingresa el nombre: ");
        String name = reader.next();
        System.out.println("Ingresa su apellido: ");
        String lastname = reader.next();
        System.out.println("Ingresa su dirección: ");
        String direccion = reader.next();
        System.out.println("Ingresa su número de teléfono: ");
        String num = reader.next();
        System.out.println("Ingresa la especialidad: ");
        String especialidad = reader.next();
        array[cont] = ("DOCTOR(a): " + "Nombre: " + name + " Apellido: " + lastname + " Dirección: " + direccion + " Teléfono: " + num + " Especialidad: " + especialidad);

        doctor docs = new doctor(id, name, lastname, direccion, num);
        docs.setspeciality(especialidad);
    }

    public static void nurse(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Por favor, ingresa su ID: ");
        int id = reader.nextInt();
        System.out.println("Ingresa el nombre: ");
        String name = reader.next();
        System.out.println("Ingresa su apellido: ");
        String lastname = reader.next();
        System.out.println("Ingresa su dirección: ");
        String direccion = reader.next();
        System.out.println("Ingresa su número de teléfono: ");
        String num = reader.next();
        System.out.println("Ingresa la especialidad: ");
        String speciality = reader.next();

        nurse enfermeras = new nurse(id, name, lastname, direccion, num);
        enfermeras.setspeciality(speciality);

        array[cont] = ("ENFERMERO(a)" + "Nombre: " + name + " Apellido: " + lastname + " Dirección: " + direccion + " Teléfono: " + num + " Especialidad: " + speciality);
    }

    public static void pacient(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Por favor, ingresa su ID: ");
        int id = reader.nextInt();
        System.out.println("Ingresa el nombre: ");
        String name = reader.next();
        System.out.println("Ingresa su apellido: ");
        String lastname = reader.next();
        System.out.println("Ingresa su dirección: ");
        String direccion = reader.next();
        System.out.println("Ingresa su número de teléfono: ");
        String num = reader.next();
        System.out.println("Ingresa su cumpleaños: (14/10/2003) ");
        String cumpleaños = reader.next();
        System.out.println("Ingresa su peso: ");
        double peso = reader.nextDouble();
        System.out.println("Ingresa su altura: ");
        double altura = reader.nextDouble();
        System.out.println("Ingresa su tipo de sangre: ");
        String sangre = reader.next();

        paciente paciente = new paciente (id, name, lastname, direccion, num);
        paciente.setbirthday(cumpleaños);
        paciente.setweigth(peso);
        paciente.setheigth(altura);
        paciente.setblood(sangre);

        array[cont] = ("PACIENTE: " + "Nombre: " + name + " Apellido: " + lastname + " Dirección: " + direccion + " Teléfono: " + num + " Cumpleaños: " + cumpleaños + " Peso: " + peso + " Altura: " + altura + " Sangre: " + sangre);
    }
}
