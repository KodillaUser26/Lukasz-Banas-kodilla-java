package com.kodilla.testing.forum.statistics;

public class StatisticalCal {
    private Statistics statistics;
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averageNumberOfPostsPerUser;
    private double averageNumberOfComentsPerUser;
    private double averageNumberOfCommentsPerPost;


    public void calculateAdvStatistics(Statistics statistics) {

        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();

        if(statistics.usersNames().size() != 0) {
            averageNumberOfPostsPerUser =  (double) (statistics.postsCount()) / (statistics.usersNames().size());
            averageNumberOfComentsPerUser =  (double) statistics.commentsCount()/statistics.usersNames().size();
        }else{
            averageNumberOfPostsPerUser = 0;
            averageNumberOfComentsPerUser = 0;
        }


        if(statistics.postsCount() != 0) {
            averageNumberOfCommentsPerPost = (double) statistics.commentsCount() / statistics.postsCount();
        }else{
            averageNumberOfCommentsPerPost = 0;
        }

    }

    public void showStatistics() {
        System.out.println("Calculated statistical data:");
        System.out.println("Number of users: " + getNumberOfUsers());
        System.out.println("Number of post: " + getNumberOfPosts());
        System.out.println("Number of comments: " + getNumberOfComments());
        System.out.println("Number of posts per users: " + getAverageNumberOfPostsPerUser());
        System.out.println("Number of comments per users: " + getAverageNumberOfComentsPerUser());
        System.out.println("Number of comments per posts: " + getAverageNumberOfCommentsPerPost());


    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAverageNumberOfPostsPerUser() {
        return averageNumberOfPostsPerUser;
    }

    public double getAverageNumberOfComentsPerUser() {
        return averageNumberOfComentsPerUser;
    }

    public double getAverageNumberOfCommentsPerPost() {
        return averageNumberOfCommentsPerPost;
    }
}

