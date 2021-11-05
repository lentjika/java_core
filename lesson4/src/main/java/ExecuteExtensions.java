public class ExecuteExtensions {
    public static  void ExecuteAndCatch(Runnable r) {
        try{
            r.run();
        }
        catch (Exception e){
            System.out.println(e);;
        }
        finally {
            System.out.println("-----------------------------------------");
        }
    }
}
