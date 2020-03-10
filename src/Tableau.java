import java.util.Arrays;
import java.util.Random;

public class Tableau {

    private static final Random RAND = new Random(System.currentTimeMillis());

    /**
     * Cree un tableau de la taille donnee et le remplit avec des entiers
     * positifs aleatoires
     */
    public static int[] creeTableauAleatoire(int taille) {
        int[] tab = new int[taille];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = RAND.nextInt(1000);
        }
        return tab;
    }

    /**
     * Cree un tableau de la taille donnee et le remplit avec des entiers
     * positifs connus
     */
    public static int[] creeTableauConnu(int taille, int nombre) {
        int[] tab = new int[taille];
        Arrays.fill(tab, nombre);
        return tab;
    }

    /**
     * Cree un tableau de la taille donnee et le remplit avec des entiers
     * positifs decroissants
     */
    public static int[] creeTableauDeCroissant(int taille) {
        int[] tab = new int[taille];
        tab[taille -1] = 0;
        for (int i = taille -2; i >=0; i--) {
            tab[i] = tab[i+1] + RAND.nextInt(10);
        }
        return tab;
    }

    /**
     * Cree un tableau de la taille donnee et le remplit avec des entiers
     * positifs croissants
     */
    public static int[] creeTableauCroissant(int taille) {
        int[] tab = new int[taille];
        tab[0] = 0;
        for (int i = 1; i < tab.length; i++) {
            tab[i] = tab[i-1] + RAND.nextInt(10);
        }
        return tab;
    }


    /**
     * Cree un tableau de la taille donnee et le remplit avec des entiers
     * positifs croissants jusqu'� un certain indice puis d�croissants
     */
    public static int[] creeTableauCroissantDecroissant(int taille) {
        int[] tab = new int[taille];
        int indice = RAND.nextInt(taille);

        tab[0] = 0;
        for (int i = 1; i <= indice; i++) {
            tab[i] = tab[i-1] + RAND.nextInt(10);
        }

        tab[taille-1] = 0;
        for (int i = taille -2; i >indice; i--) {
            tab[i] = tab[i+1] + RAND.nextInt(10);
        }
        return tab;
    }

    public static String toStringTab(int[] tab)
    {
        String str;

        str = "[";

        for (int i = 0; i < tab.length; i ++)
        {
            if (i < tab.length - 1)
            {
                str += tab[i] + "][";
            }
            else
            {
                str += tab[i] + "]";
            }
        }

        return str;
    }

    public static int maxLin(int tab[])
    {
        int max;
        max = tab[0];

        for(int i = 1; i < tab.length; i ++)
        {
            if (max < tab[i])
            {
                max = tab[i];
            }
        }

        return max;
    }
}