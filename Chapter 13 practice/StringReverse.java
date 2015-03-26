

/**
 * Write a description of class StringReverse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringReverse
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class StringReverse
     */
    public StringReverse()
    {
        // initialise instance variables
        x = 0;
    }

    public static String reverse(String text)
    {
        if( text.length() <= 1)
        {
            return text;
        }
        
        char c = text.charAt( 0 );
        String rest = text.substring(1);
        String reverseText = reverse(rest)+ c;
        return reverseText;
    }
    
    public static void main(String args[])
    {
        System.out.println(reverse("Martin and the Dragon!"));
    }
}
