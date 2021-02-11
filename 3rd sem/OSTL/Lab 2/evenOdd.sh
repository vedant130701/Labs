echo "Enter a number"
read num
n=$((num%2))
if [ $n -eq 0 ]
then
	echo "Even number"
else
	echo "Odd number"
fi
