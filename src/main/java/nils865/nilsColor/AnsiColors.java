package nils865.nilsColor;

public class AnsiColors {
    private final String ESC = "\u001B[";

    private final int RESET = 0;

    private final int BLACK = 0;
    private final int RED = 1;
    private final int GREEN = 2;
    private final int YELLOW = 3;
    private final int BLUE = 4;
    private final int MAGENTA = 5;
    private final int CYAN = 6;
    private final int WHITE = 7;

    private final int modifier;

    /**
     * @param mod either 30 or 40
     */
    protected AnsiColors(int mod) {
        this.modifier = mod;
    }

    private String ansiCoding(int code) {
        return this.ESC + String.valueOf(this.modifier + code) + "m";
    }

    private String ansiReset() {
        return this.ESC + String.valueOf(RESET) + "m";
    }

    /**
     * @param text
     * @return text colored in black
    */
    public String black(String text) {
        return ansiCoding(this.BLACK) + text + ansiReset();
    }

    /**
     * @param text
     * @return text colored in red
    */
    public String red(String text) {
        return ansiCoding(this.RED) + text + ansiReset();
    }

    /**
     * @param text
     * @return text colored in green
    */
    public String green(String text) {
        return ansiCoding(this.GREEN) + text + ansiReset();
    }

    /**
     * @param text
     * @return text colored in yellow
    */
    public String yellow(String text) {
        return ansiCoding(this.YELLOW) + text + ansiReset();
    }

    /**
     * @param text
     * @return text colored in blue
    */
    public String blue(String text) {
        return ansiCoding(this.BLUE) + text + ansiReset();
    }

    /**
     * @param text
     * @return text colored in magenta
    */
    public String magenta(String text) {
        return ansiCoding(this.MAGENTA) + text + ansiReset();
    }

    /**
     * @param text
     * @return text colored in cyan
    */
    public String cyan(String text) {
        return ansiCoding(this.CYAN) + text + ansiReset();
    }

    /**
     * @param text
     * @return text colored in white
    */
    public String white(String text) {
        return ansiCoding(this.WHITE) + text + ansiReset();
    }
}