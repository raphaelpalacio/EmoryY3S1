public class Counter{
    private int count;
    public Counter(int initial) {count = initial;}
    public int getCount() {return count;}
    public void mystery (int delta){count = count % delta;}
    public void reset(){count = 0;}

    public static void main(String[] args){
        Counter c = new Counter(7);
        c.mystery(3);
        System.out.println(c.getCount() + " ");
        Counter f = c;
        f.reset();
        System.out.println(f.getCount() + " " + c.getCount());
    }
}