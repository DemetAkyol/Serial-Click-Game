/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialclickgame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author DemetAkyol
 */
public class ServerPanel extends javax.swing.JFrame implements FrameBehavior1 {

    private Random randomNumbers = new Random();
    public final static int ONE_SECOND = 2000;
    Timer timer;

    /**
     * Creates new form ServerPanel
     */
    public ServerPanel() {
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

        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPort = new javax.swing.JTextPane();
        btnServerStart = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        gamers = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        width = new javax.swing.JTextField();
        height = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        startGame = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Messages = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setText("Port");

        txtPort.setText("5005");
        txtPort.setName("txtPort"); // NOI18N
        jScrollPane2.setViewportView(txtPort);

        btnServerStart.setText("Start Server");
        btnServerStart.setName("btnStartServer"); // NOI18N
        btnServerStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServerStartActionPerformed(evt);
            }
        });

        gamers.setColumns(20);
        gamers.setRows(5);
        jScrollPane1.setViewportView(gamers);

        jLabel1.setText("Gamers");

        jLabel2.setText("Enter Game Panel width-height :");

        width.setText("400");
        width.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                widthActionPerformed(evt);
            }
        });

        height.setText("400");

        jLabel3.setText("width ");

        jLabel4.setText("height");

        startGame.setBackground(new java.awt.Color(255, 51, 51));
        startGame.setText("START GAME");
        startGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startGameActionPerformed(evt);
            }
        });

        Messages.setColumns(20);
        Messages.setRows(5);
        jScrollPane3.setViewportView(Messages);

        jLabel5.setText("Gamers Messages");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField1)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnServerStart)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(height, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(width, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(startGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnServerStart)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(width, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(height, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(startGame, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnServerStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServerStartActionPerformed
        ServerListener newHosting = new ServerListener(txtPort.getText(), this, "server");
        newHosting.start();
        btnServerStart.setEnabled(false);

    }//GEN-LAST:event_btnServerStartActionPerformed

    private void widthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_widthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_widthActionPerformed

    private void startGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startGameActionPerformed
        Info.shapes = new ArrayList<Shape>();
        timer = new Timer(ONE_SECOND, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                boolean cyclic = randomNumbers.nextBoolean();

                // generate random coordinates		
                int x1 = randomNumbers.nextInt(Integer.parseInt(width.getText()));
                int y1 = randomNumbers.nextInt(Integer.parseInt(height.getText()));
                int w = 50;
                int h = 50;

                // generate a random color
                // generate random shape
                //  int randomShape = randomNumbers.nextInt(3) + 1;
                int firstColor = randomNumbers.nextInt(3) + 1;
                int secondColor = randomNumbers.nextInt(3) + 1;

                Shape shape = new Shape(2, x1, y1, w, h, firstColor, secondColor, false);
                Info.shapes.add(shape);
                sendShapes();
            }
        });
        timer.start();
    }//GEN-LAST:event_startGameActionPerformed

    public void sendShapes() {
        String text = "Start+";
        for (Shape shape : Info.shapes) {
            if (shape.isActive) {
                text += height.getText() + "+" + width.getText() + "+"
                        + String.valueOf(shape.X1) + "+" + String.valueOf(shape.Y1) + "+" + String.valueOf(shape.X2) + "+" + String.valueOf(shape.Y2)
                        + "+" + String.valueOf(shape.Type) + "+" + Integer.toString(shape.FirstColor) + "+" + Integer.toString(shape.SecondColor) + "+" + Boolean.toString(true) + ";";

            }
        }
        for (Gamer clt : Info.clients) {
            clt.myOutputMessages.add(text);
        }
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
            java.util.logging.Logger.getLogger(ServerPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServerPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServerPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServerPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ServerPanel().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Messages;
    private javax.swing.JButton btnServerStart;
    private javax.swing.JTextArea gamers;
    private javax.swing.JTextField height;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton startGame;
    private javax.swing.JTextPane txtPort;
    private javax.swing.JTextField width;
    // End of variables declaration//GEN-END:variables

    @Override
    public void makeAction(String msg, Gamer sender) {
        if (timer != null) {
            timer.stop();
        }
        String mParsed[] = msg.split("\\+");

        if (mParsed.length >= 2) {
            if (mParsed[0].equals("TakmaAd")) {
                sender.TakmaAd = mParsed[1];

                showGamers(sender.TakmaAd, sender);
                for (Gamer clt : Info.clients) {
                    clt.joined.add("nick+" + sender.TakmaAd);
                }

            } else if (mParsed[0].equals("Mesaj")) {
                for (Gamer clt : Info.clients) {
                    clt.myOutputMessages.add("message+" + "from" + " " + sender.TakmaAd + " " + ": " + mParsed[1]);

                }
                printResult("message" +" " + "from" + " " + sender.TakmaAd + " " + ": " + mParsed[1]);
            } else if (mParsed[0].equals("click")) {
                int x = Integer.parseInt(mParsed[1]);
                int y = Integer.parseInt(mParsed[2]);

                for (Shape item : new Reversed<>(Info.shapes)) {
                    if (ContainsRectangle(x, y, item.X1, item.Y1, item.X2, item.Y2)) {
                        if (item.FirstColor == 1) {
                            item.isActive = false;
                            UpdatePoint(sender.TakmaAd, 5);
                            sendShapes();
                            break;
                        } else if (item.FirstColor == 2) {
                            item.isActive = false;
                            UpdatePoint(sender.TakmaAd, -3);
                            sendShapes();
                            break;
                        } else if (item.FirstColor == 3) {
                            item.isActive = false;
                            UpdatePoint(sender.TakmaAd, +2);
                            sendShapes();
                            break;
                        }
                    }

                }
            }
        }
        if (timer != null) {
            timer.start();
        }
        repaint();
    }

    private boolean ContainsRectangle(int x, int y, int sx, int sy, int sw, int sh) {

        return (x > sx
                && x < (sx + sw)
                && y > sy
                && y < (sy + sh));
    }

//
//    private boolean ContainsEllipse(int x, int y, int sx, int sy, int sw, int sh) {
//
//        return (((int) Math.pow((x - ((sx + (sw / 2)))), 2)
//                / (int) Math.pow(sw / 2, 2))
//                + ((int) Math.pow((y - (sy + (sh / 2))), 2)
//                / (int) Math.pow(sh / 2, 2))) < 1;
//    }
    /*
    
     private boolean ContainsTriangle(int x, int y, int sx, int sy, int sw, int sh)
     {
            
     int[] pointx = new int[3];
     int[] pointy = new int[3];
            
     pointx[0] = sx + (sw / 2);
     pointy[0] = (sy);
     pointx[1] = sx;
     point[1].Y = sy+ (sh);
     point[2].X = (sx + sw);
     point[2].Y = (sy+ sh);
     double abc = TriangleArea(point[0], point[1], point[2]);
     double xbc = TriangleArea(location, point[1], point[2]);
     double axc = TriangleArea(point[0], location, point[2]);
     double abx = TriangleArea(point[0], point[1], location);
     return (abc == xbc + axc + abx);
     }
     private static double TriangleArea(PointF x, PointF y, PointF z)
     {
     return Math.Abs((x.X * (y.Y - z.Y) + y.X * (z.Y - x.Y) + z.X * (x.Y - y.Y)) / 2.0);
     }
    
    
     */
    //burasi duzenlenecek
    private void UpdatePoint(String name, int point) {
        for (Gamer clt : Info.clients) {
            if (clt.TakmaAd.equals(name)) {
                clt.Point += point;
              
                                    clt.myOutputMessages.add("point+" + clt.Point+"*"+clt.TakmaAd);

               

            }
        }
    }

    public void printResult(String msg) {
        Messages.setText(Messages.getText() + "\n" + msg);
    }

    @Override
    public void sendGamer(String msg, Gamer sender) {
    }

    public void showGamers(String msg, Gamer sender) {
          String mParsed[] = msg.split("\\+");
        gamers.setText(gamers.getText() + "\n" + mParsed[0]);
    }

    @Override
    public void starteGame(String received) {
    }

 

    @Override
    public void updatePoint(int point, String win) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
