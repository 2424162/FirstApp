package com.example.firstapp;

import java.util.ArrayList;
import java.util.List;

public class Served {
    public List<Oberver>  obervers = new ArrayList<Oberver>();
    public void add (Oberver oberver){
        obervers.add(oberver);
    }
    public void mnotify(){
        for(Oberver i:obervers){
            i.update();
        }

    }

}
