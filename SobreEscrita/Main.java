class Main {
  public static void main(String[] args) {
    Circulo c1 = new Circulo();
    Cilindro c2 = new Cilindro();
    double resultado;
    c1.setRaio(12);
    c2.setRaio(6);
    c2.setAltura(10);
    resultado = c1.calcularArea();
    System.out.println("circulo: " + resultado);
    resultado = c2.calcularArea();
    System.out.println("Cilindro: " + resultado);
  }
}