package strings.assigment_problems;

public class IsbnNormalizer {

    static String normalizeCode(String raw) {
        String trimmed = raw.trim();
        if (trimmed.length() < 3) {
            return trimmed;
        }
        String prefix = trimmed.substring(0, 3).toUpperCase();
        String rest = trimmed.substring(3);
        return prefix + rest;
    }

    static String validateAndFormat(String code) {
        if (code.length() != 13) {
            return "Invalid: code must be exactly 13 characters";
        }

        String publisher = code.substring(0, 3);
        String body = code.substring(3);

        for (int i = 0; i < publisher.length(); i++) {
            if (!Character.isLetter(publisher.charAt(i))) {
                return "Invalid: publisher code must be 3 letters";
            }
        }

        for (int i = 0; i < body.length(); i++) {
            if (!Character.isDigit(body.charAt(i))) {
                return "Invalid: remaining 10 characters must be digits";
            }
        }

        String year = body.substring(0, 4);
        String catalog = body.substring(4);

        StringBuilder display = new StringBuilder();
        display.append("[").append(publisher).append("] YEAR: ").append(year)
                .append(" | CATALOG: ").append(catalog);
        return display.toString();
    }

    public static void main(String[] args) {
        System.out.println(validateAndFormat(normalizeCode(" pen2026004251 ")));
        System.out.println(validateAndFormat(normalizeCode("12N2026004251")));
    }
}
