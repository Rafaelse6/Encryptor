//Simple encryptihon and decryption
package encryption;
import java.util.Scanner;
public class Encryption {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's the key ?");
        int key = scanner.nextInt();
        
        String text = "Hey, how's it hangin?";
        
        System.out.println(text);
        
        char[] chars = text.toCharArray();
        
        for(char c: chars){
            c += key;
            System.out.print(c);
        }
    } 
    
    
   //If you want do decrypt the text you only need to change c+= key to c-=key; 
    
   
}
