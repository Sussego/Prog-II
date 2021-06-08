class Main {
  public static void main(String[] args) {
    Quadrado quadrado1 = new Quadrado();
    Quadrado quadrado2 = new Quadrado(15);
    quadrado1.lado = 2;
    int area1 = quadrado1.calcularArea();
    int perimetro1 = quadrado1.calcularPerimetro();
    System.out.println(area1);
    System.out.println(perimetro1);
    int area2 = quadrado2.calcularArea();
    int perimetro2 = quadrado2.calcularPerimetro();
    System.out.println(area2);
    System.out.println(perimetro2);
    

  }
}