package demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LetterMatcherDemo {

    public static String replaceMatchingIng(String input) {
        if (input == null) return null;

        String regex = "\\b([a-zA-Z]{4})(ing)\\b";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);//No Case sensitive.
        Matcher matcher = pattern.matcher(input);

        return matcher.replaceAll("foozing"); //to replace all matching characters. Irrespective of cases
    }

    public static void main(String[] args) {
        String poem = """
             Once upon a midnight dreary, while I pondered, weak and weary,
              Over many a quaint and curious volume of forgotten lore—
            While I nodded, nearly napping, suddenly there came a tapping,
              As of some one gently rapping, rapping at my chamber door.
            “’Tis some visitor,” I muttered, “tapping at my chamber door—
              Only this and nothing more.”
            And the silken, sad, uncertain rustling of each purple curtain
            Thrilled me— filled me with fantastic terrors never felt before;
            So that now, to still the beating of my heart, I stood repeating
            “’Tis some visitor entreating entrance at my chamber door—
            Some late visitor entreating entrance at my chamber door;—
            This it is and nothing more.”
            But the Raven, sitting lonely on the placid bust, spoke only
            That one word, as if his soul in that one word he did outpour.
            Nothing farther then he uttered— not a feather then he fluttered—
            Till I scarcely more than muttered “Other friends have flown before—
            On the morrow he will leave me, as my Hopes have flown before.”
            Then the bird said “Nevermore.”
            """;

        System.out.println(replaceMatchingIng(poem));
    }
}