package com.sinatra;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class LikeSongFrankSinatra extends LikeSongParent {


    @Test
    public void testLikeSong()
    {
        navegarSitio("http://evening-bastion-49392.herokuapp.com/");
        validarHomePage("Welcome to to this website all about the songs of the great Frank Sinatra");
        hacerLogin("frank", "sinatra");
        validarMensajeLogin("You are now logged in as frank");
        validarSongsPage ();
        seleccionarCancion(2);
        darLike();
        logOut();
        validarLogout("You have now logged out");
        cerrarBrowser();
    }

  @Test
  public void testLogin()
  {
    navegarSitio("http://evening-bastion-49392.herokuapp.com/");
    validarHomePage("Welcome to to this website all about the songs of the great Frank Sinatra");
    hacerLogin("frank", "sinatra");
    validarMensajeLogin("You are now logged in as frank");
    validarSongsPage ();
    cerrarBrowser();
  }
}
