import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionHandlingTest {
    @Test
    void testNoException () {
        //given
        SecondChallenge secondChallenge = new SecondChallenge();

        //when&then
        Assertions.assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1,2));
    }

    @Test
    void testException () {
        //given
        SecondChallenge secondChallenge = new SecondChallenge();
        //when&then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2,1.5));
    }

    @Test
    void assertAllTests () {
        //given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When&Then
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2,1.5)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2,1.5))

        );
    }

}

