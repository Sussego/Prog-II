public class Cilindro extends Circulo{
  protected double altura;
  void Cilindro(){
    altura = 0;
  }
  public double calcularArea(){
    area = ((2*(2*3.14))+((2*3.14)*raio*altura));
    return area;
 }
 public void setAltura(float altura){
   this.altura = altura;
 }
}