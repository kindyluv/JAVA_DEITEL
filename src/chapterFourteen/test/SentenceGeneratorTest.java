package Chapter5.src.chapterFourteen.test;

import Chapter5.src.chapterFourteen.src.SentenceGenerator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SentenceGeneratorTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void createSentence() {
        String sentence = SentenceGenerator.createSentence();
        assertFalse(sentence.isEmpty());
        System.out.println(sentence);
    }
}