/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.ChiTietHoaDonDAO;
import DAO.HangHoaDAO;
import DAO.KhachHangDAO;
import DAO.NhomHangDAO;
import DTO.ChiTietHoaDon;
import DTO.HangHoa;
import DTO.KhachHang;
import DTO.NhomHang;
import Main.FontOptionPane;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingWorker;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Admin
 */
public class BanHangJPanel extends javax.swing.JPanel {
    private KhachHang khachhang;
    /**
     * Creates new form BanHangPanel
     */
    public BanHangJPanel() {
        initComponents();
        FontOptionPane.setUIFont();
    }

    public ArrayList<ChiTietHoaDon> listCTHD = null;
    ArrayList<HangHoa> listHH;
    public JDialog dialog;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtbQuanLyBanHang = new javax.swing.JTabbedPane();
        jpnHoaDon = new javax.swing.JPanel();
        jpnView = new javax.swing.JPanel();
        jspCTHD = new javax.swing.JScrollPane();
        jtCTHD = new javax.swing.JTable();
        jpnHangHoa = new javax.swing.JPanel();
        btnThanhToan = new javax.swing.JButton();
        btnXoaHH = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        jlbTongTien = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtfSDTKhachHang = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnTimKiem = new javax.swing.JButton();
        jcbNhomHang = new javax.swing.JComboBox<>();
        btnXoaTatCa = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtfTenKhachHang = new javax.swing.JTextField();

        jtbQuanLyBanHang.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jtbQuanLyBanHang.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jtbQuanLyBanHangStateChanged(evt);
            }
        });

        jtCTHD.setModel(new javax.swing.table.DefaultTableModel(
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
        jtCTHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtCTHDMouseClicked(evt);
            }
        });
        jspCTHD.setViewportView(jtCTHD);

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jspCTHD, javax.swing.GroupLayout.Alignment.LEADING)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspCTHD, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jpnHangHoaLayout = new javax.swing.GroupLayout(jpnHangHoa);
        jpnHangHoa.setLayout(jpnHangHoaLayout);
        jpnHangHoaLayout.setHorizontalGroup(
            jpnHangHoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpnHangHoaLayout.setVerticalGroup(
            jpnHangHoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnThanhToan.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnThanhToan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon-payments.png"))); // NOI18N
        btnThanhToan.setText("Thanh Toán");
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        btnXoaHH.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnXoaHH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon-delete.png"))); // NOI18N
        btnXoaHH.setPreferredSize(new java.awt.Dimension(171, 50));
        btnXoaHH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaHHActionPerformed(evt);
            }
        });

        btnThem.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon-plus.png"))); // NOI18N
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        jlbTongTien.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jlbTongTien.setText("Tổng Tiền:");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setText("Nhóm Hàng");

        jtfSDTKhachHang.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jtfSDTKhachHang.setPreferredSize(new java.awt.Dimension(200, 50));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setText("SDT Khách Hàng");

        btnTimKiem.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon-search.png"))); // NOI18N
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        jcbNhomHang.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jcbNhomHang.setPreferredSize(new java.awt.Dimension(250, 50));
        jcbNhomHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbNhomHangActionPerformed(evt);
            }
        });

        btnXoaTatCa.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnXoaTatCa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon-delete-forever.png"))); // NOI18N
        btnXoaTatCa.setPreferredSize(new java.awt.Dimension(171, 50));
        btnXoaTatCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaTatCaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setText("Tên Khách Hàng");

        jtfTenKhachHang.setEditable(false);
        jtfTenKhachHang.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jtfTenKhachHang.setPreferredSize(new java.awt.Dimension(200, 50));

        javax.swing.GroupLayout jpnHoaDonLayout = new javax.swing.GroupLayout(jpnHoaDon);
        jpnHoaDon.setLayout(jpnHoaDonLayout);
        jpnHoaDonLayout.setHorizontalGroup(
            jpnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpnHoaDonLayout.createSequentialGroup()
                        .addGap(420, 420, 420)
                        .addComponent(jlbTongTien))
                    .addGroup(jpnHoaDonLayout.createSequentialGroup()
                        .addComponent(btnXoaHH, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXoaTatCa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jLabel2)
                        .addGap(15, 15, 15)
                        .addComponent(jtfSDTKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnTimKiem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnThem))
                    .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jpnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnHoaDonLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jpnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnHoaDonLayout.createSequentialGroup()
                                .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jpnHoaDonLayout.createSequentialGroup()
                                .addComponent(jpnHangHoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(5, 5, 5))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnHoaDonLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel3)
                        .addGap(15, 15, 15)
                        .addComponent(jtfTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbNhomHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
        );
        jpnHoaDonLayout.setVerticalGroup(
            jpnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnThem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                        .addComponent(jtfSDTKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addComponent(btnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                        .addComponent(jtfTenKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(jpnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jcbNhomHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addComponent(btnXoaTatCa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoaHH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jpnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnHangHoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jpnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbTongTien))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jtbQuanLyBanHang.addTab("Hóa đơn 1", jpnHoaDon);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jtbQuanLyBanHang)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jtbQuanLyBanHang)
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents
    private JPanel panel;
    private final Map<String, ImageIcon> loadedImages = new HashMap<>();

    public void loadHH(String MaNhomHang) {
        listHH = HangHoaDAO.getInstance().getListHangHoa(MaNhomHang);
        if (panel == null) {
            panel = new JPanel();
            panel.setLayout(new GridLayout(0, 4, 10, 10));
        } else {
            panel.removeAll();
        }

        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                for (HangHoa hh : listHH) {
                    JButton btn = createButton(hh);
                    panel.add(btn);
                }
                return null;
            }

            @Override
            protected void done() {
                jpnHangHoa.removeAll();
                JScrollPane scrollPane = new JScrollPane(panel);
                scrollPane.setPreferredSize(new Dimension(700, 700));
                scrollPane.getVerticalScrollBar().setUnitIncrement(16);
                scrollPane.getHorizontalScrollBar().setUnitIncrement(16);
                jpnHangHoa.setLayout(new BorderLayout());
                jpnHangHoa.add(scrollPane, BorderLayout.CENTER);
                jpnHangHoa.revalidate();
                jpnHangHoa.repaint();
            }
        };

        worker.execute();
    }

    private JButton createButton(HangHoa hh) {
        ImageIcon icon = getImageIcon(hh.getHinhAnh(), 50, 50);
        JButton btn = new JButton(hh.getTenHang(), icon);
        btn.setPreferredSize(new Dimension(HangHoaDAO.HangHoaWidth, HangHoaDAO.HangHoaHeight));
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ChiTietHoaDon cthd = new ChiTietHoaDon(hh);
                if (listCTHD == null) {
                    listCTHD = new ArrayList<>();
                }
                int flag = 0;
                for (ChiTietHoaDon cthdCu : listCTHD) {
                    if (cthdCu.getMaHang().equals(cthd.getMaHang())) {
                        double oldSoLuong = cthdCu.getSoLuong() + cthd.getSoLuong();
                        double ThanhTien = oldSoLuong * cthdCu.getDonGia();
                        cthdCu.setSoLuong(oldSoLuong);
                        cthdCu.setThanhTien(ThanhTien);
                        flag = 1;
                    }
                }
                if (flag == 0) {
                    listCTHD.add(cthd);
                }
                LoadCTHDVaoTable(jtCTHD, jpnView, jspCTHD);
            }
        });

        btn.setFont(new Font("Times New Roman", Font.BOLD, 14));
        btn.setForeground(Color.BLACK);
        btn.setHorizontalAlignment(JButton.CENTER);
        btn.setVerticalTextPosition(JButton.BOTTOM);
        btn.setHorizontalTextPosition(JButton.CENTER);

        return btn;
    }

    private ImageIcon getImageIcon(String imageName, int width, int height) {
        if (!loadedImages.containsKey(imageName)) {
            URL imageUrl = getClass().getResource("/Images/" + imageName);
            if (imageUrl == null) {
                System.err.println("Could not find image: /Images/" + imageName);
                return null;
            }
            ImageIcon icon = new ImageIcon(new ImageIcon(imageUrl).getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
            loadedImages.put(imageName, icon);
        }
        return loadedImages.get(imageName);
    }

    float tinhTongTien(List<ChiTietHoaDon> listCTHD) {
        float TongTien = 0;
        if (listCTHD != null) {
            for (ChiTietHoaDon cthd : listCTHD) {
                TongTien += cthd.getThanhTien();
            }
            jlbTongTien.setText("Tổng tiền: " + TongTien + "VNĐ");
        } else {
            jlbTongTien.setText("Tổng tiền: 0 VNĐ");
        }
        return TongTien;
    }

    void LoadCTHDVaoTable(JTable jt, JPanel jpn, JScrollPane jsp) {
        String[] header = {"Mã hàng hóa", "Tên hàng hóa", "Số lượng", "DVT", "Đơn giá", "Thành Tiền"};
        if (jt == null && jpn == null && jsp == null) {
            jt = jtCTHD;
            jpn = jpnView;
            jsp = jspCTHD;
        }

        DefaultTableModel modelTableDb = new DefaultTableModel(header, 0) {
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return colIndex == 2;
            }
        };

        if (listCTHD != null) {
            for (ChiTietHoaDon cthd : listCTHD) {
                Object[] row = {cthd.getMaHang(), cthd.getTenHang(), cthd.getSoLuong(), cthd.getDVT(), cthd.getDonGia(), cthd.getThanhTien()};
                modelTableDb.addRow(row);
            }
            tinhTongTien(listCTHD);
        }

        TableRowSorter<TableModel> rowSorter = null;

        jt.setModel(modelTableDb);
        jt.getModel().addTableModelListener(new TableModelListener() {
            public void tableChanged(TableModelEvent e) {
                if (e.getType() == TableModelEvent.UPDATE) {
                    int row = e.getFirstRow();
                    int column = e.getColumn();
                    if (column == 2) { // If the second column is edited
                        TableModel model = (TableModel) e.getSource();
                        double soLuong = Double.parseDouble(model.getValueAt(row, column).toString());
                        double donGia = Double.parseDouble(model.getValueAt(row, 4).toString());
                        double thanhTien = soLuong * donGia;
                        ChiTietHoaDon cthd = listCTHD.get(row);
                        if (soLuong > cthd.getSoLuongTon()) {
                            JOptionPane.showMessageDialog(null, "Số lượng mua không thể lớn hơn số lượng tồn!", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
                            cthd.setSoLuong(cthd.getSoLuongTon());
                            model.setValueAt(cthd.getSoLuongTon(), row, column);
                        } else {
                            cthd.setSoLuong(soLuong);
                            cthd.setThanhTien(thanhTien);
                            tinhTongTien(listCTHD);
                            model.setValueAt(thanhTien, row, 5);
                        }
                    }
                }
            }
        });
        jt.setRowSorter(rowSorter);

        jt.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
        jt.setFont(new Font("Arial", Font.PLAIN, 14));
        jt.getTableHeader().setPreferredSize(new Dimension(100, 50));
        jt.setRowHeight(50);
        jt.validate();
        jt.repaint();

        jsp.setPreferredSize(new Dimension(700, 400));

        jpn.removeAll();
        jpn.setLayout(new CardLayout());
        jpn.add(jsp);
        jpn.validate();
        jpn.repaint();
    }

    private void loadComboBoxNhomHang() {
        DefaultComboBoxModel<NhomHang> model = new DefaultComboBoxModel<>();
        List<NhomHang> listNH = NhomHangDAO.getInstance().getListNhomHang();

        for (NhomHang nhomhang : listNH) {
            model.addElement(nhomhang);
        }
        jcbNhomHang.setModel(model);
    }

    private void TaoDialog(BanHangJFrame frame, String title) {
        frame.setResizable(false);

        dialog = new JDialog();
        dialog.setModal(true);
        dialog.getContentPane().add(frame.getContentPane());
        dialog.getRootPane().setDefaultButton(frame.getBtnLuu());
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setTitle(title);
        dialog.setVisible(true);
    }
    private void jtCTHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtCTHDMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2 && jtCTHD.getSelectedRow() != -1) {
            int index = jtCTHD.getSelectedRow();

            ChiTietHoaDon cthd = listCTHD.get(index);

            BanHangJFrame frame = new BanHangJFrame(cthd, this);

            TaoDialog(frame, "Sửa hàng hóa");
        }
    }//GEN-LAST:event_jtCTHDMouseClicked

    private void jtbQuanLyBanHangStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jtbQuanLyBanHangStateChanged
        // TODO add your handling code here:
        loadComboBoxNhomHang();
        int index = jtbQuanLyBanHang.getSelectedIndex();
        if (index == 0) {
            NhomHang nhomhang = (NhomHang) jcbNhomHang.getSelectedItem();
            loadHH(nhomhang.getMaNhomHang());
            LoadCTHDVaoTable(jtCTHD, jpnView, jspCTHD);
        }
    }//GEN-LAST:event_jtbQuanLyBanHangStateChanged

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
        // TODO add your handling code here:
        if (listCTHD != null) {
            ThanhToanJFrame frame = new ThanhToanJFrame(tinhTongTien(listCTHD), this.khachhang, listCTHD);

            frame.setResizable(false);

            dialog = new JDialog();
            dialog.setModal(true);
            dialog.getContentPane().add(frame.getContentPane());
            dialog.pack();
            dialog.setLocationRelativeTo(null);
            dialog.setTitle("Thông tin thanh toán");
            dialog.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Giỏ hàng đang trống! Vui lòng chọn sản phẩm để đưa vào giỏ!", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnThanhToanActionPerformed

    private void btnXoaHHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaHHActionPerformed
        // TODO add your handling code here:
        try {
            int index = jtCTHD.getSelectedRow();
            ChiTietHoaDon cthd = listCTHD.get(index);
            int kq = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa hàng hóa tên là: " + cthd.getTenHang() + " trong giỏ hàng?", "Câu hỏi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (kq == JOptionPane.YES_OPTION) {
                listCTHD.remove(index);
                LoadCTHDVaoTable(jtCTHD, jpnView, jspCTHD);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn hàng hóa muốn xóa!", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnXoaHHActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        KhachHangJFrame frame = new KhachHangJFrame(null, null, 1);
        frame.setResizable(false);

        JDialog dialog = new JDialog();
        dialog.setModal(true);
        dialog.getContentPane().add(frame.getContentPane());
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setTitle("Thêm khách hàng");
        dialog.setVisible(true);
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        String sdt = jtfSDTKhachHang.getText();
        this.khachhang = KhachHangDAO.getInstance().getKhachHangTheoSDT(sdt);
        if (this.khachhang != null) {
            jtfTenKhachHang.setText(this.khachhang.getTenKH());
        } else {
            JOptionPane.showMessageDialog(null, "Khách hàng không có trong hệ thống vui lòng thêm mới khách hàng!", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
            jtfTenKhachHang.setText("");
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnXoaTatCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaTatCaActionPerformed
        // TODO add your handling code here:
        try {
            if (listCTHD != null) {
                int kq = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa tất cả sản phẩm trong giỏ hàng?", "Câu hỏi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (kq == JOptionPane.YES_OPTION) {
                    listCTHD = null;
                    LoadCTHDVaoTable(jtCTHD, jpnView, jspCTHD);
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn hàng hóa muốn xóa!", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnXoaTatCaActionPerformed

    private void jcbNhomHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbNhomHangActionPerformed
        // TODO add your handling code here:
        NhomHang nhomhang = (NhomHang) jcbNhomHang.getSelectedItem();
        loadHH(nhomhang.getMaNhomHang());
    }//GEN-LAST:event_jcbNhomHangActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoaHH;
    private javax.swing.JButton btnXoaTatCa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<NhomHang> jcbNhomHang;
    private javax.swing.JLabel jlbTongTien;
    private javax.swing.JPanel jpnHangHoa;
    private javax.swing.JPanel jpnHoaDon;
    private javax.swing.JPanel jpnView;
    private javax.swing.JScrollPane jspCTHD;
    private javax.swing.JTable jtCTHD;
    private javax.swing.JTabbedPane jtbQuanLyBanHang;
    private javax.swing.JTextField jtfSDTKhachHang;
    private javax.swing.JTextField jtfTenKhachHang;
    // End of variables declaration//GEN-END:variables
}
