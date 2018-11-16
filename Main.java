public class Main {

    public static void main(String[] args) {
        System.out.println("hello world");
        String[] firstWord = {"Skittles", "Cyrina", "Christian", "Your mom"};
        String[] secondWord = {"amazing", "awesome", "sexy", "lousy"};
        String[] thirdWord = {"woman", "kitty", "brat", "back-massager"};

        int rand1 = (int) (Math.random() * firstWord.length);
        int rand2 = (int) (Math.random() * secondWord.length);
        int rand3 = (int) (Math.random() * thirdWord.length);

        String grammar;

        if (rand2 == 0 || rand2 == 1) {
            grammar = " is an ";}
        else {
            grammar = " is a ";}

        String phrase = firstWord[rand1] + grammar + secondWord[rand2] + " " + thirdWord[rand3] + ".";
        System.out.println(phrase);


    }
}
