public class Bicicleta {

  public Bicicleta(String marca, String serial, String color, Persona dueño) {
    this.marca = marca;
    this.serial = serial;
    this.color = color;
    Dueño = dueño;
  }

  private String marca;
  private String serial;
  private String color;
  private Persona Dueño;

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getSerial() {
    return serial;
  }

  public void setSerial(String serial) {
    this.serial = serial;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Persona getDueño() {
    return Dueño;
  }

  public void setDueño(Persona dueño) {
    Dueño = dueño;
  }

  @Override
  public String toString() {
    return "Bicicleta{" +
      "marca='" + marca + '\'' +
      ", serial='" + serial + '\'' +
      ", color='" + color + '\'' +
      ", Dueño=" + this.getDueño().toString() +
      '}';
  }
}
