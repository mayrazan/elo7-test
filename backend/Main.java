import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Direcao d = Direcao.NORTH;
    Posicao p = new Posicao(0,0,d);
    Sonda s = new Sonda();
   // Movimento m = null;

    System.out.println("Tamanho do terreno (ex: 5 5): ");
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int y = scanner.nextInt();

    while (true) {
      System.out.println("Coordenadas x e y e a direcao (ex: 1 2 N): ");
      int coordenadaX = scanner.nextInt();
      int coordenadaY = scanner.nextInt();
      String direcao = scanner.next().toUpperCase();
      p.setX(coordenadaX);
      p.setY(coordenadaY);

      if(Direcao.EAST.toString().equals(direcao)) {
        d = Direcao.EAST;
        p.setDirecao(d);
      } else if(Direcao.NORTH.toString().equals(direcao)) {
        d = Direcao.NORTH;
        p.setDirecao(d);
      } else if(Direcao.SOUTH.toString().equals(direcao)) {
        d = Direcao.SOUTH;
        p.setDirecao(d);
      } else {
        d = Direcao.WEST;
        p.setDirecao(d);
      }

      System.out.println("Movimentação utilizando 'L', 'M' ou 'R', (ex: 'LMLMLMLMM'): ");
      String movimentacao = scanner.next().toUpperCase();

      for(int i = 0; i < movimentacao.length(); i++){
        if(movimentacao.charAt(i) == 'L'){
          s.executar(p, Movimento.LEFT);
        } else if(movimentacao.charAt(i) == 'R'){
          s.executar(p, Movimento.RIGTH);
        } else {
          s.executar(p, Movimento.MOVE);
        }
      }      
      System.out.print("Resposta: ");
      System.out.println(p.toString());
    }
  }
}