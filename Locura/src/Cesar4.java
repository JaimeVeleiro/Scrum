import java.util.Scanner;

public class Cesar4 {
    public static void main(String[] args) {
        
        char[] b = {' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 
        'A', 'B', 'C', 'D' , 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M','N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ',', '?', '.', '!'};
        char[] c = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 
        'A', 'B', 'C', 'D' , 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M','N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        cesar(b, c);
        //System.out.println(b.length);
    }

    public static void cesar(char[] b, char[] c){
        StringBuilder sCodigo = new StringBuilder();
        char cLetra;
        int iSaltos = 0, saltoF = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el texto:");
        String sText = sc.nextLine();
        System.out.println("dime los saltos");
        iSaltos = Integer.valueOf(sc.nextLine());
        String cText;

        while (iSaltos >= b.length){
            iSaltos = iSaltos - b.length;
        }
        
        for (int i=0; i < sText.length(); i++ ){
            cLetra = sText.charAt(i);
            cText =String.valueOf(cLetra);

            if (cText.compareTo(",")== 0){
                saltoF = 63;
                sCodigo.append(b[saltoF]);
            }else if(cText.compareTo("?")== 0){
                saltoF = 64;
                sCodigo.append(b[saltoF]);
            }else if (cText.compareTo(".")== 0){
                saltoF = 65;
                sCodigo.append(b[saltoF]);
            }else if (cText.compareTo("!")== 0){
                saltoF = 66;
                sCodigo.append(b[saltoF]);
            }else if (cText.compareTo(" ")== 0){
                saltoF = 0;
                sCodigo.append(b[saltoF]);
            } else {

                for (int j=0; cLetra != c[j]; j++){
                    
                    if((j + 1 + iSaltos) > c.length){
                        saltoF = j + iSaltos + 1;
                        saltoF = (saltoF - c.length);
    
                    } else {
                        saltoF = j + 1 + iSaltos;
                    }
                }
    
                if(cLetra == - 1){
                    saltoF = c.length - 1;
                }
                if (saltoF == c.length){
                    saltoF = 0;
                }
                sCodigo.append(c[saltoF]);
            }
            
            
        }
        System.out.println(sCodigo);
        sc.close();
    }
}