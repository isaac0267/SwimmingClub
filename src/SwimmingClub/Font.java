package SwimmingClub;


public class Font {
    private String fonts;
    private String name;
    private int style;
    private int size;
    public static int bold;

    public static int italic;
    public Font(String name, int style, int size) {
        this.name = name;
        this.style=style;
        this.size = size;
    }
    public void setFonts() {
        this.fonts = fonts;
    }

    public void graphic() {
        Font font = new Font("Courier", Font.bold, 20);

    }
}

