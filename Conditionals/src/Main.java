
public class Main {
    public static void main(String[] args) {

        int numberIf = 0;
        int numberWhile = 0;

        if(numberIf > 0 || numberIf < 0 || numberIf == 0) {
            System.out.println("If: " + numberIf);
        }

        while(numberWhile < 3) {
            System.out.println("While: " + numberWhile);
            numberWhile++;
        }

        do {
            System.out.println("Do-While: " + numberWhile);
            numberWhile++;
        } while(numberWhile <= 3);

        for(int numberFor = 0; numberFor <=3; numberFor++) {
            System.out.println("For: " + numberFor);
        }

        String seasons = "Verano";

        switch (seasons) {
            case "Verano":
                System.out.println("Estamos en " + seasons);
                break;
            case "Invierno":
                System.out.println("Estamos en " + seasons);
                break;
            case "Otoño":
                System.out.println("Estamos en " + seasons);
                break;
            case "Primavera":
                System.out.println("Estamos en " + seasons);
                break;
            default:
                System.out.println("Ups! no es una estación");
        }
    }
}