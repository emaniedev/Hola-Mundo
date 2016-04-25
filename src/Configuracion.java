/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mazhe
 */
import twitter4j.conf.ConfigurationBuilder;
public class Configuracion {
    
    ConfigurationBuilder cb;
    
    public Configuracion(){
    cb = new ConfigurationBuilder ();
    cb.setDebugEnabled(true);
    cb.setOAuthConsumerKey("OFZg9qDXYhEMYkdheHJeAkgDx");
    cb.setOAuthConsumerSecret("tBHSxOguvmVhHESTOEvYVckQcTLfAnGtcQZUc3NcJqoWKtv0Dh");
    cb.setOAuthAccessToken("2175807113-lXKk6MYo1kH98RiFbqjPTKaNVffuyqK7fMfEP7V");
    cb.setOAuthAccessTokenSecret("6H3ElwyYfKZKRYHtzgGPsbjtPZuueGc5HxaS23Vs62aiu");
    }
    
    
}
