package unidad.poo.user.defined.exceptions;

class SaldoInsuficienteException extends Exception {
	
    public SaldoInsuficienteException(String mensaje) {
        super(mensaje);
    }
}

class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void retirar(double cantidad) throws SaldoInsuficienteException {
        if (cantidad > saldo) {
            throw new SaldoInsuficienteException("Fondos insuficientes. Saldo disponible: " + saldo);
        }
        saldo -= cantidad;
    }

    public double getSaldo() {
        return saldo;
    }
}


public class TestSaldoInsuficienteException {
	
	public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(100.0);

        try {
            cuenta.retirar(150.0);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Saldo final: " + cuenta.getSaldo());
    }
}
