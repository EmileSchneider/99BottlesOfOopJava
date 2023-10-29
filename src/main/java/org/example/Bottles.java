package org.example;

public class Bottles {
    public String verse(int verseNumber) {
        return String.format("""
                        %s %s of beer on the wall, %s %s of beer.
                        %s, %s %s of beer on the wall.
                        """,
                amount(verseNumber).substring(0, 1).toUpperCase() + amount(verseNumber).substring(1), container(verseNumber), amount(verseNumber), container(verseNumber),
                action(verseNumber), amount(successor(verseNumber)), container(successor(verseNumber)));
    }

    public String song() {
        StringBuilder builder = new StringBuilder();

        for (int i = 99; i > 0; i--) {
            builder.append(this.verse(i));
        }

        return builder.toString();
    }

    private String container(int number) {
        if (number == 1) {
            return "bottle";
        } else {
            return "bottles";
        }
    }

    private String pronoun(int number) {
        if (number == 1) {
            return "it";
        } else {
            return "one";
        }
    }

    private String amount(int number) {
        if (number == 0) {
            return "no more";
        } else {
            return String.valueOf(number);
        }
    }

    private int successor(int number) {
        if (number == 0) {
            return 99;
        } else {
            return number - 1;
        }
    }

    private String action(int number) {
        if (number == 0) {
            return "Go to the store and buy some more";
        }
        return String.format("Take %s down and pass it around", pronoun(number));
    }

}
