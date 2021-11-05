class Main {
  public static void main(String[] args) throws ExcecaoPilhaVazia {
    Pilha pilha = new Pilha(3);
    for(int i = 0 ; i < 4 ; i++){
      No no = new No("Empilhamento", i);
      pilha.empilhar(no);
    }
    pilha.imprimir();

    pilha.desempilhar();
    pilha.desempilhar();
    pilha.imprimir();
    pilha.desempilhar();
    pilha.desempilhar();
  }
}