package com.example.geektrust;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args)  {

        try{
            // Open the file that is the first
            // command line parameter
            FileInputStream inputFile = new FileInputStream(args[0]);
            BufferedReader br = new BufferedReader(new InputStreamReader(inputFile));
            String str;

            //Read File Line By Line
            while ((str = br.readLine()) != null)   {

                //This is where control need to be passed on to service
            }
            br.close();

        }catch (Exception e){//Catch exception if any
            e.printStackTrace();
        }

    }
}
