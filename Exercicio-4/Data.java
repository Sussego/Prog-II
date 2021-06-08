public class Data {
  int dia;
  int mes;
  int ano;

  Data(){
    dia = 1;
    mes = 1;
    ano = 1;
  }
  Data(int ano){
    this.ano = ano;
    dia = 1;
    mes = 1;
  }
  Data(int dia, int mes, int ano){
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
  }
  String formatarData(String separador){
    return(dia+separador+mes+separador+ano+" ");
  }
}