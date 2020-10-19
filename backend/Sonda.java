public class Sonda {
  
  public Sonda(){
  
  }

  public void executar(Posicao posicao, Movimento movimento) {
    switch (movimento) {
      case MOVE:
        mover(posicao);
        break;
      case LEFT:
        viraEsquerda(posicao);
        break;
      case RIGTH:
        viraDireita(posicao);
        break;
    }
  }

  public void viraDireita(Posicao posicao) {
    switch (posicao.getDirecao()) {
      case NORTH:
        posicao.setDirecao(Direcao.EAST);
        break;
      case EAST:
        posicao.setDirecao(Direcao.SOUTH);
        break;
      case SOUTH:
        posicao.setDirecao(Direcao.WEST);
        break;
      case WEST:
        posicao.setDirecao(Direcao.NORTH);
        break;
    }
  }

  public void viraEsquerda(Posicao posicao) {
    switch (posicao.getDirecao()) {
      case NORTH:
        posicao.setDirecao(Direcao.WEST);
        break;
      case EAST:
        posicao.setDirecao(Direcao.NORTH);
        break;
      case SOUTH:
        posicao.setDirecao(Direcao.EAST);
        break;
      case WEST:
        posicao.setDirecao(Direcao.SOUTH);
        break;
    }
  }

  public void mover(Posicao posicao) {
    int x = posicao.getX();
    int y = posicao.getY();

    switch (posicao.getDirecao()) {
      case NORTH:
        y++;
        break;
      case EAST:
        x++;
        break;
      case SOUTH:
        y--;
        break;
      case WEST:
        x--;
        break;
    }
    posicao.setX(x);
    posicao.setY(y);
  }
}