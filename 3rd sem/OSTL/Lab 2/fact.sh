echo "enter number"
read num
i=1
while [ $num -gt 0 ]
do
	i=$(($i*$num))
	num=$(($num-1))
done
echo "the factorial is $i"
