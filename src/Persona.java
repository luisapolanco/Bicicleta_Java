public class Persona {

  public Persona(String nombre, String telefono, String email) {
    this.nombre = nombre;
    this.telefono = telefono;
    this.email = email;
  }

  private String nombre;
  private String telefono;
  private String email;

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return "Persona{" +
      "nombre='" + nombre + '\'' +
      ", telefono='" + telefono + '\'' +
      ", email='" + email + '\'' +
      '}';
  }
}
