class Main {
  public static void main(String[] args) {
    Data data1 = new Data();
    Data data2 = new Data(2021);
    Data data3 = new Data(11, 12, 2000);
    String data1form = data1.formatarData("/");
    System.out.println(data1form);
    String data2form = data2.formatarData("/");
    System.out.println(data2form);
    String data3form = data3.formatarData("/");
    System.out.println(data3form);
  }
}