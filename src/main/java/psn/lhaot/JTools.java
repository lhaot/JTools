package psn.lhaot;

import org.apache.commons.cli.*;

import java.util.Arrays;


public class JTools {
    public static void main(String[] args) throws ParseException {
        Options options = new Options();
        options.addOption("i", true, "");
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args);
        Arrays.stream(commandLine.getOptions()).forEach((option -> System.out.println(option.getOpt() + option.getValue())));
    }
}