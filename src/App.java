import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the frågesport!");
        int points = 0;
        Scanner tb = new Scanner(System.in);
        System.out.println("Första frågan: Vad är frågesport på engelska?");
        String svar1=tb.nextLine();
        if (svar1.equalsIgnoreCase("quiz")) {
            System.out.println("Rätt svar. Du får en poäng");
            points++;
        }
        else{
            System.out.println("Fel svar. Du får inga poäng");
        }
        System.out.println("Andra frågan: How many buildings does NTI have?");
        String svar2=tb.nextLine();
        if (svar2.equalsIgnoreCase("too many")) {
            System.out.println("Rätt svar. Du får en poäng");
            points++;
        }
        else{
            System.out.println("Fel svar. Du får inga poäng");
        }
        System.out.println("Tredje frågan: Que llama el profesor del matematicas?");
        String svar3=tb.nextLine();
        if (svar3.equalsIgnoreCase("calle")) {
            System.out.println("Rätt svar. Du får en poäng");
            points++;
        }
        else{
            System.out.println("Fel svar. Du får inga poäng");
        }
        System.out.println("Fjärde frågan: Vilken densitet har plexiglas?");
        String svar4=tb.nextLine();
        if (svar4.equalsIgnoreCase("1,18 g/cm³")) {
            System.out.println("Rätt svar. Du får en poäng");
            points++;
        }
        else{
            System.out.println("Fel svar. Du får inga poäng");
        }
        System.out.println("Femte frågan: Harry Potter är en serie fantasyromaner av författaren J.K. Rowling, som började ges ut 1997 och avslutades 2007. Böckerna har gjort stor succé, med översättningar till 73 språk och försäljningssiffror på över 450 miljoner exemplar i hela världen.");
        String svar5=tb.nextLine();
        if (svar5.equalsIgnoreCase("Obaserat")) {
            System.out.println("Rätt svar. Du får en poäng");
            points++;
        }
        else{
            System.out.println("Fel svar. Du får inga poäng");
        }
        System.out.println("Vad är en attribut min kära vän Tim har?  1. långt hår  2. fint skägg  3. kort");
        Scanner alt = new Scanner(System.in);
        int val1 = alt.nextInt();
        do{
            switch (val1) {
                case 1:
                    System.out.println("Fel svar... ingen poäng för dig");
                    break;
                
                case 2:
                    System.out.println("Fel svar... ingen poäng för dig");
                    break;
                case 3:
                    System.out.println("Rätt svar! en poäng till dig");
                    break;
                default:
                    System.out.println("Svara inom alternativs bredden");
                    break;
            }
        }while(val1!=1 && val1!=2 && val1!=3);
        System.out.println("Hur påverkad blir man av emils närvaro?  1. Faded than a hoe  2. delvis 3. inte tillräckligt");
        int val2 = alt.nextInt();
        do{
            switch (val2) {
                case 1:
                    System.out.println("Rätt svar! du får en poäng");
                    break;
            
                case 2:
                    System.out.println("Fel svar... ingen poäng till dig");
                case 3:
                    System.out.println("Är du Tim?");
                    String tim=tb.nextLine();
                    if (tim.equalsIgnoreCase("ja")) {
                        System.out.println("Du får en poäng! rip bozo");
                    }
                    else{
                        System.out.println("Ingen poäng för dig");
                    }
                default:
                    System.out.println("Svara med 1, 2 eller 3");

                    break;
            }
        }while(val2!=1 && val2!=2 && val2!=3);
        System.out.println("Bra jobbat! Du fick "+points+" poäng");
    }
}
