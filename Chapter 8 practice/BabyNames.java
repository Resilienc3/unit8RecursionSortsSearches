

/**
 * Write a description of class BabyNames here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BabyNames
{
    /** description of instance variable x (add comment for each instance variable) */
    
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

}
