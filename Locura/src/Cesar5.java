import java.util.Scanner;

public class Cesar5 {
    public static void main(String[] args) {
        
        char[] b = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 
        'A', 'B', 'C', 'D' , 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M','N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' '};
        cesar(b);
    }

    public static void cesar(char[] b){
        StringBuilder sCodigo = new StringBuilder();
        char cLetra;
        String sLetra;
        int iSaltos = 0, saltoF = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el texto:");
        String sText = sc.nextLine();
        System.out.println("dime los saltos");
        iSaltos = Integer.valueOf(sc.nextLine());

        while (iSaltos >= b.length){
            iSaltos = iSaltos - b.length;
        }
        
        for (int i=0; i < sText.length(); i++ ){
            cLetra = sText.charAt(i);
            sLetra = String.valueOf(cLetra);

            int k = 0;
            while (sLetra.compareTo(String.valueOf(b[k])) != 0 && k != b.length -1){

                k++;
            }

            

            if (k == b.length -1){
                sCodigo.append(cLetra);
            } else {

                for (int j=0; cLetra != b[j]; j++){
                    
                    if((j + 1 + iSaltos) > b.length){
                        saltoF = j + iSaltos + 1;
                        saltoF = (saltoF - b.length);
    
                    } else {
                        saltoF = j + 1 + iSaltos;
                    }
                }
    
                if(cLetra == b[0]){
                    saltoF = iSaltos;
                }
                if(cLetra == -1){
                    saltoF = b.length - 1;
                }
                if (saltoF == b.length){
                    saltoF = 0;
                }
                sCodigo.append(b[saltoF]);
            }
            


            
        }
        System.out.println(sCodigo);
        sc.close();
    }
}