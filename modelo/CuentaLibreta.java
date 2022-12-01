package modelo;

public class CuentaLibreta extends Cuenta
{
    double saldo;

    public CuentaLibreta(int cuenta)
    {
        super(cuenta);
    }       

    public void depositar(double cantidad)
    {
        saldo = saldo*0.8 + cantidad;
    }

    public void retirar(double cantidad)
    {
        saldo = saldo*0.2 - cantidad;
    }
}
