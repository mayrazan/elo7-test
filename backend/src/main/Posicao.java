package main;

public class Posicao {
  private int x;
  private int y;
  private Direcao direcao;

  public Posicao(int x, int y, Direcao direcao) {
    this.x = x;
    this.y = y;
    this.direcao = direcao;
  }

  public void setX(int x){
    this.x = x;
  }

  public int getX(){
    return x;
  }

  public void setY(int y){
    this.y = y;
  }

  public int getY(){
    return y;
  }

  public Direcao getDirecao() {
        return this.direcao;
    }
    
  public void setDirecao(Direcao direcao){
      this.direcao=direcao;
  }

  public String toString(){
    return this.getX() + " " + this.getY() + " " + this.direcao.toString() ; 
  }
}