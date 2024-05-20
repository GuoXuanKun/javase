package day240520.practice.me.verify.Wrapper_class_verify;

public class Boxing {
    public static void main(String[] args) {
        assignedToAVariable();
        passedAsAParameter();
    }

    private static void assignedToAVariable() {
        Byte referenceByte = (byte)1;
        Short referenceShort = (short)2;
        Integer referenceInteger = 3;
        Long referenceLong = 4L;

        Float referenceFloat = 5.0F;
        Double referenceDouble = 6.0;

        Character referenceCharacter = 'c';

        Boolean referenceBoolean = false;
    }

    private static void passedAsAParameter() {
        needReferenceByte((byte)1);
        needReferenceShort((short)2);
        needReferenceInteger(3);
        needReferenceLong(4L);
        needReferenceFloat(5.0F);
        needReferenceDouble(6.0);
        needReferenceCharacter('c');
        needReferenceBoolean(true);
    }

    public static void needReferenceByte(Byte reference) {}
    public static void needReferenceShort(Short reference) {}
    public static void needReferenceInteger(Integer reference) {}
    public static void needReferenceLong(Long reference) {}
    public static void needReferenceFloat(Float reference) {}
    public static void needReferenceDouble(Double reference) {}
    public static void needReferenceCharacter(Character reference) {}
    public static void needReferenceBoolean(Boolean reference) {}
}
