package main;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Direcao d = Direcao.NORTH;
    Posicao p = new Posicao(0, 0, d);
    Sonda s = new Sonda();
    Terreno terreno = new Terreno(0, 0);

    System.out.println("Informe o tamanho do terreno: [x][y] ");
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    terreno.setTerreno(x, y);

    do {
      System.out.println("1\t Adicionar sonda: ");
      System.out.println("2\t Coordenadas x e y: ");
      System.out.println("3\t Direção apontada: (W, N, E, S) ");
      System.out.println("4\t Movimentar sonda: (L, M, R)");
      System.out.println("0\t Sair: ");

      System.out.println("Entre com sua escolha:");

      int escolha = scanner.nextInt();

      switch (escolha) {
        case 1:
          System.out.println("Adicionar sonda: ");
          String nome = scanner.next();
          s.setNomeSonda(nome);
          terreno.addSonda(s);
          break;

        case 2:
          System.out.println("Informe as coordenadas x e y: ");
          int coordenadaX = scanner.nextInt();
          int coordenadaY = scanner.nextInt();
          //verifica se as coordenadas informadas são menores ou iguais ao limite do planalto
          if (terreno.tamanhoTerrenoX() >= coordenadaX && terreno.tamanhoTerrenoY() >= coordenadaX) {
            //guarda o valor das coordenadas
            p.setX(coordenadaX);
            p.setY(coordenadaY);
          } else {
            System.out.println("Número inválido");
            break;
          }
          break;

        case 3:
          System.out.println("Informe para onde a sonda está apontada: ");
          String movimentacao = scanner.next().toUpperCase();
          //verifica se o caractere informado é o esperado
          if (movimentacao.charAt(0) == 'W' || movimentacao.charAt(0) == 'N' || movimentacao.charAt(0) == 'E'
              || movimentacao.charAt(0) == 'S') {
            //verifica se o caractere informado é igual ao esperado e guarda seu valor
            if (Direcao.EAST.toString().equals(movimentacao)) {
              d = Direcao.EAST;
              p.setDirecao(d);
            } else if (Direcao.NORTH.toString().equals(movimentacao)) {
              d = Direcao.NORTH;
              p.setDirecao(d);
            } else if (Direcao.SOUTH.toString().equals(movimentacao)) {
              d = Direcao.SOUTH;
              p.setDirecao(d);
            } else {
              d = Direcao.WEST;
              p.setDirecao(d);
            }
          } else {
            System.out.println("Comando inválido");
            break;
          }
          break;

        case 4:
        //verifica se a movimentação da sonda está dentro dos limites x e y
          if (terreno.tamanhoTerrenoX() >= p.getX() && terreno.tamanhoTerrenoY() >= p.getY()) {
            System.out.println("Informe os comandos para executar com 'L', 'M' ou 'R': ");
            String execucao = scanner.next().toUpperCase();
            //verifica a quantidade de caracteres informados na variável execucao e executa a função correspondente ao caractere
            for (int i = 0; i < execucao.length(); i++) {
              if (execucao.charAt(i) == 'L') {
                s.viraEsquerda(p);
              } else if (execucao.charAt(i) == 'R') {
                s.viraDireita(p);
              } else {
                s.mover(p);
              }
            }
            System.out.println("Resposta: " + p.toString());
          } else {
            System.out.println("Instrução maior que tamanho do planalto");
            break;
          }
          break;
      }

      System.out.println();
      if (escolha == 0 || escolha > 4) {
        scanner.close();
        break;
      }
    } while (true);
  }
}