#!/bin/bash

echo "say a num"
read num

case $num in

[0-9])
echo "Single it is"
;;

[0-9][0-9])
echo "Double it is"
;;

[0-9][0-9][0-9])
echo "3 digits it is"
;;

[a-z])
echo "ITs a lowercase  sentence"
;;

*)
echo "This is a bigger num"
;;

esac
