public class Circulo{
  protected double raio;
  protected double area;
  void Circulo(){
    raio = 0;
    area = 0;
  }
  double calcularArea(){
    area = (2 * 3.14)* raio;
    return area;
  }
  public void setRaio(float raio){
    this.raio = raio;
  }
  public double getRaio(){
    return raio;
  }
}