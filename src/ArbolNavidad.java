public class ArbolNavidad {
    public static void main(String[] args) {
        int altura = 10; // Puedes cambiar este valor para hacerlo más grande

        // Cuerpo del árbol
        for (int i = 0; i < altura; i++) {
            // 1. Imprimir espacios para centrar
            for (int j = 0; j < altura - i - 1; j++) {
                System.out.print(" ");
            }
            // 2. Imprimir asteriscos (follaje)
            // La fórmula (i * 2) + 1 asegura un número impar de asteriscos
            for (int k = 0; k < (i * 2) + 1; k++) {
                System.out.print("*");
            }
            // Salto de línea para la siguiente fila
            System.out.println();
        }

        // Tronco del árbol

    }
}