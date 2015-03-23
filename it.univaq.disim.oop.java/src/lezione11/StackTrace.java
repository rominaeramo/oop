package lezione11;

class StackTrace{
    public static void main(String[] args) {
        crunch(null);
    }
    static void crunch(int[] a) {
        mash(a);
    }
    static void mash(int[] b) {
        try {
           System.out.println(b[0]);
        }
        catch(Exception e) {e.printStackTrace();}
    }
}
