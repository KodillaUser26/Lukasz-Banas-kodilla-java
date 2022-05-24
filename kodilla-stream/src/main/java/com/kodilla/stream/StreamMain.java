package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;


import java.util.Map;
import java.util.stream.Collectors;
public class StreamMain {

    public static void main(String[] args) {

Forum forum = new Forum();


        Map<String, ForumUser> resultMap = forum.getForumUserList().stream()
        .filter(forumUser -> forumUser.getSex() == 'M')
        .filter(forumUser -> forumUser.getDateOfBirth().getYear() >= 2000)
        .filter(forumUser -> forumUser.getNumberOfPosts() >= 1)
        .collect(Collectors.toMap(ForumUser::getPeselId, forumUser -> forumUser ));

        System.out.println(resultMap.size());
        resultMap.entrySet().stream().map(Map.Entry::getValue).forEach(System.out::println);






    }
}