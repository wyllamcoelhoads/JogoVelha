/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogovelha;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JOptionPane;

/**
 *
 * @author wylla
 */
public class Tela extends javax.swing.JFrame {
    
    private boolean usuario1 = false;
    private boolean usuario2 = true;
    
    /**
     * Creates new form Tela
     */
    public Tela() {
        initComponents();
        setTitle("Mapa JogoDaVelha");
        
        URL caminhoImagem = this.getClass().getResource("/jogovelha/icone/velha.png");
        Image    iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoImagem);
        setIconImage(iconeTitulo);
    }

    public void usuario(){
           if(usuario1 == false){
               Txt1.setText("A VEZ É DO JOGADOR 'O' ! ");
               usuario1 = true;
               usuario2 = false;
           }else{
               Txt1.setText("A VEZ É DO JOGADOR 'X' ! ");
               usuario1 = false;
               usuario2 = true;
           }
           
      
      Vencedor("X");
      Vencedor("O");
      //Empate("X");
     // Empate("O");
           
    
    }
    
    public void Vencedor(String sb){ 
        /*Linhas*/
        if (bt1.getText().equals(sb) && bt2.getText().equals(sb) && 
                bt3.getText().equals(sb)){
            
            if (bt3.getText().equals("X"))
                Ganha("um");           
            else
                Ganha("dois");
            
          
        }
       
        if (bt4.getText().equals(sb) && bt5.getText().equals(sb) && 
                bt6.getText().equals(sb)){
            
            if (bt6.getText().equals("X"))
                Ganha("um");           
            else
                Ganha("dois");
            
        }
        
        if (bt7.getText().equals(sb) && bt8.getText().equals(sb) && 
                bt9.getText().equals(sb)){
            
            if (bt7.getText().equals("X"))
                Ganha("um");           
            else
                Ganha("dois");
            
        }   
        /*colunas*/
        
        if (bt1.getText().equals(sb) && bt4.getText().equals(sb) && 
                bt7.getText().equals(sb)){
            
            if (bt7.getText().equals("X"))
                Ganha("um");           
            else
                Ganha("dois");
            
        }   
        
        if (bt2.getText().equals(sb) && bt5.getText().equals(sb) && 
                bt8.getText().equals(sb)){
            
            if (bt8.getText().equals("X"))
                Ganha("um");           
            else
                Ganha("dois");
            
        }   
        
        if (bt3.getText().equals(sb) && bt6.getText().equals(sb) && 
                bt9.getText().equals(sb)){
            
            if (bt9.getText().equals("X"))
                Ganha("um");           
            else
                Ganha("dois");              
            
        }          
        /*diagonal*/
        if (bt3.getText().equals(sb) && bt5.getText().equals(sb) && 
                bt7.getText().equals(sb)){
            
            if (bt7.getText().equals("X"))
                Ganha("um");           
            else
                Ganha("dois"); 
                
        }                 
            
                
        
        if (bt1.getText().equals(sb) && bt5.getText().equals(sb) && 
                bt9.getText().equals(sb)){
            
            if (bt9.getText().equals("X"))
                Ganha("um");           
            else
                Ganha("dois"); 
                   
           
        }
        
        
    }          
    
    public void Ganha(String usuario){ 

        if (usuario.equals("um")){
            Txt1.setText("O JOGADOR 'X' VENCEU!!!!");
            JOptionPane.showMessageDialog(null, "JOGADOR 'X' VENCEU, REINICIAR!");
            Clean();
            

        }        
        
        if (usuario.equals("dois")){
            Txt1.setText("O JOGADOR 'O' VENCEU!!!!");
            JOptionPane.showMessageDialog(null, "JOGADOR 'O' VENCEU, REINICIAR!");
            Clean();
            
           
        }

    }
    
    public void Clean(){
        bt1.setText("");
        bt2.setText("");
        bt3.setText("");
        bt4.setText("");
        bt5.setText("");
        bt6.setText("");
        bt7.setText("");
        bt8.setText("");
        bt9.setText("");
        Txt1.setText("");
        Txt1.setText("CLICK EM QUALQUER BOTÃO PARA INICIAR!");
       
        
    }
    
  /* public void Empate(String x){
        
            if (!bt1.getText().equals(x) && bt5.getText().equals(x) && 
                bt9.getText().equals(x)){

            if (!bt9.getText().equals("X")){
                    Txt1.setText("empate");
            }
                
                        
                
           
        }
    
        
}*/
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        bt4 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        bt7 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();
        bt8 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt1 = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        bt9 = new javax.swing.JButton();
        Txt1 = new javax.swing.JTextField();
        reiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bt4.setBackground(new java.awt.Color(204, 255, 255));
        bt4.setFont(new java.awt.Font("Alef", 0, 36)); // NOI18N
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });

        bt3.setBackground(new java.awt.Color(204, 255, 255));
        bt3.setFont(new java.awt.Font("Alef", 0, 36)); // NOI18N
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });

        bt7.setBackground(new java.awt.Color(204, 255, 255));
        bt7.setFont(new java.awt.Font("Alef", 0, 36)); // NOI18N
        bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt7ActionPerformed(evt);
            }
        });

        bt5.setBackground(new java.awt.Color(204, 255, 255));
        bt5.setFont(new java.awt.Font("Alef", 0, 36)); // NOI18N
        bt5.setToolTipText("");
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });

        bt8.setBackground(new java.awt.Color(204, 255, 255));
        bt8.setFont(new java.awt.Font("Alef", 0, 36)); // NOI18N
        bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt8ActionPerformed(evt);
            }
        });

        bt2.setBackground(new java.awt.Color(204, 255, 255));
        bt2.setFont(new java.awt.Font("Alef", 0, 36)); // NOI18N
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });

        bt1.setBackground(new java.awt.Color(204, 255, 255));
        bt1.setFont(new java.awt.Font("Alef", 0, 36)); // NOI18N
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });

        bt6.setBackground(new java.awt.Color(204, 255, 255));
        bt6.setFont(new java.awt.Font("Alef", 0, 36)); // NOI18N
        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt6ActionPerformed(evt);
            }
        });

        bt9.setBackground(new java.awt.Color(204, 255, 255));
        bt9.setFont(new java.awt.Font("Alef", 0, 36)); // NOI18N
        bt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt9ActionPerformed(evt);
            }
        });

        Txt1.setEditable(false);
        Txt1.setBackground(new java.awt.Color(204, 255, 255));
        Txt1.setFont(new java.awt.Font("Amiri", 1, 14)); // NOI18N
        Txt1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                Txt1ComponentAdded(evt);
            }
        });
        Txt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Txt1MouseEntered(evt);
            }
        });
        Txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt1ActionPerformed(evt);
            }
        });
        Txt1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                Txt1PropertyChange(evt);
            }
        });

        reiniciar.setBackground(new java.awt.Color(51, 153, 255));
        reiniciar.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        reiniciar.setForeground(new java.awt.Color(255, 255, 255));
        reiniciar.setText("Reiniciar");
        reiniciar.setActionCommand("reiniciar");
        reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(reiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Txt1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 9, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(reiniciar)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarActionPerformed
        Clean();   
    }//GEN-LAST:event_reiniciarActionPerformed

    private void Txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt1ActionPerformed
       
    }//GEN-LAST:event_Txt1ActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed

        if (usuario1 == false){
            if (bt1.getText().equals("")){
                bt1.setText("X");
                usuario();
            }
        }else {
            if (bt1.getText().equals("")){
                bt1.setText("O");
                usuario();
            }
        }

    }//GEN-LAST:event_bt1ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed

        if (usuario1 == false){
            if (bt2.getText().equals("")){
                bt2.setText("X");
                usuario();
            }
        }else {
            if (bt2.getText().equals("")){
                bt2.setText("O");
                usuario();
            }
        }
    }//GEN-LAST:event_bt2ActionPerformed

    private void bt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt8ActionPerformed

        if (usuario1 == false){
            if (bt8.getText().equals("")){
                bt8.setText("X");
                usuario();
            }
        }else {
            if (bt8.getText().equals("")){
                bt8.setText("O");
                usuario();
            }
        }

    }//GEN-LAST:event_bt8ActionPerformed

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed

        if (usuario1 == false){
            if (bt5.getText().equals("")){
                bt5.setText("X");
                usuario();
            }
        }else {
            if (bt5.getText().equals("")){
                bt5.setText("O");
                usuario();
            }
        }

    }//GEN-LAST:event_bt5ActionPerformed

    private void bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt7ActionPerformed

        if (usuario1 == false){
            if (bt7.getText().equals("")){
                bt7.setText("X");
                usuario();
            }
        }else {
            if (bt7.getText().equals("")){
                bt7.setText("O");
                usuario();
            }
        }

    }//GEN-LAST:event_bt7ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed

        if (usuario1 == false){
            if (bt3.getText().equals("")){
                bt3.setText("X");
                usuario();
            }
        }else {
            if (bt3.getText().equals("")){
                bt3.setText("O");
                usuario();
            }
        }

    }//GEN-LAST:event_bt3ActionPerformed

    private void bt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt9ActionPerformed

        if (usuario1 == false){
            if (bt9.getText().equals("")){
                bt9.setText("X");
                usuario();
            }
        }else {
            if (bt9.getText().equals("")){
                bt9.setText("O");
                usuario();
            }
        }

    }//GEN-LAST:event_bt9ActionPerformed

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed

        if (usuario1 == false){
            if (bt4.getText().equals("")){
                bt4.setText("X");
                usuario();
            }
        }else {
            if (bt4.getText().equals("")){
                bt4.setText("O");
                usuario();
            }
        }

    }//GEN-LAST:event_bt4ActionPerformed

    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt6ActionPerformed

        if (usuario1 == false){
            if (bt6.getText().equals("")){
                bt6.setText("X");
                usuario();
            }
        }else {
            if (bt6.getText().equals("")){
                bt6.setText("O");
                usuario();
            }
        }

    }//GEN-LAST:event_bt6ActionPerformed

    private void Txt1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt1MouseEntered
        // TODO add your handling code here:
       
    }//GEN-LAST:event_Txt1MouseEntered

    private void Txt1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_Txt1ComponentAdded
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Txt1ComponentAdded

    private void Txt1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_Txt1PropertyChange
        // TODO add your handling code here:
        Txt1.setText("CLICK EM QUALQUER BOTÃO PARA INICIAR!");
    }//GEN-LAST:event_Txt1PropertyChange

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Txt1;
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt7;
    private javax.swing.JButton bt8;
    private javax.swing.JButton bt9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton reiniciar;
    // End of variables declaration//GEN-END:variables
}
