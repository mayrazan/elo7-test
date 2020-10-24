package main;

import java.util.ArrayList;

public class Terreno {
  private int[][] planalto;
  private ArrayList<Sonda> terreno = new ArrayList<>();
  private int x;
  private int y;
  private Sonda sonda;

  public Terreno(int x, int y) {
    this.setX(x);
    this.setY(y);
  }

  public Sonda getSonda() {
    return this.sonda;
  }

  public void setSonda(Sonda sonda) {
    this.sonda = sonda;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public void setTerreno(int x, int y) {
    this.planalto = new int[x][y];
  }

  public void addSonda(Sonda s) {
	  this.setSonda(s);
	  this.terreno.add(s);
  }

  public int tamanhoTerrenoX() {
    return this.planalto[0].length;
  }

  public int tamanhoTerrenoY() {
    return this.planalto[1].length;
  }

}