package charada;

public enum letra {
    B(25),
    E(26),
    I(27);

    private int valor;

    private letra(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
