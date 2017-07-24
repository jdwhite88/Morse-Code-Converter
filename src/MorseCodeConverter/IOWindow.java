package MorseCodeConverter;

import java.awt.event.WindowEvent;

/**
 * Allows user to choose what they want to input and output when using Morse
 * code (main program).
 * 
 * @author Jacob White
 */
public class IOWindow extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public IOWindow() {
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

        inputChoices = new javax.swing.ButtonGroup();
        outputTextChoices = new javax.swing.ButtonGroup();
        inputPanel = new javax.swing.JPanel();
        inputLabel = new javax.swing.JLabel();
        inputTextButton = new javax.swing.JRadioButton();
        inputMorseAudioButton = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        directions = new javax.swing.JTextArea();
        OKButton = new javax.swing.JButton();
        outputPanel = new javax.swing.JPanel();
        outputLabel = new javax.swing.JLabel();
        playAudioCheckbox = new javax.swing.JCheckBox();
        outputEnglishButton = new javax.swing.JRadioButton();
        outputMorseButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Morse Code Converter");
        setResizable(false);

        inputLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        inputLabel.setText("Input:");

        inputChoices.add(inputTextButton);
        inputTextButton.setSelected(true);
        inputTextButton.setText("Text");
        inputTextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTextButtonActionPerformed(evt);
            }
        });

        inputChoices.add(inputMorseAudioButton);
        inputMorseAudioButton.setText("Morse code audio");
        inputMorseAudioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputMorseAudioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputMorseAudioButton)
                    .addComponent(inputLabel)
                    .addComponent(inputTextButton))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addComponent(inputLabel)
                .addGap(7, 7, 7)
                .addComponent(inputTextButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputMorseAudioButton)
                .addContainerGap())
        );

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        directions.setEditable(false);
        directions.setColumns(20);
        directions.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        directions.setLineWrap(true);
        directions.setRows(5);
        directions.setText("Welcome to the Morse Code Converter! To start, choose which input type to use. \nNOTE: This program does not support any Morse prosigns other than start and end transmission.");
        directions.setWrapStyleWord(true);
        directions.setAutoscrolls(false);
        directions.setFocusable(false);
        jScrollPane1.setViewportView(directions);

        OKButton.setText("OK");
        OKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKButtonActionPerformed(evt);
            }
        });

        outputLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        outputLabel.setText("Output:");

        playAudioCheckbox.setSelected(true);
        playAudioCheckbox.setText("Play Audio");

        outputTextChoices.add(outputEnglishButton);
        outputEnglishButton.setSelected(true);
        outputEnglishButton.setText("English text");
        outputEnglishButton.setEnabled(false);

        outputTextChoices.add(outputMorseButton);
        outputMorseButton.setText("Morse code text");
        outputMorseButton.setEnabled(false);

        javax.swing.GroupLayout outputPanelLayout = new javax.swing.GroupLayout(outputPanel);
        outputPanel.setLayout(outputPanelLayout);
        outputPanelLayout.setHorizontalGroup(
            outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playAudioCheckbox)
                    .addComponent(outputLabel)
                    .addComponent(outputEnglishButton)
                    .addComponent(outputMorseButton))
                .addGap(10, 10, 10))
        );
        outputPanelLayout.setVerticalGroup(
            outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanelLayout.createSequentialGroup()
                .addComponent(outputLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(playAudioCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputEnglishButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputMorseButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(OKButton)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(outputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 156, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(OKButton)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKButtonActionPerformed

        if (inputTextButton.isSelected()) {
            if (playAudioCheckbox.isSelected() && playAudioCheckbox.isEnabled()) {
                //Converts English to Morse code text or vice versa, outputs audio & messsage
                new TextToAudioWindow().setVisible(true);
            }
            else {
                //Converts English to Morse code text or vice versa, outputs message only
                new TextToMorseWindow().setVisible(true);
            }
        }
        else {
            AudioToTextWindow atw = new AudioToTextWindow();
            atw.setTextOutput(outputEnglishButton.isSelected());
            atw.setVisible(true);
        }
        //Close the window once it's done opening a converter window.
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_OKButtonActionPerformed

    /**
     * If inputTxt option is selected, enable ability to output audio.
     * @param evt 
     */
    private void inputTextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTextButtonActionPerformed
        playAudioCheckbox.setEnabled(true);
        outputMorseButton.setEnabled(false);
        outputEnglishButton.setEnabled(false);
    }//GEN-LAST:event_inputTextButtonActionPerformed

    /**
     * if inputMorseAudio option is selected, disable ability to output audio.
     * @param evt 
     */
    private void inputMorseAudioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputMorseAudioButtonActionPerformed
        playAudioCheckbox.setEnabled(false);
        outputMorseButton.setEnabled(true);
        outputEnglishButton.setEnabled(true);
    }//GEN-LAST:event_inputMorseAudioButtonActionPerformed

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
            java.util.logging.Logger.getLogger(IOWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IOWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IOWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IOWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IOWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OKButton;
    private javax.swing.JTextArea directions;
    private javax.swing.ButtonGroup inputChoices;
    private javax.swing.JLabel inputLabel;
    private javax.swing.JRadioButton inputMorseAudioButton;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JRadioButton inputTextButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton outputEnglishButton;
    private javax.swing.JLabel outputLabel;
    private javax.swing.JRadioButton outputMorseButton;
    private javax.swing.JPanel outputPanel;
    private javax.swing.ButtonGroup outputTextChoices;
    private javax.swing.JCheckBox playAudioCheckbox;
    // End of variables declaration//GEN-END:variables
}
