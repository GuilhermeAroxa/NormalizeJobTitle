package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import utils.Normalise;

public class NormaliseTests {
    
    @Test
    public void shouldBeNormalisedToArchitect () {
        Normalise n = new Normalise();
        String engineerNormalised = n.normalise("Cloud Architect");
        assertEquals(engineerNormalised, "Architect");
    }

    @Test
    public void shouldBeNormalisedToEnginer () {
        Normalise n = new Normalise();
        String engineerNormalised = n.normalise("Java engineer");
        assertEquals(engineerNormalised, "Software Engineer");
    }

    @Test
    public void shouldBeNormalisedToQuantitySurveyor () {
        Normalise n = new Normalise();
        String engineerNormalised = n.normalise("Chartered Quantity Surveyor");
        assertEquals(engineerNormalised, "Quantity Surveyor");
    }

    @Test
    public void shouldBeNormalisedToAccountant () {
        Normalise n = new Normalise();
        String engineerNormalised = n.normalise("Chief Accountant");
        assertEquals(engineerNormalised, "Accountant");
    }
    
    @Test
    public void shouldNotBeNormalised () {
        Normalise n = new Normalise();
        String jobTitleNormalised = n.normalise("Wrong Job Title");
        assertNull(jobTitleNormalised);
    }
}
