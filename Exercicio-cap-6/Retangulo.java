public class Retangulo{
  private int lado1;
  private int lado2;
  /*construtores*/
  Retangulo(){
    lado1 = 0;
    lado2 = 0;
  }
  Retangulo(int lado1, int lado2){
    this.lado1 = lado1;
    this.lado2 = lado2;
  }
  /*gets*/
  public int getLado1(){
    return lado1;
  }
  public int getLado2(){
    return lado2;
  }
/*sets*/
  public void setLado1(int lado1){
    this.lado1 = lado1;
  }
  public void setLado2(int lado2){
    this.lado2 = lado2;
  }
  /*verificador*/
  static boolean verificarIgualdade(Retangulo retangulo){
    if(retangulo.lado1 == retangulo.lado2){
      return true;
    }else{
      return false;
    }
  }
}