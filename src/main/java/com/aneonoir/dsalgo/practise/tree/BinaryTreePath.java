package com.aneonoir.dsalgo.practise.tree;

import java.util.LinkedList;
import java.util.List;

/**
 * link: https://leetcode.com/problems/binary-tree-paths/
 *
 * approach: recursive, and solved it after few exploration.
 *
 * TODO: can you do it iteratively ?
 *
 * Runtime Runtime: 1 ms, faster than 100.00% of Java online submissions for Binary Tree Paths.
 * 02/01/20 2:53 AM
 *
 *
 */
public class BinaryTreePath {

    public static void main(String[] args) {

        BinaryTreePath binaryTreePath = new BinaryTreePath();

        TreeNode no = new TreeNode(1);
        no.left = new TreeNode(2);
        no.right = new TreeNode(3);
        no.left.right = new TreeNode(4);

        binaryTreePath.binaryTreePaths(no);
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths= new LinkedList();
        if(root!=null){
            binaryTreePaths(root,paths,"");
        }
        return paths;
    }
    private void binaryTreePaths(TreeNode root, List<String> paths,String pre ){
        if(root!=null){
            String st=pre+root.val;
            if(root.left==null && root.right==null){
                paths.add(st);
            }
            st=st+"->";
            binaryTreePaths(root.left,paths,st);
            binaryTreePaths(root.right,paths,st);
        }
    }
}

/**
 *  02/01/20 2:48 AM All these did not work
 * @param root
 * @return

public List<String> binaryTreePaths(TreeNode root) {
    String strings = binaryTreePath(root, new StringBuffer());
    System.out.println(strings);
    return null;
}


private String binaryTreePath(TreeNode root, StringBuffer sbr) {
    if (root.left == null && root.right == null) {
        System.out.println(root.val + "");
        return root.val + "";
    } else {
        String rootS = root.val + "->";
        String rootR = root.val + "->";
        if (root.left != null)
            rootS += binaryTreePath(root.left, sbr);
        if (root.right != null) {
            rootR += binaryTreePath(root.right, sbr);
        }
        return rootS + "SSS" + rootR;
    }
}

}
*/