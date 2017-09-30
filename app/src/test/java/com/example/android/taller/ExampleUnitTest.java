package com.example.android.taller;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void division_entre_cero_correcta(){
        assertFalse(Metodos.calcular_valor_diferente_cero_incorrecto(0));
    }

    @Test
    public void division_entre_cero_incorrecta(){
        assertFalse(Metodos.calcular_valor_diferente_cero_incorrecto(0));
    }
    @Test
    public void division_entre_cero_correcta2(){
        assertFalse(Metodos.calcular_valor_diferente_cero_incorrecto(0));
    }

    @Test
    public void division_entre_cero_incorrecta2(){
        assertFalse(Metodos.calcular_valor_diferente_cero_incorrecto(0));
    }
    @Test
    public void suma_de_numero_correctamente(){
        assertEquals(5,Metodos.suma(3,2),0);
    }
    @Test
    public void suma_de_numero_incorrectamente(){
        assertNotEquals(4,Metodos.suma(3,2),0);
    }

}