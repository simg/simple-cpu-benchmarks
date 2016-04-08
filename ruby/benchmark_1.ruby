#!/usr/bin/ruby

x=0
start_time = Time.now()

for i in 0...10000000
  x = x + 1
end

end_time = Time.now();
total_time = (end_time-start_time)*1000
print "Total time=",total_time,"ms"