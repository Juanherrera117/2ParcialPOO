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
        saldo =  saldo + cantidad;
    }

    public void retirar(double cantidad)
    {
        saldo = saldo - cantidad;
    }
}
