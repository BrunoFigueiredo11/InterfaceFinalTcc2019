/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Controller.LinkController;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class TelaPrincipalAdm extends javax.swing.JFrame {

    public TelaPrincipalAdm() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(new GridLayout());
         URL iconejanela = getClass().getResource("/images/logojanela.png");
       Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(iconejanela);
       this.setIconImage(iconeTitulo);
    

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jdptela = new javax.swing.JDesktopPane();
        btnnovo = new javax.swing.JButton();
        btnturmas = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btncursos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnadm1 = new javax.swing.JButton();
        btnturmas1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btnaddfunc = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btnaddcurso = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        Menucadastrar = new javax.swing.JMenuItem();
        Menualterar = new javax.swing.JMenuItem();
        Menuturmas = new javax.swing.JMenu();
        Menucursos = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        Menusobre = new javax.swing.JMenu();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal - Administrador");

        btnnovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adduserpainel.png"))); // NOI18N
        btnnovo.setContentAreaFilled(false);
        btnnovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnnovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnnovoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnnovoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnnovoMouseExited(evt);
            }
        });
        btnnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnovoActionPerformed(evt);
            }
        });

        btnturmas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/grouppanel.png"))); // NOI18N
        btnturmas.setContentAreaFilled(false);
        btnturmas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnturmas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnturmasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnturmasMouseExited(evt);
            }
        });
        btnturmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnturmasActionPerformed(evt);
            }
        });

        btneditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edituserpainel.png"))); // NOI18N
        btneditar.setContentAreaFilled(false);
        btneditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btneditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btneditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btneditarMouseExited(evt);
            }
        });
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        btncursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bookpainel.png"))); // NOI18N
        btncursos.setContentAreaFilled(false);
        btncursos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btncursosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btncursosMouseExited(evt);
            }
        });
        btncursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncursosActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Alterar Aluno");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Cadastrar Aluno");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Turmas");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Cursos");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("  Logout");

        btnadm1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/door_out.png"))); // NOI18N
        btnadm1.setContentAreaFilled(false);
        btnadm1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnadm1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnadm1MouseExited(evt);
            }
        });
        btnadm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadm1ActionPerformed(evt);
            }
        });

        btnturmas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/chamada.png"))); // NOI18N
        btnturmas1.setContentAreaFilled(false);
        btnturmas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnturmas1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnturmas1MouseExited(evt);
            }
        });
        btnturmas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnturmas1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Chamada");

        btnaddfunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/funcipainel.png"))); // NOI18N
        btnaddfunc.setContentAreaFilled(false);
        btnaddfunc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnaddfuncMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnaddfuncMouseExited(evt);
            }
        });
        btnaddfunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddfuncActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Cadastrar Funcionarios");

        btnaddcurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bookpainelAdm.png"))); // NOI18N
        btnaddcurso.setContentAreaFilled(false);
        btnaddcurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnaddcursoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnaddcursoMouseExited(evt);
            }
        });
        btnaddcurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddcursoActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Adicionar Cursos");

        jdptela.setLayer(btnnovo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdptela.setLayer(btnturmas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdptela.setLayer(btneditar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdptela.setLayer(btncursos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdptela.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdptela.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdptela.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdptela.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdptela.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdptela.setLayer(btnadm1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdptela.setLayer(btnturmas1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdptela.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdptela.setLayer(btnaddfunc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdptela.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdptela.setLayer(btnaddcurso, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdptela.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdptelaLayout = new javax.swing.GroupLayout(jdptela);
        jdptela.setLayout(jdptelaLayout);
        jdptelaLayout.setHorizontalGroup(
            jdptelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdptelaLayout.createSequentialGroup()
                .addGroup(jdptelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jdptelaLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addGroup(jdptelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jdptelaLayout.createSequentialGroup()
                                .addComponent(btnturmas, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(200, 200, 200)
                                .addComponent(btncursos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jdptelaLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(235, 235, 235)
                                .addComponent(jLabel7)))
                        .addGroup(jdptelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jdptelaLayout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(btnaddcurso, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jdptelaLayout.createSequentialGroup()
                                .addGap(173, 173, 173)
                                .addComponent(jLabel13))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jdptelaLayout.createSequentialGroup()
                        .addGroup(jdptelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jdptelaLayout.createSequentialGroup()
                                .addGap(173, 173, 173)
                                .addComponent(btnnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(200, 200, 200)
                                .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jdptelaLayout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(jLabel5)
                                .addGap(152, 152, 152)
                                .addComponent(jLabel3)))
                        .addGroup(jdptelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jdptelaLayout.createSequentialGroup()
                                .addGap(207, 207, 207)
                                .addComponent(btnaddfunc, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jdptelaLayout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(jLabel11)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 304, Short.MAX_VALUE)
                .addGroup(jdptelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jdptelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnturmas1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jdptelaLayout.createSequentialGroup()
                        .addComponent(btnadm1)
                        .addGap(50, 50, 50)))
                .addContainerGap(221, Short.MAX_VALUE))
        );
        jdptelaLayout.setVerticalGroup(
            jdptelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdptelaLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(jdptelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnnovo)
                    .addComponent(btneditar)
                    .addGroup(jdptelaLayout.createSequentialGroup()
                        .addComponent(btnaddfunc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jdptelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnturmas1))
                .addGroup(jdptelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdptelaLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(jdptelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdptelaLayout.createSequentialGroup()
                                .addComponent(btnadm1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jdptelaLayout.createSequentialGroup()
                                .addGroup(jdptelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnturmas)
                                    .addComponent(btncursos))
                                .addGap(3, 3, 3)
                                .addGroup(jdptelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jdptelaLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jdptelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdptelaLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(btnaddcurso)
                        .addGap(33, 33, 33)))
                .addContainerGap(297, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(102, 102, 102));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        jMenu2.setText("Alunos");

        Menucadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_add.png"))); // NOI18N
        Menucadastrar.setText("Cadastrar");
        Menucadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Menucadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenucadastrarActionPerformed(evt);
            }
        });
        jMenu2.add(Menucadastrar);

        Menualterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_edit.png"))); // NOI18N
        Menualterar.setText("Alterar");
        Menualterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Menualterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenualterarActionPerformed(evt);
            }
        });
        jMenu2.add(Menualterar);

        jMenuBar1.add(jMenu2);

        Menuturmas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/group.png"))); // NOI18N
        Menuturmas.setText("Turmas");
        Menuturmas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuturmasMouseClicked(evt);
            }
        });
        Menuturmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuturmasActionPerformed(evt);
            }
        });
        jMenuBar1.add(Menuturmas);

        Menucursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/book.png"))); // NOI18N
        Menucursos.setText("Cursos");
        Menucursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenucursosMouseClicked(evt);
            }
        });
        Menucursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenucursosActionPerformed(evt);
            }
        });

        jMenuItem4.setText("Listar");
        jMenuItem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem4MouseClicked(evt);
            }
        });
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        Menucursos.add(jMenuItem4);

        jMenuItem2.setText("Adicionar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        Menucursos.add(jMenuItem2);

        jMenuItem1.setText("Editar");
        Menucursos.add(jMenuItem1);

        jMenuItem3.setText("Excluir");
        Menucursos.add(jMenuItem3);

        jMenuBar1.add(Menucursos);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/funci.png"))); // NOI18N
        jMenu3.setText("Funcionários");

        jMenuItem8.setText("Cadastrar");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem9.setText("Alterar");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuItem10.setText("Excluir");
        jMenu3.add(jMenuItem10);

        jMenuBar1.add(jMenu3);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/relatório.png"))); // NOI18N
        jMenu1.setText("Relatórios");

        jMenuItem5.setText("Frequência");
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("Notas");
        jMenu1.add(jMenuItem6);

        jMenuItem7.setText("Histórico");
        jMenu1.add(jMenuItem7);

        jMenuBar1.add(jMenu1);

        Menusobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/information.png"))); // NOI18N
        Menusobre.setText("Sobre");
        jMenuBar1.add(Menusobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdptela)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdptela)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuturmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuturmasActionPerformed
        
    }//GEN-LAST:event_MenuturmasActionPerformed

    private void MenucursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenucursosActionPerformed
       
    }//GEN-LAST:event_MenucursosActionPerformed

    private void MenucursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenucursosMouseClicked
       
    }//GEN-LAST:event_MenucursosMouseClicked

    private void MenuturmasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuturmasMouseClicked
       TelaListarTurmas telaturmas = new TelaListarTurmas();
        jdptela.add(telaturmas);
        telaturmas.setVisible(true);
    }//GEN-LAST:event_MenuturmasMouseClicked

    private void jMenuItem4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem4MouseClicked
        
    }//GEN-LAST:event_jMenuItem4MouseClicked

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        TelaListarCursos telacursos = new TelaListarCursos();
        jdptela.add(telacursos);
        telacursos.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void btnnovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnovoMouseClicked

    }//GEN-LAST:event_btnnovoMouseClicked

    private void btnnovoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnovoMouseEntered
        btnnovo.setBorder(BorderFactory.createRaisedBevelBorder());
    }//GEN-LAST:event_btnnovoMouseEntered

    private void btnnovoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnovoMouseExited
        btnnovo.setBorder(null);
    }//GEN-LAST:event_btnnovoMouseExited

    private void btnnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnovoActionPerformed
        TelaCadastroAluno telaCadAluno = new TelaCadastroAluno();
        jdptela.add(telaCadAluno);
        telaCadAluno.setVisible(true);
    }//GEN-LAST:event_btnnovoActionPerformed

    private void btnturmasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnturmasMouseEntered
        btnturmas.setBorder(BorderFactory.createRaisedBevelBorder());
    }//GEN-LAST:event_btnturmasMouseEntered

    private void btnturmasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnturmasMouseExited
        btnturmas.setBorder(null);
    }//GEN-LAST:event_btnturmasMouseExited

    private void btnturmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnturmasActionPerformed
        TelaListarTurmas telaturmas = new TelaListarTurmas();
        jdptela.add(telaturmas);
        telaturmas.setVisible(true);
    }//GEN-LAST:event_btnturmasActionPerformed

    private void btneditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditarMouseEntered
        btneditar.setBorder(BorderFactory.createRaisedBevelBorder());
    }//GEN-LAST:event_btneditarMouseEntered

    private void btneditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditarMouseExited
        btneditar.setBorder(null);
    }//GEN-LAST:event_btneditarMouseExited

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        TelaAlteraAluno telaAltCad = new TelaAlteraAluno();
        jdptela.add(telaAltCad);
        telaAltCad.setVisible(true);
    }//GEN-LAST:event_btneditarActionPerformed

    private void btncursosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncursosMouseEntered
        btncursos.setBorder(BorderFactory.createRaisedBevelBorder());
    }//GEN-LAST:event_btncursosMouseEntered

    private void btncursosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncursosMouseExited
        btncursos.setBorder(null);
    }//GEN-LAST:event_btncursosMouseExited

    private void btncursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncursosActionPerformed
        TelaListarCursos telacursos = new TelaListarCursos();
        jdptela.add(telacursos);
        telacursos.setVisible(true);
    }//GEN-LAST:event_btncursosActionPerformed

    private void btnadm1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnadm1MouseEntered
        btnadm1.setBorder(BorderFactory.createRaisedBevelBorder());
    }//GEN-LAST:event_btnadm1MouseEntered

    private void btnadm1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnadm1MouseExited
        btnadm1.setBorder(null);
    }//GEN-LAST:event_btnadm1MouseExited

    private void btnadm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadm1ActionPerformed
        int sair = JOptionPane.showConfirmDialog(null, "Deseja Sair ?");
        if (sair == JOptionPane.YES_OPTION) {
            dispose();
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_btnadm1ActionPerformed

    private void btnturmas1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnturmas1MouseEntered
        btnturmas1.setBorder(BorderFactory.createRaisedBevelBorder());
    }//GEN-LAST:event_btnturmas1MouseEntered

    private void btnturmas1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnturmas1MouseExited
        btnturmas1.setBorder(null);
    }//GEN-LAST:event_btnturmas1MouseExited

    private void btnturmas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnturmas1ActionPerformed
        LinkController l = new LinkController();
        LinkController.main();
    }//GEN-LAST:event_btnturmas1ActionPerformed

    private void btnaddfuncMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnaddfuncMouseEntered
        btnaddfunc.setBorder(BorderFactory.createRaisedBevelBorder());
    }//GEN-LAST:event_btnaddfuncMouseEntered

    private void btnaddfuncMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnaddfuncMouseExited
        btnaddfunc.setBorder(null);
    }//GEN-LAST:event_btnaddfuncMouseExited

    private void btnaddfuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddfuncActionPerformed
        TelaAddFunc telaaddfunc = new TelaAddFunc();
        jdptela.add(telaaddfunc);
        telaaddfunc.setVisible(true);
    }//GEN-LAST:event_btnaddfuncActionPerformed

    private void btnaddcursoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnaddcursoMouseEntered
        btnaddcurso.setBorder(BorderFactory.createRaisedBevelBorder());
    }//GEN-LAST:event_btnaddcursoMouseEntered

    private void btnaddcursoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnaddcursoMouseExited
        btnaddcurso.setBorder(null);
    }//GEN-LAST:event_btnaddcursoMouseExited

    private void btnaddcursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddcursoActionPerformed
        TelaAddCurso telaaddcurso = new TelaAddCurso();
        jdptela.add(telaaddcurso);
        telaaddcurso.setVisible(true);
    }//GEN-LAST:event_btnaddcursoActionPerformed

    private void MenucadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenucadastrarActionPerformed

        TelaCadastroAluno telaCadAluno = new TelaCadastroAluno();
        jdptela.add(telaCadAluno);
        telaCadAluno.setVisible(true);

    }//GEN-LAST:event_MenucadastrarActionPerformed

    private void MenualterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenualterarActionPerformed
        TelaAlteraAluno telaAltCad = new TelaAlteraAluno();
        jdptela.add(telaAltCad);
        telaAltCad.setVisible(true);
    }//GEN-LAST:event_MenualterarActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
         TelaAddCurso telaaddcurso = new TelaAddCurso();
        jdptela.add(telaaddcurso);
        telaaddcurso.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
         TelaAddFunc telaaddfunc = new TelaAddFunc();
        jdptela.add(telaaddfunc);
        telaaddfunc.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
         TelaAltFunc telaaltfunc = new TelaAltFunc();
        jdptela.add(telaaltfunc);
        telaaltfunc.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipalAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Menualterar;
    private javax.swing.JMenuItem Menucadastrar;
    private javax.swing.JMenu Menucursos;
    private javax.swing.JMenu Menusobre;
    private javax.swing.JMenu Menuturmas;
    private javax.swing.JButton btnaddcurso;
    private javax.swing.JButton btnaddfunc;
    private javax.swing.JButton btnadm1;
    private javax.swing.JButton btncursos;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btnnovo;
    private javax.swing.JButton btnturmas;
    private javax.swing.JButton btnturmas1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JDesktopPane jdptela;
    // End of variables declaration//GEN-END:variables
}
