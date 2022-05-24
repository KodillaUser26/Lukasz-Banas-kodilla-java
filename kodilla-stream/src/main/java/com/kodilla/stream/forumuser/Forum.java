package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> forumUserList = new ArrayList<ForumUser>();

    public Forum() {
        forumUserList.add(new ForumUser("1111111", "Fdrdynand", 'M', 1988, 7,
                21, 1));
        forumUserList.add(new ForumUser("22222222", "Walduś", 'M', 2000, 4,
                3, 9));
        forumUserList.add(new ForumUser("33333333", "Halinka", 'K', 2008, 4,
                3, 8));
        forumUserList.add(new ForumUser("4444444", "Helena", 'K', 2003, 4,
                3, 8));
        forumUserList.add(new ForumUser("55555555", "Marian", 'M', 1994, 4,
                3, 0));
        forumUserList.add(new ForumUser("66666666", "Arnold", 'K', 1999, 4,
                3, 4));

    }


    public List<ForumUser> getForumUserList (){
        return new ArrayList<>(forumUserList);
    }


}
