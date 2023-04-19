/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisador;

/**
 *
 * @author Felyp
 */
public enum Token {
    PALAVRA, OPERDOR_ARITIMETICO, OPERADOR_LOGICO, OP_ATRIBUICAO, OP_BOOLEANO, OP_RELACIONAL ,SEPARADOR,
    ESPECIAL, COMENTARIO, ID, NUMERO, ERROR, MARCADOR_INICIO, MARCADOR_FIM, CONFIG, INTERFACE, BIBLIOTECA,
    INICIO, FIM, ESCREVA, LEIA, PORTA, SECRETA, CONSOLE, IP, GATEWAY_PADRAO, EXIBIR_INTERFACE, EXIBIR_MAC,
    EXIBIR_VLAN, EXIBIR_RAM, EXIBIR_NVRAM, EXIBIR_FLASH, COPIA_RAM_NVRAM, LINHA, 
}
