/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * jfCategorias.java
 *
 * Created on 02/04/2009, 19:40:21
 */

package br.edu.fatecriopreto.loja.view;

import javax.swing.JOptionPane;
import br.edu.fatecriopreto.loja.model.PessoaFisica;
import br.edu.fatecriopreto.loja.model.PessoaJuridica;

/**
 *
 * @author Diretor
 */
public class jifFormasPagamento extends javax.swing.JInternalFrame {
    PessoaFisica objPf;
    PessoaJuridica objPj;
    /** Creates new form jfCategorias */
    public jifFormasPagamento() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTipoPessoa = new javax.swing.ButtonGroup();
        jlCodigo = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jlNome = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jbConsultar = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        jbNovo = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro de Categorias");
        getContentPane().setLayout(null);

        jlCodigo.setFont(new java.awt.Font("Book Antiqua", 3, 14));
        jlCodigo.setText("Código:");
        getContentPane().add(jlCodigo);
        jlCodigo.setBounds(60, 40, 70, 17);

        jtCodigo.setEditable(false);
        jtCodigo.setForeground(new java.awt.Color(0, 0, 204));
        jtCodigo.setToolTipText("Digite o código");
        getContentPane().add(jtCodigo);
        jtCodigo.setBounds(140, 40, 50, 20);

        jlNome.setFont(new java.awt.Font("Book Antiqua", 3, 14));
        jlNome.setText("Descrição");
        getContentPane().add(jlNome);
        jlNome.setBounds(60, 70, 70, 17);

        jtNome.setEditable(false);
        jtNome.setForeground(new java.awt.Color(0, 0, 204));
        jtNome.setToolTipText("Digite o nome");
        getContentPane().add(jtNome);
        jtNome.setBounds(140, 70, 240, 20);

        jbConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/server_lightning.png"))); // NOI18N
        jbConsultar.setText("Consultar");
        jbConsultar.setEnabled(false);
        getContentPane().add(jbConsultar);
        jbConsultar.setBounds(290, 150, 120, 23);

        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/accept.png"))); // NOI18N
        jbSalvar.setText("Salvar");
        jbSalvar.setEnabled(false);
        jbSalvar.setMaximumSize(new java.awt.Dimension(75, 23));
        jbSalvar.setMinimumSize(new java.awt.Dimension(75, 23));
        jbSalvar.setPreferredSize(new java.awt.Dimension(75, 23));
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jbSalvar);
        jbSalvar.setBounds(50, 120, 120, 23);

        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/cancel.png"))); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.setEnabled(false);
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jbCancelar);
        jbCancelar.setBounds(170, 120, 120, 23);

        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/delete.png"))); // NOI18N
        jbExcluir.setText("Excluir");
        jbExcluir.setEnabled(false);
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jbExcluir);
        jbExcluir.setBounds(290, 120, 120, 23);

        jbAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/cog_edit.png"))); // NOI18N
        jbAlterar.setText("Alterar");
        jbAlterar.setEnabled(false);
        getContentPane().add(jbAlterar);
        jbAlterar.setBounds(170, 150, 120, 23);

        jbSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/page_go.png"))); // NOI18N
        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });
        getContentPane().add(jbSair);
        jbSair.setBounds(410, 150, 110, 23);

        jbNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/add.png"))); // NOI18N
        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });
        getContentPane().add(jbNovo);
        jbNovo.setBounds(50, 150, 120, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        if(validar_campos()){
            limpar_campos();
            desabilitar_campos();
            jbNovo.setEnabled(true);
            jbSalvar.setEnabled(false);
            jbCancelar.setEnabled(false);
            JOptionPane.showMessageDialog(this,
                    "Registro Salvo com Sucesso!",
                    "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        limpar_campos();
        desabilitar_campos();
        jbSalvar.setEnabled(false);
        jbCancelar.setEnabled(false);
        jbNovo.setEnabled(true);// TODO add your handling code here:
}//GEN-LAST:event_jbCancelarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jbExcluirActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        dispose();
}//GEN-LAST:event_jbSairActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        habilitar_campos();
        jbSalvar.setEnabled(true);
        jbCancelar.setEnabled(true);
        jbNovo.setEnabled(false);
}//GEN-LAST:event_jbNovoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgTipoPessoa;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbConsultar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSair;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlNome;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtNome;
    // End of variables declaration//GEN-END:variables

        public void limpar_campos()
    {

        jtCodigo.setText("");

        jtNome.setText("");
    }

    public void desabilitar_campos()
    {
      jtCodigo.setEditable(false);
      jtNome.setEditable(false);


    }

    public void habilitar_campos()
    {
      jtCodigo.setEditable(true);
      jtNome.setEditable(true);
      jbSalvar.setEnabled(true);
      jbCancelar.setEnabled(true);
      jbNovo.setEnabled(false);


    }

    public boolean validar_campos(){
        if(jtCodigo.getText().equals("")){
            JOptionPane.showMessageDialog(this,
                    "Digite o campo código",
                    "Validação", JOptionPane.ERROR_MESSAGE);
            jtCodigo.requestFocus();
            return false;
        }
        if(jtNome.getText().equals("")){
            JOptionPane.showMessageDialog(this,
                    "Digite o campo nome",
                    "Validação", JOptionPane.ERROR_MESSAGE);
            jtNome.requestFocus();
            return false;
        }
 
        
        return true;
    }
    public boolean preencher_objeto(){
      
            try{
                objPf = new PessoaFisica();
                objPf.setCodigo(Integer.parseInt(jtCodigo.getText()));
                objPf.setNome(jtNome.getText());
               
                return true;
            }
            catch(Exception ERRO){
                JOptionPane.showMessageDialog(this, "Ocorreu um erro" +
                        ERRO.getMessage(),
                        "Preencher objeto",2);
                return false;
            }
        
    }
}