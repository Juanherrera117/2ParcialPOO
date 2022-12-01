package modelo;

public class CuentaCorriente extends Cuenta 
{
    double saldo;

    public CuentaCorriente(int cuenta)
    {
        super(cuenta);
    } 

    public void depositar(double cantidad)
    {
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad)
    {
        saldo = saldo - cantidad;
    }
}
