package com.aneonoir.dsalgo.practise.tree;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreeCamera {

//    [0,0,null,0,null,0,null,null,
public static void main(String[] args) {
    BinaryTreeCamera binaryTreeCamera = new BinaryTreeCamera();
    TreeNode t = new TreeNode(0);
    t.left = new TreeNode(0);
    t.left.left = new TreeNode(0);
    t.left.left.left = new TreeNode(0);
    t.left.left.left.right = new TreeNode(0);

    binaryTreeCamera.minCameraCover(t);
}
    public int minCameraCover(TreeNode root) {
        if (root != null) {
            List<CameraLocator> list = new LinkedList<>();
            CameraLocator current = new CameraLocator(root, true);
            minCamera(null, current, list);
            int count = 0;
            for (CameraLocator c : list) {
                count = c.hasCamera == true ? count + 1 : count;
            }
            return count;
        }
        return 0;
    }

    private void minCamera(CameraLocator parent, CameraLocator node, List<CameraLocator> list) {
        if (node.current != null) {

            if (node.current.left != null || node.current.right != null) {
                if (parent != null) {
                    if (parent.hasCamera == true) {
                        parent.hasCamera = false;
                    }
                }
                node.hasCamera = true;
            }
            list.add(node);
            minCamera(node, new CameraLocator(node.current.left, false), list);
            minCamera(node, new CameraLocator(node.current.right, false), list);
        }
    }

    class CameraLocator {
        TreeNode current;
        boolean hasCamera;

        CameraLocator(TreeNode current, boolean hasCamera) {
            this.current = current;
            this.hasCamera = hasCamera;
        }
    }
}
