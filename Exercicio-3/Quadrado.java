public class Quadrado {
  int lado;
  Quadrado(){
    lado = 0;
  }
  Quadrado(int lado){
    this.lado = lado;
  }
  int calcularArea(){
    return(lado*lado);
  }
  int calcularPerimetro(){
    return(lado*4);
  }
}