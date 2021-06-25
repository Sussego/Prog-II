import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int numVagas;
    int opcao;
    int remocao;
    boolean aux;
    Scanner leitor = new Scanner(System.in);
    System.out.print("Numero de vagas:");
    numVagas = leitor.nextInt();
    Vagas vaga[] = new Vagas[numVagas];

    /*aloca espaço*/
    for(int i = 0 ; i < numVagas ; i++){
      vaga[i] = new Vagas();
    }

    /*menu*/
    do{
      System.out.print("\n1 - Adicionar carro\n2 - Retirar carro\n0 - Sair\nOPCAO:");
      opcao = leitor.nextInt();

      /*adicionar carro*/
      if(opcao == 1){
        for(int i = 0 ; i < numVagas ; i++){
          aux = vaga[i].getOcupado();
          if(aux == false){
            vaga[i].adicionarCarro();
            break;
          }
          if(i == numVagas - 1 && aux == true){
            System.out.println("\nSem Vagas!\n");
          }
        }
      }

      /*remover carro*/
      if(opcao == 2){
        System.out.print("Numero da vaga do carro a ser removido(de 0 á " + (numVagas - 1) + "):");
        remocao = leitor.nextInt();
        if(remocao < numVagas){
          System.out.println("\nPagamento: R$" + vaga[remocao].removerCarro()+"\n");
        }else{
          System.out.println("\nVaga invalida!");
        }
      }
    }while(opcao != 0);
  }
}