
public class DrawFigure2
{
    public static final int SUB_HEIGHT = 4;
    
    public static void main(String[] args)
    {
        System.out.println(drawLine());
        System.out.print(drawTop());
        System.out.print(drawBottom());
        System.out.println(drawLine());
    }
    
    public static String writeSpaces(int number){
    	String RETURN_STRING = "";
    	for (int i = 1; i <= (number - 1); i++)
        {
    		RETURN_STRING += " ";                
        }
    	return RETURN_STRING;
    }
    
    public static String drawTop()
    {
    	String RETURN_STRING = "";
        for (int line = 1; line <= SUB_HEIGHT; line++)
        {
        	RETURN_STRING += "|";
            //System.out.print("|");
            
            // This loop, that writes spaces, is in many places.
            // How can we replace it with a method call?
            RETURN_STRING += writeSpaces(line);

            RETURN_STRING += "\\";
            int dots = 2 * SUB_HEIGHT - 2 * line;
            for (int i = 1; i <= dots; i++)
            {
            	RETURN_STRING += ".";                
            }

            RETURN_STRING += "/";
            
            RETURN_STRING += writeSpaces(line);

            RETURN_STRING += "|\n";
        }
        return RETURN_STRING;
    }

    public static String drawBottom()
    {
    	String RETURN_STRING = "";
        for (int line = 1; line <= SUB_HEIGHT; line++)
        {
            RETURN_STRING += "|";
//            for (int i = 1; i <= (SUB_HEIGHT - line); i++)
//            {
//                System.out.print(" ");                
//            }
            RETURN_STRING += writeSpaces((SUB_HEIGHT - line) + 1);

            RETURN_STRING += "/";
            for (int i = 1; i <= 2 * (line - 1); i++)
            {
                RETURN_STRING += ".";                
            }

            RETURN_STRING += "\\";
            
            RETURN_STRING += writeSpaces((SUB_HEIGHT - line) + 1);
            
            RETURN_STRING += "|\n";
        }
        return RETURN_STRING;
    }

    public static String drawLine()
    {
    	String RETURN_STRING = "";
        RETURN_STRING += "+";
        for (int i = 1; i <= (2 * SUB_HEIGHT); i++)
        {
            RETURN_STRING += "-";            
        }
        RETURN_STRING += "+";
        
        return RETURN_STRING;
    }
}
