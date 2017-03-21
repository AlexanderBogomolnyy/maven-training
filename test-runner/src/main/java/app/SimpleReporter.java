package app;

import java.util.List;

public class SimpleReporter implements Reporter {

    @Override
    public String report(List<String> list) {
        StringBuilder builder = new StringBuilder();
        for(String string: list)
            builder.append(string).append("; ");
        return builder.toString();
    }

}
