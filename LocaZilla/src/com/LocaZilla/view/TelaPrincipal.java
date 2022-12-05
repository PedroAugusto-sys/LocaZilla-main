/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.LocaZilla.view;

import com.LocaZilla.control.marca.MarcaControle;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.MenuElement;
import javax.swing.plaf.basic.BasicMenuBarUI;
import java.awt.Dimension;

/**
 *
 * @author aluno
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        
        
        
        
        
        initComponents();
        
        MarcaControle conferirBanco = new MarcaControle();
        conferirBanco.conferirBancoDeIDMarca();
        conferirBanco.conferirBancoDeDados();
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        customizeMenuBar(jMenuBarLocazilla);
        //jLabelBackgroundTelaPrincipal.setBackground(Color.BLACK);;
        //jLabelBackgroundTelaPrincipal.setOpaque(true);
        //add(jLabelBackgroundTelaPrincipal);
        
    }
   

     ImageIcon img = new ImageIcon("./src/com/LocaZilla/imagens/operador/LocaMini.png");

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelBackgroundTelaPrincipal = new javax.swing.JLabel();
        jMenuBarLocazilla = new javax.swing.JMenuBar();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuCadastrosClientes = new javax.swing.JMenuItem();
        jMenuItemCadastrosMarcas = new javax.swing.JMenuItem();
        jMenuItemCadastrosModelo = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuConsultas = new javax.swing.JMenu();
        jMenuControle = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuOutros = new javax.swing.JMenu();
        jMenuItemLogOff = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LocaZilla");
        setBackground(new java.awt.Color(51, 51, 51));
        setIconImage(img.getImage());
        setPreferredSize(new java.awt.Dimension(1280, 1024));

        jLabelBackgroundTelaPrincipal.setForeground(new java.awt.Color(51, 51, 51));
        jLabelBackgroundTelaPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBackgroundTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/LocaZilla/imagens/operador/LogoFullSemFundo.png"))); // NOI18N
        jLabelBackgroundTelaPrincipal.setMaximumSize(new java.awt.Dimension(1280, 1024));
        jLabelBackgroundTelaPrincipal.setMinimumSize(new java.awt.Dimension(1280, 1024));

        jMenuBarLocazilla.setToolTipText("");

        jMenuCadastros.setText("Cadastros");

        jMenuCadastrosClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuCadastrosClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/LocaZilla/imagens/operador/ClienteCadastro.png"))); // NOI18N
        jMenuCadastrosClientes.setText("Clientes");
        jMenuCadastrosClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastrosClientesActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuCadastrosClientes);

        jMenuItemCadastrosMarcas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemCadastrosMarcas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/LocaZilla/imagens/operador/cadastroMarcas.png"))); // NOI18N
        jMenuItemCadastrosMarcas.setText("Marcas");
        jMenuItemCadastrosMarcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrosMarcasActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadastrosMarcas);

        jMenuItemCadastrosModelo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemCadastrosModelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/LocaZilla/imagens/operador/modeloicon.png"))); // NOI18N
        jMenuItemCadastrosModelo.setText("Modelo");
        jMenuItemCadastrosModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrosModeloActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadastrosModelo);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Veículo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setText("Motorista");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItem3);

        jMenuBarLocazilla.add(jMenuCadastros);

        jMenuConsultas.setText("Consultas");
        jMenuBarLocazilla.add(jMenuConsultas);

        jMenuControle.setText("Controle");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem4.setText("Locação");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenuControle.add(jMenuItem4);

        jMenuBarLocazilla.add(jMenuControle);

        jMenuOutros.setText("Outros");

        jMenuItemLogOff.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItemLogOff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/LocaZilla/imagens/funcoes/LogOff.png"))); // NOI18N
        jMenuItemLogOff.setText("Log OFF(ESC)");
        jMenuItemLogOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLogOffActionPerformed(evt);
            }
        });
        jMenuOutros.add(jMenuItemLogOff);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ADD, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/LocaZilla/imagens/operador/OperadorCadastro.png"))); // NOI18N
        jMenuItem1.setText("Cadastrar Operador");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuOutros.add(jMenuItem1);

        jMenuBarLocazilla.add(jMenuOutros);

        jMenuAjuda.setText("Ajuda");
        jMenuBarLocazilla.add(jMenuAjuda);

        setJMenuBar(jMenuBarLocazilla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelBackgroundTelaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1336, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelBackgroundTelaPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 555, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //COLORIR BARRA DE MENU
    Color azulSistema = new Color(255, 204, 102, 255);
    
    //[255,204,102]
    
    static void displayJFrame()
  {
    // create our jframe as usual
    JFrame jframe = new JFrame("JFrame Background Color");
    //jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    jframe.setBackground(Color.red);

    // set the jframe size and location, and make it visible
    jframe.setPreferredSize(new Dimension(400, 300));
    jframe.pack();
    jframe.setLocationRelativeTo(null);
    jframe.setVisible(true);
  }
    
    
    private void customizeMenuBar(JMenuBar menuBar) {

        menuBar.setUI(new BasicMenuBarUI() {

            @Override
            public void paint(Graphics g, JComponent c) {
                g.setColor(azulSistema);
                g.fillRect(0, 0, c.getWidth(), c.getHeight());
            }

        });

        MenuElement[] menus = menuBar.getSubElements();

        for (MenuElement menuElement : menus) {

            JMenu menu = (JMenu) menuElement.getComponent();
            changeComponentColors(menu);
            menu.setOpaque(true);

            MenuElement[] menuElements = menu.getSubElements();

            for (MenuElement popupMenuElement : menuElements) {

                JPopupMenu popupMenu = (JPopupMenu) popupMenuElement.getComponent();
                popupMenu.setBorder(null);

                MenuElement[] menuItens = popupMenuElement.getSubElements();

                for (MenuElement menuItemElement : menuItens) {

                    JMenuItem menuItem = (JMenuItem) menuItemElement.getComponent();
                    changeComponentColors(menuItem);
                    menuItem.setOpaque(true);

                }
            }
        }
    }

    private void changeComponentColors(Component comp) {
        comp.setBackground(azulSistema);
        comp.setForeground(Color.black);
    }

    
    
    
    
    
    private void jMenuCadastrosClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastrosClientesActionPerformed
        // TODO add your handling code here:
        TelaCliente telaCliente = new TelaCliente();
        telaCliente.setVisible(true);
    }//GEN-LAST:event_jMenuCadastrosClientesActionPerformed

    private void jMenuItemCadastrosMarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrosMarcasActionPerformed
        // TODO add your handling code here:
        TelaDasMarcas telaCadastroMarcas = new TelaDasMarcas();
        telaCadastroMarcas.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemCadastrosMarcasActionPerformed

    private void jMenuItemLogOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLogOffActionPerformed
        // TODO add your handling code here:
        super.dispose();
        
       TelaInicialOperador telaoperador = new TelaInicialOperador();
       telaoperador.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemLogOffActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        TelaCadastroOperador telaCadastroOperador = new TelaCadastroOperador();
        telaCadastroOperador.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItemCadastrosModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrosModeloActionPerformed
        // TODO add your handling code here:
        
        TelaCadastroModelo telacadastro = new TelaCadastroModelo();
        telacadastro.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemCadastrosModeloActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        TelaVeiculo telaVeiculo = new TelaVeiculo();
        telaVeiculo.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here
        TelaMotorista telaMotorista = new TelaMotorista();
        telaMotorista.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        TelaLocacao telaLocacao = new TelaLocacao();
        telaLocacao.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelBackgroundTelaPrincipal;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuBar jMenuBarLocazilla;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenuItem jMenuCadastrosClientes;
    private javax.swing.JMenu jMenuConsultas;
    private javax.swing.JMenu jMenuControle;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItemCadastrosMarcas;
    private javax.swing.JMenuItem jMenuItemCadastrosModelo;
    private javax.swing.JMenuItem jMenuItemLogOff;
    private javax.swing.JMenu jMenuOutros;
    // End of variables declaration//GEN-END:variables
}
