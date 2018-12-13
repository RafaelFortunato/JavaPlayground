import java.math.BigDecimal;
import java.math.RoundingMode;

public class NfeDigitValidator {
    public static void main(String[] args) {
        Calculations.Init();
//        validateNFe();
    }

    public static void validateNFe() {
        String nfe = "52060433009911002506550120000007800267301615";

        int verifyingDigit = calcVerifyingDigit(nfe);
        System.out.println("VD: " + verifyingDigit);
        System.out.println("isValid: " + validateNfe(nfe, verifyingDigit));


//        System.out.println(getRoundedBigDecimal(new BigDecimal(38.4756)).doubleValue());
//        System.out.println(getRoundedBigDecimal(new BigDecimal(38445.97981)).doubleValue());
//        System.out.println(getRoundedBigDecimal(new BigDecimal(691.12550887785)).doubleValue());
//        System.out.println(getRoundedBigDecimal(new BigDecimal(47.0000448999)).doubleValue());
    }

    public static int calcVerifyingDigit(String nfe) {
        int[] multipliers = new int[] {2,3,4,5,6,7,8,9};
        int indexNfe = 42;
        int sum = 0;

        while (indexNfe >= 0) {
            for (int indexMult = 0; indexMult < multipliers.length && indexNfe >= 0; indexMult++) {
                sum += Character.getNumericValue(nfe.charAt(indexNfe)) * multipliers[indexMult];
                indexNfe--;
            }
        }

        int remains = sum % 11;
        if (remains == 0 || remains == 1) {
            return 0;
        } else {
            return (11 - remains);
        }
    }

    public static boolean validateNfe(String nfe, int verifyingDigit) {
        return verifyingDigit == Character.getNumericValue(nfe.charAt(43));
    }

    private static BigDecimal getRoundedBigDecimal(final BigDecimal value) {
        return value.setScale(2, RoundingMode.HALF_EVEN);
    }
}
