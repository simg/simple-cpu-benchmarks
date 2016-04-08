#!/usr/bin/python

from datetime import datetime
 
x=0
start = datetime.now();

i = 0
while i < 10000000:
  i = i + 1
  x = x + 1
  
end = datetime.now();
total_time = (end.microsecond-start.microsecond)/1000
print "Total time="+str(total_time)+"ms"