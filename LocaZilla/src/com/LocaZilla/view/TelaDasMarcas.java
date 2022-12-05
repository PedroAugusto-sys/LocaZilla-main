/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.LocaZilla.view;


import com.LocaZilla.view.TelaDasMarcas;
import com.LocaZilla.control.marca.MarcaControle;
import com.LocaZilla.DAO.marca.MarcaDAO;
import com.LocaZilla.control.marca.IMarcaControle;
import javax.swing.JOptionPane;
import com.LocaZilla.model.marca.Marca;
import com.LocaZilla.control.marca.MarcaControle;
import java.awt.Event;
import java.awt.event.KeyEvent;
import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import java.nio.file.StandardCopyOption;


/**
 *
 * @author ejmcc
 */
public class TelaDasMarcas extends javax.swing.JFrame {
    //Atributos 
    
    IMarcaControle marcaControle = new MarcaControle();
    /**
     * Creates new form TelaDasMarcas
     */
    public TelaDasMarcas() {
        
        
        //Apontador
        MarcaControle conferirBanco = new MarcaControle();
        
        //Chama as instancias do MARCADAO
        conferirBanco.conferirBancoDeDados();
        conferirBanco.conferirBancoDeIDMarca();
        
        //Inicia os componentes da tela
        initComponents();
        jTextFieldIdentificador.setEnabled(false);
        jTextFieldUrl.setEnabled(false);
        this.setLocationRelativeTo(null);
        
        //Imprime os dados da GRID
        try {
            imprimirDadosNaGrid(marcaControle.listagem());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro);
        }
        
        
        
            
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

        jPanel3 = new javax.swing.JPanel();
        jButtonVoltarTelaMarcas = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldIdentificador = new javax.swing.JTextField();
        jTextFieldDescricao = new javax.swing.JTextField();
        jTextFieldUrl = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButtonAlterar = new javax.swing.JButton();
        jButtonIncluir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMarcas = new javax.swing.JTable();
        JLabelLogo = new javax.swing.JLabel();
        jButtonUpload = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Marcas");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(102, 102, 102));
        setIconImage(img.getImage());
        setResizable(false);

        jPanel3.setBackground(java.awt.SystemColor.control);
        jPanel3.setForeground(new java.awt.Color(204, 255, 51));
        jPanel3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel3KeyPressed(evt);
            }
        });

        jButtonVoltarTelaMarcas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/LocaZilla/imagens/funcoes/Voltar.png"))); // NOI18N
        jButtonVoltarTelaMarcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarTelaMarcasActionPerformed(evt);
            }
        });
        jButtonVoltarTelaMarcas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonVoltarTelaMarcasKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 188, 69));
        jLabel1.setText("Cadastro de marcas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(230, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(226, 226, 226))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Id");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Descrição");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("URL");

        jTextFieldIdentificador.setPreferredSize(new java.awt.Dimension(60, 30));
        jTextFieldIdentificador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdentificadorActionPerformed(evt);
            }
        });

        jTextFieldDescricao.setToolTipText("");
        jTextFieldDescricao.setPreferredSize(new java.awt.Dimension(60, 30));
        jTextFieldDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldDescricaoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDescricaoKeyTyped(evt);
            }
        });

        jTextFieldUrl.setPreferredSize(new java.awt.Dimension(60, 30));
        jTextFieldUrl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUrlActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Logo");

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inserir/Alterar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 3, 12), new java.awt.Color(240, 188, 69))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(240, 188, 69));

        jButtonAlterar.setBackground(new java.awt.Color(240, 188, 69));
        jButtonAlterar.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        jButtonAlterar.setForeground(new java.awt.Color(102, 102, 102));
        jButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/LocaZilla/imagens/funcoes/Alterar.png"))); // NOI18N
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });
        jButtonAlterar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonAlterarKeyPressed(evt);
            }
        });

        jButtonIncluir.setBackground(new java.awt.Color(240, 188, 69));
        jButtonIncluir.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        jButtonIncluir.setForeground(new java.awt.Color(240, 188, 69));
        jButtonIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/LocaZilla/imagens/funcoes/Mais.png"))); // NOI18N
        jButtonIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncluirActionPerformed(evt);
            }
        });
        jButtonIncluir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonIncluirKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonIncluir, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(jButtonAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonIncluir, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTableMarcas.setBackground(new java.awt.Color(51, 51, 51));
        jTableMarcas.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(240, 188, 69)));
        jTableMarcas.setForeground(new java.awt.Color(240, 188, 69));
        jTableMarcas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDENTIFICADOR", "DESCRIÇÃO", "URL", "LOGO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableMarcas.setAlignmentX(5.0F);
        jTableMarcas.setColumnSelectionAllowed(true);
        jTableMarcas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableMarcas.setFillsViewportHeight(true);
        jTableMarcas.setFocusCycleRoot(true);
        jTableMarcas.setGridColor(new java.awt.Color(240, 188, 69));
        jTableMarcas.setRowHeight(100);
        jTableMarcas.setShowGrid(false);
        jTableMarcas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMarcasMouseClicked(evt);
            }
        });
        jTableMarcas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableMarcasKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTableMarcas);
        if (jTableMarcas.getColumnModel().getColumnCount() > 0) {
            jTableMarcas.getColumnModel().getColumn(3).setCellRenderer(new com.LocaZilla.Tools.geral.TabelaimagemMarca());
        }
        jTableMarcas.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        JLabelLogo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(240, 188, 69), new java.awt.Color(240, 188, 69)));
        JLabelLogo.setFocusable(false);
        JLabelLogo.setName(""); // NOI18N
        JLabelLogo.setOpaque(true);

        jButtonUpload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/LocaZilla/imagens/operador/uploadicon_1.png"))); // NOI18N
        jButtonUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUploadActionPerformed(evt);
            }
        });
        jButtonUpload.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonUploadKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButtonVoltarTelaMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonUpload, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(223, 223, 223))))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(160, 160, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jButtonVoltarTelaMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)))))
                .addContainerGap(286, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUrlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUrlActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jTextFieldUrlActionPerformed

    private void imprimirDadosNaGrid(ArrayList<Marca> listaDeMarcas){
        try {
            DefaultTableModel model =  (DefaultTableModel) jTableMarcas.getModel();
            //Limpa a tabela 
            model.setNumRows(0);
            Iterator<Marca> lista = listaDeMarcas.iterator();
            while(lista.hasNext()){
                String[] saida= new String[4];
                Marca aux = lista.next();
                saida[0]= aux.getId()+"";
                saida[1]= aux.getDescricao();
                saida[2] = aux.getUrl();
                saida[3] = "" ;
                //Incluir nova linha na Tabela
                model.addRow(saida);
         } 
            jTableMarcas.setModel(model);
        } catch(Exception erro){
            JOptionPane.showMessageDialog(this, erro.getMessage());
      } 
               
    }
    
    private void jButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirActionPerformed
        // TODO add your handling code here:
        
         try {
            Marca objeto = new Marca(0,jTextFieldDescricao.getText().trim(),
                                    jTextFieldUrl.getText());
            marcaControle.incluir(objeto);
            imprimirDadosNaGrid(marcaControle.listagem());
            
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
        jTextFieldIdentificador.setText("");
        jTextFieldDescricao.setText("");
        jTextFieldUrl.setText("");
        JLabelLogo.setIcon(null);
    }//GEN-LAST:event_jButtonIncluirActionPerformed
        
    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed

           // TODO add your handling code here:
           if(jTextFieldUrl.getText().equals("")){
               JOptionPane.showMessageDialog(this, "Selecione uma marca antes de alterar.");
           }else{
               try {
            
                Marca obj = new Marca(Integer.parseInt(jTextFieldIdentificador.getText()), jTextFieldDescricao.getText(), 
                        jTextFieldUrl.getText());
                marcaControle.alterar(obj);
                imprimirDadosNaGrid(marcaControle.listagem());
                jTextFieldDescricao.setText("");
                jTextFieldUrl.setText("");  
                JLabelLogo.setIcon(null);
            
        } catch (Exception erro) {
                JOptionPane.showMessageDialog(this, erro.getMessage());
                
        }
                jTextFieldDescricao.setText("");
                jTextFieldUrl.setText("");  
                JLabelLogo.setIcon(null);
                jTextFieldIdentificador.setText("");
               
           }
           
         


    }//GEN-LAST:event_jButtonAlterarActionPerformed

  
    
    private void jButtonUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUploadActionPerformed
            
         
        
          // TODO add your handling code here:
        
        //Ao apertar UPLOAD, isso acontece. 
        if(jTextFieldDescricao.getText()!=""){
            
             try {
            JFileChooser fc = new JFileChooser();
            fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
            fc.addChoosableFileFilter(new FileNameExtensionFilter("Image files",new String[] { "png", "jpg", "jpeg", "gif" }));
            fc.setCurrentDirectory(new File("C:\\"));
            Action details = fc.getActionMap().get("Go Up");
            details.actionPerformed(null);
            details.actionPerformed(null);
            fc.showOpenDialog(this);
            File arquivo = fc.getSelectedFile();
            if(arquivo != null){
                String nomeDoArquivo = arquivo.getPath();
                jTextFieldUrl.setText(nomeDoArquivo);
                ImageIcon iconLogo = new ImageIcon(nomeDoArquivo);
                iconLogo.setImage(iconLogo.getImage().getScaledInstance(
                    JLabelLogo.getWidth(),JLabelLogo.getHeight(),1));
                    JLabelLogo.setIcon(iconLogo);     
                    File origemArquivo = new File(nomeDoArquivo);
                    if(jTextFieldDescricao.getText()!=""){
                    File destinoArquivo = new File("./src/com/LocaZilla/Dados/marca/ImagemMarca/"+jTextFieldDescricao.getText()+".jpeg");
                    
                                    String saidaMascara = destinoArquivo+"";    

                                    jTextFieldUrl.setText(saidaMascara.replace(".JPEG",""));
                    
                    try {
                    
                    Files.copy(origemArquivo.toPath(), destinoArquivo.toPath(),StandardCopyOption.REPLACE_EXISTING);
                    
                } catch (Exception e) {
                }
             
            }else{
                JOptionPane.showMessageDialog(this, "É necessário inserir uma descrição antes de inserir a marca.");
            }
             
            }
            
       }    catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
       
        } else{
            jButtonUpload.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonUploadActionPerformed

    private void jTextFieldDescricaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDescricaoKeyTyped
        // TODO add your handling code here:
            char e = evt.getKeyChar();
            evt.setKeyChar(Character.toUpperCase(e));
            if(Character.isDigit(e)){
                evt.consume();
            }
//            if (Character.isLowerCase(e)) {
//            evt.setKeyChar(Character.toUpperCase(e));
//            }
    }//GEN-LAST:event_jTextFieldDescricaoKeyTyped

    private void jTextFieldIdentificadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdentificadorActionPerformed
        // TODO add your handling code here:
        
        
        
        
    }//GEN-LAST:event_jTextFieldIdentificadorActionPerformed

    private void jTableMarcasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMarcasMouseClicked
        // TODO add your handling code here:
          try {
              
            this.jTextFieldIdentificador.setText((String) this.jTableMarcas.getValueAt(jTableMarcas.getSelectedRow(), 0));
            this.jTextFieldDescricao.setText((String) this.jTableMarcas.getValueAt(jTableMarcas.getSelectedRow(), 1));
            this.jTextFieldUrl.setText((String) this.jTableMarcas.getValueAt(jTableMarcas.getSelectedRow(), 2));
            
            String nomeArquivo = (String) this.jTableMarcas.getValueAt(jTableMarcas.getSelectedRow(), 2);
            
            jTextFieldUrl.setText(nomeArquivo);
            ImageIcon iconLogo = new ImageIcon(nomeArquivo);
            iconLogo.setImage(iconLogo.getImage().getScaledInstance(JLabelLogo.getWidth(), JLabelLogo.getHeight(), java.awt.Image.SCALE_SMOOTH));
            JLabelLogo.setIcon(iconLogo);
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, "Selecione uma marca válida já cadastrada!");
        }
    }//GEN-LAST:event_jTableMarcasMouseClicked

    private void jButtonVoltarTelaMarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarTelaMarcasActionPerformed
        // TODO add your handling code here:
        
        try {
            
            TelaCadastroModelo.preencherCombobox();
            
        } catch (Exception e) {
            
        }
        
        
        this.dispose();
        
    }//GEN-LAST:event_jButtonVoltarTelaMarcasActionPerformed

    private void jButtonVoltarTelaMarcasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonVoltarTelaMarcasKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            super.dispose();
        }
    }//GEN-LAST:event_jButtonVoltarTelaMarcasKeyPressed

    private void jTextFieldDescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDescricaoKeyPressed
         
        
        if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            super.dispose();
        }
        
    }//GEN-LAST:event_jTextFieldDescricaoKeyPressed

    private void jButtonIncluirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonIncluirKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            super.dispose();
        }
    }//GEN-LAST:event_jButtonIncluirKeyPressed

    private void jButtonAlterarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonAlterarKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            super.dispose();
        }
    }//GEN-LAST:event_jButtonAlterarKeyPressed

    private void jPanel3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel3KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            super.dispose();
        }
    }//GEN-LAST:event_jPanel3KeyPressed

    private void jButtonUploadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonUploadKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            super.dispose();
        }
    }//GEN-LAST:event_jButtonUploadKeyPressed

    private void jTableMarcasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableMarcasKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            super.dispose();
        }
    }//GEN-LAST:event_jTableMarcasKeyPressed

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
            java.util.logging.Logger.getLogger(TelaDasMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDasMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDasMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDasMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDasMarcas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelLogo;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonIncluir;
    private javax.swing.JButton jButtonUpload;
    private javax.swing.JButton jButtonVoltarTelaMarcas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableMarcas;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldIdentificador;
    private javax.swing.JTextField jTextFieldUrl;
    // End of variables declaration//GEN-END:variables
}
