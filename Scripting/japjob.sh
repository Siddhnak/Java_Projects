


#!/bin/bash

echo "Tell your name pls"
read name
if  [ "$name" == "bungo" ]; then
echo "Alright"

        echo "What's the password? "
        read pass
        if [ "$pass" == "nihongo" ]; then
        echo "ok Yokoso"

        echo  "Tell your N level"
        read N
        if [ "$N" -gt 3 ]; then
        echo  "Congrats to the job"
        else
            echo "Go get N3 and then come to me.."
                fi

else
echo "Access not granted"
fi

else
echo "Access not granted"
fi
