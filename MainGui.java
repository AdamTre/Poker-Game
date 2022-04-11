/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

/**
 *
 * @author charlotteolaniyi
 */
public class MainGui extends javax.swing.JFrame {
    Poker p = new Poker();
    int count=0;
    int aiD;
    int p1TotalWager;
    int aiTotalWager;
    boolean playerRaised=false;

    
    

    /**
     * Creates new form MainGui
     */
    public MainGui() {
        p.startNewGame();
        initComponents();
        
        p1TotalWager=0;
   dealC1.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getDealerHand().getCard(0).getImage())));
   p1C1.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getPlayer1().getHand().getCard(0).getImage())));
   p1C2.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getPlayer1().getHand().getCard(1).getImage())));
   p1C3.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getPlayer1().getHand().getCard(2).getImage())));
   jLabel1.setText(Integer.toString(aiD));
    jLabel3.setText(Integer.toString(count));
    }

private void checkNewRound(){
System.out.println(p.getP1Turn());
System.out.println(p.getAITurn());

if(count==3){
int result = p.getWinner();
aiC1.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getPlayer2().getHand().getCard(0).getImage())));
aiC2.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getPlayer2().getHand().getCard(1).getImage())));
aiC3.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getPlayer2().getHand().getCard(2).getImage())));

if(result==0){
jLabel1.setText("Tie!Starting new Game");
p.startNewGame();
   count=1;
   playerRaised=false;
   dealC1.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getDealerHand().getCard(0).getImage())));
   p1C1.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getPlayer1().getHand().getCard(0).getImage())));
   p1C2.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getPlayer1().getHand().getCard(1).getImage())));
   p1C3.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getPlayer1().getHand().getCard(2).getImage())));
  aiC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b2fv.png")));
aiC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b2fv.png")));
aiC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b2fv.png")));
Balance.setText(Integer.toString(p.getPlayer1().getMoney()));

}else if(result==1){
jLabel1.setText("P1 Wins!Starting new Game");
p.startNewGame();
 p1TotalWager=0;
   count=1;
   playerRaised=false;
    dealC1.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getDealerHand().getCard(0).getImage())));
   p1C1.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getPlayer1().getHand().getCard(0).getImage())));
   p1C2.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getPlayer1().getHand().getCard(1).getImage())));
   p1C3.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getPlayer1().getHand().getCard(2).getImage())));
 aiC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b2fv.png")));
aiC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b2fv.png")));
aiC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b2fv.png")));
Balance.setText(Integer.toString(p.getPlayer1().getMoney()));

    }else if(result==2){
        jLabel1.setText("P2 Wins!Starting new Game");
        p.startNewGame();
    p1TotalWager=0;
   count=1;
   playerRaised=false;
   dealC1.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getDealerHand().getCard(0).getImage())));
   p1C1.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getPlayer1().getHand().getCard(0).getImage())));
   p1C2.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getPlayer1().getHand().getCard(1).getImage())));
   p1C3.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getPlayer1().getHand().getCard(2).getImage())));
 aiC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b2fv.png")));
aiC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b2fv.png")));
aiC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b2fv.png")));
Balance.setText(Integer.toString(p.getPlayer1().getMoney()));
    }   
}
 else if(count!=3&&p.turnOverCheck()==true){

p.startNewRound();
aiD = aiDecision();

if(p.getRound()==1){
dealC2.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getDealerHand().getCard(1).getImage())));
count=2;
  jLabel3.setText(Integer.toString(count));
Round.setText(Integer.toString(p.getRound()+1));

}else if(p.getRound()==2){
dealC3.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getDealerHand().getCard(2).getImage())));
count=3;
  jLabel3.setText(Integer.toString(count));
Round.setText(Integer.toString(p.getRound()+1));

    }else{

}
}
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        aiC3 = new javax.swing.JLabel();
        aiC2 = new javax.swing.JLabel();
        aiC1 = new javax.swing.JLabel();
        p1C3 = new javax.swing.JLabel();
        p1C2 = new javax.swing.JLabel();
        p1C1 = new javax.swing.JLabel();
        Fold = new javax.swing.JButton();
        Call = new javax.swing.JButton();
        Hold = new javax.swing.JButton();
        Raise = new javax.swing.JButton();
        dealC3 = new javax.swing.JLabel();
        dealC2 = new javax.swing.JLabel();
        dealC1 = new javax.swing.JLabel();
        p1NewWager = new javax.swing.JTextField();
        aiWager = new javax.swing.JTextField();
        P1CurrentWager = new javax.swing.JLabel();
        Balance = new javax.swing.JLabel();
        Round = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 0));

        aiC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b2fv.png"))); // NOI18N
        aiC3.setText("jLabel1");

        aiC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b2fv.png"))); // NOI18N
        aiC2.setText("jLabel2");

        aiC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b2fv.png"))); // NOI18N
        aiC1.setText("jLabel3");

        p1C3.setText("jLabel7");

        p1C2.setText("jLabel8");

        p1C1.setText("jLabel9");

        Fold.setText("Fold");
        Fold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FoldActionPerformed(evt);
            }
        });

        Call.setText("Call");
        Call.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CallActionPerformed(evt);
            }
        });

        Hold.setText("Hold");
        Hold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoldActionPerformed(evt);
            }
        });

        Raise.setText("Raise");
        Raise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RaiseActionPerformed(evt);
            }
        });

        dealC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b1fv.png"))); // NOI18N

        dealC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b1fv.png"))); // NOI18N

        dealC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b1fv.png"))); // NOI18N

        p1NewWager.setText("P1 Wager:###");
        p1NewWager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1NewWagerActionPerformed(evt);
            }
        });

        aiWager.setText("P2 Wager:###");
        aiWager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aiWagerActionPerformed(evt);
            }
        });

        P1CurrentWager.setText("Current Wager: 00");

        Balance.setText("Balance:1000");

        Round.setText("Round:1");

        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(141, 141, 141)
                                        .addComponent(Fold)
                                        .addGap(18, 18, 18)
                                        .addComponent(Call)
                                        .addGap(27, 27, 27)
                                        .addComponent(Hold))
                                    .addComponent(Balance))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(p1C2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(p1NewWager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Raise))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(p1C1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(P1CurrentWager))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(Round))
                        .addGap(212, 212, 212)
                        .addComponent(jLabel1)))
                .addGap(0, 131, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(p1C3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(aiC3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dealC3))))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dealC2)
                    .addComponent(aiC2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(aiC1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(aiWager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dealC1))
                .addGap(93, 93, 93))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aiC2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(aiWager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(aiC1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Round)
                            .addComponent(jLabel1))
                        .addGap(16, 16, 16)
                        .addComponent(aiC3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dealC2)
                    .addComponent(dealC1)
                    .addComponent(dealC3))
                .addGap(98, 98, 98)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p1C3)
                    .addComponent(p1C2)
                    .addComponent(p1C1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P1CurrentWager)
                    .addComponent(Balance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p1NewWager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Call)
                    .addComponent(Fold)
                    .addComponent(Hold)
                    .addComponent(Raise)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        //
    private void FoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FoldActionPerformed
        // TODO add your handling code here:
   p.Fold();
   dealC1.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getDealerHand().getCard(0).getImage())));
   dealC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b1fv.png")));
   dealC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b1fv.png")));
   p1C1.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getPlayer1().getHand().getCard(0).getImage())));
   p1C2.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getPlayer1().getHand().getCard(1).getImage())));
   p1C3.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getPlayer1().getHand().getCard(2).getImage())));
   P1CurrentWager.setText("Current Wager:");
   Balance.setText(Integer.toString(p.getPlayer1().getMoney()));
         
    }//GEN-LAST:event_FoldActionPerformed

    private void p1NewWagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1NewWagerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1NewWagerActionPerformed

//decide what AI(p2 in poker class) will do for its turn, we can ignore fold. Returns an int (1,or 2) depending on if they call or raise
private int aiDecision(){
 int ex=(int) (Math.random()*2 + 1);
jLabel1.setText(Integer.toString(ex));
return  ex;

}

private void aiAction(){
if(p.getAITurn()){
if(aiD==1){
    p.Raise((int)(((Math.random())*p.getPlayer1().getMoney())+1), p.getPlayer2());
    aiTotalWager=aiTotalWager+p.getPlayer2().getWager();
    aiWager.setText(Integer.toString(p.getPlayer2().getWager()));
    jLabel1.setText("P2 Raised");
//raise
p.setP1Turn(true);
p.setaiTurn(false);
}else if(aiD==2){
//call
      jLabel1.setText("P2 called");
    p.aiCall();
    aiWager.setText(Integer.toString(p.getPlayer2().getWager()));
    p.setaiTurn(false);
    

}
    aiD = aiDecision();
    
   // checkNewRound();
    
        }


 checkNewRound();
}

//Raise Button
    private void RaiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RaiseActionPerformed
    if(p.getP1Turn()){
     p.Raise(Integer.parseInt(p1NewWager.getText()), p.getPlayer1());
     p1TotalWager=p1TotalWager+p.getPlayer1().getWager();
     p.setP1Turn(false);
     p.setaiTurn(true);
     P1CurrentWager.setText(Integer.toString(p.getPlayer1().getWager()));
     playerRaised=true;
aiD=aiDecision();
  aiAction();
}
//Call AI turn

      
 //Poker.p1.setWager(jTextField1.get);        // TODO add your handling code here:
    }//GEN-LAST:event_RaiseActionPerformed

    private void aiWagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aiWagerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aiWagerActionPerformed
   
    private void HoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoldActionPerformed
        // TODO add your handling code here:
         //have ai go
        //AITurn
    
     aiAction();
    }//GEN-LAST:event_HoldActionPerformed

    private void CallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CallActionPerformed
        // TODO add your handling code here:
//ai has not went yet, so you can't call
     if(p.getAITurn()){
   jLabel1.setText("Can't call");
}else{
     p.Call();
     p.setP1Turn(false);
     P1CurrentWager.setText(Integer.toString(aiTotalWager));
      aiAction();

    }//GEN-LAST:event_CallActionPerformed
}
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
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Balance;
    private javax.swing.JButton Call;
    private javax.swing.JButton Fold;
    private javax.swing.JButton Hold;
    private javax.swing.JLabel P1CurrentWager;
    private javax.swing.JButton Raise;
    private javax.swing.JLabel Round;
    private javax.swing.JLabel aiC1;
    private javax.swing.JLabel aiC2;
    private javax.swing.JLabel aiC3;
    private javax.swing.JTextField aiWager;
    private javax.swing.JLabel dealC1;
    private javax.swing.JLabel dealC2;
    private javax.swing.JLabel dealC3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel p1C1;
    private javax.swing.JLabel p1C2;
    private javax.swing.JLabel p1C3;
    private javax.swing.JTextField p1NewWager;
    // End of variables declaration//GEN-END:variables
}
