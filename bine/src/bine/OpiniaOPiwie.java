/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bine;

/**
 *
 * @author Ariel
 */
public class OpiniaOPiwie extends Opinia{
    
    String kolor;
    String klarownosc;
    String piana;
    String lepkosc;
    String intensywnoscBarwy;
    String aromat;
    String intensywnoscAromatyczna;
    String bukiet;
    String smak;
    String atak;
    String cialo;
    String rownowaga;
    String finisz;
    String kwasowosc;
    String cierpkosc;
    String slodycz;
    
    public OpiniaOPiwie(String name, float degree, String comment, String type, 
            String kolor, String klarownosc, String piana, String lepkosc, String intensywnoscBarwy, 
            String aromat, String intensywnoscAromatyczna, String bukiet, String smak, String atak, 
            String cialo, String rownowaga, String finisz, String kwasowosc, String cierpkosc, String slodycz)
    {
        super(name, degree, comment, type);
        this.kolor = kolor;
        this.klarownosc = klarownosc;
        this.piana = piana;
        this.lepkosc = lepkosc;
        this.intensywnoscBarwy = intensywnoscBarwy;
        this.aromat = aromat;
        this.intensywnoscAromatyczna = intensywnoscAromatyczna;
        this.bukiet = bukiet;
        this.smak = smak;
        this.atak = atak;
        this.cialo = cialo;
        this.rownowaga = rownowaga;
        this.finisz = finisz;
        this.kwasowosc = kwasowosc;
        this.cierpkosc = cierpkosc;
        this.slodycz = slodycz;
    }
    
}
