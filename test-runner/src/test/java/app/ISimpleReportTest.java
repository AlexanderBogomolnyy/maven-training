package app;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ISimpleReportTest {

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
    public void longRunningTestReport() throws Exception {
        Thread.sleep(2500);
        assertEquals("a; b; c; ", reporter.report(data));
    }

}
