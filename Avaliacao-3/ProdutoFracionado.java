public class ProdutoFracionado extends Produto implements IProduto{
  private double quantidadeEstoque;
  //Construtores
  public ProdutoFracionado(int codigo, String nome, double preco, double quantidadeEstoque){
    super(codigo, nome, preco);
    this.quantidadeEstoque = quantidadeEstoque;
  }
  public ProdutoFracionado(){
    super();
    this.quantidadeEstoque = 0;
  }
  
  //Metodos
  public void adicionarEstoque(int quantidade){
    quantidadeEstoque = quantidadeEstoque+quantidade;
  }

  public void vender(double num){
    quantidadeEstoque = quantidadeEstoque - num;
  }

  @Override
  public double calcularValorEmEstoque(){
    return quantidadeEstoque*super.getPreco();
  }

  //Gets e Sets
  public double getQuantidadeEstoque(){
    return quantidadeEstoque;
  }
  public void setQuantidadeEstoque(double quantidade){
    this.quantidadeEstoque = quantidade;
  }
}