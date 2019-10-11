/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Class.Character;
import java.awt.Canvas;
import javax.swing.JFrame;

/**
 *
 * @author soldgear
 */
public class MainWindow extends JFrame {
    
    private Character chr;
    private Character adv;
    private Battle Bt;
    
    /**
     * Creates new form MainWindow
     */
    public MainWindow(Character chr) {
        this.chr = chr;
        initComponents();
//        Bt = new Battle(this.chr, this.adv);
    }
    
    public void initDisplayComponents(){
        equipButton1.setText("Unequiped");
        NameLabel.setText("Name: "+chr.getName());
        AttackLabel.setText("Attack: "+chr.getAttackDamage());
        MagicLabel.setText("magic: "+chr.getMagicDamage());
        HealthLabel.setText("HP: "+chr.getHealthPoints());
        ExpLabel.setText("XP: "+chr.getExperience());
    }
    
    public void updateDisplayComponents(){
        
        NameLabel.setText("Name: "+chr.getName());
        AttackLabel.setText("Attack: "+chr.getAttackDamage());
        MagicLabel.setText("magic: "+chr.getMagicDamage());
        HealthLabel.setText("HP: "+chr.getHealthPoints());
        ExpLabel.setText("XP: "+chr.getExperience());
    }
    
    public void setAdversary(Character adv){
        this.adv = adv;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        EventsPanelDisplay = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        terminalEvents = new javax.swing.JTextArea();
        STATUSpanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        HealthLabel = new javax.swing.JLabel();
        AttackLabel = new javax.swing.JLabel();
        ExpLabel = new javax.swing.JLabel();
        MagicLabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        NameLabel = new javax.swing.JLabel();
        startBattleButton = new javax.swing.JButton();
        expProgressBar = new javax.swing.JProgressBar();
        DECKpanel = new javax.swing.JPanel();
        equipButton1 = new javax.swing.JButton();
        selectItem1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(200, 200, 200));
        setForeground(java.awt.Color.gray);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 189, Short.MAX_VALUE)
        );

        EventsPanelDisplay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout EventsPanelDisplayLayout = new javax.swing.GroupLayout(EventsPanelDisplay);
        EventsPanelDisplay.setLayout(EventsPanelDisplayLayout);
        EventsPanelDisplayLayout.setHorizontalGroup(
            EventsPanelDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 383, Short.MAX_VALUE)
        );
        EventsPanelDisplayLayout.setVerticalGroup(
            EventsPanelDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 205, Short.MAX_VALUE)
        );

        terminalEvents.setColumns(20);
        terminalEvents.setRows(5);
        jScrollPane1.setViewportView(terminalEvents);

        STATUSpanel.setBorder(javax.swing.BorderFactory.createTitledBorder("CHARACTER_STATUS"));

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        HealthLabel.setText("HP");

        AttackLabel.setText("Atk");

        ExpLabel.setText("XP");

        MagicLabel.setText("Magic");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HealthLabel)
                    .addComponent(ExpLabel))
                .addGap(50, 50, 50)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MagicLabel)
                    .addComponent(AttackLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HealthLabel)
                    .addComponent(AttackLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExpLabel)
                    .addComponent(MagicLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        NameLabel.setText("Name");

        startBattleButton.setText("Start");
        startBattleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBattleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(startBattleButton)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(startBattleButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout STATUSpanelLayout = new javax.swing.GroupLayout(STATUSpanel);
        STATUSpanel.setLayout(STATUSpanelLayout);
        STATUSpanelLayout.setHorizontalGroup(
            STATUSpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(STATUSpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(STATUSpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(expProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        STATUSpanelLayout.setVerticalGroup(
            STATUSpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, STATUSpanelLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(expProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        DECKpanel.setBorder(javax.swing.BorderFactory.createTitledBorder("DECK"));

        equipButton1.setText("Un/Equip");
        equipButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equipButton1ActionPerformed(evt);
            }
        });

        selectItem1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        selectItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectItem1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DECKpanelLayout = new javax.swing.GroupLayout(DECKpanel);
        DECKpanel.setLayout(DECKpanelLayout);
        DECKpanelLayout.setHorizontalGroup(
            DECKpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DECKpanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(equipButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(selectItem1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        DECKpanelLayout.setVerticalGroup(
            DECKpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DECKpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DECKpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equipButton1)
                    .addComponent(selectItem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(STATUSpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DECKpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EventsPanelDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EventsPanelDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DECKpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(STATUSpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startBattleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBattleButtonActionPerformed
        
        if (adv == null){
            System.out.println("No adversary selected!");
            return;
        }
        
        Bt = new Battle(this.chr, this.adv);
        Bt.setListener(new Battle.BattleListener() {
            
            @Override
            public void roundEnd(Character chr, Character adv){
                terminalEvents.setText("\n "+adv.getName()+",Hp: "+adv.getHealthPoints()+" "+terminalEvents.getText());
                if (adv.getHealthPoints() <= 0)
                    terminalEvents.setText("Victory");
                if (chr.getHealthPoints() <= 0)
                    terminalEvents.setText("Defeat"+terminalEvents.getText());
                
            }
            @Override
            public void battleEnd(){
                updateDisplayComponents();
            }
        });
        Bt.start();
    }//GEN-LAST:event_startBattleButtonActionPerformed

    private void equipButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipButton1ActionPerformed
        
        if (equipButton1.getText().equals("Unequiped")){
            equipButton1.setText("Equiped");
        }else{
            if (equipButton1.getText().equals("Equiped"))
                equipButton1.setText("Unequiped");
        }
        
    }//GEN-LAST:event_equipButton1ActionPerformed

    private void selectItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectItem1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AttackLabel;
    private javax.swing.JPanel DECKpanel;
    private javax.swing.JPanel EventsPanelDisplay;
    private javax.swing.JLabel ExpLabel;
    private javax.swing.JLabel HealthLabel;
    private javax.swing.JLabel MagicLabel;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JPanel STATUSpanel;
    private javax.swing.JButton equipButton1;
    private javax.swing.JProgressBar expProgressBar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> selectItem1;
    private javax.swing.JButton startBattleButton;
    private javax.swing.JTextArea terminalEvents;
    // End of variables declaration//GEN-END:variables
}
