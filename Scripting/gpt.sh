source ./fun2.sh
add() {
    echo "Enter two numbers:"
    read a
    read b
    sum=$((a + b))
    echo "Sum: $sum"
}

sub() {
    echo "Enter two numbers:"
    read a
    read b
    dif=$((a - b))
    echo "Difference: $dif"
}

echo "Enter 'add' for addition or 'sub' for subtraction:"
read l

# if [ "$l" == "dif" ]; then
#     add
# else
#     sub
# fi

if [ "$l" == "mul" ]
then
multiply
else
echo "only mul supported"
fi