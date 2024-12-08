
package igu;

public class Principal extends javax.swing.JFrame {
    //variables globales
    String[] dnis = new String[10];
    String[] nombres = new String[10];
    String[] apellidos = new String[10];
    String[] direcciones = new String[10];
    String[] telefonos = new String[10];
    String[] fechanac = new String[10];
    
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        dni = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        nombre = new javax.swing.JLabel();
        txt3 = new javax.swing.JTextField();
        apellido = new javax.swing.JLabel();
        txt4 = new javax.swing.JTextField();
        direc = new javax.swing.JLabel();
        txt5 = new javax.swing.JTextField();
        tel = new javax.swing.JLabel();
        txt6 = new javax.swing.JTextField();
        fecha = new javax.swing.JLabel();
        btl = new javax.swing.JButton();
        btm = new javax.swing.JButton();
        btr = new javax.swing.JButton();
        indice = new javax.swing.JLabel();
        txt7 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(0, 204, 204));

        titulo.setBackground(new java.awt.Color(0, 0, 0));
        titulo.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 102, 153));
        titulo.setText("Agenda Electronica");

        jSeparator1.setForeground(new java.awt.Color(0, 204, 204));

        jSeparator2.setBackground(new java.awt.Color(0, 204, 204));

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        dni.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        dni.setForeground(new java.awt.Color(0, 51, 153));
        dni.setText("   DNI     :");

        txt1.setBackground(new java.awt.Color(255, 255, 255));
        txt1.setForeground(new java.awt.Color(0, 0, 0));

        txt2.setBackground(new java.awt.Color(255, 255, 255));
        txt2.setForeground(new java.awt.Color(0, 0, 0));

        nombre.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 51, 153));
        nombre.setText("Nombre :");

        txt3.setBackground(new java.awt.Color(255, 255, 255));
        txt3.setForeground(new java.awt.Color(0, 0, 0));

        apellido.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        apellido.setForeground(new java.awt.Color(0, 51, 153));
        apellido.setText("Apellido :");

        txt4.setBackground(new java.awt.Color(255, 255, 255));
        txt4.setForeground(new java.awt.Color(0, 0, 0));

        direc.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        direc.setForeground(new java.awt.Color(0, 51, 153));
        direc.setText("Direccion :");

        txt5.setBackground(new java.awt.Color(255, 255, 255));
        txt5.setForeground(new java.awt.Color(0, 0, 0));

        tel.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        tel.setForeground(new java.awt.Color(0, 51, 153));
        tel.setText("Telefono :");

        txt6.setBackground(new java.awt.Color(255, 255, 255));
        txt6.setForeground(new java.awt.Color(0, 0, 0));

        fecha.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        fecha.setForeground(new java.awt.Color(0, 51, 153));
        fecha.setText("   F. Nac  :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(dni)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(nombre)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(apellido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(170, 170, 170)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(fecha)
                        .addGap(18, 18, 18)
                        .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(direc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tel)
                        .addGap(18, 18, 18)
                        .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(193, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dni)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(direc)))
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tel)))
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellido)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fecha)))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        btl.setText("<<");
        btl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlActionPerformed(evt);
            }
        });

        btm.setText("Guardar");
        btm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmActionPerformed(evt);
            }
        });

        btr.setText(">>");
        btr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btrActionPerformed(evt);
            }
        });

        indice.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        indice.setForeground(new java.awt.Color(0, 51, 153));
        indice.setText("Indice :");

        txt7.setEditable(false);
        txt7.setBackground(new java.awt.Color(255, 255, 255));
        txt7.setForeground(new java.awt.Color(0, 0, 0));
        txt7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt7.setText("0");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(titulo))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(380, 380, 380)
                                .addComponent(indice)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(288, 288, 288)
                                .addComponent(btl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(btm, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addComponent(btr, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btm, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btr, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indice)
                    .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlActionPerformed
        int indi = 0 ; //declaro una variable int y la inicializo
        String indice = txt7.getText(); //declaro indice como cadena de caracteres y le asigno lo q tiene "txt7"
        indi = Integer.parseInt(indice);  //a "indi" le asigno el indice convertido en int
        if(indi > 0){ 
        indi = indi-1;  //decremento "indi"
        indice = String.valueOf(indi);  // ahora a "indice" le asigno el valor de "indi" en formato String
        txt7.setText(indice); //en txt7 escribe String q tiene "indice"
        //todo esto guardara los datos o no para la agenda.
        txt1.setText(dnis[indi]);
        txt2.setText(nombres[indi]);
        txt3.setText(apellidos[indi]);
        txt4.setText(direcciones[indi]);
        txt5.setText(telefonos[indi]);
        txt6.setText(fechanac[indi]);
        }
    }//GEN-LAST:event_btlActionPerformed

    private void btrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btrActionPerformed

        int indi = 0 ; //declaro una variable int y la inicializo
        String indice = txt7.getText(); //declaro indice como cadena de caracteres y le asigno lo q tiene "txt7"
        indi = Integer.parseInt(indice);  //a "indi" le asigno el indice convertido en int
        if(indi < 9){
        indi = indi+1;  //incremento "indi"
        indice = String.valueOf(indi);  // ahora a "indice" le asigno el valor de "indi" en formato String
        txt7.setText(indice); //en txt7 escribe String q tiene "indice"
        //todo esto guardara los datos o no para la agenda.
        txt1.setText(dnis[indi]);
        txt2.setText(nombres[indi]);
        txt3.setText(apellidos[indi]);
        txt4.setText(direcciones[indi]);
        txt5.setText(telefonos[indi]);
        txt6.setText(fechanac[indi]);
        }
    }//GEN-LAST:event_btrActionPerformed

    private void btmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmActionPerformed
        int indi = 0 ; //declaro una variable int y la inicializo
        String indice = txt7.getText();
        indi = Integer.parseInt(indice);
        //todo esto guardara los datos o no para la agenda.
        dnis[indi] = txt1.getText();
        nombres[indi] = txt2.getText();
        apellidos[indi] = txt3.getText();
        direcciones[indi] = txt4.getText();
        telefonos[indi] = txt5.getText();
        fechanac[indi] = txt6.getText();
        
        
        
    }//GEN-LAST:event_btmActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellido;
    private javax.swing.JPanel bg;
    private javax.swing.JButton btl;
    private javax.swing.JButton btm;
    private javax.swing.JButton btr;
    private javax.swing.JLabel direc;
    private javax.swing.JLabel dni;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel indice;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel tel;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt7;
    // End of variables declaration//GEN-END:variables
}
