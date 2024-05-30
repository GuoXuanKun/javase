package day240530.practice.teach;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class QA {
    public static void main(String[] args) {
        File file = new File("src/day240527");
        //String[] list = file.list();
        //MySortUtil.sort();
        //System.out.println(Arrays.toString(list));
        // 只想要 properties
        /*for (String name : list) {
            if (name.endsWith(".properties")) {
                System.out.println(name);
            }
        }*/

        /*System.out.println("=== === ===");
        String[] list = file.list(new Xxx());
        //MySortUtil.sort(MyComparator...);
        System.out.println(Arrays.toString(list));*/

        System.out.println("=== === ===");

        String[] list = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                //System.out.println(dir);
                return name.startsWith("Hash");
            }
        });
        System.out.println(Arrays.toString(list));

        /*System.out.println("=== === ===");

        file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                System.out.println(pathname);
                return false;
            }
        });*/
    }
}

class Xxx implements FilenameFilter {

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(".properties");
    }
}
