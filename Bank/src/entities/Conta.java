package entities;

public class Conta {
    public String name;
    public double saldo;
    public boolean temSaldo;

    public Conta(String name, double saldo) {
        this.name = name;
        this.saldo = saldo;
        this.temSaldo = true;
    }

    public Conta(String name) {
        this.name = name;
        this.temSaldo = false;
    }

    public String toString() {
        if (temSaldo) {
            return "Nome: " + name
                    + String.format("%nSaldo: %.2f", saldo);
        }
        else {
            return "Nome: " + name;
        }
    }
}