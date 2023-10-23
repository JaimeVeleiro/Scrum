// Alejandro ha estado aqui
//Jaime ha estado aqui
//Jaime bobo juega al bdo
public class Ejercicio_3Dados {
    static final String GANA1= "Ha ganado el Jugador 1, ENHORABUENA!!";
    static final String GANA2 = "Ha ganado el Jugador 2, ENHORABUENA!!";
    static final String EMPATE = "Habeis empatado, seguid intentÃ¡ndolo!!";
    static final byte RANGO = 6;
    public static void main(String[] args) {
        byte valor1,  valor2, valor3, valor4, valor5, valor6;
        byte final1, final2;

        //IN, PROCESO, OUT
        valor1 = (byte) (Math.random() * RANGO + 1);
        valor2 = (byte) (Math.random() * RANGO + 1);
        valor3 = (byte) (Math.random() * RANGO + 1);
        valor4 = (byte) (Math.random() * RANGO + 1);
        valor5 = (byte) (Math.random() * RANGO + 1);
        valor6 = (byte) (Math.random() * RANGO + 1);

        //PROCESO
        if (valor1 + valor2 + valor3 == RANGO * 3){
            final1 = 3;
        } else if ((valor1 == RANGO) && valor2 == RANGO){
            final1 = 2;
        } else if (valor1 == RANGO && valor3 == RANGO){
            final1 = 2;
        } else if (valor2 == RANGO && valor3 == RANGO){
            final1 = 2;
        }else if (valor1 == RANGO || valor2 == RANGO || valor3 == RANGO){
            final1 = 1;
        } else {
            final1 = 0;
        }

        if (valor4 + valor5 + valor6 == RANGO * 3){
            final2 = 3;
        } else if (valor4 == RANGO && valor5 == RANGO){
            final2 = 2;
        } else if (valor4 == RANGO && valor6 == RANGO){
            final2 = 2;
        } else if (valor5 == RANGO && valor6 == RANGO){
            final2 = 2;
        }else if (valor4 == RANGO || valor5 == RANGO || valor6 == RANGO){
            final2 = 1;
        } else {
            final2 = 0;
        }
        
        //OUT
        System.out.println("El Dado 1 ha dado como resultado " + valor1);
        System.out.println("El Dado 2 ha dado como resultado " + valor2);
        System.out.println("El Dado 3 ha dado como resultado " + valor3);
        System.out.println("El Dado 4 ha dado como resultado " + valor4);
        System.out.println("El Dado 5 ha dado como resultado " + valor5);
        System.out.println("El Dado 6 ha dado como resultado " + valor6);
        if (final1 == final2){
            System.out.println(EMPATE);
        } else if (final1 > final2){
            System.out.println(GANA1);
        } else {
            System.out.println(GANA2);
        }
    }
}