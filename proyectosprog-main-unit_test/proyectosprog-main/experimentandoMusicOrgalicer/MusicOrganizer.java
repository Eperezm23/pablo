import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<String>();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if (validIndex(index) ==true){
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(validIndex(index) ==true) {
            files.remove(index);
        }
    }
    public void checkIndex  (int indice) {
        if (files.size() == 0) {
            System.out.println("la colección esta vacía");
        } else {
if (files.size() >= indice || files.size() <0) {
    System.out.println("se ha producido un error, vuelve a introducir un número válido " );
}
        }
    }
    public boolean validIndex (int index) {
        boolean resultado    ;
        if ( index >=   0 && index < files.size()  ) {
            resultado = true ;
        } else {
            resultado = false ;
        }
return resultado ;
        }  
    public void listAllFiles() {
        int position = 1; 
        for (String filename : files) {
            System.out.println(position + ". " + filename);
            position++;
        }
    }

    /**
 * Enumera los nombres de archivo que se corresponden con
 * la cadena de búsqueda proporcionada.
 * @param searchString La cadena que hay que buscar.
 */
public void listMatching(String searchString) {
    boolean mensajeError ;
    mensajeError = false ;

    for (String filename : files) {
        if (filename.contains(searchString)) {
            mensajeError = true;
            System.out.println(filename);
        }
    }

    if (!mensajeError) {
        System.out.println("no se ha encontrado lo que buscas");
    }
}

//metodo listfile con bucle.
/**
 * Mostrar una lista de todos los archivos de la colección
 */
public void listAllFilesDos() {
    int index = 0;
    while(index < files.size()) {
        String filename = files.get(index);
        System.out.println(filename);
        index++;
    }
}


//fin de la clase

}