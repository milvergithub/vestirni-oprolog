
import de.javasoft.plaf.synthetica.SyntheticaWhiteVisionLookAndFeel;
import java.io.File;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import jpl.Query;

/**
 * @author MILVER
 */
public class VentanaUI extends javax.swing.JFrame {
 private ArrayList<String>arriba;
 private ArrayList<String>medio;
 private ArrayList<String>abajo;
 private PanelNino pn;
 public VentanaUI() {
        initComponents();
        pn=new PanelNino();
        pn.setBounds(0, 0, personaDesnudo.getWidth(), personaDesnudo.getHeight());
        personaDesnudo.add(pn);
        arriba=new ArrayList<String>();
        arriba.add("fisico");
        medio=new ArrayList<String>();
        medio.add("desnudo");
        abajo=new ArrayList<String>();
        abajo.add("descalzo");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        personaDesnudo = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelArriba = new PanelClosed();
        camisa = new javax.swing.JButton();
        corbata = new javax.swing.JButton();
        polera = new javax.swing.JButton();
        chaleco = new javax.swing.JButton();
        traje = new javax.swing.JButton();
        btnQuitarPolera = new javax.swing.JButton();
        btnQuitarCamisa = new javax.swing.JButton();
        btnQuitarCorbata = new javax.swing.JButton();
        btnQuitarTraje = new javax.swing.JButton();
        btnQuitarChaleco = new javax.swing.JButton();
        panelCuerpo = new PanelClosed();
        pantalon = new javax.swing.JButton();
        calzoncillo = new javax.swing.JButton();
        btnQuitarCalzocillo = new javax.swing.JButton();
        btnQuitarPantalon = new javax.swing.JButton();
        panelPie = new PanelClosed();
        medias = new javax.swing.JButton();
        zapatos = new javax.swing.JButton();
        btnQuitarMedias = new javax.swing.JButton();
        btnQuitarZapatos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaExplicacion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        personaDesnudo.setBackground(new java.awt.Color(102, 102, 102));
        personaDesnudo.setLayout(null);

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        panelArriba.setLayout(null);

        camisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/camisa.png"))); // NOI18N
        camisa.setText("camisa");
        camisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camisaActionPerformed(evt);
            }
        });
        panelArriba.add(camisa);
        camisa.setBounds(220, 10, 160, 180);

        corbata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/corbata.png"))); // NOI18N
        corbata.setText("corbata");
        corbata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corbataActionPerformed(evt);
            }
        });
        panelArriba.add(corbata);
        corbata.setBounds(430, 10, 160, 180);

        polera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/polera.png"))); // NOI18N
        polera.setText("polera");
        polera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poleraActionPerformed(evt);
            }
        });
        panelArriba.add(polera);
        polera.setBounds(20, 10, 160, 180);

        chaleco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/chaleco.png"))); // NOI18N
        chaleco.setText("chaleco");
        chaleco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chalecoActionPerformed(evt);
            }
        });
        panelArriba.add(chaleco);
        chaleco.setBounds(220, 230, 160, 180);

        traje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/traje.png"))); // NOI18N
        traje.setText("traje");
        traje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trajeActionPerformed(evt);
            }
        });
        panelArriba.add(traje);
        traje.setBounds(20, 230, 160, 180);

        btnQuitarPolera.setText("Quitar Polera");
        btnQuitarPolera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarPoleraActionPerformed(evt);
            }
        });
        panelArriba.add(btnQuitarPolera);
        btnQuitarPolera.setBounds(20, 190, 160, 23);

        btnQuitarCamisa.setText("Quitar Camisa");
        btnQuitarCamisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarCamisaActionPerformed(evt);
            }
        });
        panelArriba.add(btnQuitarCamisa);
        btnQuitarCamisa.setBounds(220, 190, 160, 23);

        btnQuitarCorbata.setText("Quitar Corbata");
        btnQuitarCorbata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarCorbataActionPerformed(evt);
            }
        });
        panelArriba.add(btnQuitarCorbata);
        btnQuitarCorbata.setBounds(430, 190, 160, 23);

        btnQuitarTraje.setText("Quitar Traje ");
        btnQuitarTraje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarTrajeActionPerformed(evt);
            }
        });
        panelArriba.add(btnQuitarTraje);
        btnQuitarTraje.setBounds(20, 410, 160, 23);

        btnQuitarChaleco.setText("Quitar Chaleco");
        btnQuitarChaleco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarChalecoActionPerformed(evt);
            }
        });
        panelArriba.add(btnQuitarChaleco);
        btnQuitarChaleco.setBounds(220, 410, 160, 23);

        jTabbedPane1.addTab("CUERPO", panelArriba);

        panelCuerpo.setLayout(null);

        pantalon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pantalon.png"))); // NOI18N
        pantalon.setText("pantalon");
        pantalon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pantalonActionPerformed(evt);
            }
        });
        panelCuerpo.add(pantalon);
        pantalon.setBounds(230, 10, 160, 180);

        calzoncillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calzoncillo.png"))); // NOI18N
        calzoncillo.setText("calzoncillo");
        calzoncillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calzoncilloActionPerformed(evt);
            }
        });
        panelCuerpo.add(calzoncillo);
        calzoncillo.setBounds(20, 10, 160, 180);

        btnQuitarCalzocillo.setText("Quitar Calzoncillo");
        btnQuitarCalzocillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarCalzocilloActionPerformed(evt);
            }
        });
        panelCuerpo.add(btnQuitarCalzocillo);
        btnQuitarCalzocillo.setBounds(20, 190, 160, 23);

        btnQuitarPantalon.setText("Quitar Pantalon");
        btnQuitarPantalon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarPantalonActionPerformed(evt);
            }
        });
        panelCuerpo.add(btnQuitarPantalon);
        btnQuitarPantalon.setBounds(230, 190, 160, 23);

        jTabbedPane1.addTab("PIERNAS", panelCuerpo);

        panelPie.setLayout(null);

        medias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/medias.png"))); // NOI18N
        medias.setText("medias");
        medias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediasActionPerformed(evt);
            }
        });
        panelPie.add(medias);
        medias.setBounds(20, 20, 160, 180);

        zapatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/zapato.png"))); // NOI18N
        zapatos.setText("zapatos");
        zapatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zapatosActionPerformed(evt);
            }
        });
        panelPie.add(zapatos);
        zapatos.setBounds(210, 20, 160, 180);

        btnQuitarMedias.setText("Quitar Medias");
        btnQuitarMedias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarMediasActionPerformed(evt);
            }
        });
        panelPie.add(btnQuitarMedias);
        btnQuitarMedias.setBounds(20, 200, 160, 23);

        btnQuitarZapatos.setText("Quitar Zapatos");
        btnQuitarZapatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarZapatosActionPerformed(evt);
            }
        });
        panelPie.add(btnQuitarZapatos);
        btnQuitarZapatos.setBounds(210, 200, 160, 23);

        jTabbedPane1.addTab("PIE", panelPie);

        areaExplicacion.setColumns(20);
        areaExplicacion.setFont(new java.awt.Font("Source Code Pro Semibold", 1, 18)); // NOI18N
        areaExplicacion.setForeground(new java.awt.Color(0, 51, 102));
        areaExplicacion.setRows(5);
        jScrollPane1.setViewportView(areaExplicacion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(personaDesnudo, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(personaDesnudo, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private  void emparejarArriba(String ropa){
        String anterior=arriba.get(arriba.size()-1);
        File archivo=new File("src/vestir.pl");
        Query q1 = new Query("consult('C:/Users/MILVER/Documents/NetBeansProjects/IA_VESTIR/src/vestir.pl')");
        if(q1.hasSolution()){
        
        String c2 = "consulta("+ropa+","+anterior+")";
        Query q2 = new Query(c2);
        if(q2.hasSolution()){
            arriba.add(ropa);
            pn.actualizarImage(arriba.get(arriba.size()-1)+"_"+medio.get(medio.size()-1)+"_"+abajo.get(abajo.size()-1)+".png");
            pn.repaint();
            areaExplicacion.setText("Bien...");
        }
        else{
            String error="consulta(X,"+anterior+")";
            Query qsug=new Query(error);
            areaExplicacion.setText("La prenda que va encima  es : "+String.valueOf(qsug.oneSolution().get("X")));
        }
    }
    else{
        
    }
    }
    private void emparejar(String anterior,String ropa){
        
    }
    private void camisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camisaActionPerformed
        String ropa=camisa.getText();
        emparejarArriba(ropa);
    }//GEN-LAST:event_camisaActionPerformed

    private void poleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poleraActionPerformed
        // TODO add your handling code here:
        String ropa=polera.getText();
        emparejarArriba(ropa);
    }//GEN-LAST:event_poleraActionPerformed

    private void corbataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corbataActionPerformed
        // TODO add your handling code here:
        String ropa=corbata.getText();
        emparejarArriba(ropa);
    }//GEN-LAST:event_corbataActionPerformed

    private void chalecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chalecoActionPerformed
        // TODO add your handling code here:
        String ropa=chaleco.getText();
        emparejarArriba(ropa);
    }//GEN-LAST:event_chalecoActionPerformed

    private void trajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trajeActionPerformed
        // TODO add your handling code here:
        String ropa=traje.getText();
        emparejarArriba(ropa);
    }//GEN-LAST:event_trajeActionPerformed
    private void emparejarMedio(String ropa){
        String anterior=medio.get(medio.size()-1);
        Query q1 = new Query("consult('C:/Users/MILVER/Documents/NetBeansProjects/IA_VESTIR/src/vestir.pl')");
        if(q1.hasSolution()){
        
        String c2 = "consulta("+ropa+","+anterior+")";
        Query q2 = new Query(c2);
        if(q2.hasSolution()){
            medio.add(ropa);
            pn.actualizarImage(arriba.get(arriba.size()-1)+"_"+medio.get(medio.size()-1)+"_"+abajo.get(abajo.size()-1)+".png");
            pn.repaint();
            areaExplicacion.setText("Bien...");
        }
        else{
            String error="consulta(X,"+anterior+")";
            Query qsug=new Query(error);
            areaExplicacion.setText("La prenda que va encima es : "+String.valueOf(qsug.oneSolution().get("X")));  
        }
    }
    else{
        
    }
    }
    private void pantalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pantalonActionPerformed
        // TODO add your handling code here:
        String ropa=pantalon.getText();
        emparejarMedio(ropa);
    }//GEN-LAST:event_pantalonActionPerformed

    private void calzoncilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calzoncilloActionPerformed
        // TODO add your handling code here:
        String ropa=calzoncillo.getText();
        emparejarMedio(ropa);
    }//GEN-LAST:event_calzoncilloActionPerformed
    private void emparejarPie(String ropa){
        String anterior=abajo.get(abajo.size()-1);
        Query q1 = new Query("consult('C:/Users/MILVER/Documents/NetBeansProjects/IA_VESTIR/src/vestir.pl')");
        if(q1.hasSolution()){
        
        String c2 = "consulta("+ropa+","+anterior+")";
        Query q2 = new Query(c2);
        if(q2.hasSolution()){
            abajo.add(ropa);
            pn.actualizarImage(arriba.get(arriba.size()-1)+"_"+medio.get(medio.size()-1)+"_"+abajo.get(abajo.size()-1)+".png");
            pn.repaint();
            areaExplicacion.setText("Bien...");
        }
        else{
            String error="consulta(X,"+anterior+")";
            Query qsug=new Query(error);
            areaExplicacion.setText("La prenda que va encima es : "+String.valueOf(qsug.oneSolution().get("X")));   
        }
    }
    else{
        
    }
    }
    private void mediasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediasActionPerformed
        // TODO add your handling code here:
        String ropa=medias.getText();
        emparejarPie(ropa);
    }//GEN-LAST:event_mediasActionPerformed

    private void zapatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zapatosActionPerformed
        // TODO add your handling code here:
        String ropa=zapatos.getText();
        emparejarEspecial(ropa);
    }//GEN-LAST:event_zapatosActionPerformed

    private void btnQuitarPoleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarPoleraActionPerformed
        // TODO add your handling code here:
        String encima=arriba.get(arriba.size()-1);
        String prenda="polera";
        quitarPrendas(prenda, encima, arriba);
        
        
    }//GEN-LAST:event_btnQuitarPoleraActionPerformed

    private void btnQuitarCamisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarCamisaActionPerformed
        // TODO add your handling code here:
        String encima=arriba.get(arriba.size()-1);
        String prenda="camisa";
        quitarPrendas(prenda, encima, arriba);
    }//GEN-LAST:event_btnQuitarCamisaActionPerformed

    private void btnQuitarCorbataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarCorbataActionPerformed
        // TODO add your handling code here:
        String encima=arriba.get(arriba.size()-1);
        String prenda="corbata";
        quitarPrendas(prenda, encima, arriba);
    }//GEN-LAST:event_btnQuitarCorbataActionPerformed

    private void btnQuitarTrajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarTrajeActionPerformed
        // TODO add your handling code here:
        String encima=arriba.get(arriba.size()-1);
        String prenda="traje";
        quitarPrendas(prenda, encima, arriba);
    }//GEN-LAST:event_btnQuitarTrajeActionPerformed

    private void btnQuitarChalecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarChalecoActionPerformed
        // TODO add your handling code here:
        String encima=arriba.get(arriba.size()-1);
        String prenda="chaleco";
        quitarPrendas(prenda, encima, arriba);
    }//GEN-LAST:event_btnQuitarChalecoActionPerformed

    private void btnQuitarCalzocilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarCalzocilloActionPerformed
        // TODO add your handling code here:
        String encima=medio.get(medio.size()-1);
        String prenda="calzoncillo";
        quitarPrendas(prenda, encima, medio);
    }//GEN-LAST:event_btnQuitarCalzocilloActionPerformed

    private void btnQuitarPantalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarPantalonActionPerformed
        // TODO add your handling code here:
        String encima=abajo.get(abajo.size()-1);
        String prenda="pantalon";
        quitarPrendas(prenda, encima, medio);
    }//GEN-LAST:event_btnQuitarPantalonActionPerformed

    private void btnQuitarMediasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarMediasActionPerformed
        // TODO add your handling code here:
        String encima=abajo.get(abajo.size()-1);
        String prenda="medias";
        quitarPrendas(prenda, encima, abajo);
    }//GEN-LAST:event_btnQuitarMediasActionPerformed

    private void btnQuitarZapatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarZapatosActionPerformed
        // TODO add your handling code here:
        String encima=abajo.get(abajo.size()-1);
        String prenda="zapatos";
        quitarPrendas(prenda, encima, abajo);
    }//GEN-LAST:event_btnQuitarZapatosActionPerformed
    private void quitarPrendas(String prenda,String encima,ArrayList<String> parte){
        Query pregunta=new Query("consult('C:/Users/MILVER/Documents/NetBeansProjects/IA_VESTIR/src/vestir.pl')");
        if(pregunta.hasSolution()){
        
        String c2 = "devestir("+prenda+","+encima+")";
        Query q2 = new Query(c2);
        if(q2.hasSolution()){
            parte.remove(parte.size()-1);
            pn.actualizarImage(arriba.get(arriba.size()-1)+"_"+medio.get(medio.size()-1)+"_"+abajo.get(abajo.size()-1)+".png");
            pn.repaint();
            areaExplicacion.setText("Bien...");
        }
        else{
            String error="devestir(X,"+encima+")";
            Query qsug=new Query(error);
            if (qsug.hasSolution()) {
                areaExplicacion.setText("La prenda que debe quitar primero es  : "+String.valueOf(qsug.oneSolution().get("X")));
            } else {
                areaExplicacion.setText("No hay Prendas que quitar...!!!");
            }
   
            }
        }
    }
    private void emparejarEspecial(String ropa){
        String pantalon=medio.get(medio.size()-1);
        String media=abajo.get(abajo.size()-1);
        Query q1 = new Query("consult('C:/Users/MILVER/Documents/NetBeansProjects/IA_VESTIR/src/vestir.pl')");
        if(q1.hasSolution()){
        
        String c2 = "consultaD("+ropa+","+pantalon+","+media+")";
        Query q2 = new Query(c2);
        if(q2.hasSolution()){
            abajo.add(ropa);
            pn.actualizarImage(arriba.get(arriba.size()-1)+"_"+medio.get(medio.size()-1)+"_"+abajo.get(abajo.size()-1)+".png");
            pn.repaint();
            areaExplicacion.setText("Bien...");
        }
        else{
            String error="consulta(X,"+media+")";
            Query qsug=new Query(error);
            areaExplicacion.setText("La prenda que va encima es : "+String.valueOf(qsug.oneSolution().get("X")));   
        }
    }
    else{
        
    }
    }
    public static void main(String args[]) {
     try {
         try {
             UIManager.setLookAndFeel(new SyntheticaWhiteVisionLookAndFeel());
         } catch (ParseException ex) {
             Logger.getLogger(VentanaUI.class.getName()).log(Level.SEVERE, null, ex);
         }
     } catch (UnsupportedLookAndFeelException ex) {
         Logger.getLogger(VentanaUI.class.getName()).log(Level.SEVERE, null, ex);
     }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaExplicacion;
    private javax.swing.JButton btnQuitarCalzocillo;
    private javax.swing.JButton btnQuitarCamisa;
    private javax.swing.JButton btnQuitarChaleco;
    private javax.swing.JButton btnQuitarCorbata;
    private javax.swing.JButton btnQuitarMedias;
    private javax.swing.JButton btnQuitarPantalon;
    private javax.swing.JButton btnQuitarPolera;
    private javax.swing.JButton btnQuitarTraje;
    private javax.swing.JButton btnQuitarZapatos;
    private javax.swing.JButton calzoncillo;
    private javax.swing.JButton camisa;
    private javax.swing.JButton chaleco;
    private javax.swing.JButton corbata;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton medias;
    private javax.swing.JPanel panelArriba;
    private javax.swing.JPanel panelCuerpo;
    private javax.swing.JPanel panelPie;
    private javax.swing.JButton pantalon;
    private javax.swing.JPanel personaDesnudo;
    private javax.swing.JButton polera;
    private javax.swing.JButton traje;
    private javax.swing.JButton zapatos;
    // End of variables declaration//GEN-END:variables
}
