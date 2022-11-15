package io.zipcoder;

import java.util.Arrays;
import java.util.LinkedList;

import static java.util.Arrays.*;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){

        LinkedList<String> ll = new LinkedList<>(Arrays.asList(playList));
        int counter=-1;
        for(int i=0; i<playList.length; i++ ){
            if(!ll.get(i).equals(selection)){
                counter++;
            }
        }
        return counter;
    }
}
