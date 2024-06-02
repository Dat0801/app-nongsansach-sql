/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.HoaDonDAO;
import DTO.HoaDon;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Admin
 */
public class HoaDonJPanel extends javax.swing.JPanel {

    public JDialog dialog;

    /**
     * Creates new form HoaDonJPanel
     */
    public HoaDonJPanel() {
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

        jtbQuanLyHoaDon = new javax.swing.JTabbedPane();
        jpnQuanLyHoaDon = new javax.swing.JPanel();
        jtfSearch = new javax.swing.JTextField();
        jpnView = new javax.swing.JPanel();
        jspHoaDon = new javax.swing.JScrollPane();
        jtHoaDon = new javax.swing.JTable();
        btnTimKiem = new javax.swing.JButton();

        jtbQuanLyHoaDon.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jtbQuanLyHoaDon.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jtbQuanLyHoaDonStateChanged(evt);
            }
        });

        jtfSearch.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jtHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtHoaDonMouseClicked(evt);
            }
        });
        jspHoaDon.setViewportView(jtHoaDon);

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 1196, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
        );

        btnTimKiem.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon-search.png"))); // NOI18N
        btnTimKiem.setText("Tìm kiếm");

        javax.swing.GroupLayout jpnQuanLyHoaDonLayout = new javax.swing.GroupLayout(jpnQuanLyHoaDon);
        jpnQuanLyHoaDon.setLayout(jpnQuanLyHoaDonLayout);
        jpnQuanLyHoaDonLayout.setHorizontalGroup(
            jpnQuanLyHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQuanLyHoaDonLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnTimKiem)
                .addContainerGap(645, Short.MAX_VALUE))
            .addGroup(jpnQuanLyHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpnQuanLyHoaDonLayout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(28, 28, 28)))
        );
        jpnQuanLyHoaDonLayout.setVerticalGroup(
            jpnQuanLyHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQuanLyHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnQuanLyHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(593, Short.MAX_VALUE))
            .addGroup(jpnQuanLyHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpnQuanLyHoaDonLayout.createSequentialGroup()
                    .addGap(81, 81, 81)
                    .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(14, 14, 14)))
        );

        jtbQuanLyHoaDon.addTab("Quản lý hóa đơn", jpnQuanLyHoaDon);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtbQuanLyHoaDon)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtbQuanLyHoaDon)
        );
    }// </editor-fold>//GEN-END:initComponents
    ArrayList<HoaDon> listHD;

    void LoadHDVaoTable(JTable jt, JPanel jpn, JScrollPane jsp, int trangthai) {
        String[] header = {"Mã hóa đơn", "Mã nhân viên", "Mã khách hàng", "Ngày tạo", "Tổng tiền", "Trạng thái"};
        if (jt == null && jpn == null && jsp == null) {
            jt = jtHoaDon;
            jpn = jpnView;
            jsp = jspHoaDon;
        }
        listHD = HoaDonDAO.getInstance().getListHoaDon();
        DefaultTableModel modelTableDb = new DefaultTableModel(header, 0) {
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }

        };

        for (HoaDon hd : listHD) {
            Object[] row = {hd.getMaHD(), hd.getMaNV(), hd.getMaKH(), hd.getNgayTao(), hd.getTongTien(), hd.getTrangThai()};
            modelTableDb.addRow(row);
        }

        TableRowSorter<TableModel> rowSorter = null;

        jt.setModel(modelTableDb);
        jt.setRowSorter(rowSorter);

        jt.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
        jt.setFont(new Font("Arial", Font.PLAIN, 14));
        jt.getTableHeader().setPreferredSize(new Dimension(100, 50));
        jt.setRowHeight(50);
        jt.validate();
        jt.repaint();

        jsp.setPreferredSize(new Dimension(1350, 400));

        jpn.removeAll();
        jpn.setLayout(new CardLayout());
        jpn.add(jsp);
        jpn.validate();
        jpn.repaint();
    }
    
    private void TaoDialog(HoaDonJFrame frame, String title) {
        frame.setResizable(false);

        dialog = new JDialog();
        dialog.setModal(true);
        dialog.getContentPane().add(frame.getContentPane());
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setTitle(title);
        dialog.setVisible(true);
    }
    private void jtHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtHoaDonMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2 && jtHoaDon.getSelectedRow() != -1) {
            int index = jtHoaDon.getSelectedRow();

            HoaDon hd = listHD.get(index);

            HoaDonJFrame frame = new HoaDonJFrame(hd, this);
            TaoDialog(frame, "Chi tiết hóa đơn");
        }
    }//GEN-LAST:event_jtHoaDonMouseClicked

    private void jtbQuanLyHoaDonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jtbQuanLyHoaDonStateChanged
        // TODO add your handling code here:
        int index = jtbQuanLyHoaDon.getSelectedIndex();
        if (index == 0) {
            LoadHDVaoTable(jtHoaDon, jpnView, jspHoaDon, 1);
        }
    }//GEN-LAST:event_jtbQuanLyHoaDonStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JPanel jpnQuanLyHoaDon;
    private javax.swing.JPanel jpnView;
    private javax.swing.JScrollPane jspHoaDon;
    private javax.swing.JTable jtHoaDon;
    private javax.swing.JTabbedPane jtbQuanLyHoaDon;
    private javax.swing.JTextField jtfSearch;
    // End of variables declaration//GEN-END:variables
}
