package constants;

public class Constants {
    private static final String rus = "ЙЦУКЕНГШЩЗХЪФЫВАПРОЛДЖЭЯЧСМИТЬБЮЁ";
    private static final String eng = "QWERTYUIOPASDFGHJKLZXCVBNM";
    private static final String cypher = "123456789";
    private static final String z = "!:!@#^&*()_+{}:|<>?$%^";
    public static final String ALPHABET = rus + eng + rus.toLowerCase() + eng.toLowerCase() + cypher + z;
}
