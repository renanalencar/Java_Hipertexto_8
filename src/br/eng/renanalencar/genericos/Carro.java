package br.eng.renanalencar.genericos;

/**
 * Classe que representa um objeto do tipo Carro
 * 
 * @author Renan Costa Alencar
 * @version 1.0
 */
public class Carro {
    private String placa;
    private String modelo;
    private String ano;
    private String proprietario;

    /**
     * Construtor com argumentos recebido para inicializar o objeto Carro
     * @param placa a placa
     * @param modelo o modelo
     * @param ano o ano
     * @param proprietario o proprietário
     */
    public Carro(String placa, String modelo, String ano, String proprietario) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.proprietario = proprietario;
    }

    /**
     * Getter para a placa
     * @return uma <code>String</code> da placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Setter para placa
     * @param placa a placa
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * Getter para modelo
     * @return uma <code>String</code> do modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Setter para modelo
     * @param modelo o modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Getter para ano
     * @return uma <code>String</code> do ano
     */
    public String getAno() {
        return ano;
    }

    /**
     * Setter para ano
     * @param ano o ano
     */
    public void setAno(String ano) {
        this.ano = ano;
    }

    /**
     * Getter para proprietario
     * @return uma <code>String</code> do proprietário
     */
    public String getProprietario() {
        return proprietario;
    }

    /**
     * Setter para proprietario
     * @param proprietario o proprietário
     */
    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }
    
}