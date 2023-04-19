/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisador;

import java.io.File;
/**
 *
 * @author Felyp
 */
public class Main {
    //metodo para criar a nova classe para fazer a analise lexica
public static void geraLexer(String path){
    File arquivo = new File(path); //abre o arquivo "Lexer.flex"
    jflex.Main.generate(arquivo); //gera a classe "Lexer.java"
    
}
    
    public static void main(String[] args){
        //localiza o arquivo ""
        String path = "C:/Users/Felyp/Documents/NetBeansProjects/Analisador/src/analisador/Lexer.flex";
        
        //chamada do metodo "geraLexer"
        geraLexer(path);
    }
}
