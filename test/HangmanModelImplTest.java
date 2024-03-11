import hangman.HangmanModel;
import hangman.HangmanModelImpl;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class HangmanModelImplTest {

  private HangmanModel game;

  @Before
  public void setUp() {
    game = new HangmanModelImpl("res/test.txt");
  }

  @Test
  public void aTestThatPasses() {
  }


}