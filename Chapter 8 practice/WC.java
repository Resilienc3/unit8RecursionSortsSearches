import java.util.Scanner;
import java.io.File;
/**
 * Write a description of class WC here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WC
{
    private File text;
    Scanner in = new Scanner(text);
    /**
     * Default constructor for objects of class WC
     */
    public WC()
        throws java.io.FileNotFoundException
    {
        Scanner s = new Scanner(System.in);
        File text = new File(s.next());
       
    }

    public int charCount()
    {
        in.useDelimiter("");
        int counter= 0;
        while (in.hasNext())
        {
            counter++;
        }
        return counter;
    }
    
    public int wordCount()
    {
        in.useDelimiter("[^A-Za-z]+");
        int counter= 0;
        while (in.hasNext())
        {
            counter++;
        }
        return counter;
    }
    
    public int lineCount()
    {
        in.useDelimiter("\n");
        int counter= 0;
        while (in.hasNext())
        {
            counter++;
        }
        return counter;
    }
}
