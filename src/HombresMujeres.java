public class HombresMujeres {
    public static void main(String[] args) {
        int[] edadHombres = {18, 22, 25, 30, 19};
        int[] edadMujeres = {20, 21, 24, 28, 22};

        int n=edadHombres.length;
        double hombres = 0;
        double mujeres = 0;

        for (int i = 0; i < n; i++) {
            hombres += edadHombres[i];
            mujeres += edadMujeres[i];
        }
        double promedioHombres = hombres / n;
        double promedioMujeres = mujeres / n;

        System.out.println("Promedio Hombres: " + promedioHombres);
        System.out.println("Promedio Mujeres: " + promedioMujeres);
        System.out.println("------------------------------------");

        if (promedioHombres>promedioMujeres) {
            System.out.println("el promedio de los hombres es mayor");
        }else if (promedioMujeres>promedioHombres) {
            System.out.println("el promedio de mujeres es mayor");
        }else{
            System.out.println("el promedio de hombres y mujeres es igual");
        }
    }
}