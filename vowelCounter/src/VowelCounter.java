
/**
 *
 * @author HUSSAIN ASHIQ
 */
public class VowelCounter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new MainFrame().setVisible(true);
    }
    public static int[] countVowel(String input){
        int vowelCount = 0;
        int consonentCount = 0;
        int result[] = {0,0};
        input = input.replaceAll("[ 1234567890=+!~@#$%^&*()_.,?-]", "");
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(ch == 'a' || ch == 'A' ||
               ch == 'e' || ch == 'E' ||
               ch == 'i' || ch == 'I' ||
               ch == 'o' || ch == 'O' ||
               ch == 'u' || ch == 'U' )
            {
              vowelCount++;  
            }
            else
                consonentCount++;
                
        }
        result[0] = vowelCount;
        result[1] = consonentCount;
        return result;
        
    }
    
}
