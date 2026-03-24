public class ListaNotas {
    public static void main(String[] args) {

        int ganaron=0;
        int perdieron=0;

        double listaNotas[]={4.5, 2.8, 3.0, 1.5, 5.0, 3.2, 2.0, 4.1, 2.9, 3.8};

        for(int i=0; i<listaNotas.length; i++){
            if (listaNotas[i]>=3) {
                ganaron++;
            }else{
                perdieron++;
                }  
            }
        System.out.println("resultado");
        System.out.println("ganaron "+ ganaron +" estudiantes");
        System.out.println("perdieron "+ perdieron +" estudiantes");
    }
}