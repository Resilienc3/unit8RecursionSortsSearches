

/**
 * Write a description of class StringReverseIter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringReverseIter
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    
    public static String reverse(String text)
    {
        String reverseText = "";
        
        for(int i = text.length() - 1; i >= 0; i--)
        {
            char c = text.charAt(i);
            reverseText += c;
        }
        
        return reverseText;
    }

}
