add()
{
echo "Enter 2 nums"
read a 
read b
sum=$((a+b))
echo $sum    
}
sub()
{
echo "Enter 2 nums"
read a 
read b
dif=$((a-b))
echo $dif    
}
multiply()
{
echo "Enter 2 nums"
read a 
read b
mul=$((a*b))
echo $mul
}


echo "Enter add for addition , dif for subtraction or multiply"
read l

if [ "$l" == "add" ]
then
add
elif [ "$l" == "mul" ]
then
multiply
elif [ "$l" == "sub" ]
then
sub
else
echo "that's invalid input"
fi

