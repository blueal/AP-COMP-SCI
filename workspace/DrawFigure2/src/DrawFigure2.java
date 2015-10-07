
public class DrawFigure2
{
    public static final int SUB_HEIGHT = 4;
    
    public static void main(String[] args)
    {
        drawLine();
        drawTop();
        drawBottom();
        drawLine();
    }
    
    public static void writeSpaces(int number){
    	for (int i = 1; i <= (number - 1); i++)
        {
            System.out.print(" ");                
        }
    }
    
    public static void drawTop()
    {
        for (int line = 1; line <= SUB_HEIGHT; line++)
        {
            System.out.print("|");
            
            // This loop, that writes spaces, is in many places.
            // How can we replace it with a method call?
            writeSpaces(line);

            System.out.print("\\");
            int dots = 2 * SUB_HEIGHT - 2 * line;
            for (int i = 1; i <= dots; i++)
            {
                System.out.print(".");                
            }

            System.out.print("/");
            
            writeSpaces(line);

            System.out.println("|");
        }
    }

    public static void drawBottom()
    {
        for (int line = 1; line <= SUB_HEIGHT; line++)
        {
            System.out.print("|");
//            for (int i = 1; i <= (SUB_HEIGHT - line); i++)
//            {
//                System.out.print(" ");                
//            }
            writeSpaces((SUB_HEIGHT - line) + 1);

            System.out.print("/");
            for (int i = 1; i <= 2 * (line - 1); i++)
            {
                System.out.print(".");                
            }

            System.out.print("\\");
            
            writeSpaces((SUB_HEIGHT - line) + 1);
            
            System.out.println("|");
        }
    }

    public static void drawLine()
    {
        System.out.print("+");
        for (int i = 1; i <= (2 * SUB_HEIGHT); i++)
        {
            System.out.print("-");            
        }
        System.out.println("+");
    }
}
