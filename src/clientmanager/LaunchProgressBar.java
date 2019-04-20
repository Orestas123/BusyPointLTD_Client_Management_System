
package clientmanager;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JProgressBar;
import javax.swing.plaf.PanelUI;


public class LaunchProgressBar extends javax.swing.JDialog {

    /** Creates new form LaunchProgressBar */
    public LaunchProgressBar() {
        setUndecorated(true);
        initComponents();
        this.setAlwaysOnTop(true);
        SplashPanel.setUI(new BgSplash());
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (dim.width-getWidth())/2;
        int y = (dim.height-getHeight())/2;
        setLocation(x, y);
        ProgressBar.setStringPainted(true);
    }
    
    public JProgressBar getProgressBar() {
        return ProgressBar;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplashPanel = new javax.swing.JPanel();
        ProgressBar = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        SplashPanel.setBackground(new java.awt.Color(255, 255, 255));
        SplashPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        ProgressBar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        ProgressBar.setForeground(new java.awt.Color(0, 255, 0));
        ProgressBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Please Wait...");

        javax.swing.GroupLayout SplashPanelLayout = new javax.swing.GroupLayout(SplashPanel);
        SplashPanel.setLayout(SplashPanelLayout);
        SplashPanelLayout.setHorizontalGroup(
            SplashPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SplashPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(SplashPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SplashPanelLayout.setVerticalGroup(
            SplashPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SplashPanelLayout.createSequentialGroup()
                .addContainerGap(252, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        getContentPane().add(SplashPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar ProgressBar;
    private javax.swing.JPanel SplashPanel;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
class BgSplash extends PanelUI {
    ImageIcon background = new ImageIcon(getClass().getResource("/Gambar/busy-point.png"));
    @Override
    public void paint(Graphics g, JComponent c) {
         g.drawImage(background.getImage(), 0, 0, null);
    }
}