/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * jifUsuario.java
 *
 * Created on 14/06/2011, 12:17:46
 */

package br.edu.fatecriopreto.loja.view;

import br.edu.fatecriopreto.loja.model.AcessarSistema;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luciene
 */
public class jifUsuario extends javax.swing.JInternalFrame {
    AcessarSistema objUsuario;
    int acao=0;
    /** Creates new form jifUsuario */
    public jifUsuario() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jlUsuario = new javax.swing.JLabel();
        jtUsuario = new javax.swing.JTextField();
        jlTipo = new javax.swing.JLabel();
        jtSenha = new javax.swing.JTextField();
        jcTipo = new javax.swing.JComboBox();
        jlSenha = new javax.swing.JLabel();
        jbCancelar = new javax.swing.JButton();
        jbNovo = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbPesquisar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbListar = new javax.swing.JButton();
        jtPesquisa = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbPesquisa = new javax.swing.JTable();
        jrUsuario = new javax.swing.JRadioButton();
        jrTipo = new javax.swing.JRadioButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro de Usuários");
        getContentPane().setLayout(null);

        jlUsuario.setText("Usuário");
        getContentPane().add(jlUsuario);
        jlUsuario.setBounds(40, 40, 60, 14);
        getContentPane().add(jtUsuario);
        jtUsuario.setBounds(110, 40, 100, 20);

        jlTipo.setText("Tipo");
        getContentPane().add(jlTipo);
        jlTipo.setBounds(40, 110, 60, 14);
        getContentPane().add(jtSenha);
        jtSenha.setBounds(110, 70, 100, 20);

        jcTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Comum", "Administrador" }));
        getContentPane().add(jcTipo);
        jcTipo.setBounds(110, 110, 100, 20);

        jlSenha.setText("Senha");
        getContentPane().add(jlSenha);
        jlSenha.setBounds(40, 70, 60, 14);

        jbCancelar.setText("Cancelar");
        getContentPane().add(jbCancelar);
        jbCancelar.setBounds(180, 140, 80, 23);

        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });
        getContentPane().add(jbNovo);
        jbNovo.setBounds(20, 140, 80, 23);

        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jbSalvar);
        jbSalvar.setBounds(100, 140, 80, 23);

        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jbExcluir);
        jbExcluir.setBounds(180, 170, 80, 23);

        jbPesquisar.setText("Pesquisar");
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(jbPesquisar);
        jbPesquisar.setBounds(20, 170, 79, 23);

        jbEditar.setText("Editar");
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });
        getContentPane().add(jbEditar);
        jbEditar.setBounds(100, 170, 80, 23);

        jbListar.setText("Listar");
        jbListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbListarActionPerformed(evt);
            }
        });
        getContentPane().add(jbListar);
        jbListar.setBounds(260, 170, 120, 23);

        jtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPesquisaKeyReleased(evt);
            }
        });
        getContentPane().add(jtPesquisa);
        jtPesquisa.setBounds(10, 220, 370, 20);

        jtbPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuário", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtbPesquisa);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 282, 370, 140);

        buttonGroup1.add(jrUsuario);
        jrUsuario.setText("Usuário");
        jrUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jrUsuario);
        jrUsuario.setBounds(10, 250, 61, 23);

        buttonGroup1.add(jrTipo);
        jrTipo.setText("Tipo");
        jrTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrTipoActionPerformed(evt);
            }
        });
        getContentPane().add(jrTipo);
        jrTipo.setBounds(150, 250, 45, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        try{
        if(validarCampos()){
            if(preencherObjeto()){
                UsuarioDAO DAO = new UsuarioDAO();
                if(acao==1){
                    if(DAO.Inclui(objUsuario)){
                        limparCampos();
                        JOptionPane.showMessageDialog(null, "Salvo com sucesso", 
                                "Salvar", JOptionPane.INFORMATION_MESSAGE);
                        jbSalvar.setEnabled(false);
                        jbCancelar.setEnabled(false);
                        jbNovo.setEnabled(true);
                    }   else {
                        JOptionPane.showMessageDialog(null, "Não foi possível salvar o registro", 
                                "Salvar", JOptionPane.INFORMATION_MESSAGE);
                    } }
                if(acao==2){
                    if(DAO.Editar(objUsuario)){
                        limparCampos();
                        JOptionPane.showMessageDialog(null, "Alterado com sucesso", 
                                "Salvar", JOptionPane.INFORMATION_MESSAGE);
                        jbSalvar.setEnabled(false);
                        jbCancelar.setEnabled(false);
                        jbNovo.setEnabled(true);
                    }   else {
                        JOptionPane.showMessageDialog(null, "Não foi possível salvar o registro", 
                                "Salvar", JOptionPane.INFORMATION_MESSAGE);
                    }
                 }
            }    
            }        
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro:"+
                    erro.getMessage(), "Salvar", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
       try{
        if(jtUsuario.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Digite o nome do usuário", 
                    "Pesquisar", JOptionPane.INFORMATION_MESSAGE);
            jtUsuario.requestFocus();
        } else {
            UsuarioDAO DAO = new UsuarioDAO();
            objUsuario = DAO.Pesquisar(jtUsuario.getText());
            if(objUsuario==null){
                JOptionPane.showMessageDialog(null, "Usuário não encontrado", 
                        "Pesquisar", JOptionPane.INFORMATION_MESSAGE);
            } else {
                jtSenha.setText(objUsuario.getSenha());
                jcTipo.setSelectedIndex(objUsuario.getTipo());
                jbExcluir.setEnabled(true);
                jbEditar.setEnabled(true);
            }
        }   }catch(Exception erro){
           JOptionPane.showMessageDialog(null, "Ocorreu um erro:"+
                   erro.getMessage());        }
    }//GEN-LAST:event_jbPesquisarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        try{
        if(jtUsuario.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Digite o nome do usuário", 
                    "Excluir", JOptionPane.INFORMATION_MESSAGE);
        } else {
            UsuarioDAO DAO = new UsuarioDAO();
            if(DAO.Excluir(jtUsuario.getText())){
                JOptionPane.showMessageDialog(this, "Usuário apagado com sucesso!");
                limparCampos();
                jbExcluir.setEnabled(false);
                jbEditar.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(this, "Não foi possível excluir o registro");
            }
        }
        }catch(Exception erro){
           JOptionPane.showMessageDialog(null, "Ocorreu um erro:"+
                   erro.getMessage());        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        acao=2;
        jtUsuario.setEditable(false);
        jtSenha.setEditable(true);
        jcTipo.setEnabled(true);
        jbSalvar.setEnabled(true);
        jbCancelar.setEnabled(true);
        jbNovo.setEnabled(false);
        jbPesquisar.setEnabled(false);
        jbEditar.setEnabled(false);
        jbExcluir.setEnabled(false);
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        acao=1;
        
        
        
        
        
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListarActionPerformed
        try{
            UsuarioDAO DAO = new UsuarioDAO();
            Vector cabecalho = new Vector();
            cabecalho.add("Usuário");
            cabecalho.add("Tipo");
            jtbPesquisa.setModel(new DefaultTableModel(DAO.listar(), cabecalho));
    }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " +
                    erro.getMessage());
    }//GEN-LAST:event_jbListarActionPerformed

    private void jtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPesquisaKeyReleased
        try{
        UsuarioDAO DAO = new UsuarioDAO();
        Vector cabecalho = new Vector();
        cabecalho.add("Usuário");
        cabecalho.add("Tipo");
        jtbPesquisa.setModel(new DefaultTableModel(DAO.listar(jtPesquisa.getText())
                , cabecalho));
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " +
                    erro.getMessage());
        }
    }//GEN-LAST:event_jtPesquisaKeyReleased

    private void jrUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrUsuarioActionPerformed
 try{
        UsuarioDAO DAO = new UsuarioDAO();
        Vector cabecalho = new Vector();
        cabecalho.add("Usuário");
        cabecalho.add("Tipo");
        jtbPesquisa.setModel(new DefaultTableModel(DAO.listarOrdenadoporUsuario(jtPesquisa.getText())
                , cabecalho));
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " +
                    erro.getMessage());
        }
 // TODO add your handling code here:
    }//GEN-LAST:event_jrUsuarioActionPerformed

    private void jrTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrTipoActionPerformed
 try{
        UsuarioDAO DAO = new UsuarioDAO();
        Vector cabecalho = new Vector();
        cabecalho.add("Usuário");
        cabecalho.add("Tipo");
        jtbPesquisa.setModel(new DefaultTableModel(DAO.listarOrdenadoporTipo(jtPesquisa.getText())
                , cabecalho));
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " +
                    erro.getMessage());
        }
 // TODO add your handling code here:
    }//GEN-LAST:event_jrTipoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbListar;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox jcTipo;
    private javax.swing.JLabel jlSenha;
    private javax.swing.JLabel jlTipo;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JRadioButton jrTipo;
    private javax.swing.JRadioButton jrUsuario;
    private javax.swing.JTextField jtPesquisa;
    private javax.swing.JTextField jtSenha;
    private javax.swing.JTextField jtUsuario;
    private javax.swing.JTable jtbPesquisa;
    // End of variables declaration//GEN-END:variables
    private boolean preencherObjeto() throws Exception {
        objUsuario = new AcessarSistema();
        objUsuario.setLogin(jtUsuario.getText());
        objUsuario.setSenha(jtSenha.getText());
        objUsuario.setTipo(jcTipo.getSelectedIndex());
        return true;
    }
}