import java.util.Scanner;

public class Cesar {
    public static void main(String[] args) {
        
        char[] b = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        cesar(b);
        System.out.println(b.length);
    }

    public static void cesar(char[] b){
        StringBuilder sCodigo = new StringBuilder();
        char cLetra;
        int iSaltos = 0, saltoF = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el texto:");
        String sText = sc.nextLine();
        System.out.println("dime los saltos");
        iSaltos = Integer.valueOf(sc.nextLine());

        while (iSaltos >= 26){
            iSaltos = iSaltos - 26;
        }
        

        for (int i=0; i < sText.length(); i++ ){
            cLetra = sText.charAt(i);

            for (int j=0; cLetra != b[j]; j++){
                
                if((j + 1 + iSaltos) > b.length){
                    saltoF = j + iSaltos +1;
                    saltoF = (saltoF - 26);


                } else {
                    saltoF = j+1 + iSaltos;
                }

            }

            if(cLetra == b[0]){
                saltoF = iSaltos; 
            }
            if (saltoF == -1){
                saltoF = 25;
            }
            if (saltoF == 26){
                saltoF = 0;
            }
            
            sCodigo.append(b[saltoF]);
        }
        System.out.println(sCodigo);
        sc.close();
    }
}