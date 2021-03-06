 package GV;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.font.TextAttribute;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anamta
 */
public class gvForm extends javax.swing.JFrame {

    /**
     * Creates new form gvForm
     */
     Font originalFont=null;
    int total=0;
    ArrayList<Integer> price=new ArrayList<>();
       ArrayList<JRadioButton> games0=new ArrayList<>();
       ArrayList<JRadioButton> gamesN=new ArrayList<>();
       String loc="Main Block", code;
       public gvForm()
       {
         initComponents();
         Panel.setVisible(false);
        gamePanel0.setLayout((new GridLayout(0,5,3,8)));          
        gamePanelN.setLayout((new GridLayout(0,5,3,8)));
         initialize();  
       }
    public gvForm(String l) {
        initComponents();
         Panel.setVisible(false);
        gamePanel0.setLayout((new GridLayout(0,5,3,8)));          
        gamePanelN.setLayout((new GridLayout(0,5,3,8)));
         initialize();
loc=l;
        }

public void initialize() //initializing game panels
{    
    try
{
    Class.forName("com.mysql.jdbc.Driver");
        Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gv","root","passcode");
       Statement smt = con.createStatement();
       
       
     String q="select * from games";
      ResultSet rs=smt.executeQuery(q);
       
       while(rs.next())
       {   int p=rs.getInt("price");
       price.add(p);
           JRadioButton box=new JRadioButton(rs.getString("game"));
           if(rs.getInt("team")==0)
           {        
           games0.add(box);
           gamePanel0.add(box);
           }
           else
           {
               gamesN.add(box);
               gamePanelN.add(box);
           }
          
           
          
       }
       pack();
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
 MobNo.setColumns(10);
  
}
catch(Exception e)
{
    JOptionPane.showMessageDialog(this, e.getMessage());
}
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        scroll = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        FName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        LName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CName = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        Course = new javax.swing.JComboBox<>();
        Branch = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        MobNo = new javax.swing.JTextField();
        reg = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Panel = new javax.swing.JPanel();
        paid = new javax.swing.JTextField();
        t = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        due = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        ret = new javax.swing.JTextField();
        confirm = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        gamePanel0 = new javax.swing.JPanel();
        gamePanelN = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(850, 600));

        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setPreferredSize(new java.awt.Dimension(100, 847));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        jLabel1.setText("REGISTRATION FORM");

        jLabel2.setText("First Name:");

        jLabel3.setText("Last Name:");

        jLabel4.setText("College:");

        jLabel5.setText("Branch:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Game:");

        CName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Babu Banarsi Das National Institute of Technology and Management", "Babu Banarasi Das Northern Institute of Indian Technology", "Babu Banarsi Das Engineering College", "Babu Banarasi Das University", "Babu Banarsi Das Dental College", " " }));

        jLabel7.setText("Course:");

        Course.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B.Tech", "B.Arch", "BCA", "B.Com", "BJMC", "..", "Item 3", "Item 4" }));

        Branch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Computer Science and Engineering", "Information Technology", "Electrical Engineering", "Electronics", "Aeronautical", "Chemical", "Electrical and instrumentation" }));

        jLabel10.setText("Mobile No. :");

        MobNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                MobNoKeyReleased(evt);
            }
        });

        reg.setText("Register");
        reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regActionPerformed(evt);
            }
        });

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 34)); // NOI18N
        jLabel11.setText("GAMING VIRTUOSO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        paid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                paidKeyReleased(evt);
            }
        });

        t.setText("Total:");

        jLabel12.setText("Paid:");

        jLabel13.setText("Due:");

        jLabel14.setText("Returned: ");

        ret.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                retKeyReleased(evt);
            }
        });

        confirm.setText("Confirm");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("PAYMENT:");

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(due, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PanelLayout.createSequentialGroup()
                            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(PanelLayout.createSequentialGroup()
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(paid, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PanelLayout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ret, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(99, 99, 99)
                            .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(363, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(due, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(paid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)))
                .addGap(20, 20, 20)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(ret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirm))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        back.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        back.setText("Back");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Single Player:");

        gamePanel0.setLayout(new java.awt.GridLayout(1, 0));

        gamePanelN.setLayout(new java.awt.GridLayout(1, 0));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Team Games:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(657, 657, 657)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(222, 222, 222)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(CName, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(MobNo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addComponent(Course, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(75, 75, 75)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(Branch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(FName, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(75, 75, 75)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(LName, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(reg, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(171, 171, 171)
                                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(gamePanelN, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gamePanel0, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back)
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(LName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(Course, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Branch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(MobNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gamePanel0, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addGap(4, 4, 4)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gamePanelN, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reg)
                    .addComponent(reset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        scroll.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {                                      
     reset();
    }
 public void reset()
 {   total=0;
     FName.setText("");
LName.setText("");
MobNo.setText("");

CName.setSelectedIndex(0);
Course.setSelectedIndex(0);
Branch.setSelectedIndex(0);
Iterator<JRadioButton> itr= games0.iterator();
while(itr.hasNext())
{
 itr.next().setSelected(false);
}
itr= gamesN.iterator();
while(itr.hasNext())
{
 itr.next().setSelected(false);
}
 Panel.setVisible(false);
ret.setText("0");
paid.setText("0");
due.setText("0");
    }                                     

    private void regActionPerformed(java.awt.event.ActionEvent evt) {                                    
String name=FName.getText()+" "+LName.getText();; 
String col=CName.getItemAt(CName.getSelectedIndex());
String cour=Course.getItemAt(Course.getSelectedIndex());
String branch=Branch.getItemAt(Branch.getSelectedIndex());
String number=MobNo.getText();
boolean flag1=false,flag2=false;
int count=0;
if(name==null || col== null || cour==null || number==null)
{
    JOptionPane.showMessageDialog(null,"Please fill in all the details");
    return;
}

 String sql;
         try { 
            
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gv","root","passcode");
       Statement smt = con.createStatement();
       sql="select code as abbr from locations where location='"+loc+"'";
       
       ResultSet rs=smt.executeQuery(sql);
       
       while(rs.next())           
        code=rs.getString("abbr");
               
       DateFormat dateFormat = new SimpleDateFormat("ddMMyy");
        Date date = new Date();
        String fr=dateFormat.format(date);
        code=code+fr;
       
       Iterator<JRadioButton> itr= games0.iterator();
      
          String k=null;
          JRadioButton button;
while(itr.hasNext())
{
    button=itr.next();
     if(button.isSelected()){
          
    if(flag1==false)   { 
      String query="SELECT MAX(ID) FROM registrations";
                 rs= smt.executeQuery(query);
                int m;
                  if(rs.next())
                 {
                     String index=rs.getString(1);
                     if(index==null){
                     m=1;
                     }
                     else{
                     m=Integer.parseInt(index)+1;}
                     
                     k=Integer.toString(m);
                 }
                 
                  flag1=true;
                 }
                  
                  
     sql="insert into IDGames(ID, game) values('"+(k+code)+"','"+button.getText()+"')";
               smt.executeUpdate(sql);
               
     count++;
            }
}
if(flag2==false)
{
   sql="insert into registrations(code, Name, college, course, branch, mobNo) values('"+code+"','"+name+"','"+col+"','"+cour+"','"+branch+"','"+number+"')"; 
   smt.executeUpdate(sql);
   flag2=true;
}
itr= gamesN.iterator();

while(itr.hasNext())
{
    button=itr.next();
 if(button.isSelected())
 { 
    if(flag1==false){   
      String query="SELECT MAX(ID) FROM registrations";
                rs= smt.executeQuery(query);
                 
                 int m;
                  if(rs.next())
                 {
                     String index=rs.getString(1);
                     if(index==null){
                     m=1;
                     }
                     else{
                     m=Integer.parseInt(index)+1;}
                     
                     k=Integer.toString(m);
                 }
    }
     sql="insert into IDGames(ID, game,teamid) values('"+(k+code)+"','"+button.getText()+"',0)";
               smt.executeUpdate(sql);
     
         count++;    
      }
}
if(flag2==false)
{
    sql="insert into registrations(code, Name, college, course, branch, mobNo) values('"+code+"','"+name+"','"+col+"','"+cour+"','"+branch+"',"+number+")";
     smt.executeUpdate(sql);
}
    
         }
         catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
         finally
         {
             if(count>0)
             {
             JOptionPane.showMessageDialog(null, "Successfully registered for "+count+" game(s)");
             Panel.setVisible(true);
             paid.setText("0");
             
                  Statement smt; ResultSet rs;
                 String query;  
                 int p;
        
        
        try {
       Iterator<JRadioButton> itr= games0.iterator();
       JRadioButton button;
while(itr.hasNext())
{
  button=itr.next();
 if(button.isSelected())
 {  
      
     int g=games0.indexOf(button);
      p=price.get(g);
      total=total+p;
}
}
itr= gamesN.iterator();
int len=games0.size();
while(itr.hasNext())
{
    button=itr.next();
 if(button.isSelected())
 { 
     
     int g=gamesN.indexOf(button);
      p=price.get(len+g);
      total=total+p;
 }
}
     
     
     
     
    

       t.setText("Total: "+total);
       due.setText(Integer.toString(total));
           }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } 
         }
             else
             JOptionPane.showMessageDialog(null, "No game selected!");    
         }
    }                                   
     
    
    private void paidKeyReleased(java.awt.event.KeyEvent evt) {                                 
        int pay=Integer.parseInt(paid.getText());
        int dues=total-pay;
        due.setText(Integer.toString(dues));
              
    }                                

    private void retKeyReleased(java.awt.event.KeyEvent evt) {                                
if(ret.getText().equals(""))
        due.setText(Integer.toString(total-(Integer.parseInt(paid.getText()))));
        
int returned=Integer.parseInt(ret.getText());


int d=total-(Integer.parseInt(paid.getText()));
int dues=d+returned;
due.setText(Integer.toString(dues));

    }                               

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {                                        
        try {
            int i=Integer.parseInt(due.getText());
           int choice= JOptionPane.showConfirmDialog(null, "Confirm due as"+i+"?");
            if(choice==JOptionPane.YES_OPTION)
            {
            String name1=FName.getText(); 
String name2=LName.getText();
String number=MobNo.getText();
String name=name1+" "+name2;

            if(i!=0)
            {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gv","root","passcode");
        Statement smt=con.createStatement();
        String query="SELECT MAX(ID) FROM registrations";
               ResultSet rs= smt.executeQuery(query);
               String v="";
                while(rs.next())
                v=rs.getString(1);
        code=v+code;
              
        
        query="insert into dues(ID,due) values('"+code+"','"+i+"')";
        smt.executeUpdate(query);
            }
        JOptionPane.showMessageDialog(null,"Payment Confirmed");
        reset();
       
        }
        }
catch(Exception e)
{
JOptionPane.showMessageDialog(this, e.getMessage());
}
      
    }                                       

    private void backMouseClicked(java.awt.event.MouseEvent evt) {                                  
this.setVisible(false);       
    }                                 

     
    
    
    
    
   
    private void MobNoKeyReleased(java.awt.event.KeyEvent evt) {                                  
String num=MobNo.getText();  
int l=num.length();
if(l>10 || Character.isDigit(num.charAt(l-1))==false){
    num=num.substring(0,l-1);
    MobNo.setText(num); }
    

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
            java.util.logging.Logger.getLogger(gvForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gvForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gvForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gvForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gvForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JComboBox<String> Branch;
    private javax.swing.JComboBox<String> CName;
    private javax.swing.JComboBox<String> Course;
    private javax.swing.JTextField FName;
    private javax.swing.JTextField LName;
    private javax.swing.JTextField MobNo;
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton confirm;
    private javax.swing.JTextField due;
    private javax.swing.JPanel gamePanel0;
    private javax.swing.JPanel gamePanelN;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField paid;
    private javax.swing.JButton reg;
    private javax.swing.JButton reset;
    private javax.swing.JTextField ret;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JLabel t;
    
    // End of variables declaration                   
}
