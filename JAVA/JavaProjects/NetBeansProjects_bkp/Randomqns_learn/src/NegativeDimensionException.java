/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import exception.io*;

public class NegativeDimensionException {
    public void  toString()
    {
        return "Dimension cannot be Negative";
    }
}

int area(int l,int b)throws NegativeDimensionException
{
if(l<0||b<0)
throw new NegativeDimensionException();
int a=l*b;
return a;
}