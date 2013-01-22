/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bine;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Ariel
 */
public class Uzytkownik {
    
    String imie;
    String nazwisko;
    String login;
    String kodPocztowy;
    String miasto;
    String ulica;
    int nrDomu;
    int nrLokalu;
    List<Wino> wina;
    List<Piwo> piwa;
    List<OpiniaOWinie> opinieOWinach;
    List<OpiniaOPiwie> opinieOPiwach;
    List<GatunekChmielu> gatunkiChmielu;
    List<SzczepWinogron> szczepyWinogron;
    List<RodzajPiwa> rodzajePiwa;
    List<Wino> winaGlobalne;
    List<Piwo> piwaGlobalne;
    ObslugaDanych bazaDanych;
    
    public Uzytkownik(String imie, String nazwisko, String login, String kodPocztowy, String miasto, String ulica, int nrDomu, int nrLokalu)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.login = login;
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
        this.ulica = ulica;
        this.nrDomu = nrDomu;
        this.nrLokalu = nrLokalu;
        wina = new LinkedList<>();
        piwa = new LinkedList<>();
        opinieOPiwach = new LinkedList<>();
        opinieOWinach = new LinkedList<>();
        gatunkiChmielu = new LinkedList<>();
        szczepyWinogron = new LinkedList<>();
        rodzajePiwa = new LinkedList<>();
        bazaDanych = new ObslugaDanych();
        winaGlobalne = new LinkedList<>();
        piwaGlobalne = new LinkedList<>();
        
    }
    
    public void dodajWino(Wino wino)
    {
        wina.add(wino);
    }
    
    public void dodajPiwo(Piwo piwo)
    {
        piwa.add(piwo);
    }
    
    public void usunWino(String nazwa)
    {
        
    }
    
    public void usunPiwo(String nazwa)
    {
        
    }
    
    public void dodajOpinieOWinie(OpiniaOWinie opinia)
    {
        opinieOWinach.add(opinia);
    }
    
    
    public void dodajOpinieOPiwach(OpiniaOPiwie opinia)
    {
        opinieOPiwach.add(opinia);
    }
    
    public void usunOpinieOWinie(String nazwaWina)
    {
        
    }
    
    
    public void usunOpinieOPiwie(String nazwaPiwa)
    {
        
    }
    
    public void edytujOpinieOWinie(OpiniaOWinie opinia)
    {
        
    }
    
    
    public void edytujOpinieOPiwie(OpiniaOPiwie opinia)
    {
        
    }
    
    public List<Wino> listaWin()
    {
        return wina;
    }
    
    public List<Piwo> listaPiw()
    {
        return piwa;
    }
    
    public List<OpiniaOWinie> listaOpiniOWinach()
    {
        return opinieOWinach;
    }
    
    public List<OpiniaOPiwie> listaOpiniOPiwie()
    {
        return opinieOPiwach;
    }
    
    public Wino wyszukajWino(String nazaWina)
    {
        Wino wino = null;
        
        return wino;
    }
    
    public Piwo wyszukajPiwo(String nazaPiwa)
    {
        Piwo piwo = null;
        
        return piwo;
    }
    
    public OpiniaOWinie wyszukajOpinieOWinie(String nazaWina)
    {
        OpiniaOWinie opinia = null;
        
        return opinia;
    }
    
    public OpiniaOPiwie wyszukajOpinieOPiwie(String nazaPiwa)
    {
        OpiniaOPiwie opinia = null;
        
        return opinia;
    }
    
    public void edytujWino(Wino wino)
    {
        
    }
    
    
    public void edytujPiwo(Piwo piwo)
    {
        
    }
    
    public GatunekChmielu wyszukajChmiel(String nazwa)
    {
        GatunekChmielu chmiel = null;
        
        return chmiel;
    }
    
    public SzczepWinogron wyszukajSzczep(String nazwa)
    {
        SzczepWinogron szczep = null;
        
        return szczep;
    }
    
    public RodzajPiwa wyszukajRodzajPiwa(String nazwa)
    {
        RodzajPiwa rodzaj = null;
        
        return rodzaj;
    }
    
    public Wino wyszukajWinoGlobalne(String nazaWina)
    {
        Wino wino = null;
        
        return wino;
    }
    
    public Piwo wyszukajPiwoGlobalne(String nazaPiwa)
    {
        Piwo piwo = null;
        
        return piwo;
    }
    
}
