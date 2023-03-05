/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author angga
 */
public class PersegiPanjang implements MenghitungBidang {
    protected double panjang, lebar, luas, keliling;
    
    public PersegiPanjang() {
    }
    
    public PersegiPanjang(double p, double l) {
        panjang = p;
        lebar = l;
    }
    
    @Override
    public void hitungLuas() {
        luas = panjang*lebar;
    }

    @Override
    public void hitungKeliling() {
       keliling = 2*(panjang+lebar); 
    }
            
    public double getLuas() {
        return luas;
    }
    
    public double getKeliling() {
        return keliling;
    }
}
