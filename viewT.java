/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GV;



import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Anamta
 */
public class viewT extends javax.swing.JFrame {

    String g;
    Font originalFont=null;
    HashMap<Integer, ArrayList> hm=new HashMap<>();
    
    public viewT() {
        initComponents();
        g="Hang Man";
        process();
    }
    public viewT(String game)
    {
        initComponents();
      g=game;  
      
      process();
      
      
    }
      
      private void process()
      {
     
      try{
          
       Class.forName("com.mysql.jdbc.Driver");
       Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gv","root","passcode");
       Statement smt = con.createStatement();
       Statement stmt=con.createStatement();
       String query="select tID from team where game='"+g+"'";
       ResultSet rs=smt.executeQuery(query);
      while(rs.next())
      {
      int id=rs.getInt("tID");
      String query2="select members from members where tId="+id;
      ArrayList<String> mem=new ArrayList<>();
      ResultSet rs2=stmt.executeQuery(query2);
      while(rs2.next()){
      String m=rs2.getString("members");
      mem.add(m);
      
      }
      
      hm.put(id, mem);
      }
      DefaultListModel obj=(DefaultListModel) teamList.getModel();
      
              for (Map.Entry<Integer, ArrayList> entry : hm.entrySet()) {
    Integer key = entry.getKey();
    
    obj.addElement(key.toString());


      
      }
      
      }
      
      
          
          
          
          
          
          
       

    catch(Exception e){
        JOptionPane.showMessageDialog(this, e.getMessage());
        
        
}
      }
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        pane = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        teamList = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        membersList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 34)); // NOI18N
        jLabel11.setText("GAMING VIRTUOSO");

        teamList.setModel(new DefaultListModel());
        teamList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        teamList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                teamListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(teamList);

        membersList.setModel(new DefaultListModel()   
        );
        jScrollPane2.setViewportView(membersList);

        jLabel1.setText("Teams:");

        jLabel2.setText("Members:");

        javax.swing.GroupLayout paneLayout = new javax.swing.GroupLayout(pane);
        pane.setLayout(paneLayout);
        paneLayout.setHorizontalGroup(
            paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addGroup(paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paneLayout.setVerticalGroup(
            paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        back.setText("Back");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(jLabel11)
                .addContainerGap(179, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void teamListValueChanged(javax.swing.event.ListSelectionEvent evt) {                                      
DefaultListModel obj2=(DefaultListModel) membersList.getModel();
obj2.removeAllElements();
        String value= teamList.getSelectedValue();   
int val=Integer.parseInt(value);
List<String> allvalues=hm.get(val);

for(Iterator<String> iter=allvalues.iterator(); iter.hasNext();)
{
    String memberids=iter.next();
    obj2.addElement(memberids);
}

    }
                              

    private void backikhkMouseExited(java.awt.event.MouseEvent evt) {                                   
     // back.setFont(originalFont);
              
    }                                     

    private void backMouseClicked(java.awt.event.MouseEvent evt) {                                  
                              
this.setVisible(false);       
    }                                 

    private void backMouseEntered(java.awt.event.MouseEvent evt) {                                  
        originalFont = back.getFont();
        Map attributes = originalFont.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
      back.setFont(originalFont.deriveFont(attributes));
    }                                 

    private void backMouseExited(java.awt.event.MouseEvent evt) {                                 
        back.setFont(originalFont);
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
            java.util.logging.Logger.getLogger(viewT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> membersList;
    private javax.swing.JPanel pane;
    private javax.swing.JList<String> teamList;
    // End of variables declaration                   
}
