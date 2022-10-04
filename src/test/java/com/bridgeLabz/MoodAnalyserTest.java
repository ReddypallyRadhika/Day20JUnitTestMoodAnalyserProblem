package com.bridgeLabz;


import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void testMoodAnalyser_Sad()
    {
        MoodAnalyser moodAnalyser= new MoodAnalyser();
        String mood = moodAnalyser.getMsg("This is a sad message");
        Assert.assertEquals(mood,"sad");
    }
    @Test
    public void testMoodAnalyser_Happy()
    {
        MoodAnalyser moodAnalyser= new MoodAnalyser();
        String mood = moodAnalyser.getMsg("This is a Happy message");
        Assert.assertEquals(mood,"Happy");
    }
}
