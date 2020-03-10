public class Main
{
    public static void main(String[] args)
    {
        int[] tabAlea;
        int[] tabAlea2;
        int[] tabConnu;
        int[] tabConnu2;
        int[] tabDecroissant;
        int[] tabDecroissant2;
        int[] tabCroissant;
        int[] tabCroissant2;
        int[] tabCroissantDecroissant;
        int[] tabCroissantDecroissant2;

        tabAlea = Tableau.creeTableauAleatoire(10);
        tabAlea2 = Tableau.creeTableauAleatoire(11);
        tabConnu = Tableau.creeTableauConnu(10, 42);
        tabConnu2 = Tableau.creeTableauConnu(11, 42);
        tabDecroissant = Tableau.creeTableauDeCroissant(10);
        tabDecroissant2 = Tableau.creeTableauDeCroissant(11);
        tabCroissant = Tableau.creeTableauCroissant(10);
        tabCroissant2 = Tableau.creeTableauCroissant(11);
        tabCroissantDecroissant = Tableau.creeTableauCroissantDecroissant(10);
        tabCroissantDecroissant2 = Tableau.creeTableauCroissantDecroissant(11);

        System.out.println("tabAlea :" + Tableau.toStringTab(tabAlea));
        System.out.println("Test element majoritaire naif: " + Algo.naif(tabAlea));
        System.out.println("Test element majoritaire tableauCompteur: " + Algo.tableauCompteur(tabAlea));

        System.out.println("tabAlea2 :" + Tableau.toStringTab(tabAlea2));
        System.out.println("Test element majoritaire naif: " + Algo.naif(tabAlea2));
        System.out.println("Test element majoritaire tableauCompteur: " + Algo.tableauCompteur(tabAlea2));

        System.out.println("tabConnu :" + Tableau.toStringTab(tabConnu));
        System.out.println("Test element majoritaire naif: " + Algo.naif(tabConnu));
        System.out.println("Test element majoritaire tableauCompteur: " + Algo.tableauCompteur(tabConnu));

        System.out.println("tabConnu2 :" + Tableau.toStringTab(tabConnu2));
        System.out.println("Test element majoritaire naif: " + Algo.naif(tabConnu2));
        System.out.println("Test element majoritaire tableauCompteur: " + Algo.tableauCompteur(tabConnu2));

        System.out.println("tabDecroissant :" + Tableau.toStringTab(tabDecroissant));
        System.out.println("Test element majoritaire naif: " + Algo.naif(tabDecroissant));
        System.out.println("Test element majoritaire tableauCompteur: " + Algo.tableauCompteur(tabDecroissant));

        System.out.println("tabDecroissant2 :" + Tableau.toStringTab(tabDecroissant2));
        System.out.println("Test element majoritaire naif: " + Algo.naif(tabDecroissant2));
        System.out.println("Test element majoritaire tableauCompteur: " + Algo.tableauCompteur(tabDecroissant2));

        System.out.println("tabCroissant :" + Tableau.toStringTab(tabCroissant));
        System.out.println("Test element majoritaire naif: " + Algo.naif(tabCroissant));
        System.out.println("Test element majoritaire tableauCompteur: " + Algo.tableauCompteur(tabCroissant));

        System.out.println("tabCroissant2 :" + Tableau.toStringTab(tabCroissant2));
        System.out.println("Test element majoritaire naif: " + Algo.naif(tabCroissant2));
        System.out.println("Test element majoritaire tableauCompteur: " + Algo.tableauCompteur(tabCroissant2));

        System.out.println("tabCroissantDecroissant :" + Tableau.toStringTab(tabCroissantDecroissant));
        System.out.println("Test element majoritaire naif: " + Algo.naif(tabCroissantDecroissant));
        System.out.println("Test element majoritaire tableauCompteur: " + Algo.tableauCompteur(tabCroissantDecroissant));

        System.out.println("tabCroissantDecroissant2 :" + Tableau.toStringTab(tabCroissantDecroissant2));
        System.out.println("Test element majoritaire naif: " + Algo.naif(tabCroissantDecroissant2));
        System.out.println("Test element majoritaire tableauCompteur: " + Algo.tableauCompteur(tabCroissantDecroissant2));
    }
}
