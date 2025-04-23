import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class CPRValidatorTest {

    private CPRValidator c;
    @BeforeEach
    void startUp() {
        c = new CPRValidator();
    }

    @AfterEach
    void tearDown() {
        c = null;
    }


}