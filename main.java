/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random; 
import javax.swing.*;
/**
 *
 * @author root lee
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        jLabel1.setText("莊家手牌(莊家分數)");

        jLabel2.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        jLabel2.setText("你的手牌(你的分數)");

        jButton1.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        jButton1.setText("繼續補牌");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        jButton2.setText("掀底牌");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/0.gif"))); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(71, 96));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/0.gif"))); // NOI18N
        jLabel4.setPreferredSize(new java.awt.Dimension(71, 96));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/0.gif"))); // NOI18N
        jLabel5.setPreferredSize(new java.awt.Dimension(71, 96));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/0.gif"))); // NOI18N
        jLabel6.setPreferredSize(new java.awt.Dimension(71, 96));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/0.gif"))); // NOI18N
        jLabel7.setPreferredSize(new java.awt.Dimension(71, 96));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/0.gif"))); // NOI18N
        jLabel8.setPreferredSize(new java.awt.Dimension(71, 96));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/0.gif"))); // NOI18N
        jLabel9.setPreferredSize(new java.awt.Dimension(71, 96));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/0.gif"))); // NOI18N
        jLabel10.setPreferredSize(new java.awt.Dimension(71, 96));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/0.gif"))); // NOI18N
        jLabel11.setPreferredSize(new java.awt.Dimension(71, 96));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/0.gif"))); // NOI18N
        jLabel12.setPreferredSize(new java.awt.Dimension(71, 96));

        jButton3.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        jButton3.setText("開始遊戲");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("新細明體", 0, 36)); // NOI18N
        jLabel13.setText("  遊戲結果");

        jButton4.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        jButton4.setText("停止補牌");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("新細明體", 0, 48)); // NOI18N
        jLabel14.setText("0");

        jLabel15.setFont(new java.awt.Font("新細明體", 0, 48)); // NOI18N
        jLabel15.setText("未知");

        jButton5.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        jButton5.setText("重新開始");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private int i=0;
    private int n=0;
    private int s[] = new int[10];
    private int cant =0;
    private int plus1 = 0,plus2 = 0;
    private int check(int a,int b){
        for(int i = 0 ;i<=b;i++){
                while(a==s[b]){
                    a =(int)(Math.random()*52+1);
                }
            }
        return a;
    }
    private void lost(int a){
        int plus=0;
        for(int i = 0 ;i<5;i++){
            if(s[i]>=40){
                s[i]=s[i]-39;
            }
            else if(s[i]>=27){
                s[i]=s[i]-26;
            }
            else if(s[i]>=14){
                s[i]=s[i]-13;
            }
            if(s[i]>10){
                s[i]=s[i]-(s[i]%10);
            }
            plus=plus+s[i];
        }
        if ((a==5 && plus<=21)||plus==21){
            jLabel13.setText("You Win");
            cant = 100;
        }
        else if (plus>21){
            jLabel13.setText("You Lost");
            cant = 100;
        }
        jLabel14.setText(Integer.toString(plus));
        plus1=plus;
    }
    private void computer(int a){
        int plus =0;
        for(int i = 5 ;i<10;i++){
            if(s[i]>=40){
                s[i]=s[i]-39;
            }
            else if(s[i]>=27){
                s[i]=s[i]-26;
            }
            else if(s[i]>=14){
                s[i]=s[i]-13;
            }
            if(s[i]>10){
                s[i]=s[i]-(s[i]%10);
            }
            plus=plus+s[i];
        }
        plus2=plus;
        if (plus>=17){
            cant=100;
        }
        if ((a==10 && plus<=21)||(plus==21)||(plus>plus1 && (plus<=21))){
            jLabel13.setText("You Lost");
            cant = 100;
        }
        else if (plus2>21 ||(plus<plus1 && (plus<=21 && plus>=17))){
            jLabel13.setText("You Win");
            cant = 100;
        }
    }
    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:

        if (n==0 && cant!=100){
            for(int i=0;i<10;i++){
                s[i]=0;
            }
            Random random = new Random();
            int r = (int)(Math.random()*52+1);
            s[n]=r;
            n++;
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(String.valueOf(r)+".gif")));
            int t =(int)(Math.random()*52+1);
            check(r,n);
            //jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource(String.valueOf(t)+".gif")));
            s[5]=t;
            lost(n);
        }
        else if(n!=0){
            jButton3.setText("已經開始遊戲");
            lost(n);
        }
        
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        n=6;
        for (int i=5;i<10 && cant!=100;i++){
            if(n==6){
                Random random = new Random();
                int r = (int)(Math.random()*52+1);
                check(r,n);
                s[n]=r;
                n++;
                jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource(String.valueOf(r)+".gif")));
                computer(n);
            }
            else if(n==7){
                Random random = new Random();
                int r = (int)(Math.random()*52+1);
                check(r,n);
                s[n]=r;
                n++;
                jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource(String.valueOf(r)+".gif")));
                computer(n);
            }
            else if(n==8){
                Random random = new Random();
                int r = (int)(Math.random()*52+1);
                check(r,n);
                s[n]=r;
                n++;
                jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource(String.valueOf(r)+".gif")));
                computer(n);
            }
            else if(n==9){
                Random random = new Random();
                int r = (int)(Math.random()*52+1);
                check(r,n);
                s[n]=r;
                n++;
                jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource(String.valueOf(r)+".gif")));
                computer(n);
            }
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        if(n == 1 && cant!=100){
            Random random = new Random();
            int r = (int)(Math.random()*52+1);
            check(r,n);
            s[n]=r;
            n++;
            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource(String.valueOf(r)+".gif")));
            lost(n);
        }
        else if(n == 2 && cant!=100){
            Random random = new Random();
            int r = (int)(Math.random()*52+1);
            check(r,n);
            s[n]=r;
            n++;
            jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource(String.valueOf(r)+".gif")));
            lost(n);
        }
        else if(n == 3 && cant!=100){
            Random random = new Random();
            int r = (int)(Math.random()*52+1);
            check(r,n);
            s[n]=r;
            n++;
            jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource(String.valueOf(r)+".gif")));
            lost(n);
        }
        else if(n == 4 && cant!=100){
            Random random = new Random();
            int r = (int)(Math.random()*52+1);
            check(r,n);
            s[n]=r;
            n++;
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource(String.valueOf(r)+".gif")));
            lost(n);
        }
        else if(n==5){
            jButton1.setText("無法繼續補牌");
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        if(cant==100){
            computer(n);
            jButton2.setText("掀底牌");
            jLabel15.setText(Integer.toString(plus2));
            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource(String.valueOf(s[5])+".gif")));
        }
        else {
            jButton2.setText("偷看的是小狗");
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        n = 0;
        cant = 0;
        plus1 = 0;
        plus2 = 0;
        for(int i=0;i<10;i++){
                s[i]=0;
        }
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("0.gif")));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("0.gif")));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("0.gif")));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("0.gif")));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("0.gif")));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("0.gif")));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("0.gif")));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("0.gif")));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("0.gif")));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("0.gif")));
        jLabel13.setText("遊戲結果");
        jLabel14.setText(Integer.toString(0));
        jLabel15.setText("未知");
        jButton1.setText("繼續補牌");
        jButton2.setText("掀底牌");
        jButton3.setText("開始遊戲");
        jButton4.setText("停止補牌");

    }//GEN-LAST:event_jButton5MouseClicked

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
