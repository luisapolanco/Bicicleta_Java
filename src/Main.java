import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Nodo cab = GetDummies();
    GetMenu(cab);
  }


  public static void GetMenu(Nodo cab){
    boolean var = true;
    int contador = 100;

    while(var){
      System.out.println("Elegir un número");
      System.out.println("Opción 1: Agregar ordenado");
      System.out.println("Opcion 2: eliminar");
      System.out.println("Opcion 3: ver datos disponibles");
      System.out.println("Opcion 4: contar numero de datos");
      System.out.println("Opcion 5: Salir");
      Scanner scan = new Scanner(System.in);
      int numero = scan.nextInt();

      switch (numero){
        case 1:
          Bicicleta bici = CrearDatosBici();
          Nodo cabTemp = agregar(cab, bici, contador);
          contador = contador + 1;
          cab = cabTemp;
          break;
        case 2:
          System.out.println("Ingrese id de bicicleta que desea eliminar: ");
          int id = scan.nextInt();
          Nodo cabTempeE = eliminar(cab, id);
          cab = cabTempeE;
          break;
        case 3:
          System.out.println("Elegiste ver los datos");
          verDatos(cab);
          break;
        case 4:
          System.out.println("Elegiste contar: ");
          System.out.println(contar(cab));
          break;
        case 5:
          System.out.println("Elegiste SALIR");
          var = false;
          break;
        default:
          System.out.println("No es una opción, intenta nuevamente ");
      }
    }
  }

  public static Bicicleta CrearDatosBici(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Ingrese Color: ");
    String color = scan.next();
    System.out.println("Ingrese Marca: ");
    String marca = scan.next();
    System.out.println("Ingrese Serial: ");
    String serial = scan.next();
    System.out.println("Ingrese Nombre: ");
    String nombre = scan.next();
    System.out.println("Ingrese Telefono: ");
    String telefono = scan.next();
    System.out.println("Ingrese Email: ");
    String email = scan.next();
    Persona persona = new Persona(nombre,telefono, email);
    Bicicleta bici = new Bicicleta(marca, serial, color, persona);
    return bici;
  }

  public static Nodo GetDummies() {
    Dummy dummy = new Dummy();
    Nodo nodo = new Nodo();
    for (int i = 0; i < 100; i++) {
      Bicicleta bici = dummy.crearBicicleta();
      Nodo cab = agregar(nodo, bici, i );
      nodo = cab;
    }
    return nodo;
  }

  public static Nodo agregar(Nodo cab, Bicicleta nuevaBici, int contador){
    Nodo nuevoNodo = new Nodo(nuevaBici, contador + 1);
    if (cab.getBici() == null){
      return nuevoNodo;
    }
    if(cab.getBici().getColor().compareTo(nuevaBici.getColor()) == 0){
      nuevoNodo.setNext(cab);
      return nuevoNodo;
    } else{
      Nodo aux1 = cab;
      Nodo aux2 = new Nodo();
      while(aux1 != null && aux1.getBici().getColor().compareTo(nuevaBici.getColor()) < 0 ){
        aux2 = aux1;
        aux1 = aux1.getNext();
      }

      if(cab == aux1){
        cab = nuevoNodo;
      }else{
        aux2.setNext(nuevoNodo);
      }

      nuevoNodo.setNext(aux1);
      return cab;
    }
  }

  public static Nodo eliminar(Nodo cab, int id) {
    if (cab == null) {
      return cab;
    } else {
      Nodo temp = cab;
      Nodo previo = null;
      Nodo newCab = null;
      boolean stop = false;
      while (stop == false) {
        if (temp.getId() == id && previo == null) {
          newCab = temp.getNext();
          stop = true;
        } else if (temp.getId() == id) {
          previo.setNext(temp.getNext());
          newCab = previo;
          stop = true;
        } else {
          previo = temp;
          temp = temp.getNext();
        }
      }
      return newCab;
    }
  }


  public static int contar(Nodo cab){
    Nodo temp = cab;
    int contador = 1;
    while(temp.getNext() != null){
      contador = contador + 1;
      temp = temp.getNext();
    }

    return contador;
  }

  public static void verDatos(Nodo cab){
    Nodo actual = new Nodo();
    actual = cab;
    while(actual != null){
      System.out.println(actual.getBici().toString());
      actual = actual.getNext();
    }
  }


}
