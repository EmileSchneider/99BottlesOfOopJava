package org.example;

public class Bottles {
    public String verse(int verseNumber) {
        if(verseNumber == 0) {
            return """
                    No more bottles of beer on the wall, no more bottles of beer.
                    Go to the store and buy some more, 99 bottles of beer on the wall.
                    """;
        }
        if (verseNumber == 1) {
            return """
                    1 bottle of beer on the wall, 1 bottle of beer.
                    Take it down and pass it around, no more bottles of beer on the wall.
                    """;
        }
        if (verseNumber == 2) {
            return """
                    2 bottles of beer on the wall, 2 bottles of beer.
                    Take one down and pass it around, 1 bottle of beer on the wall.
                    """;
        }
        return String.format("""
                %s bottles of beer on the wall, %s bottles of beer.
                Take one down and pass it around, %s bottles of beer on the wall.
                """, verseNumber, verseNumber, verseNumber-1);
    }

    public String song() {
        StringBuilder builder = new StringBuilder();
        for(int i = 99; i > 0; i--) {
            builder.append(this.verse(i));
        }

        return builder.toString();
    }
}
