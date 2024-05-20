package day240520.practice.me.verify.Wrapper_class_verify;

public class Unboxing {
    public static void main(String[] args) {
        WrapperToValue();
        WrapperToValueMethodPara();
    }

    public static void WrapperToValue() {
        Byte referenceByte = (byte) 1;
        byte byteValue = referenceByte;

        Short referenceShort = (short) 2;
        short shortValue = referenceShort;

        Integer referenceInteger = 3;
        int intValue = referenceInteger;

        Long referenceLong = 4L;
        long longValue = referenceLong;

        Float referenceFloat = 5.0F;
        float floatValue = referenceFloat;

        Double referenceDouble = 6.0;
        double doubleValue = referenceDouble;

        Character referenceCharacter = 'a';
        char charValue = referenceCharacter;

        Boolean referenceBoolean = true;
        boolean booleanValue = referenceBoolean;
    }

    public static void WrapperToValueMethodPara() {
        Byte referenceByte = (byte)1;
        byteWrapperToByteValue(referenceByte);

        Short referenceShort = (short) 2;
        shortWrapperToShortValue(referenceShort);

        Integer referenceInteger = 3;
        integerWrapperToIntValue(referenceInteger);

        Long referenceLong = 4L;
        longWrapperToLongValue(referenceLong);

        Float referenceFloat = 5.0F;
        floatWrapperToFloatValue(referenceFloat);

        Double referenceDouble = 6.0;
        doubleWrapperToDoubleValue(referenceDouble);

        Character referenceCharacter = 'a';
        characterWrapperToCharValue(referenceCharacter);

        Boolean referenceBoolean = true;
        booleanWrapperToBooleanValue(referenceBoolean);

    }
    public static void byteWrapperToByteValue(byte value){}
    public static void shortWrapperToShortValue(short value){}
    public static void integerWrapperToIntValue(int value){}
    public static void longWrapperToLongValue(Long value){}
    public static void floatWrapperToFloatValue(float value){}
    public static void doubleWrapperToDoubleValue(double value){}
    public static void characterWrapperToCharValue(char value){}
    public static void booleanWrapperToBooleanValue(boolean value){}


}
