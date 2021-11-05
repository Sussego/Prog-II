public class Pilha {
  No pilha[];
  int topo = -1;
  int tam;

  public Pilha(int tam){
    pilha = new No[tam];
    this.tam = tam;
  }

  public void empilhar(No n){
    if(topo < tam-1){
      topo++;
      pilha[topo] = n;
      System.out.println("Empilhado!");
    }else{
      System.out.println("Sem espaco na Pilha!");
    }
  }

  public No desempilhar() throws ExcecaoPilhaVazia {
    if(topo != -1){
      No aux = pilha[topo];
      pilha[topo] = null;
      topo--;
      System.out.println("Desempilhado!");
      return aux;
    }else{
      throw new ExcecaoPilhaVazia();
    }
  }

  public void imprimir(){
    for(int i = topo ; i > -1 ; i--){
      System.out.println(pilha[i].toString()+"\n");
    }
  }
}