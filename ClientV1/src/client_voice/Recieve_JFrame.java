/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client_voice;

import java.awt.Color;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.TargetDataLine;
import server.listen_voice;

/**
 *
 * @author PC
 */
public class Recieve_JFrame extends javax.swing.JFrame {

    /**
     * Creates new form Recieve_JFrame
     */
    public Recieve_JFrame() {
        initComponents();
    }
     
//    public static AudioFormat getaudioformat(){
//        float sampleRate = 8000.0F;
//        int sampleSizeInbits = 16;
//        int channel = 2;
//        boolean signed = true;
//        boolean bigEndian = false;
//        return new AudioFormat(sampleRate, sampleSizeInbits, channel, signed, bigEndian);
//    }
//    public SourceDataLine audio_out;
    public int port_server = 6789;
    public String add_server = Client_voice.ip_send_voice;
   // public  listen_voice listen=new listen_voice();
    TargetDataLine audio_in;
//    public static AudioFormat getaudioformat(){
//        float sampleRate = 8000.0F;
//        int sampleSizeInbits = 16;
//        int channel = 2;
//        boolean signed = true;
//        boolean bigEndian = false;
//        return new AudioFormat(sampleRate, sampleSizeInbits, channel, signed, bigEndian);
//    }
//    public void init_audio(){
//        try {
//            System.out.println(" da gui o port "+ port_server);
//            AudioFormat format = getaudioformat();
//            DataLine.Info info = new DataLine.Info(TargetDataLine.class, format);
//            if(!AudioSystem.isLineSupported(info)){
//                System.out.println("not suport");
//                System.exit(0);
//            }
//            audio_in = (TargetDataLine) AudioSystem.getLine(info);
//            audio_in.open(format);
//            audio_in.start();
//            recorder_thread r = new recorder_thread();
//            InetAddress inet = InetAddress.getByName(add_server);
//            r.audio_in = audio_in;
//            r.dout = new DatagramSocket();
//            r.server_ip = inet;
//            r.server_port = port_server;
//            Client_voice.calling = true;
//            r.start();
//        } catch (LineUnavailableException | UnknownHostException | SocketException ex) {
//            Logger.getLogger(client_fr.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Start = new javax.swing.JButton();
        btn_Cancel = new javax.swing.JButton();
        lb_call = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_Start.setBackground(new java.awt.Color(255, 255, 255));
        btn_Start.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_Start.setText("Ok");
        btn_Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_StartActionPerformed(evt);
            }
        });

        btn_Cancel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_Cancel.setText("Cancal");
        btn_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelActionPerformed(evt);
            }
        });

        lb_call.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lb_call.setText("   Someone is calling ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Start, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btn_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(lb_call)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_call, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Start, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_StartActionPerformed
        // TODO add your handling code here:
                    System.out.println(" Da gui o port 6789 ");
        r recieve= new r();
        recieve.port_server=6789;
        recieve.add_server=Client_voice.ip_send_voice;
        System.out.println("Gui am thanh cho ip" + Client_voice.ip_send_voice +" o port 6789" );
        recieve.init_audio();
       
//        Thread t1= new Thread(new send());
//        t1.start();
//        System.out.println("class1"); 
        
//        send se=new send();
//        se.port=8888;
//        se.message="OK";
//        Thread t1= new Thread(se);
//        t1.start();
        
        listen_voice listen=new listen_voice();
        listen.port_voice=9867;
        listen.start();
        
//        rr1 fr= new rr1();
//        fr.setVisible(true);
        this.btn_Start.setBackground(Color.red);        
        System.out.println(" Châp nhận cuộc gọi và khởi động client");
//        Client_voice.calling=true;
//        try {
//            init_audio();
//        } catch (UnknownHostException ex) {
//            Logger.getLogger(Recieve_JFrame.class.getName()).log(Level.SEVERE, null, ex);
//        }
   // this.setVisible(false);
    }//GEN-LAST:event_btn_StartActionPerformed

    private void btn_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelActionPerformed
        // TODO add your handling code here:
        Client_voice.calling=false;
        this.dispose();
    }//GEN-LAST:event_btn_CancelActionPerformed

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
            java.util.logging.Logger.getLogger(Recieve_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recieve_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recieve_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recieve_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recieve_JFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cancel;
    private javax.swing.JButton btn_Start;
    public javax.swing.JLabel lb_call;
    // End of variables declaration//GEN-END:variables
}