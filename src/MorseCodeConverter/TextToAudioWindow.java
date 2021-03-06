package MorseCodeConverter;

import java.text.ParseException;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 * Based on the user settings, play the audio. 
 * 
 * TODO: 
 * Allow option to save audio file?
 * 
 * @author Jacob White
 */
public class TextToAudioWindow extends javax.swing.JFrame {

    public int defaultWPM = 20;
    public int defaultFrequency = 1000;
    /**
     * Creates new form MorseToAudioWindow
     */
    public TextToAudioWindow() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        directions = new javax.swing.JTextArea();
        IOPanel = new javax.swing.JPanel();
        inputLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        inputArea = new javax.swing.JTextArea();
        outputLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        outputArea = new javax.swing.JTextArea();
        convertButton = new javax.swing.JButton();
        settingsPanel = new javax.swing.JPanel();
        settingsLabel = new javax.swing.JLabel();
        wpmLabel = new javax.swing.JLabel();
        freqLabel = new javax.swing.JLabel();
        wpmSpinner = new javax.swing.JSpinner();
        freqSpinner = new javax.swing.JSpinner();
        volLabel = new javax.swing.JLabel();
        volSlider = new javax.swing.JSlider();
        defaultsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Text to Morse Audio Converter");
        setResizable(false);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setFocusable(false);

        directions.setEditable(false);
        directions.setColumns(20);
        directions.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        directions.setLineWrap(true);
        directions.setRows(5);
        directions.setText("Click \"Convert\" to play the input text as Morse code. The corresponding Morse Code text will be displayed as the audio plays. In Morse code, the message is contained by the starting signal \"-.-.-\" and the ending signal \"...-.-\", letters are separated by a space, and words are separated by \"|\" or \"/\".");
        directions.setWrapStyleWord(true);
        directions.setFocusable(false);
        jScrollPane1.setViewportView(directions);

        inputLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        inputLabel.setText("Input Text:");

        inputArea.setColumns(20);
        inputArea.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        inputArea.setLineWrap(true);
        inputArea.setRows(5);
        inputArea.setWrapStyleWord(true);
        jScrollPane4.setViewportView(inputArea);

        outputLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        outputLabel.setText("Output Text:");

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setAutoscrolls(true);

        outputArea.setEditable(false);
        outputArea.setColumns(20);
        outputArea.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        outputArea.setLineWrap(true);
        outputArea.setRows(5);
        outputArea.setWrapStyleWord(true);
        outputArea.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane3.setViewportView(outputArea);

        convertButton.setText("Convert");
        convertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout IOPanelLayout = new javax.swing.GroupLayout(IOPanel);
        IOPanel.setLayout(IOPanelLayout);
        IOPanelLayout.setHorizontalGroup(
            IOPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IOPanelLayout.createSequentialGroup()
                .addGroup(IOPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputLabel)
                    .addGroup(IOPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(IOPanelLayout.createSequentialGroup()
                            .addComponent(outputLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 342, Short.MAX_VALUE)
                            .addComponent(convertButton))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(0, 0, 0))
        );
        IOPanelLayout.setVerticalGroup(
            IOPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IOPanelLayout.createSequentialGroup()
                .addComponent(inputLabel)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(IOPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outputLabel)
                    .addComponent(convertButton))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        settingsLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        settingsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        settingsLabel.setText("Audio Settings:");

        wpmLabel.setText("WPM:");

        freqLabel.setText("Frequency (Hz):");

        wpmSpinner.setModel(new javax.swing.SpinnerNumberModel(20, 5, 60, 1));
        wpmSpinner.setMinimumSize(new java.awt.Dimension(31, 25));
        wpmSpinner.setPreferredSize(new java.awt.Dimension(71, 25));

        freqSpinner.setModel(new javax.swing.SpinnerNumberModel(1000, 600, null, 10));
        freqSpinner.setMinimumSize(new java.awt.Dimension(47, 25));
        freqSpinner.setPreferredSize(new java.awt.Dimension(71, 25));

        volLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        volLabel.setText("Volume:");

        volSlider.setMajorTickSpacing(25);
        volSlider.setOrientation(javax.swing.JSlider.VERTICAL);
        volSlider.setPaintLabels(true);
        volSlider.setPaintTicks(true);
        volSlider.setValue(100);

        defaultsButton.setText("Reset to Defaults");
        defaultsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defaultsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout settingsPanelLayout = new javax.swing.GroupLayout(settingsPanel);
        settingsPanel.setLayout(settingsPanelLayout);
        settingsPanelLayout.setHorizontalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(defaultsButton)
                .addGap(21, 21, 21))
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(wpmLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(freqLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(wpmSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(freqSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(settingsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(volLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(volSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        settingsPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {freqSpinner, wpmSpinner});

        settingsPanelLayout.setVerticalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addComponent(settingsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wpmSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wpmLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(freqLabel)
                    .addComponent(freqSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(volLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(volSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(defaultsButton))
        );

        settingsPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {freqSpinner, wpmSpinner});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(settingsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(IOPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IOPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(settingsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void defaultsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defaultsButtonActionPerformed
        volSlider.setValue(volSlider.getMaximum());
        wpmSpinner.setValue(defaultWPM);
        freqSpinner.setValue(defaultFrequency);
    }//GEN-LAST:event_defaultsButtonActionPerformed

    private void convertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertButtonActionPerformed
        TextToMorse ttm = new TextToMorse();
        TextToAudio mta = new TextToAudio();
        
        String input = inputArea.getText();
        String output;
        
        double vol = (double)volSlider.getValue()/100;
        try {
            freqSpinner.commitEdit();
            wpmSpinner.commitEdit();
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
        mta.setFrequency((int)freqSpinner.getValue());
        mta.setWPM((int)wpmSpinner.getValue());
        mta.setVolume(vol);
                
        Pattern textPattern = Pattern.compile("[^\\-\\s.\\|/]");

        outputArea.setText(""); //Clear text before outputting
                
        try {
            //Convert any input into Morse code output
            boolean inputIsText = textPattern.matcher(input).find();
            if (inputIsText) {
                //Convert input text into Morse code
                output = ttm.toString(input);
            }
            else {
                //Set output text as input (assumed Morse code)
                output = input;
            }
            
            boolean outputIsText = textPattern.matcher(output).find();
            if (!outputIsText) {
                //Converts morse code string to audio, and outputs text as it plays
                TextToAudioProcessor pc = new TextToAudioProcessor(output, this, convertButton, outputArea, mta);
                pc.execute(); //Uses SwingWorker TextToAudioProcessor to handle text output
            }
            else {
                //Create error window if output isn't Morse code (shouldn't happen if toString works))
                JOptionPane.showMessageDialog(this, "Unable to convert input into readable Morse code. Please try again.", "Invalid input", JOptionPane.ERROR_MESSAGE);

            }
        }
        catch (InvalidTransmissionException e) {
            JOptionPane.showMessageDialog(this, "No Morse code message found. Remember to contain message with starting and ending signals.", "Invalid Transmission Error", JOptionPane.ERROR_MESSAGE);
        }
        catch (InvalidCharacterException e) {
            JOptionPane.showMessageDialog(this, "Invalid Character: " + "\"" + e.getCharacter() + "\"", "Invalid Character", JOptionPane.ERROR_MESSAGE);
        }
        catch (InvalidArraysException e) {
            JOptionPane.showMessageDialog(this, "Indices in the letters and morse arrays do not match.\nletters Array Length: " + e.getLettersLength() + "\nmorse Array Length: " + e.getMorseLength(), "Array Mismatch", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(TextToAudioWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TextToAudioWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TextToAudioWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TextToAudioWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TextToAudioWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel IOPanel;
    private javax.swing.JButton convertButton;
    private javax.swing.JButton defaultsButton;
    private javax.swing.JTextArea directions;
    private javax.swing.JLabel freqLabel;
    private javax.swing.JSpinner freqSpinner;
    private javax.swing.JTextArea inputArea;
    private javax.swing.JLabel inputLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea outputArea;
    private javax.swing.JLabel outputLabel;
    private javax.swing.JLabel settingsLabel;
    private javax.swing.JPanel settingsPanel;
    private javax.swing.JLabel volLabel;
    private javax.swing.JSlider volSlider;
    private javax.swing.JLabel wpmLabel;
    private javax.swing.JSpinner wpmSpinner;
    // End of variables declaration//GEN-END:variables
}
