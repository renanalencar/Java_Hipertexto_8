package br.eng.renanalencar.genericos;

/**
 * Classe para executar o funcionamento das classes Carro.java e Dicionario.java
 * 
 * @see Carro
 * @see Dicionario
 * @author Renan Costa Alencar
 * @version 1.0
 */
public class Cadastro {
    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        
        Dicionario<String, Carro> dicionario = new Dicionario<>();

        Carro carro = new Carro("KKN2368", "GOL", "2013", "Paulo Roberto Vieira");

        dicionario.adiciona(carro.getPlaca(), carro);

        if (dicionario.retorna(carro.getPlaca()) != null) {
            System.out.println("Carro está no dicionário.");
        } else {
            System.out.println("Carro não existe.");
        }

    }
}
