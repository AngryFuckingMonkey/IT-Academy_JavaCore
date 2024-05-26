package lesson_2.homework;

public class SecondClass {

    private final byte CONST_SMALL_NUM = 103;
    private final static short ANOTHER_CONST_SMALL_NUM = -708;
    private int defaultInt;
    private static long justLongNum = 1029384756L;
    private float fractalNum = 13.14f;
    private final static double CONST_STAT_DOUBLE_NUM = 89.98;
    private char defaultChar;
    private boolean isExist;

    private static String text = "Mom was washing the frame";

    private final Byte CONST_BYTE_NUM = 14;
    private final static Short CONST_SHORT_NUM = -860;
    private Integer anotherDefaultInt;
    private static Long longNum = 483853849358345L;
    private Float anotherFloatNum = 114.115f;
    private final Double CONST_DOUBLE_NUM = 89.98;
    private static Character notDefaultChar = '\u45AF';
    private final Boolean IS_TRUE = true;

    public byte getCONST_SMALL_NUM() {
        return CONST_SMALL_NUM;
    }

    public static short getANOTHER_CONST_SMALL_NUM() {
        return ANOTHER_CONST_SMALL_NUM;
    }

    public int getDefaultInt() {
        return defaultInt;
    }

    public void setDefaultInt(int defaultInt) {
        this.defaultInt = defaultInt;
    }

    public static long getJustLongNum() {
        return justLongNum;
    }

    public static void setJustLongNum(long justLongNum) {
        SecondClass.justLongNum = justLongNum;
    }

    public float getFractalNum() {
        return fractalNum;
    }

    public void setFractalNum(float floatNum) {
        this.fractalNum = floatNum;
    }

    public static double getCONST_STAT_DOUBLE_NUM() {
        return CONST_STAT_DOUBLE_NUM;
    }

    public char getDefaultChar() {
        return defaultChar;
    }

    public void setDefaultChar(char defaultChar) {
        this.defaultChar = defaultChar;
    }

    public boolean getIsExist() {
        return isExist;
    }

    public void setIsExist(boolean isExist) {
        this.isExist = isExist;
    }

    public static String getText() {
        return text;
    }

    public static void setText(String text) {
        SecondClass.text = text;
    }

    public Byte getCONST_BYTE_NUM() {
        return CONST_BYTE_NUM;
    }

    public static Short getCONST_SHORT_NUM() {
        return CONST_SHORT_NUM;
    }

    public Integer getAnotherDefaultInt() {
        return anotherDefaultInt;
    }

    public void setAnotherDefaultInt(Integer anotherDefaultInt) {
        this.anotherDefaultInt = anotherDefaultInt;
    }

    public static Long getLongNum() {
        return longNum;
    }

    public static void setLongNum(Long longNum) {
        SecondClass.longNum = longNum;
    }

    public Float getAnotherFloatNum() {
        return anotherFloatNum;
    }

    public void setAnotherFloatNum(Float anotherFloatNum) {
        this.anotherFloatNum = anotherFloatNum;
    }

    public Double getCONST_DOUBLE_NUM() {
        return CONST_DOUBLE_NUM;
    }

    public static Character getNotDefaultChar() {
        return notDefaultChar;
    }

    public static void setNotDefaultChar(Character notDefaultChar) {
        SecondClass.notDefaultChar = notDefaultChar;
    }

    public Boolean getIS_TRUE() {
        return IS_TRUE;
    }
}
