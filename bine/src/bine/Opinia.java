/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bine;

/**
 *
 * @author Ariel
 */
public class Opinia {
    
    String nazwa;
    float ocena;
    String komentarz;
    String rodzaj;
    
    public Opinia(String name, float degree, String comment, String type)
    {
        nazwa = name;
        ocena = degree;
        komentarz = comment;
        rodzaj = type;
    }
    
}
