/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MongoModel;

import java.awt.Color;
import java.awt.event.KeyEvent;
import net.boplicity.xmleditor.*;
import java.io.FileInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
/**
 *
 * @author mkromer
 */
public class Editor extends javax.swing.JFrame {

    String ofile;
    ConfigurationManager config;
    /**
     * Creates new form Editor
     */
    public Editor() {
        initComponents();     
        
        jEditorPane1.setBackground(Color.BLACK);
        
        // Get the default path for Mondrian models
        try {
            config = new ConfigurationManager ("MongoModel.xml");
        } catch (IOException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,e.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);         
        }
       
        // Get the current path for Mondrian models
       String mdir = config.getProperty("mondrian");
       
        //Create a file chooser
        final JFileChooser fc = new JFileChooser(mdir);
        //In response to a button click:
        int returnVal = fc.showDialog(this, null);

        // ofile stores the Mondrian file location
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            ofile = fc.getSelectedFile().toString();
        }
        else
        {
            setVisible(false);
            dispose();
        }
        
        //JOptionPane.showMessageDialog(this,ofile, "Warning", JOptionPane.WARNING_MESSAGE);         
        
        jEditorPane1.setEditorKit(new XmlEditorKit());
        try {
            jEditorPane1.read(new FileInputStream(ofile),null);
        } catch (Exception e) {}
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jEditorPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jEditorPane1.setForeground(new java.awt.Color(255, 255, 255));
        jEditorPane1.setDragEnabled(true);
        jEditorPane1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jEditorPane1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jEditorPane1);

        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Validate");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setEnabled(false);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
// Close button
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            SchemaFactory factory = 
                    SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File("mondrian4.xsd"));
            Validator validator = schema.newValidator();
            //validator.validate(new StreamSource(new File(ofile)));            
            validator.validate(new StreamSource(new StringReader(jEditorPane1.getText())));
        } catch (Exception e) {
            jTextArea1.setForeground(Color.RED);
            jTextArea1.setText(e.getMessage());
            return;
        }
           jTextArea1.setForeground(Color.GREEN);
           jTextArea1.setText("Passed Validation");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Save button
        try {
            PrintWriter out = new PrintWriter(ofile);
            out.println(jEditorPane1.getText());
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,"Writing to file failed:\n"+ofile, "Save Model", JOptionPane.INFORMATION_MESSAGE);                     
            return;
        }

        JOptionPane.showMessageDialog(this,"Saved Successfully", "Save Mode",JOptionPane.INFORMATION_MESSAGE);                     

    }//GEN-LAST:event_jButton3ActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        // Close on ESC
        //JOptionPane.showMessageDialog(this,evt.getKeyCode(), "Save Mode",JOptionPane.INFORMATION_MESSAGE);                     
        if (evt.getKeyCode()==KeyEvent.VK_ESCAPE) {
            setVisible(false);
            dispose();
        }
    }//GEN-LAST:event_formKeyPressed

    private void jEditorPane1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jEditorPane1KeyPressed
        // Close on ESC
        //JOptionPane.showMessageDialog(this,evt.getKeyCode(), "Save Mode",JOptionPane.INFORMATION_MESSAGE);                     
        if (evt.getKeyCode()==KeyEvent.VK_ESCAPE) {
            setVisible(false);
            dispose();
        }
    }//GEN-LAST:event_jEditorPane1KeyPressed

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
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editor().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
