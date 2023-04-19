/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisador;

import javax.swing.JTextArea;
import java.awt.TextArea;
import java.io.StringReader;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Felyp
 */
public class Interface extends javax.swing.JFrame {

    public JTextArea jText;

    public void execultar()throws Exception{

        int cont = 0;

        jText = textArea1; //recebe o que foi digitado
        String expr;
        //jText = textArea1;
        expr = (String)jText.getText();
        Lexer lexer = new Lexer(new StringReader(expr));

        String resultado = "";

        while (true) {
            Token token = lexer.yylex();
            if (token == null) {

                textArea.setText(resultado);

                return;

            }

            switch (token) {

                case PALAVRA:

                    resultado = resultado + "Linha" + cont + "<Palavra_Reservada>" + lexer.lexeme + "\n";
                    break;

                case OPERADOR_ARITMETICO:

                    resultado = resultado + "Linha" + cont + "<Operador_Aritmético>" + lexer.lexeme + "\n";
                    break;

                case OPERADOR_LOGICO:

                    resultado = resultado + "Linha" + cont + "<Operador_Lógico>" + lexer.lexeme + "\n";
                    break;

                case OP_ATRIBUICAO:

                    resultado = resultado + "Linha" + cont + "<Operador_Atribuição>" + lexer.lexeme + "\n";
                    break;

                case OP_BOOLEANO:

                    resultado = resultado + "Linha" + cont + "<Operador_Booleano>" + lexer.lexeme + "\n";
                    break;

                case OP_RELACIONAL:

                    resultado = resultado + "Linha" + cont + "<Operador_Relacional>" + lexer.lexeme + "\n";
                    break;

                case SEPARADOR:

                    resultado = resultado + "Linha" + cont + "<Separador>" + lexer.lexeme + "\n";
                    break;

                case ESPECIAL:

                    resultado = resultado + "Linha" + cont + "<Caracter_Especial>" + lexer.lexeme + "\n";
                    break;

                case COMENTARIO:

                    resultado = resultado + "Linha" + cont + "<Comentário>" + lexer.lexeme + "\n";
                    break;

                case LINHA:

                    cont++;
                    break;

                case ERROR:

                    resultado = resultado + "Linha" + cont + ": Simbolo não reconhecido \n";
                    break;

                case ID:

                    resultado = resultado + "Linha" + cont + "<ID>" + lexer.lexeme + "\n";
                    break;

                case NUMERO:

                    resultado = resultado + "Linha" + cont + "<Número>" + lexer.lexeme + "\n";
                    break;

                case INICIO:

                    resultado = resultado + "Linha" + cont + "<Incio_algoritmo>" + lexer.lexeme + "\n";
                    break;

                case FIM:

                    resultado = resultado + "Linha" + cont + "<Fim_algoritmo>" + lexer.lexeme + "\n";
                    break;

                case MARCADOR_INICIO:

                    resultado = resultado + "Linha" + cont + "<Incio_bloco>" + lexer.lexeme + "\n";
                    break;

                case MARCADOR_FIM:

                    resultado = resultado + "Linha" + cont + "<Fim_bloco>" + lexer.lexeme + "\n";
                    break;

                case BIBLIOTECA:

                    resultado = resultado + "Linha" + cont + "<Biblioteca>" + lexer.lexeme + "\n";
                    break;

                case ESCREVA:

                    resultado = resultado + "Linha" + cont + "<Escreva>" + lexer.lexeme + "\n";
                    break;

                case LEIA:

                    resultado = resultado + "Linha" + cont + "<Leia>" + lexer.lexeme + "\n";
                    break;

                case PORTA:

                    resultado = resultado + "Linha" + cont + "<Porta>" + lexer.lexeme + "\n";
                    break;

                case CONFIG:

                    resultado = resultado + "Linha" + cont + "<Configuração>" + lexer.lexeme + "\n";
                    break;

                case SECRETA:

                    resultado = resultado + "Linha" + cont + "<Senha secreta>" + lexer.lexeme + "\n";
                    break;

                case CONSOLE:

                    resultado = resultado + "Linha" + cont + "<Senha Console>" + lexer.lexeme + "\n";
                    break;

                case INTERFACE:

                    resultado = resultado + "Linha" + cont + "< Config interface>" + lexer.lexeme + "\n";
                    break;

                case IP:

                    resultado = resultado + "Linha" + cont + "<Config IP>" + lexer.lexeme + "\n";
                    break;

                case GATEWAY_PADRAO:

                    resultado = resultado + "Linha" + cont + "<Gateway padrao>" + lexer.lexeme + "\n";
                    break;

                default:

                    resultado = resultado + "Linha" + cont + "<" + lexer.lexeme + ">" + cont++;
                    break;
            }

        }

    }

    public Interface() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAnalisar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        lb_entrada = new javax.swing.JLabel();
        lb_analiseLexica = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAnalisar.setText("Analisar");
        btnAnalisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalisarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        lb_entrada.setText("Entrada");

        lb_analiseLexica.setText("Análise Léxica");

        textArea1.setColumns(20);
        textArea1.setRows(5);
        jScrollPane1.setViewportView(textArea1);

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane3.setViewportView(textArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lb_entrada)
                        .addGap(81, 81, 81)
                        .addComponent(btnAnalisar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpar)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(lb_analiseLexica)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_analiseLexica)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnalisar)
                    .addComponent(btnLimpar)
                    .addComponent(lb_entrada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnalisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalisarActionPerformed
        try {
            execultar();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_btnAnalisarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        
        textArea.setText("");
        textArea1.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalisar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lb_analiseLexica;
    private javax.swing.JLabel lb_entrada;
    private javax.swing.JTextArea textArea;
    private javax.swing.JTextArea textArea1;
    // End of variables declaration//GEN-END:variables
}
