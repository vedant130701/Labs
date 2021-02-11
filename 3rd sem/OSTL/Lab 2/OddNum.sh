echo "Enter n"
read n
c=0
while [ $n -gt 0 ] 
do
	num=$((c%2))
	if [ $num != 0 ]
	then
		echo "$c"
		n=$((n-1))

	fi
	c=$((c+1))
done
