package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char[] chars) {
        char s[];      s =chars;
        int i=0;
        while (i <=s.length){
            System.out.print(s[i]);
            i++;

        }

    }

    public static void main(String[] args) {
        WordsBuilder wordsBuilder = new WordsBuilder();
        char s[] = { '!','H','I','N','T'};
        wordsBuilder.buildPhrase(s);
    }
}
