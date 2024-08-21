public class date {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);


        //is it save to store the no of ms in a variable of type long
        System.out.println(Long.MAX_VALUE);
    }
}
