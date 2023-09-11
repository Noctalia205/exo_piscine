import java.sql.SQLOutput;

public class principal {

    public static void main(String[] args) {
        // CODE HERE !!!
        System.out.println("Hello World");

        int entier;
        float reel;
        String chaine1;
        boolean isValid;

        entier = 54;
        reel = 54.7f;
        chaine1 = "coucou c'est cool !";
        isValid = true;
        System.out.println(entier + reel + " / " + chaine1 + " / " + isValid);


        // Initialisation de la variable A
        int A;
        A = 12 ;
// Traitement
        if( A >= 5 ) {
            A = A * 10 ;
        }
        else {
            A = A + 1 ;
        }
// Affichage du résultat
        System.out.println( A ) ;

// branchements condtionnels

        int age = 15;

        if(age >= 18){
            System.out.println("je suis majeur");
        }
        else{
            System.out.println("je suis mineur");
        }

        int v1 = 100;
        int v2 = 100;

        if(v1 == 0 || v2 == 0){
            System.out.println("produit nul");
        }
        else if(v2 > 0 && v1 > 0){
            System.out.println("produit positif");
        }


        float note = 15f;

        if(note == 20){
            System.out.println("excellent");
        }
        else if(note >=18 ){
            System.out.println("très bien");
        }
        else if(note >=16){
            System.out.println("bien");
        }
        else if(note >=14) {
            System.out.println("assez bien");
        }
        else if(note >=12) {
            System.out.println("pas de mention");
        }
        else if(note >=10) {
            System.out.println("rattrapage");
        }
        else{
            System.out.println("Tricheur");
        }

        int i;
        System.out.println(1);

        for (i=0;i<=100;i+=3){
            System.out.println(i);
        }
        System.out.println("END");

        int x;
        for (x=100;x>=0;x=x-1){
            System.out.println(x);
        }

        String machaine = "Coding";
        String nvchaine = "";
        for (int j = machaine.length()-1; j>=0; j--) {
            nvchaine += machaine.charAt(j);
        }
        System.out.println(nvchaine);


        System.out.println(minimum(4,5));

        System.out.println(abs(-6));

        System.out.println(sum(5));
    }

    static int minimum(int y, int z){
        int mini = y;
        if (y>z){
            mini = z;
        } else if (y==z){
            System.out.println("égalité");
        }
        return mini;

    }

    static int abs(int num) {
        int temp = num;
        if (num < 0) {
            temp = num * (-1);
        }
        return temp;
    }

    static int sum(int N) {
        int somme = 0;
        for (int e = 1; e<=N; ++e){
            somme += e;
        }
        return somme;
    }
}

