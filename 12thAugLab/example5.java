//write a java program to check the whether java is installed on your computer.

public class example5 {
    public static void main(String[] args) {
        System.out.println("\njava version:"+System.getProperty("java.version"));
        System.out.println("java home:" +System.getProperty("java.home"));
        System.out.println("java vendor:" +System.getProperty("java vendor"));
        System.out.println("java vendor url:" +System.getProperty("java.vendor.url"));
        System.out.println("java class path:" +System.getProperty("java.class.path")+"\n");
    }
}
