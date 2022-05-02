
import java.util.concurrent.TimeUnit;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author adamt
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
    public MainGui()  {


p.startNewGame();

initComponents();

       
 restart.setVisible(false);
        jLabel11.setText("Poker");
        p1TotalWager=0;
   dealC1.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getDealerHand().getCard(0).getImage())));
   p1C1.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getPlayer1().getHand().getCard(0).getImage())));
   p1C2.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getPlayer1().getHand().getCard(1).getImage())));
   p1C3.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getPlayer1().getHand().getCard(2).getImage())));
//you might be wondering "Adam why did you do this this seems inefficienct why not just reveal the P2 cards when the game is over" and you'd be right but for some reason
//that causes a dealer card to be displayed
aiC1.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getPlayer2().getHand().getCard(0).getImage())));
aiC2.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getPlayer2().getHand().getCard(1).getImage())));
aiC3.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getPlayer2().getHand().getCard(2).getImage())));
aiC1.setVisible(false);
aiC2.setVisible(false);
aiC3.setVisible(false);
}
    


private void checkNewRound(){
System.out.println(p.getP1Turn());
System.out.println(p.getAITurn());

if(count==3){
int result = p.getWinner();

switch(result){
case 0: 
jLabel11.setText("Tie!");
cover1.setVisible(false);
cover2.setVisible(false);
cover3.setVisible(false);
aiC1.setVisible(true);
aiC2.setVisible(true);
aiC3.setVisible(true);
restart.setVisible(true);

break;

case 1: 
jLabel11.setText("P1 Wins!");
cover1.setVisible(false);
cover2.setVisible(false);
cover3.setVisible(false);
aiC1.setVisible(true);
aiC2.setVisible(true);
aiC3.setVisible(true);
restart.setVisible(true);
/*
p.startNewGame();
 p1TotalWager=0;
   count=1;
   playerRaised=false;
   p1C1.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getPlayer1().getHand().getCard(0).getImage())));
   p1C2.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getPlayer1().getHand().getCard(1).getImage())));
   p1C3.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getPlayer1().getHand().getCard(2).getImage())));
 aiC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b2fv.png")));
aiC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b2fv.png")));
aiC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b2fv.png")));
Balance.setText(Integer.toString(p.getPlayer1().getMoney()));
P1CurrentWager.setText("0");
*/
break;

   case -1:

        jLabel11.setText("P2 Wins!Starting new Game");
cover1.setVisible(false);
cover2.setVisible(false);
cover3.setVisible(false);
aiC1.setVisible(true);
aiC2.setVisible(true);
aiC3.setVisible(true);
    restart.setVisible(true);
/*
        p.startNewGame();
    p1TotalWager=0;
   count=1;
   playerRaised=false;
   p1C1.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getPlayer1().getHand().getCard(0).getImage())));
   p1C2.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getPlayer1().getHand().getCard(1).getImage())));
   p1C3.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getPlayer1().getHand().getCard(2).getImage())));
 aiC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b2fv.png")));
aiC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b2fv.png")));
aiC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b2fv.png")));
Balance.setText(Integer.toString(p.getPlayer1().getMoney()));
P1CurrentWager.setText("0");
*/
break;

default: break;
    }   

}
 else if(count!=3&&p.turnOverCheck()==true){

p.startNewRound();
aiD = aiDecision();

if(p.getRound()==1){
dealC2.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getDealerHand().getCard(1).getImage())));
count=2;
  
Round.setText(Integer.toString(p.getRound()+1));

}else if(p.getRound()==2){
dealC3.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getDealerHand().getCard(2).getImage())));
count=3;

Round.setText(Integer.toString(p.getRound()+1));

    }else{

}
}
}

private int aiDecision(){
 int ex=(int) (Math.random()*2 + 1);
return  ex;

}

private void aiAction(){
if(p.getAITurn()){
if(aiD==1){
if( p.getPlayer1().getWager()>p.getPlayer2().getWager()){
int dif= p.getPlayer1().getWager()-p.getPlayer2().getWager();
p.Raise((int)(((Math.random())*p.getPlayer1().getMoney()/2)+1)+dif, p.getPlayer2());
}else{
    p.Raise((int)(((Math.random())*p.getPlayer1().getMoney())+1), p.getPlayer2());
}
    aiTotalWager=aiTotalWager+p.getPlayer2().getWager();
    aiWager.setText(Integer.toString(p.getPlayer2().getWager()));
    jLabel11.setText("P2 Raised");
//raise
p.setP1Turn(true);
p.setaiTurn(false);
}else if(aiD==2){
//call
    p.aiCall();
    aiWager.setText(Integer.toString(p.getPlayer2().getWager()));
    p.setaiTurn(false);
    

}
    aiD = aiDecision();
    
   // checkNewRound();
    
        }


 checkNewRound();
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Round = new javax.swing.JLabel();
        aiC3 = new javax.swing.JLabel();
        aiC2 = new javax.swing.JLabel();
        aiC1 = new javax.swing.JLabel();
        dealC1 = new javax.swing.JLabel();
        dealC2 = new javax.swing.JLabel();
        dealC3 = new javax.swing.JLabel();
        p1C3 = new javax.swing.JLabel();
        p1C2 = new javax.swing.JLabel();
        p1C1 = new javax.swing.JLabel();
        Balance = new javax.swing.JLabel();
        Fold = new javax.swing.JButton();
        Call = new javax.swing.JButton();
        Hold = new javax.swing.JButton();
        Raise = new javax.swing.JButton();
        restart = new javax.swing.JButton();
        p1NewWager = new javax.swing.JTextField();
        P1CurrentWager = new javax.swing.JLabel();
        aiWager = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cover2 = new javax.swing.JLabel();
        cover3 = new javax.swing.JLabel();
        cover1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 51));

        Round.setText("Round:1");

        aiC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b2fv.png"))); // NOI18N

        aiC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b2fv.png"))); // NOI18N

        aiC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b2fv.png"))); // NOI18N
        aiC1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        dealC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b1fv.png"))); // NOI18N

        dealC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b1fv.png"))); // NOI18N

        dealC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b1fv.png"))); // NOI18N

        p1C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b1fv.png"))); // NOI18N

        p1C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b1fv.png"))); // NOI18N

        p1C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b1fv.png"))); // NOI18N

        Balance.setText("Balance: 1000");

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

        restart.setText("New Game");
        restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartActionPerformed(evt);
            }
        });

        p1NewWager.setText("Betting:");

        P1CurrentWager.setText("Current Wager:0");

        aiWager.setText("P2 Wager:");

        jLabel11.setText("jLabel1");

        cover2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b2fv.png"))); // NOI18N

        cover3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b2fv.png"))); // NOI18N

        cover1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b2fv.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Round)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cover3)
                            .addComponent(aiC3))
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aiC2)
                            .addComponent(cover2))
                        .addGap(89, 89, 89)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aiC1)
                            .addComponent(cover1))
                        .addGap(99, 99, 99)
                        .addComponent(aiWager))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(dealC3)
                        .addGap(77, 77, 77)
                        .addComponent(dealC2)
                        .addGap(94, 94, 94)
                        .addComponent(dealC1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(p1C3)
                        .addGap(79, 79, 79)
                        .addComponent(p1C2)
                        .addGap(89, 89, 89)
                        .addComponent(p1C1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(Balance)
                        .addGap(211, 211, 211)
                        .addComponent(P1CurrentWager))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(Fold)
                        .addGap(12, 12, 12)
                        .addComponent(Hold)
                        .addGap(12, 12, 12)
                        .addComponent(Call)
                        .addGap(12, 12, 12)
                        .addComponent(p1NewWager, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(Raise)
                        .addGap(7, 7, 7)
                        .addComponent(restart)))
                .addContainerGap(242, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Round)
                .addGap(13, 13, 13)
                .addComponent(jLabel11)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cover3)
                            .addComponent(aiC3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aiC2)
                            .addComponent(cover2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(aiC1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cover1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aiWager))
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dealC3)
                    .addComponent(dealC2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(dealC1)))
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p1C3)
                    .addComponent(p1C2)
                    .addComponent(p1C1))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Balance)
                    .addComponent(P1CurrentWager))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Fold)
                    .addComponent(Hold)
                    .addComponent(Call)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(p1NewWager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Raise)
                    .addComponent(restart)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FoldActionPerformed
        // TODO add your handling code here:
 p.Fold();
  cover1.setVisible(false);
cover2.setVisible(false);
cover3.setVisible(false);
aiC1.setVisible(true);
aiC2.setVisible(true);
aiC3.setVisible(true);
    restart.setVisible(true);
   Balance.setText(Integer.toString(p.getPlayer1().getMoney()));
    }//GEN-LAST:event_FoldActionPerformed

    private void CallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CallActionPerformed
        // TODO add your handling code here:
// TODO add your handling code here:
//ai has not went yet, so you can't call
     if(p.getAITurn()){
   jLabel11.setText("Can't call");
}else{
     p.Call();
     p.setP1Turn(false);
     P1CurrentWager.setText(Integer.toString(aiTotalWager));
      aiAction();
}
           
    }//GEN-LAST:event_CallActionPerformed

    private void RaiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RaiseActionPerformed
        // TODO add your handling code here:
if(p.getP1Turn()){
if(p.getPlayer2().getWager()>p.getPlayer1().getWager()){
int dif=p.getPlayer2().getWager()-p.getPlayer1().getWager();
p.Raise(Integer.parseInt(p1NewWager.getText())+dif, p.getPlayer1());
}else{
     p.Raise(Integer.parseInt(p1NewWager.getText()), p.getPlayer1());
}
     p1TotalWager=p1TotalWager+p.getPlayer1().getWager();
     p.setP1Turn(false);
     p.setaiTurn(true);
     P1CurrentWager.setText(Integer.toString(p.getPlayer1().getWager()));
     playerRaised=true;
    aiD=aiDecision();
    aiAction();
}

    }//GEN-LAST:event_RaiseActionPerformed

    private void HoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoldActionPerformed
        // TODO add your handling code here:
        aiAction();
    }//GEN-LAST:event_HoldActionPerformed

    private void restartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartActionPerformed
        // TODO add your handling code here:
restart.setVisible(false);
aiC1.setVisible(false);
aiC2.setVisible(false);
aiC3.setVisible(false);
cover1.setVisible(true);
cover2.setVisible(true);
cover3.setVisible(true);
p.startNewGame();
 p1TotalWager=0;
 aiTotalWager=0;
   count=1;
   playerRaised=false;
   p1C1.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getPlayer1().getHand().getCard(0).getImage())));
   p1C2.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getPlayer1().getHand().getCard(1).getImage())));
   p1C3.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getPlayer1().getHand().getCard(2).getImage())));
   aiC1.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getPlayer2().getHand().getCard(0).getImage())));
   aiC2.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getPlayer2().getHand().getCard(1).getImage())));
   aiC3.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getPlayer2().getHand().getCard(2).getImage())));
  dealC1.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getDealerHand().getCard(0).getImage())));
dealC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b1fv.png")));
dealC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b1fv.png")));
Balance.setText(Integer.toString(p.getPlayer1().getMoney()));
P1CurrentWager.setText("0");

    }//GEN-LAST:event_restartActionPerformed

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
    private javax.swing.JLabel aiWager;
    private javax.swing.JLabel cover1;
    private javax.swing.JLabel cover2;
    private javax.swing.JLabel cover3;
    private javax.swing.JLabel dealC1;
    private javax.swing.JLabel dealC2;
    private javax.swing.JLabel dealC3;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel p1C1;
    private javax.swing.JLabel p1C2;
    private javax.swing.JLabel p1C3;
    private javax.swing.JTextField p1NewWager;
    private javax.swing.JButton restart;
    // End of variables declaration//GEN-END:variables
}
