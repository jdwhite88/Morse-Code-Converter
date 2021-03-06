package MorseCodeConverter;

import javax.swing.JOptionPane;

/**
 * Window that allows user to input text (English or Morse) and receive translated output
 * 
 * BUGS:
 * Input text box isn't focusable after converting
 * 
 * @author Jacob White
 */
public class TextToMorseWindow extends javax.swing.JFrame {

    /**
     * Creates new form TextToMorseWindow
     */
    public TextToMorseWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        directions = new javax.swing.JTextArea();
        convertButton = new javax.swing.JButton();
        inputPanel = new javax.swing.JPanel();
        inputLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputArea = new javax.swing.JTextArea();
        outputPanel = new javax.swing.JPanel();
        outputLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        outputArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Text to Morse Code Converter");
        setResizable(false);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        directions.setEditable(false);
        directions.setColumns(20);
        directions.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        directions.setLineWrap(true);
        directions.setRows(5);
        directions.setText("Click \"Convert\" to change the message from English to Morse code (or vice versa). In Morse code, the message is contained by the starting signal \"-.-.-\" and the ending signal \"...-.-\", letters are separated by a space, and words are separated by \"|\" or \"/\".");
        directions.setWrapStyleWord(true);
        directions.setFocusable(false);
        jScrollPane3.setViewportView(directions);

        convertButton.setText("Convert");
        convertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertButtonActionPerformed(evt);
            }
        });

        inputLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        inputLabel.setText("Input Text:");

        inputArea.setColumns(20);
        inputArea.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        inputArea.setLineWrap(true);
        inputArea.setRows(5);
        inputArea.setWrapStyleWord(true);
        inputArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        inputArea.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(inputArea);

        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addComponent(inputLabel)
                .addGap(0, 587, Short.MAX_VALUE))
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addComponent(inputLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        outputLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        outputLabel.setText("Output Text:");

        outputArea.setEditable(false);
        outputArea.setColumns(20);
        outputArea.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        outputArea.setLineWrap(true);
        outputArea.setRows(5);
        outputArea.setWrapStyleWord(true);
        jScrollPane2.setViewportView(outputArea);

        javax.swing.GroupLayout outputPanelLayout = new javax.swing.GroupLayout(outputPanel);
        outputPanel.setLayout(outputPanelLayout);
        outputPanelLayout.setHorizontalGroup(
            outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
            .addGroup(outputPanelLayout.createSequentialGroup()
                .addComponent(outputLabel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        outputPanelLayout.setVerticalGroup(
            outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanelLayout.createSequentialGroup()
                .addComponent(outputLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 606, Short.MAX_VALUE)
                        .addComponent(convertButton))
                    .addComponent(outputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(convertButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void convertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertButtonActionPerformed
        TextToMorse ttm = new TextToMorse();
        String input = inputArea.getText(); //Input message in text
        String output;
        try {
            output = ttm.toString(input);
            outputArea.setText(output); //Output message in Morse code
        }
        catch (InvalidTransmissionException e) {
            //Shouldn't ever be caught, unless the isMorse pattern within TextToMorse is incorrect.
            JOptionPane.showMessageDialog(this, "No Morse code message found. Remember to contain message with starting and ending signals.", "Invalid Transmission Error", JOptionPane.ERROR_MESSAGE);
        }
        catch (InvalidCharacterException e) {
            JOptionPane.showMessageDialog(this, "Invalid Character: " + "\"" + e.getCharacter() + "\"", "Invalid Character Error", JOptionPane.ERROR_MESSAGE);
        }
        catch (InvalidArraysException e) {
            JOptionPane.showMessageDialog(this, "Indices in the letters and morse arrays do not match.\nletters: " + e.getLettersLength() + "\nmorse: " + e.getMorseLength(), "Array Mismatch", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_convertButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TextToMorseWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TextToMorseWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TextToMorseWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TextToMorseWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TextToMorseWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton convertButton;
    private javax.swing.JTextArea directions;
    private javax.swing.JTextArea inputArea;
    private javax.swing.JLabel inputLabel;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea outputArea;
    private javax.swing.JLabel outputLabel;
    private javax.swing.JPanel outputPanel;
    // End of variables declaration//GEN-END:variables
}
