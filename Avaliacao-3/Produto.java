public abstract class Produto implements Comparable, IProduto {
  private int codigo;
  private String nome;
  private double preco;

  //Contrutores
  public Produto(int codigo, String nome, double preco){
    this.codigo = codigo;
    this.nome = nome;
    this.preco = preco;
  }
  public Produto(){
    codigo = 0;
    nome = "null";
    preco = 0.0;
  }

  //toString
  @Override
  public String toString() {
    return codigo + " - " + nome;
  }
  
  //Metodo de Organizacao por codigo
  @Override
  public int compareTo(Object o) {
    Produto prox = (Produto) o;
      if (this.codigo < prox.getCodigo()){
        return -1;
      }
      if (this.codigo == prox.getCodigo()){
        return 0;
     }
       return 1;
   }
   
  //Gets e Sets
  public int getCodigo(){
    return codigo;
  }
  public String getNome(){
    return nome;
  }
  public double getPreco(){
    return preco;
  }
  public void setCodigo(int num){
    this.codigo = num;
  }
  public void setNome(String nome){
    this.nome = nome;
  }
  public void setPreco(double preco){
    this.preco = preco;
  }

}