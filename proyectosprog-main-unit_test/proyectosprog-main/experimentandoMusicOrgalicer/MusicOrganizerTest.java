import org.junit.Test;

import junit.framework.Assert;

public class MusicOrganizerTest {
    @Test
    
    /* 
    Probaremos el metodo GetNumberOfFiles insertando previamente una canción. Por lo que el resultado deberia ser 1.
    */
    public void testGetNumberOfFiles (){
        //Creo un nuevo objeto MusicOrganizer y lo inicalizo en la variable musicOrganizer
        MusicOrganizer musicOrganizer = new MusicOrganizer();
        //Inserto una canción con el método addFile
        musicOrganizer.addFile("Loba - Shakira.mp3");
        //Ejecuto la instruccion assertEquals para comparar el valor que me devuelve el metodo getNumberOfFiles con el valor 1, que es el que deberia retornar.
        org.junit.Assert.assertEquals(musicOrganizer.getNumberOfFiles(), 1);
    }
}
