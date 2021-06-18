class Main {
  public static void main(String[] args) {
    /*vars e objetos*/
    Retangulo retang1 = new Retangulo();
    Retangulo retang2 = new Retangulo(12, 12);
    int lado1;
    int lado2;
    boolean verificador;
    /*get e sets*/
    retang1.setLado1(15);
    retang1.setLado2(13);
    lado1 = retang1.getLado1();
    lado2 = retang1.getLado2();
    System.out.println(lado1+"\n"+lado2);
    lado1 = retang2.getLado1();
    lado2 = retang2.getLado2();
    System.out.println(lado1+"\n"+lado2);
    /*metodo verificar*/
    verificador = Retangulo.verificarIgualdade(retang1);
    System.out.println(verificador);
    verificador = Retangulo.verificarIgualdade(retang2);
    System.out.println(verificador);
  }
}