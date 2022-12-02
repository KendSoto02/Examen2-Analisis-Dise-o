/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2aguinaldo;

import java.time.LocalDateTime;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sotof
 */
public class AguinaldoTest {
    
    public AguinaldoTest() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

     @Test
    public void testFindbonusUnDia() {
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.of(2020, 9, 10, 13,50);
        LocalDateTime endDate = LocalDateTime.of(2020, 9, 9, 13,50);
        float amount = 300000.0F;
        float expResult = -1.0F;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
    }
     @Test
    public void testFindbonusUnDiaMalo() {
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.of(2020, 9, 10, 13,50);
        LocalDateTime endDate = LocalDateTime.of(2020, 9, 9, 13,50);
        float amount = -1;
        float expResult = 300000.0F;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
    }
    
    
    /////////////////////////////////////////////////////////////////
       @Test
    public void testFindbonusUnMes() {
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.of(2020, 9, 10, 13,50);
        LocalDateTime endDate = LocalDateTime.of(2020, 10, 9, 13,50);
        float amount = 300000.0F;
        float expResult = 25000.0F;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
    }
    
       @Test
    public void testFindbonusUnMesMalo() {
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.of(2020, 9, 10, 13,50);
        LocalDateTime endDate = LocalDateTime.of(2020, 10, 9, 13,50);
        float amount = 300000.0F;
        float expResult = 500000.0F;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
    }
    
    ///////////////////////////////////////////////////////////////////////
    
       @Test
    public void testFindbonusResultadoMenos3() {
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.of(2021, 10, 05, 15,56);
        LocalDateTime endDate = LocalDateTime.of(2022, 03, 01, 15,56);
        float amount = 300000.0F;
        float expResult = -3.0F;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
    }
    
          @Test
    public void testFindbonusResultadoMenos3Malo() {
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.of(2021, 10, 05, 15,56);
        LocalDateTime endDate = LocalDateTime.of(2050, 03, 01, 15,56);
        float amount = 3400000.0F;
        float expResult = -2.0F;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////
    
    @Test
    public void testFindbonusAYear() {
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.of(2021, 12, 31, 15,56);
        LocalDateTime endDate = LocalDateTime.of(2022, 12, 31, 15,56);
        float amount = 300000.0F;
        float expResult = -2.0F;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
    }
    
        
    @Test
    public void testFindbonusAYearMalo() {
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.of(2020, 9, 10, 13,50);
        LocalDateTime endDate = LocalDateTime.of(2020, 9, 9, 13,50);
        float amount = 0.0F;
        float expResult = -3.0F;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////

            
    @Test
    public void testFindbonusMontoSuperior() {
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.of(2020, 9, 10, 13,50);
        LocalDateTime endDate = LocalDateTime.of(2020, 9, 9, 13,50);
        float amount = 300001.0F;
        float expResult = -1.0F;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testFindbonusMontoInferior() {
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.of(2020, 9, 10, 13,50);
        LocalDateTime endDate = LocalDateTime.of(2020, 9, 9, 13,50);
        float amount = 299999.0F;
        float expResult = -2.0F;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
    }
    
        @Test
    public void testFindbonusMontoInferiorMalo() {
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.of(2020, 9, 10, 13,50);
        LocalDateTime endDate = LocalDateTime.of(2020, 9, 9, 13,50);
        float amount = 299.0F;
        float expResult = -1.0F;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
    }
    

    @Test
    public void testBonusUnDia() {
        System.out.println("bonus");
        long moth = 0L;
        float amount = 300000.0F;
        float expResult = 0;
        float result = Aguinaldo.bonus(moth, amount);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testBonusUnDiaMalo() {
        System.out.println("bonus");
        long moth = 0L;
        float amount = 0;
        float expResult = 300000.0F;
        float result = Aguinaldo.bonus(moth, amount);
        assertEquals(expResult, result, 0);
    }
    
    ////////////////////////////////////////////////////////////////////////
        @Test
    public void testBonusUnMes() {
        System.out.println("bonus");
        long moth = 1L;
        float amount = 300000.0F;
        float expResult = 25000;
        float result = Aguinaldo.bonus(moth, amount);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testBonusUnMesMalo() {
        System.out.println("bonus");
        long moth = 1L;
        float amount = 0;
        float expResult = 300000.0F;
        float result = Aguinaldo.bonus(moth, amount);
        assertEquals(expResult, result, 0);
    }
    
    ////////////////////////////////////////////////////////////////////////
        @Test
    public void testBonusAYear() {
        System.out.println("bonus");
        long moth = 12L;
        float amount = 300000.0F;
        float expResult = 300000.0F;
        float result = Aguinaldo.bonus(moth, amount);
        assertEquals(expResult, result, 0);
    }
        @Test
     public void testBonusAYearMalo() {
        System.out.println("bonus");
        long moth = 12L;
        float amount = 20;
        float expResult = 500000.0F;
        float result = Aguinaldo.bonus(moth, amount);
        assertEquals(expResult, result, 0);
    }
    

    public void testBonusAYear13() {
        System.out.println("bonus");
        long moth = 13L;
        float amount = 300000;
        float expResult = -2;
        float result = Aguinaldo.bonus(moth, amount);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Aguinaldo.main(args);
    }
    
}
