public class ProdutoUnitario extends Produto implements IProduto{
  private int quantidadeEstoque;

  //Construtores
  public ProdutoUnitario(int codigo, String nome, double preco, int quantidadeEstoque){
    super(codigo, nome, preco);
    this.quantidadeEstoque = quantidadeEstoque;
  }
  public ProdutoUnitario(){
    super();
    this.quantidadeEstoque = 0;
  }

  //Metodos
  public void vender(int num){
    quantidadeEstoque = quantidadeEstoque - num;
  }

  public void adicionarEstoque(int valor){
    quantidadeEstoque = quantidadeEstoque+valor;
  }
  
  @Override
  public double calcularValorEmEstoque(){
    return quantidadeEstoque*super.getPreco();
  }

  //Gets e Sets
  public int getQuantidadeEstoque(){
    return quantidadeEstoque;
  }
  public void setQuantidadeEstoque(int quantidade){
    this.quantidadeEstoque = quantidade;
  }
}