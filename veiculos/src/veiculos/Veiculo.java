package veiculos;

enum Veiculo {
    JEEP_RENEGADE("Jeep Renegade", 5, "SUV", 385),
    ONIX("Onix", 4, "Hatch", 525),
    HB20("HB20", 4, "Hatch", 303),
    CIVIC("Civic", 4, "Sedan", 300);

    private String nome;
    private int numeroPortas;
    private String tipo;
    private int litrosPortaMalas;

    Veiculo(String nome, int numeroPortas, String tipo, int litrosPortaMalas) {
        this.nome = nome;
        this.numeroPortas = numeroPortas;
        this.tipo = tipo;
        this.litrosPortaMalas = litrosPortaMalas;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public String getTipo() {
        return tipo;
    }

    public int getLitrosPortaMalas() {
        return litrosPortaMalas;
    }
}
