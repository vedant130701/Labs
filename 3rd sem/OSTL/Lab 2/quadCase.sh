#!/bin/bash
echo "Enter a,b,c"
read a
if [ $a -eq 0 ]
then
	echo "Not a quadratic equation"
	exit 0
fi
read b
read c
d=$((($b)*($b)-4*($a)*($c)))
if [ $d -lt 0 ]
then
	choice=1
elif [ $d -eq 0 ]
then 
	choice=2
else
	choice=3
fi
rootA=`echo "scale=4;$b/(2*$a)"|bc`

case $choice in
	1)
		f=$(((-1)*($d)))
		root1=`echo "scale=4;(-1)*($rootA)"|bc`
		# root2=$((sqrt($f)/(2*$a)))
		square_root=`echo "scale=4; sqrt($f)" | bc`

		root2=`echo "scale=4;$square_root/(2*$a)"|bc`
		echo "root1 = $root1 + i $root2"
		echo "root2 = $root1 - i $root2"
		;;
	2)
		root1=`echo "scale=4;(-1)*($rootA)"|bc`
		echo "equal root = $root1"
		;;
	3)
		root1=`echo "scale=4;(-1)*($rootA)"|bc`
		square_root=`echo "scale=4; sqrt($d)" | bc`
		root2=`echo "scale=4;$square_root/(2*$a)"|bc`
		r1=`echo "scale=4;$root1+$root2"|bc`
		r2=`echo "scale=4;$root1-$root2"|bc`
		echo "root1 = $r1"
		echo "root2 = $r2"
		;;
	*)
	echo "default"
esac
