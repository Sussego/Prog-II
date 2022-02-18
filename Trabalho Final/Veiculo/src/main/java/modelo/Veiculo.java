package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "veiculo")
public class Veiculo {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
   @Column(length = 30)
   private String marca;
   @Column(length = 30)
   private String modelo;
   @Column(length = 8)
   private String placa;
   
   public Veiculo(){
       this.marca = "";
       this.modelo = "";
       this.placa = "";
   }

    public Veiculo(String marca, String modelo, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
    }

   
}
