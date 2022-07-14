package br.com.lestcode.caixaeletronico.services;

public class SelecionaComando {

    private final ListarComandos listarComandos;
    private final ObtemComando obtemComando;
    private final ExecutarComandoExpecifico executarComandoExpecifico;


    public SelecionaComando() {
        this.listarComandos = new ListarComandosImpl();
        this.obtemComando = new ObtemComandoImpl();
        this.executarComandoExpecifico = new ExecutarComandoExpecificoImpl();
    }

    public boolean executar() {
        listarComandos.execute();
        int comando = obtemComando.execute();
        return executarComandoExpecifico.execute(comando);
    }
}

