/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author angga
 */
public class Balok extends PersegiPanjang implements MenghitungRuang {
    private double tinggi, luasPermukaan, volume;
    
    public Balok() {
    }
    
    public Balok(double p, double l, double t) {
        super(p,l);
        tinggi = t;
    }    
    
    @Override
    public void hitungVolume()
    {
        volume = getLuas()*tinggi;
    }
    
    @Override
    public void hitungLuasPermukaan()
    {
        luasPermukaan = getLuas()*2+2*super.lebar*tinggi+2*super.panjang*tinggi;
    }

    public double getLuasPermukaan() {
        return luasPermukaan;
    }

    public double getVolume() {
        return volume;
    }
}
