import java.util.Scanner;
public class Cartao{
  int saldo;
  Scanner leitor = new Scanner(System.in);
//Construtor//
  Cartao(){
    saldo = 10;
  }
//Compra um cafe//
  void comprar(){
    if(saldo > 0){
      saldo = saldo - 1;
      System.out.println("\nComprou!"+"\nCompras restantes no Cartao:"+saldo+"\n");
    }else{
      System.out.println("\nCartao sem Saldo!\n");
    }
  }
  //Compra "X" cafes//
  void comprarMais(int num){
    if(num <= saldo){
      saldo = saldo - num;
      System.out.println("\nComprou "+num+" cafes\nCompras restantes no Cartao:"+saldo+"\n");
    }else{
      System.out.println("\nCartao sem Saldo!\n");
    }
  }
//Adiciona saldo ao cartao//
  void carregarCartao(){
    System.out.print("\nQuando quer adicionar ao Cartao:");
    int valor = leitor.nextInt();
    saldo = saldo + valor;
    System.out.println("Novo saldo:"+saldo+"\n");
  }
}