package br.eng.renanalencar.genericos;

import java.util.ArrayList;

/**
 * Um dicionário implementado com ArrayLists
 * 
 * @author Renan Costa Alencar
 * @version 1.0
 */
public class Dicionario<K, V> {
    
    private ArrayList<K> chaves;
    private ArrayList<V> valores;

    /**
     * Construtor sem argumentos do Dicionario que inicializa o ArrayLists para chaves e valores
     */
    public Dicionario() {
        chaves = new ArrayList<>();
        valores = new ArrayList<>();
    }

    /**
     * Adiciona o par chave-valor para o Dicionario
     * @param chave a chave
     * @param valor o valor
     */
    public void adiciona(K chave, V valor) {
        this.chaves.add(chave);
        this.valores.add(valor);
    }

    /**
     * Retorna o valor encontrado de acordo com a chave passada como arugmento.
     * @param chave
     * @return um valor do tipo <code>Object</code>
     */
    public V retorna(K chave) {
        V temp = null;
        int indice = chaves.indexOf(chave);
        temp = valores.get(indice);
        return temp; 
    }

    
}