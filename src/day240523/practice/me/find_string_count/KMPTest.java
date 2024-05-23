package day240523.practice.me.find_string_count;

public class KMPTest {

    public static int[] computeTemporaryArray(char pattern[]){
        int tempArr[] = new int[pattern.length];
        int index = 0;
        for(int i=1; i < pattern.length;){
            if(pattern[i] == pattern[index]){
                tempArr[i] = index + 1;
                index++;
                i++;
            }else{
                if(index != 0){
                    index = tempArr[index - 1];
                }else{
                    tempArr[i] = 0;
                    i++;
                }
            }
        }
        return tempArr;
    }

    public static boolean KMP(char text[], char pattern[]){

        int tempArr[] = computeTemporaryArray(pattern);
        int i=0;
        int j=0;
        int count = 0;
        while(i < text.length && j < pattern.length){
            if(text[i] == pattern[j]){
                i++;
                j++;
            }else{
                if(j!=0){
                    j = tempArr[j - 1];
                }else{
                    i++;
                }
            }
            if(j == pattern.length){
                count++;
                j = 0;
            }
        }
        System.out.println("'sb' 出现了 " + count + " 次");
        return false;
    }

    public static void main(String args[]){

        String str = "acusbikmnesbciouinsbeik123dsb9";
        String pat = "sb";
        KMP(str.toCharArray(), pat.toCharArray());
    }
}
