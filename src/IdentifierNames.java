public class IdentifierNames {
    public static void main(String[] args) {
//        double d1, double d2; // DOEST NOT COMPILE
        double $d1, d2;

//        double notAtStart = _1000.00; // DOES NOT COMPILE
//        double notAtEnd = 1000.00_; // DOES NOT COMPILE
//        double notByDecimal = 1000_.00; // DOES NOT COMPILE
        double annoyingButLegal = 1_00_0.0_0; // this one compiles


//        Prepare to be tested on these rules. The following examples are legal:
        int okidentifier;
        int $OK2Identifier;
        int _alsoOK1d3ntifi3r;
        int __SStillOkbutKnotsonice$;

//        These examples are not legal:
//        int 3DPointClass; // identifiers cannot begin with a number
//        int hollywood@vine; // @ is not a letter, digit, $ or _
//        int *$coffee; // * is not a letter, digit, $ or _
//        int public; // public is a reserved word
    }
}
