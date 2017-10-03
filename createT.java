/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GV;

import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.font.TextAttribute;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Anamta
 */
public class createT extends javax.swing.JFrame {

    
    String g="Hang Man";
    String index;
    String value;
    int n;
    Font originalFont;
    /** Creates new form createT */
    public createT() {
        initComponents();
        genReg();
        addbutton.setEnabled(false);
        removebutton.setEnabled(false);
        ct.setEnabled(false);
    }
    public createT(String game)
    {
        initComponents();
        g=game;
        genReg();
        addbutton.setEnabled(false);
        removebutton.setEnabled(false);
         ct.setEnabled(false);
        
    }
    String sql="Select idgames.ID from idgames inner join registrations where (Select concat(registrations.ID,registrations.code))=idgames.ID and game='"+g+"' and teamid='0'";

    ArrayList<String> names=new ArrayList<String>();
    ArrayList<String> ids=new ArrayList<String>();
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        addlist = new javax.swing.JList<>();
        addbutton = new javax.swing.JButton();
        removebutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ct = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        removelist = new javax.swing.JList<>();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 34)); // NOI18N
        jLabel11.setText("GAMING VIRTUOSO");

        addlist.setModel(new DefaultListModel());
        addlist.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        addlist.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                addlistValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(addlist);

        addbutton.setText("   Add    ");
        addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttonActionPerformed(evt);
            }
        });

        removebutton.setText("Remove");
        removebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removebuttonActionPerformed(evt);
            }
        });

        jLabel1.setText("Registrations:");

        jLabel2.setText("Add Members:");

        ct.setText("Create Team");
        ct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctActionPerformed(evt);
            }
        });

        removelist.setModel(new DefaultListModel());
        removelist.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        removelist.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                removelistValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(removelist);

        back.setText("Back");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(324, 324, 324)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addbutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 3, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ct, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removebutton))
                        .addGap(27, 27, 27)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(338, 338, 338)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(addbutton)
                        .addGap(112, 112, 112)
                        .addComponent(removebutton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))))
                .addGap(24, 24, 24)
                .addComponent(ct)
                .addContainerGap(555, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        
    public void genReg()
    {
        
try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gv","root","passcode");        
       Statement smt = con.createStatement();
            ResultSet       rs = smt.executeQuery(sql);
            
            while(rs.next())
            {
                
                String id=rs.getString("ID");
                   DefaultListModel ob=(DefaultListModel) removelist.getModel();
           ob.addElement(id); 
              
                          
            }
sql="select team from games where game='"+g+"'";
rs=smt.executeQuery(sql);
while(rs.next())
{
    n=rs.getInt("team");
}
}
    catch(Exception e){
        JOptionPane.showMessageDialog(this,e.getMessage());
        
    
}

back.addMouseListener(new MouseListener(){
    
    public void mouseEntered(MouseEvent e){
 originalFont = back.getFont();
        Map attributes = originalFont.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
      back.setFont(originalFont.deriveFont(attributes));
    }

        @Override
        public void mouseClicked(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mousePressed(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseExited(MouseEvent e) {
              back.setFont(originalFont);
        }

});





    }   
    
    
    
    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {                                          
DefaultListModel obj=(DefaultListModel) addlist.getModel();
DefaultListModel ob=(DefaultListModel) removelist.getModel();
int t=obj.getSize();
if(t<n)
{
           obj.addElement(index); 
          int i=removelist.getSelectedIndex();

           ob.remove(i); 
index="";
addbutton.setEnabled(false);
removebutton.setEnabled(false);
t++;
}
else if(t==n)
{
    JOptionPane.showMessageDialog(null,"Maximum team members are"+n);
}
if(t==n)
    ct.setEnabled(true);
    }                                         

    private void removebuttonActionPerformed(java.awt.event.ActionEvent evt) {                                             
     DefaultListModel obj=(DefaultListModel) removelist.getModel();
           obj.addElement(value); 
           int i=addlist.getSelectedIndex();
           DefaultListModel ob=(DefaultListModel) addlist.getModel();
           ob.remove(i); 
           value="";
           removebutton.setEnabled(false);
           addbutton.setEnabled(false);
           int t=ob.getSize();
           if(t<n)
    ct.setEnabled(false);
       // TODO add your handling code here:
    }                                            

    private void removelistValueChanged(javax.swing.event.ListSelectionEvent evt) {                                        
index=removelist.getSelectedValue();
addbutton.setEnabled(true);
    }                                       

    private void addlistValueChanged(javax.swing.event.ListSelectionEvent evt) {                                     
        value=addlist.getSelectedValue();
        removebutton.setEnabled(true);       
    }                                    

    private void ctActionPerformed(java.awt.event.ActionEvent evt) {                                   
        try {
           sql="insert into team(game) values('"+g+"')";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gv","root","passcode");        
       Statement smt = con.createStatement();
       smt.executeUpdate(sql);
       DefaultListModel ob=(DefaultListModel) addlist.getModel();
       int t=ob.getSize();
       sql="select MAX(tID) from team";
       ResultSet rs=smt.executeQuery(sql);
       int ti=0;
       while(rs.next())
       {
            ti=rs.getInt(1);
       }
       PreparedStatement stmt=con.prepareStatement("insert into members(tID,members) values(?,?)");
              
       for(int i=0;i<t;i++)
       {
           String name=(String) ob.getElementAt(i);
           stmt.setInt(1,ti);
           stmt.setString(2,name);
           stmt.executeUpdate();
       }
       for(int i=0;i<t;i++)
       {  String name=(String) ob.getElementAt(i);
           String query="update idgames set teamid='"+ti+"'where id='"+name+"' and game='"+g+"'";
           smt.executeUpdate(query);
       }
       ct.setEnabled(false);
       String query="SELECT MAX(tID) FROM team";
       ResultSet rs1=smt.executeQuery(query);
       int nt=0;
       while(rs1.next()){
       nt=rs1.getInt(1);}
       
       JOptionPane.showMessageDialog(null,"Team "+nt+" created");
       
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }                                  
                                           
    private void backMouseClicked(java.awt.event.MouseEvent evt) {                                  
                              
this.setVisible(false);  
   
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
            java.util.logging.Logger.getLogger(createT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton addbutton;
    private javax.swing.JList<String> addlist;
    private javax.swing.JLabel back;
    private javax.swing.JButton ct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton removebutton;
    private javax.swing.JList<String> removelist;
    // End of variables declaration                   

}
