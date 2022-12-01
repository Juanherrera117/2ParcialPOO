package ejecutable;

import javax.swing.JOptionPane;

import modelo.Cuenta;
import modelo.CuentaCorriente;


public class Test 
{
    public static void main(String[] args) 
    {
        //Entrada de datos
        double x = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un saldo: "));

        //Creacion de un objeto Suma
        CuentaCorriente miCuentaCorriente = new CuentaCorriente();
        miSuma.sumar();
        JOptionPane.showMessageDialog(null, "La suma de " + x + " y " + y + " es " + miSuma.mostrarResultado());   
    }
}
