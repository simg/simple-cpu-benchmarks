import java.util.Date;

class benchmark_1  {
    public static void main(String[] args) {
      int x=0;
      long start = new Date().getTime();
      for (int i = 0; i < 10000000; i++) {
        x = x + 1;
      }
      long end = new Date().getTime();
      long total_time = end-start;
      System.out.println("Total time=" + total_time+"ms");
    }
}