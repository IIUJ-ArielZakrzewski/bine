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
public class Piwo extends Alkohol{
    
    String browar;
    int ekstrakt;
    List<String> chmiel;
    
    public Piwo(String name, String country, int alk, String genre, String description, String browar, int ekstrakt)
    {
        super(name, country, alk, genre, description);
        this.browar = browar;
        this.ekstrakt = ekstrakt;
        chmiel = new LinkedList<>();
    }
    
    public void usunPiwo()
    {
        
    }
    
    public void addChmiel(String nazwaChmielu)
    {
        chmiel.add(nazwaChmielu);
    }
    
    public void deleteChmiel(String nazwaChmielu)
    {
        if(chmiel.contains(nazwaChmielu))
        {
            chmiel.remove(chmiel.indexOf(nazwaChmielu));
        }
    }
    
}
