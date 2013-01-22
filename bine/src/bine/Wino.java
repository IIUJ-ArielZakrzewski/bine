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
public class Wino extends Alkohol {
    
    int rocznik;
    String region;
    String apelacja;
    String winnica;
    List<String> szczepyWinogron;
    
    public Wino(String name, String country, int alk, String genre, String description,
            int rocznik, String region, String apelacja, String winnica)
    {
        super(name, country, alk, genre, description);
        
        this.rocznik = rocznik;
        this.region = region;
        this.apelacja = apelacja;
        this.winnica = winnica;
        szczepyWinogron = new LinkedList<>();
    }
    
    public void usunWino()
    {
        
    }
    
    public void addSzczep(String nazwaSzczepu)
    {
        szczepyWinogron.add(nazwaSzczepu);
    }
    
    public void deleteSzczep(String nazwaSzczepu)
    {
        if(szczepyWinogron.contains(nazwaSzczepu))
        {
            szczepyWinogron.remove(szczepyWinogron.indexOf(nazwaSzczepu));
        }
    }
    
}
