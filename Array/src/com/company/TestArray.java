package com.company;

public class TestArray {
    public void newArray() {
        int myArray[] = {12, 23, 532, 6, 865, 34, 243, 1};
        int temp = myArray[0];
        int tempus = myArray[0];
        int total = 0;

        //print max number
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > temp) temp = myArray[i];
        }
        System.out.println(temp);


        //Sum  from array

        for (int j = 0; j < myArray.length; j++) {
            total += myArray[j];
        }
        System.out.println("sum = " + total);


//max number from array
        for (int i = 1; i < myArray.length; i++) {
            for (int j = i; j > 0; j--) {
                if (myArray[j] < myArray[j - 1]) {
                    tempus = myArray[j];
                    myArray[j] = myArray[j - 1];
                    myArray[j - 1] = tempus;
                }
            }
        }

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }

}
