package day240408;

public class Transform {
    public static void main(String[] args) {

        String lady = "女";
        int age = 23;
        String status = "富婆";

        if(lady == "女" && age>=18 && age <= 23 ){
            System.out.println("找她");
        }

        if (lady == "女" && age>=18 && age <= 23 && status == "富婆"){
            System.out.println("是她,就是她");
        }
    }
}
