package com.bridgeLabz;

public class MoodAnalyser {

    public MoodAnalyser() {

    }

    public String getMsg(String msg) {
        if(msg.contains("sad")) {
            return "sad";
        }
        else
        {
            return "Happy";
        }
    }
}
