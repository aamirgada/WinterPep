public class OverLoaded {
/// Single
    public void show(int integer){
        System.out.println("Integer is is: "+integer);
    }

    public void show(Integer integer){
        System.out.println("Integer is: "+integer);
    }
    public void show(String string){
        System.out.println("Integer is: "+string);
    }
    public void show(StringBuilder string){
        System.out.println("Integer is: "+string);
    }


}
