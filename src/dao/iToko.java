/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.mToko;

/**
 *
 * @author MNArifin
 */
public interface iToko {

    public void TampilData(mToko a);  
    public void UbahData(mToko a); 
    public void SimpanData(mToko a);  
    public void HapusData(String kode);
    public List<mToko> getCariKategori(String kategori);  
    public List<mToko> getAll();   
    
}
