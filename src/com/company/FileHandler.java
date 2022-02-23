package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {

    public ArrayList<PostInfo> fileDataToObjects(){
        ArrayList<PostInfo> dataList = new ArrayList<>();
        File file = new File("data/danske-postnumre-byer.csv");

        try{
            Scanner sc = new Scanner(file);
            sc.nextLine();
            while(sc.hasNext()){
                String line = sc.nextLine();
                if (line.equals(";")){
                    break;
                } else {
                    String[] dataArray = line.split(";");
                    int zipNumber = Integer.parseInt(dataArray[0]);
                    String city = dataArray[1];
                    PostInfo postInfo = new PostInfo(zipNumber,city);
                    dataList.add(postInfo);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return dataList;
    }

}
