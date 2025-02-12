package NLP;

import java.io.IOException;
import java.util.LinkedList;
import questionaireprocessing.FileManager;

/**
 *
 * @author USER
 */
public class StopwordRemoval {

    static LinkedList<String> stopwords;
    static final String PATH = "stopword-list-en.txt";

    public StopwordRemoval() throws IOException {
        FileManager fileManager = new FileManager();
        stopwords = fileManager.readFileContent(PATH);
    }

    public LinkedList<String> removeStopwords(LinkedList<String> wordList) {
        LinkedList<String> curatedWordList = new LinkedList<>();

        for (String word : wordList) {
            if (stopwords.contains(word) == false) {
                curatedWordList.add(word);
            }
        }

        return curatedWordList;
    }

}
