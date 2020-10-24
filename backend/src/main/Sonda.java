package main;

public class Sonda {

  private String nome;

  public void viraDireita(Posicao posicao) {
    //faz o movimento no sentido horário pegando a posição atual da direção
    switch (posicao.getDirecao()) {
      //se sonda estiver apontada para o norte vira para o leste
      case NORTH:
        posicao.setDirecao(Direcao.EAST);
        break;
      //se sonda estiver apontada para o leste vira para o sul
      case EAST:
        posicao.setDirecao(Direcao.SOUTH);
        break;
      //se sonda estiver apontada para o sul vira para o oeste
      case SOUTH:
        posicao.setDirecao(Direcao.WEST);
        break;
      //se sonda estiver apontada para o oeste vira para o norte
      case WEST:
        posicao.setDirecao(Direcao.NORTH);
        break;
    }
  }

  public void viraEsquerda(Posicao posicao) {
    //faz o movimento no sentido anti-horário pegando a posição atual da direção
    switch (posicao.getDirecao()) {
      //se sonda estiver apontada para o norte vira para o oeste
      case NORTH:
        posicao.setDirecao(Direcao.WEST);
        break;
      //se sonda estiver apontada para o leste vira para o norte
      case EAST:
        posicao.setDirecao(Direcao.NORTH);
        break;
      //se sonda estiver apontada para o sul vira para o leste
      case SOUTH:
        posicao.setDirecao(Direcao.EAST);
        break;
      //se sonda estiver apontada para o oeste vira para o sul
      case WEST:
        posicao.setDirecao(Direcao.SOUTH);
        break;
    }
  }

  public void mover(Posicao posicao) {
    int x;
    int y;
    //faz a movimentação da sonda de acordo com a posição atual
    switch (posicao.getDirecao()) {
      //se estiver apontada para o norte vai alterar apenas o y, como se estivesse se movendo para frente
      case NORTH:
        y = posicao.getY() + 1;
        posicao.setY(y);
        break;
      //se estiver apontada para o leste vai alterar apenas o x, como se estivesse se movendo para a direita
      case EAST:
        x = posicao.getX() + 1;
        posicao.setX(x);
        break;
      //se estiver apontada para o sul vai alterar apenas o y, como se estivesse se movendo para trás 
      case SOUTH:
        y = posicao.getY() - 1;
        posicao.setY(y);
        break;
      //se estiver apontada para o oeste vai alterar apenas o x, como se estivesse se movendo para a esquerda
      case WEST:
        x = posicao.getX() - 1;
        posicao.setX(x);
        break;
    }
  }

  public void setNomeSonda(String s) {
    this.nome = s;
  }

  public String getNomeSonda() {
    return this.nome;
  }
}