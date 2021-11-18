public class App {

    // 列挙型
    enum Preference{
        NONE,
        MALE,
        FEMALE,
    }

    // 定数

    private static final int MISSING_REMNANT = 0;

    private static final String MESSAGE_FORMAT_FOR_MALE_PAYMENT = "男性：%d 円";
    private static final String MESSAGE_FORMAT_FOR_FEMALE_PAYMENT = "女性：%d 円";
    private static final String MESSAGE_FORMAT_FOR_REMNANT_PRICE = "余り：%d 円";

    static {
    }

    public static void main(String[] args) {

        // 規定変数

        int totalPrice = 12000;
        int numberOfMale = 3;
        int numberOfFemale = 3;

        // 自作処理

        Preference preferenceGender = Preference.FEMALE;
        int preferencePayment = 1000;

        int totalNum = numberOfMale + numberOfFemale;

        int numberOfBear = getNumberOfBear(numberOfMale, numberOfFemale, preferenceGender);
        int totalPreferencePayment = preferencePayment * numberOfBear;

        int everyoneTotalPrice = totalPrice - totalPreferencePayment;
        int everyonePayment = everyoneTotalPrice / totalNum;
        int remnantPrice = everyoneTotalPrice % totalNum;

        int malePayment = getMalePayment(everyonePayment, preferencePayment, preferenceGender);
        int femalePayment = getFemalePayment(everyonePayment, preferencePayment, preferenceGender);

        dispPayment(malePayment, femalePayment, remnantPrice);
    }

    private static int getNumberOfBear(int numberOfMale, int numberOfFemale, Preference preferenceGender) {

        switch (preferenceGender) {

        case MALE:
            return numberOfFemale;

        case FEMALE:
            return numberOfMale;

        default:
            return 0;
        }
    }

    private static int getMalePayment(int everyonePayment, int preferencePayment, Preference preferenceGender) {

        int malePayment = everyonePayment;

        if (preferenceGender == Preference.FEMALE) {
            malePayment += preferencePayment;
        }

        return malePayment;
    }

    private static int getFemalePayment(int everyonePayment, int preferencePayment, Preference preferenceGender) {
        
        int femalePayment = everyonePayment;

        if (preferenceGender == Preference.MALE) {
            femalePayment += preferencePayment;
        }

        return femalePayment;
    }

    private static void dispPayment(int malePayment, int femalePayment, int remnantPrice) {
        println(MESSAGE_FORMAT_FOR_MALE_PAYMENT, malePayment);
        println(MESSAGE_FORMAT_FOR_FEMALE_PAYMENT, femalePayment);

        if (remnantPrice != MISSING_REMNANT) {
            println(MESSAGE_FORMAT_FOR_REMNANT_PRICE, remnantPrice);
        }
    }

    // 汎用関数

    private static void println(String str, Object... args) {
        System.out.println(String.format(str, args));
    }
}
