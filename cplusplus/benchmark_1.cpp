#include <iostream>
#include <sys/time.h>
#include <stdio.h>
#include <unistd.h>

using namespace std;

int main()
{

   struct timeval start, end;

  long mtime, seconds, useconds;    
  int x = 0;
  
  gettimeofday(&start, NULL);
  
  for (int i=0; i<10000000; i++) {
    x = x + 1;
  }
  
  gettimeofday(&end, NULL);

  seconds  = end.tv_sec  - start.tv_sec;
  useconds = end.tv_usec - start.tv_usec;

  mtime = ((seconds) * 1000 + useconds/1000.0) + 0.5;

  printf("Total time: %ld milliseconds\n", mtime);
  return 0;
}
