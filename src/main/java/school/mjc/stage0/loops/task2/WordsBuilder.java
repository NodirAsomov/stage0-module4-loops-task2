package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {

        int i=0;
        while (i <=chars.length){
            System.out.print(chars);
            i++;
            break;

        }

    }

    public static void main(String[] args) {
        WordsBuilder wordsBuilder = new WordsBuilder();

        wordsBuilder.buildPhrase( '!','H','I','N','T');

    }
}
