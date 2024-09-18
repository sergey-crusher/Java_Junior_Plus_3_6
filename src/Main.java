public class Main {
    public static void main(String[] args)
    {
        Box myBox = new Box(10);
        System.out.println(myBox.height+"/"+myBox.length+"/"+ myBox.width);
        Box x2Box = myBox.Increase();
        System.out.println(x2Box.height+"/"+x2Box.length+"/"+ x2Box.width);
    }
}