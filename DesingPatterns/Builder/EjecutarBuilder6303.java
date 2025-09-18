public class EjecutarBuilder6303 {

    public static void main(String[] args) {
        //creacion de los objetos de tipo converter
        Converter objC1 = new ASCIIConverter();
        Converter objC2 = new PostScriptConverter();
        Converter objC3 = new PdfConverter();

        //Relacionar los objetos de la clase reader 
        Reader objR1 = new Reader("LINE", objC1);
        Reader objR2 = new Reader("LINE", objC2);
        Reader objR3 = new Reader("TABLE", objC3);
        Reader objR4 = new Reader("TABLE", objC1);

        //ASCII con Line
        objR1.parseInput();
        //PostScript coon  line
        objR2.parseInput();
        //Pdf con Table
        objR3.parseInput();
        //ASCII con Table
        objR4.parseInput();
    }
}