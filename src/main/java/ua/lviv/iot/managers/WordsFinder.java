package ua.lviv.iot.managers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordsFinder {

    public String findWordsWithDecimal(String text, int decimal) {
        String patternString = "\\b\\w" + decimal + "\\w*\\b";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);
        StringBuilder finalText = new StringBuilder();
        while (matcher.find()) {
            finalText.append(matcher.group()).append(" ");
        }

        return finalText.toString();
    }
}
