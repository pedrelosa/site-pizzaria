package br.com.fabricadapizzace.model;

public enum AbreviacaoLogradouro {
    CAPITAO("CAP"),
    CONSELHEIRO("CONS"),
    CORONEL("CEL"),
    DEPUTADO("DEP"),
    DESEMBARGADOR("DES"),
    ENGENHEIRO("ENG"),
    GENERAL("GAL"),
    GOVERNADOR("GOV"),
    MAJOR("MAJ"),
    MONSENHOR("MONS"),
    PROFESSOR("PROF");

    private String abreviacao;


    AbreviacaoLogradouro(String tipo) {
        this.abreviacao = tipo;
    }
}
