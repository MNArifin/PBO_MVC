/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import dao.dToko;
import dao.iToko;
import model.mToko;
import view.home;
import model.tmToko;

/**
 *
 * @author MNArifin
 */
public class cToko {
    home hm;
    iToko impToko;
    List<mToko> lt;
    
    public cToko(home hm) {
        this.hm = hm;
        impToko = new dToko();
        lt = impToko.getAll();
    }

    //mengkosongkan isian field     
    public void Reset() {
        hm.getTxtKode().setText("");
        hm.getTxtNama().setText("");
        hm.getTxtHarga().setText("");
        hm.getCbKategori().setSelectedItem(null);
        hm.getCbJenis().setSelectedItem(null);
    }      
    //menghapus data yang dipilih     
    public void Hapus() {
        if (hm.getTxtKode().getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(hm, "Masukkan kode barang");
        } else {
            String kode = (hm.getTxtKode().getText());
            impToko.HapusData(kode);
            JOptionPane.showMessageDialog(hm, "Data berhasil dihapus");
        }
    }     
    //menyimpan data     
    public void SimpanData() {
        mToko toko = new mToko();
        toko.setkode(hm.getTxtKode().getText());
        toko.setnama(hm.getTxtNama().getText());
        toko.setharga(hm.getTxtHarga().getText());
        toko.setkategori(hm.getCbKategori().getSelectedItem().toString());
        toko.setjenis(hm.getCbJenis().getSelectedItem().toString());
        impToko.SimpanData(toko);
    }     
    //mengubah data     
    public void Ubah() {
        mToko toko = new mToko();
        toko.setkode(hm.getTxtKode().getText());
        toko.setnama(hm.getTxtNama().getText());
        toko.setkategori(hm.getCbKategori().getSelectedItem().toString());
        toko.setjenis(hm.getCbJenis().getSelectedItem().toString());
        toko.setharga(hm.getTxtHarga().getText());
        impToko.UbahData(toko);
    }
    public void isiTable() {
        lt = impToko.getAll();
        tmToko tmt = new tmToko(lt);
        hm.getTableData().setModel(tmt);
    }

    public void isiField(int row) {
        hm.getTxtKode().setText(lt.get(row).getkode().toString());
        hm.getTxtNama().setText(lt.get(row).getnama().toString());
        hm.getCbKategori().setSelectedItem(lt.get(row).getkategori().toString());
        hm.getCbJenis().setSelectedItem(lt.get(row).getjenis().toString());
        hm.getTxtHarga().setText(lt.get(row).getharga().toString());
    }

    public void CariKategori() {
        if (!hm.getCbCariKategori().getSelectedItem().toString().isEmpty()) {
            isiTableCariKategori();
        } else {
            JOptionPane.showMessageDialog(hm, "Silahkan Pilih Kategori");
        }
    }

    private void isiTableCariKategori() {
        String item = hm.getCbCariKategori().getSelectedItem().toString();
        lt = impToko.getCariKategori(item);
        tmToko tmt = new tmToko(lt);
        hm.getTableData().setModel(tmt);
    }
}
