public class Dummy {
  public Bicicleta crearBicicleta(){
    String nombre = this.crearNombre();
    String telefono = this.crearTelefono();
    String email = this.crearEmail();
    Persona persona = new Persona(nombre, telefono, email);
    String color = this.crearColor();
    String marca = this.crearMarca();
    String serial = this.crearSerial();
    Bicicleta bici = new Bicicleta(marca, serial, color, persona);
    return bici;
  }

  private String crearColor(){
    int numero = (int)(Math.random()*6+0);
    String colores[] = {"azul", "turquesa", "rojo", "blanco", "verde", "negro"};
    return colores[numero];
  }

  private String crearMarca(){
    int numero = (int)(Math.random()*5+0);
    String marcas[] = {"GW", "Trek", "Scott", "Shimano", "Giant"};
    return marcas[numero];
  }

  private String crearSerial(){
    int numero = (int)(Math.random()*5+0);
    String seriales[] = {"ABC123", "UVW456", "OPQ678", "LMN487", "EFG095"};
    return seriales[numero];
  }

  private String crearNombre(){
    int numero = (int)(Math.random()*7+0);
    String nombres[] = {"Luis", "Miguel", "Alejandro", "Andrea", "Juliana", "Valentina", "Roberto"};
    return nombres[numero];
  }

  private String crearTelefono(){
    int numero = (int)(Math.random()*6+0);
    String telefonos[] = {"2452525", "252525", "744844", "985588", "252669", "563737"};
    return telefonos[numero];
  }

  private String crearEmail(){
    int numero = (int)(Math.random()*4+0);
    String emails[] = {"sog@hot.com", "kg@gma.com", "bsd@gma.com", "rbd@hot.com"};
    return emails[numero];
  }

}
