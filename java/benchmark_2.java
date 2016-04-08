import java.util.Date;

class benchmark_2  {
    public static void main(String[] args) {
      String x="";
      long start = new Date().getTime();
      for (int i = 0; i < 100000; i++) {
        x = x + "x";
      }
      long end = new Date().getTime();
      long total_time = end-start;
      System.out.println("Total time=" + total_time+"ms");
    }
}