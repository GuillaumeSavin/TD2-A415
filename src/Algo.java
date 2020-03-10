import javafx.scene.control.Tab;

import java.lang.reflect.Array;

public class Algo
{
    public static boolean naif(int[] tab)
    {
        int compteur = 0;
        int valeur;

        for(int i = 0; i < tab.length; i ++)
        {
            compteur = 0;
            valeur = tab[i];

            for(int j = 0; j < tab.length; j ++)
            {
                if(valeur == tab[j])
                {
                    compteur ++;
                }
            }

            if (compteur > Math.ceil(tab.length / 2 + 1))
            {
                return true;
            }
        }

        return false;
    }

    public static boolean tableauCompteur(int[] tab)
    {
        int valeur;
        int taille_tab2 = Tableau.maxLin(tab) + 1;
        int[] tab2 = new int[taille_tab2];
        boolean testMajoritaire = false;

        for(int i = 0; i < tab.length; i ++)
        {
            valeur = tab[i];

            if(valeur == tab[j])
            {
                tab2[valeur] ++;
            }
        }

        if (tab2[valeur] > Math.ceil(tab.length / 2 + 1))
        {
            testMajoritaire = true;
        }
        }

        System.out.println("tab2 : " + Tableau.toStringTab(tab2));

        return testMajoritaire;
    }
}
