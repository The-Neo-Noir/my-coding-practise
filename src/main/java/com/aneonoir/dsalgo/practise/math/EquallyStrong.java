package com.aneonoir.dsalgo.practise.math;

/**
 * link: https://app.codesignal.com/arcade/intro/level-5/g6dc9KJyxmFjB98dL
 * <p>
 * //TOOD: See others solution:
 */
public class EquallyStrong {

    boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
        return (yourLeft == friendsLeft || yourLeft == friendsRight) && (yourRight == friendsLeft || yourRight == friendsRight) && (yourLeft + yourRight == friendsLeft + friendsRight);
    }


}
