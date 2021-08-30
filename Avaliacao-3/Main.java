import java.util.ArrayList;
import java.util.*;
class Main {
  public static void main(String[] args) {
    List<Produto> listaProdutos = new ArrayList<>();

    Produto p = new ProdutoFracionado(10,"Tomate", 5.20, 10.5);
    Produto p1 = new ProdutoFracionado(5, "Uva", 3.50, 30.7);
    Produto p2 = new ProdutoUnitario(6, "Doritos", 8.0, 15);
    Produto p3 = new ProdutoUnitario(1, "Refrigerante", 10.30, 9);
    Produto p4 = new ProdutoFracionado(11, "Aveia", 12.50, 20.1);
    Produto p5 = new ProdutoUnitario(9, "Energetico", 9.0, 8);

    listaProdutos.add(p);
    listaProdutos.add(p1);
    listaProdutos.add(p2);
    listaProdutos.add(p3);
    listaProdutos.add(p4);
    listaProdutos.add(p5);
    
    //Valor total de Produtos no Mercado
    int tamanho = listaProdutos.size();
    double valorTotal = 0;
    for(int i = 0 ; i < tamanho ; i++){
      valorTotal = valorTotal+listaProdutos.get(i).calcularValorEmEstoque();
    }
    System.out.println("Valor total: "+valorTotal);

    //Listando Produtos Pelo codigo
    Collections.sort(listaProdutos);
    for(int i = 0 ; i < tamanho ; i++){
      System.out.println(listaProdutos.get(i));
    }

  }
}