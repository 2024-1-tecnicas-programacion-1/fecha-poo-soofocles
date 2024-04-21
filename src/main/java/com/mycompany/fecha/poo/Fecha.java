package com.mycompany.fecha.poo;
import java.util.HashMap;
public class Fecha {
   
    private int dia;
    private int mes;
    private int annio;
   
    private final HashMap<Integer, String> meses;
        
    public Fecha(int dia, int mes, int annio){
        this.dia = dia;
        this.mes = mes;
        this.annio = annio;
        this.meses = new HashMap<>();
        meses.put(1, "enero");
        meses.put(2, "febrero");
        meses.put(3, "marzo");
        meses.put(4, "abril");
        meses.put(5, "mayo");
        meses.put(6, "junio");
        meses.put(7, "julio");
        meses.put(8, "agosto");
        meses.put(9, "septiembre");
        meses.put(10, "octubre");
        meses.put(11, "noviembre");
        meses.put(12, "diciembre");
 }

    public String fechaCorta() {
        return dia + "/" + mes + "/" + annio;
    }

    public boolean validarFecha() {
        boolean validacion = true; // Initialize as true by default
        boolean annioBisiesto = (annio % 4 == 0 && annio % 100 != 0) || (annio % 400 == 0);

        if (dia <= 0 || dia > 31) {
            validacion = false;
        } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            validacion = false;
        } else if (mes == 2) {
            validacion = (annioBisiesto && dia <= 29) || (!annioBisiesto && dia <= 28);
        }
        return validacion;
    }

    public String mesLetra() {
        return meses.get(mes);
    }

    public String fechaLarga() {
        return dia + " de " + meses.get(mes) + " de " + annio;
    }
}
