public class Nodo {
  private Bicicleta bici;
  private Nodo next;

  private int id;

  public Nodo(Bicicleta bici, int id) {
    this.bici = bici;
    this.next = null;
    this.id = id;
  }

  public Bicicleta getBici() {
    return bici;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setBici(Bicicleta bici) {
    this.bici = bici;
  }

  public Nodo getNext() {
    return next;
  }

  public void setNext(Nodo next) {
    this.next = next;
  }

  public Nodo() {
  }
}
