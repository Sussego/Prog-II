/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package util;

import java.util.List;
import modelo.Veiculo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class DaoTest {
    
    public DaoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testInserir() {
       Veiculo v = new Veiculo("Ford","Camaro","ABC1234");
       Dao<Veiculo> dao = new Dao(Veiculo.class);
       dao.inserir(v);
    }
    
    /*@Test
    public void testLista(){
        Dao<Veiculo> dao = new Dao(Veiculo.class);
        List<Veiculo> lista = dao.listarTodos();
        
        for(Veiculo v : lista){
            System.out.println(v);
        }
    }
    */
}
