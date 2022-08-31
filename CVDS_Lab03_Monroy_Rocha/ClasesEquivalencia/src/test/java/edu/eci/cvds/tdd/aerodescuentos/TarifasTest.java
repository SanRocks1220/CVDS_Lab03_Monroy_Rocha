package edu.eci.cvds.tdd.aerodescuentos;

import static org.junit.Assert.fail;
import org.junit.Assert;
import org.junit.Test;

public class TarifasTest {
    
    @Test
    public void validateNegBase() {
        double result = 0;
        double base = -15;
        int diasAntelación = 15;
        int edad = 50;

        result = CalculadorDescuentos.calculoTarifa(base, diasAntelación, edad);
        Assert.assertNotEquals(15, result, 0);
        Assert.assertFalse(base > 0);
    }

    @Test
    public void validateNegDias() {
        double result = 0;
        double base = 15;
        int diasAntelación = -15;
        int edad = 50;

        result = CalculadorDescuentos.calculoTarifa(base, diasAntelación, edad);
        Assert.assertEquals(15, result, 0);
        Assert.assertFalse(diasAntelación > 0);
    }

    @Test
    public void validateNegEdad() {
        double result = 0;
        double base = 15;
        int diasAntelación = 15;
        int edad = -50;

        result = CalculadorDescuentos.calculoTarifa(base, diasAntelación, edad);
        Assert.assertNotEquals(15, result, 0);
        Assert.assertFalse(edad > 0);
    }

    @Test
    public void validateSuperEdad() {
        double result = 0;
        double base = 15;
        int diasAntelación = 15;
        int edad = 5000;

        result = CalculadorDescuentos.calculoTarifa(base, diasAntelación, edad);
        Assert.assertEquals(13.8, result, 0);
        Assert.assertTrue(edad > 0);
    }
    
    /**
     * Tests en Frontera
     */
    @Test
    public void validateBaseLimite() {
        double result = 0;
        double base = 0;
        int diasAntelación = 15;
        int edad = 50;

        result = CalculadorDescuentos.calculoTarifa(base, diasAntelación, edad);
        Assert.assertEquals(0, result, 0);
        Assert.assertEquals(0, base, 0);

        base++;
        result = CalculadorDescuentos.calculoTarifa(base, diasAntelación, edad);
        Assert.assertEquals(1, result, 0);
        Assert.assertTrue(base > 0);
    }

    @Test
    public void validateDiasLimite() {
        double result = 0;
        double base = 15;
        int diasAntelación = 20;
        int edad = 50;

        result = CalculadorDescuentos.calculoTarifa(base, diasAntelación, edad);
        Assert.assertEquals(15, result, 0);
        Assert.assertEquals(20, diasAntelación, 0);

        diasAntelación++;
        result = CalculadorDescuentos.calculoTarifa(base, diasAntelación, edad);
        Assert.assertEquals(12.75, result, 0);
        Assert.assertTrue(diasAntelación > 20);
    }

    @Test
    public void validateEdadLimite() {
        double result = 0;
        double base = 15;
        int diasAntelación = 15;
        int edad = 17;

        result = CalculadorDescuentos.calculoTarifa(base, diasAntelación, edad);
        Assert.assertEquals(14.25, result, 0);
        Assert.assertTrue(edad < 18);

        edad++;
        result = CalculadorDescuentos.calculoTarifa(base, diasAntelación, edad);
        Assert.assertEquals(15, result, 0);
        Assert.assertEquals(18, edad);

        edad = 65;
        result = CalculadorDescuentos.calculoTarifa(base, diasAntelación, edad);
        Assert.assertEquals(15, result, 0);
        Assert.assertEquals(65, edad);

        edad++;
        result = CalculadorDescuentos.calculoTarifa(base, diasAntelación, edad);
        Assert.assertEquals(13.8, result, 0);
        Assert.assertTrue(edad > 65);
    }
}
