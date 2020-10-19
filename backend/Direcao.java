
public enum Direcao {
    NORTH("N"), SOUTH("S"), WEST("W"), EAST("E");

  private final String direcao;
  private Direcao(String direcao) {
    this.direcao = direcao;
  }

  public String toString(){
    return direcao;
  }

}