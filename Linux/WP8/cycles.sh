for h in {01..24}
do
	echo $h
done

c=10
while [ $c -ge 0 ] 
do 
	echo "Test"
	let "c = c - 1"
done

for (( c=1; c<=5; c++ ))
do  
   echo "Попытка номер $c"
done

dellist=$(find -ctime +$del) 
# удаляем их
for i in $dellist
do
        rm $i
done
