package homeworks.lesson2;

public class FirstClass {

    private byte byteNum = -90;
    private short shortNum = 1000;
    private int intNum = 17;
    private long longNum = 834593459472374L;
    private float floatNum = 874.324f;
    private double doubleNum = 5464.324376;
    private char charNotNum = 'A';
    private boolean isAlive;

    private static String secondText = "Mom washed the frame";

    private static Byte secondByteNum = 1;
    private Short secondShortNum = -1;
    private static Integer secondIntNum = 2;
    private Long secondLongNum = -2L;
    private static Float secondFloatNum = 3.0f;
    private Double secondDoubleNum = -3.0;
    private static Character secondCharNotNum = 4;
    private Boolean isDead = true;

    public byte getByteNum() {
        return byteNum;
    }

    public void setByteNum(byte byteNum) {
        this.byteNum = byteNum;
    }

    public short getShortNum() {
        return shortNum;
    }

    public void setShortNum(short shortNum) {
        this.shortNum = shortNum;
    }

    public int getIntNum() {
        return intNum;
    }

    public void setIntNum(int intNum) {
        this.intNum = intNum;
    }

    public long getLongNum() {
        return longNum;
    }

    public void setLongNum(long longNum) {
        this.longNum = longNum;
    }

    public float getFloatNum() {
        return floatNum;
    }

    public void setFloatNum(float floatNum) {
        this.floatNum = floatNum;
    }

    public double getDoubleNum() {
        return doubleNum;
    }

    public void setDoubleNum(double doubleNum) {
        this.doubleNum = doubleNum;
    }

    public char getCharNotNum() {
        return charNotNum;
    }

    public void setCharNotNum(char charNotNum) {
        this.charNotNum = charNotNum;
    }

    public boolean getIsAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public static String getSecondText() {
        return secondText;
    }

    public static void setSecondText(String secondText) {
        FirstClass.secondText = secondText;
    }

    public static Byte getSecondByteNum() {
        return secondByteNum;
    }

    public static void setSecondByteNum(Byte secondByteNum) {
        FirstClass.secondByteNum = secondByteNum;
    }

    public Short getSecondShortNum() {
        return secondShortNum;
    }

    public void setSecondShortNum(Short secondShortNum) {
        this.secondShortNum = secondShortNum;
    }

    public static Integer getSecondIntNum() {
        return secondIntNum;
    }

    public static void setSecondIntNum(Integer secondIntNum) {
        FirstClass.secondIntNum = secondIntNum;
    }

    public Long getSecondLongNum() {
        return secondLongNum;
    }

    public void setSecondLongNum(Long secondLongNum) {
        this.secondLongNum = secondLongNum;
    }

    public static Float getSecondFloatNum() {
        return secondFloatNum;
    }

    public static void setSecondFloatNum(Float secondFloatNum) {
        FirstClass.secondFloatNum = secondFloatNum;
    }

    public Double getSecondDoubleNum() {
        return secondDoubleNum;
    }

    public void setSecondDoubleNum(Double secondDoubleNum) {
        this.secondDoubleNum = secondDoubleNum;
    }

    public static Character getSecondCharNotNum() {
        return secondCharNotNum;
    }

    public static void setSecondCharNotNum(Character secondCharNotNum) {
        FirstClass.secondCharNotNum = secondCharNotNum;
    }

    public Boolean getIsDead() {
        return isDead;
    }

    public void setIsDead(Boolean isDead) {
        this.isDead = isDead;
    }

    public static void main(String[] args) {

        byte localByteNum = 10;
        short localShortNum = 20;
        var localIntNum = 30;
        long localLongNum = -300000000L;
        float localFloatNum = -20.0f;
        var localDoubleNum = -10.0;
        var localCharNotNum = 'B';
        var isLocal = true;

        Byte secondLocalByteNum = 0;
        Short secondLocalShortNum = 0;
        Integer secondLocalIntNum = 9;
        Long secondLocalLongNum = -9L;
        Float secondLocalFloatNum = 8.0f;
        Double secondLocalDoubleNum = -8.0;
        Character secondLocalCharNotNum = '\u17A5';
        Boolean isNotLocal = false;

        localByteNum =(byte)localShortNum;
        localByteNum = secondLocalByteNum;
        localIntNum = (int)localFloatNum;
        localShortNum = (short)localLongNum;
        secondLocalIntNum = (int)localCharNotNum;
        localIntNum = secondLocalCharNotNum;

        FirstClass.setSecondByteNum((byte)87);
        FirstClass.setSecondIntNum(86);
        FirstClass.setSecondFloatNum(85.84f);
        FirstClass.setSecondCharNotNum('S');
        FirstClass.setSecondText("Mom washed the frame a long time ago");

        FirstClass first = new FirstClass();

        first.setByteNum((byte)99);
        first.setShortNum((short)98);
        first.setIntNum(97);
        first.setLongNum(96L);
        first.setFloatNum(95.94f);
        first.setDoubleNum(93.92);
        first.setCharNotNum('g');
        first.setIsAlive(true);
        first.setSecondShortNum((short)91);
        first.setSecondLongNum(90L);
        first.setSecondDoubleNum(89.88);
        first.setIsDead(false);

        SecondClass.setJustLongNum(1584L);
        SecondClass.setLongNum(1583L);
        SecondClass.setNotDefaultChar('0');
        SecondClass.setText("Mom was washing the frame the day before yesterday");

        SecondClass second = new SecondClass();

        second.setDefaultInt(1582);
        second.setFractalNum(1581.1580f);
        second.setDefaultChar('8');
        second.setIsExist(true);
        second.setAnotherDefaultInt(1579);
        second.setAnotherFloatNum(1578.1577f);

        System.out.println("Final variables from the Second Class are " + second.getCONST_SMALL_NUM() + ", "
                + second.getCONST_BYTE_NUM() + ", " + second.getCONST_DOUBLE_NUM() + ", " + second.getIS_TRUE() + ", "
                + SecondClass.getANOTHER_CONST_SMALL_NUM() + ", " + SecondClass.getCONST_STAT_DOUBLE_NUM() + ", "
                + SecondClass.getCONST_SHORT_NUM());
        System.out.println("Static variables from the second class are " + SecondClass.getANOTHER_CONST_SMALL_NUM() + ", "
                + SecondClass.getCONST_SHORT_NUM() + ", " + SecondClass.getCONST_STAT_DOUBLE_NUM() + ", "
                + SecondClass.getLongNum() + ", " + SecondClass.getJustLongNum() + ", " + SecondClass.getNotDefaultChar() + ", "
                + SecondClass.getText());
        System.out.println("Others variables from the Second Class are " + second.getDefaultInt() + ", "
                + second.getFractalNum() + ", " + second.getDefaultChar() + ", " + second.getIsExist() + ", "
                + second.getAnotherDefaultInt() + second.getAnotherFloatNum() + "\n");
        System.out.println("Static variables from the First Class are " + FirstClass.getSecondByteNum() + ", "
                + FirstClass.getSecondIntNum() + ", " + FirstClass.getSecondFloatNum() + ", "
                + FirstClass.getSecondCharNotNum() + ", " + FirstClass.getSecondText());
        System.out.println("Non static global variables from the First Class are " + first.getByteNum() + ", "
                + first.getShortNum() + ", " + first.getIntNum() + ", " + first.getLongNum() + ", "
                + first.getFloatNum() + ", " + first.getDoubleNum() + ", " + first.getCharNotNum() + ", "
                + first.getIsAlive() + ", " + first.getSecondShortNum() + ", " + first.getSecondLongNum() + ", "
                + first.getSecondDoubleNum() + ", " + first.getIsDead() + "\n");
        System.out.println("Local variables are " +  localByteNum + ", " + localShortNum + ", " + localIntNum + ", "
                + localLongNum + ", " + localFloatNum + ", " + localDoubleNum + ", " + localCharNotNum + ", "
                + isLocal + ", " + secondLocalByteNum + ", " + secondLocalShortNum + ", " + secondLocalIntNum + ", "
                + secondLocalLongNum + ", " + secondLocalFloatNum + ", " + secondLocalDoubleNum + ", "
                + secondLocalCharNotNum + ", " + isNotLocal);
    }
}
