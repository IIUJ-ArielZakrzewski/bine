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
public class Administrator extends Uzytkownik{
    
    
    List<Uzytkownik> uzytkownicy;
    
    public Administrator(String imie, String nazwisko, String login, String kodPocztowy, String miasto, String ulica, int nrDomu, int nrLokalu)
    {
        super(imie, nazwisko, login, kodPocztowy, miasto, ulica, nrDomu, nrLokalu);
        uzytkownicy = new LinkedList<>();
    }
    
    public void dodajChmiel(GatunekChmielu chmiel)
    {
        gatunkiChmielu.add(chmiel);
    }
    
    public void usunChmiel(String nazwa)
    {
        
    }
    
    public void dodajSzczep(SzczepWinogron szczep)
    {
        szczepyWinogron.add(szczep);
    }
    
    public void usunSzczep(String nazwa)
    {
        
    }
    
    public void dodajRodzaj(RodzajPiwa rodzaj)
    {
        rodzajePiwa.add(rodzaj);
    }
    
    public void usunRodzaj(String nazwa)
    {
        
    }
    
    public void edytujChmiel(String nazwa, String opis)
    {
        
    }
    
    public void edytujSzczep(String nazwa, String opis)
    {
        
    }
    
    public void edytujRodzaj(String nazwa, String opis)
    {
        
    }
    
    public void edytujWinoGlobalne(Wino wino)
    {
        
    }
    
    public void edytujPiwoGlobalne(Piwo piwo)
    {
        
    }
    
    public void przeniesPiwoDoGlobalnych(Piwo piwo, String user)
    {
        
    }
    
    public void przeniesWinoDoGlobalnych(Wino wino, String user)
    {
        
    }
    
    public void dodajWinoGlobalne(Wino wino)
    {
        winaGlobalne.add(wino);
    }
    
    public void dodajPiwoGlobalne(Piwo piwo)
    {
        piwaGlobalne.add(piwo);
    }
    
    public void usunWinoGlobalne(String nazwa)
    {
        
    }
    
    public void usunPiwoGlobalne(String nazwa)
    {
        
    }
    
    public Uzytkownik wyszukajUsera(String imie, String nazwisko, String login)
    {
        Uzytkownik wynik = null;
        
        return wynik;
    }
    
}
