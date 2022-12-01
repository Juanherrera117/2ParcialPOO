package modelo;

public class CuentaAhorro extends Cuenta 
{
    double saldo;

    public CuentaAhorro(int cuenta)
    {
        super(cuenta);
    }
    
    public void depositar(double cantidad)
    {
        saldo =  saldo*0.4 + cantidad;
    }

    public void retirar(double cantidad)
    {
        saldo = saldo - cantidad;
    }
}
