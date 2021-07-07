package com.first.cumculator;

public class Calculator {


    public int result(String all1){


        String all = all1+"*10";

        String interval = "";
        String interval_2="";
        int sum = 0;

        for (int j = 0; (all.charAt(j) != '+')&&(all.charAt(j) != '-')&&(all.charAt(j) != '*')&&(all.charAt(j) != '/'); j++) {
            interval = interval + all.charAt(j);
        }
        sum = sum + Integer.valueOf(interval);      //записал первое число до первого знака в сумму.

        for (int i=interval.length();i<all.length();i++){

            if((all.charAt(i)=='+')||(all.charAt(i)=='-')||(all.charAt(i)=='*')||(all.charAt(i)=='/')){

                for (int j=i+1;(all.charAt(j) != '+')&&(all.charAt(j) != '-')&&(all.charAt(j) != '*')&&(all.charAt(j) != '/'&&(j<all.length()-1));j++){
                    interval_2=interval_2+all.charAt(j);

                }
                if(all.charAt(i)=='+'){
                    sum=sum+Integer.valueOf(interval_2);
                    interval_2 = "";
                }
                else if(all.charAt(i)=='-'){
                    sum=sum-Integer.valueOf(interval_2);
                    interval_2 = "";
                }
                else if(all.charAt(i)=='*'){
                    sum=sum*Integer.valueOf(interval_2);
                    interval_2 = "";
                }
                else if(all.charAt(i)=='/'){
                    sum=sum/Integer.valueOf(interval_2);
                    interval_2 = "";
                }
            }
        }
        return sum;
    }


}




