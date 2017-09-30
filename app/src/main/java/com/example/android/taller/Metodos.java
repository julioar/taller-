package com.example.android.taller;

/**
 * Created by android on 30/09/2017.
 */

public class Metodos {

    public static boolean calcular_valor_diferente_cero_correcto(double num1){
        if(num1 != 0) return false;
        else  return true;
    }

    public static boolean calcular_valor_diferente_cero_incorrecto(double num1){
        if(num1 == 0) return false;
        else  return true;
    }
    public static boolean calcular_valor_diferente_cero_correcto2(double num3){
        if(num3 != 0) return false;
        else  return true;
    }
    public static boolean calcular_valor_diferente_cero_incorrecto2(double num3){
        if(num3 == 0) return false;
        else  return true;
    }
    public static double suma(double resultado, double resultado1){
        return resultado+resultado1;
    }

}
