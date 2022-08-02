package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User millenials = new Millenials("Robcio");
        User yGeneration = new YGeneration("Lewy");
        User zGeneration = new ZGeneration("RL9");

        //When
        String mSocialPublisher = millenials.sharePost();
        System.out.println("Robcio : " + mSocialPublisher);
        String ySocialPublisher = yGeneration.sharePost();
        System.out.println("Lewy : " + ySocialPublisher);
        String zSocialPublisher = zGeneration.sharePost();
        System.out.println("RL9 : " + zSocialPublisher);

        //Then
        Assert.assertEquals("Twitter", mSocialPublisher);
        Assert.assertEquals("Facebook", ySocialPublisher);
        Assert.assertEquals("Snapchat", zSocialPublisher);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User millenials = new Millenials("Robcio");

        //When
        String mSocialPublisher = millenials.sharePost();
        System.out.println("Robcio : " + mSocialPublisher);
        millenials.setSocialPublisher(new FacebookPublisher());
        mSocialPublisher = millenials.sharePost();
        System.out.println("Robcio now : " + mSocialPublisher);

        //Then
        Assert.assertEquals("Facebook", mSocialPublisher);
    }
}