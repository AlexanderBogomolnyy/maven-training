package app;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SimpleReporterTest {

    private Reporter reporter;
    private List<String> data;

    @Before
    public void setUp() throws Exception {
        reporter = new SimpleReporter();
        data = new ArrayList<String>() {{
            add("a");
            add("b");
            add("c");
        }};
    }

    @Test
    public void testReport() throws Exception {
        assertEquals("a; b; c; ", reporter.report(data));
    }

}