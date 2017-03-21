package app;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>() {{
            add("a");
            add("b");
            add("c");
        }};
        Reporter reporter = new SimpleReporter();
        System.out.println("Report: " + reporter.report(strings));
    }

}
