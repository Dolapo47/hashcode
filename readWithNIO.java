package com.dolapo;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class readWithNIO {

    public static void readWithNIO(){
        Path path = Paths.get("src/com/dolapo/input.txt");
        try{
            List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
            int sum = 0;
            int pizzaOrdered = 0;
            String[] maxArray = lines.get(0).split(" ");
            String[] sliceArray = lines.get(1).split(" ");
            int maxNum = Integer.parseInt(maxArray[0]);
            ArrayList<Integer> result = new ArrayList<>();

            for(int i = sliceArray.length - 1; i >= 0; i--){
                if(sum + Integer.parseInt(sliceArray[i]) > maxNum){
                    continue;
                }else{
                    sum += Integer.parseInt(sliceArray[i]);
                    result.add(i);
                }
            }
            Collections.reverse(result);
            StringBuilder sResult = new StringBuilder();
            pizzaOrdered = result.size();
            sResult.append(pizzaOrdered);
            sResult.append("\n");
            for(int s : result){
                sResult.append(s);
                sResult.append(" ");
            }
            String fileName1 = "output.txt";
            Files.writeString(Paths.get(fileName1), sResult, StandardCharsets.UTF_8);
            System.out.println(sResult);
        }catch(IOException ex){
            System.err.println("exception: " + ex.getMessage());
        }
    }
}
