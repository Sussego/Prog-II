
class Main {
  public static void main(String[] args) {
    Cartao cartao = new Cartao();
    //compra um cafe//
    cartao.comprar();
    cartao.comprar();
    //insere mais saldo//
    cartao.carregarCartao();
    //compra multiplos cafes//
    cartao.comprarMais(8);
    //Teste sem saldo//
    cartao.comprarMais(99999);
  }
}