/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bine;

/**
 *
 * @author Ariel
 */
public class OpiniaOWinie extends Opinia {
    
    String polyskliwosc;
    String pierscien;
    String kolor;
    String intensywnoscBarwy;
    String klarownosc;
    String lepkosc;
    String aromaty;
    String szczerosc;
    String harmoniaZapachow;
    String intensywnoscAromatyczna;
    String utlenianie;
    String redukcja;
    String trwaloscAromatyczna;
    String kwasowosc;
    String lotnaKwasowosc;
    String wiek;
    String gorycz;
    String alkohol;
    String atak;
    String cialo;
    String rownowaga;
    String finisz;
    String dwutlenekWegla;
    String sol;
    String slodycz;
    String taniny;
    
    public OpiniaOWinie(String name, float degree, String comment, String type,
            String polyskliwosc, String pierscien, String kolor, String intensywnoscBarwy, String klarownosc,
            String lepkosc, String aromaty, String szczerosc, String harmoniaZapachow, String intensywnoscAromatyczna,
            String utlenianie, String redukcja, String trwaloscAromatyczna, String kwasowosc, String lotnaKwasowosc,
            String wiek, String gorycz, String alkohol, String atak, String cialo, String rownowaga, String finisz, 
            String dwutlenekWegla, String sol, String slodycz, String taniny)
    {
        super(name, degree, comment, type);
        
        this.polyskliwosc = polyskliwosc;
        this.pierscien = pierscien;
        this.kolor = kolor;
        this.intensywnoscBarwy = intensywnoscBarwy;
        this.klarownosc = klarownosc;
        this.lepkosc = lepkosc;
        this.aromaty = aromaty;
        this.szczerosc = szczerosc;
        this.harmoniaZapachow = harmoniaZapachow;
        this.intensywnoscAromatyczna = intensywnoscAromatyczna;
        this.utlenianie = utlenianie;
        this.redukcja = redukcja;
        this.trwaloscAromatyczna = trwaloscAromatyczna;
        this.kwasowosc = kwasowosc;
        this.lotnaKwasowosc = lotnaKwasowosc;
        this.wiek = wiek;
        this.gorycz = gorycz;
        this.alkohol = alkohol;
        this.atak = atak;
        this.cialo = cialo;
        this.rownowaga = rownowaga;
        this.finisz = finisz;
        this.dwutlenekWegla = dwutlenekWegla;
        this.sol = sol;
        this.slodycz = slodycz;
        this.taniny = taniny;
        
    }
    
}
