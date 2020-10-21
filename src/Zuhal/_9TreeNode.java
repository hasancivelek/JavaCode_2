package Zuhal;

public class _9TreeNode {

 
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        
        if(root!=null){
            
            TreeNode left=invertTree(root.right);
            TreeNode right=invertTree(root.left);
            
            root.left=left;
            root.right=right;
        }
        
        return root;
    }
}
 
 
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
 
	TreeNode(int x) {
		val = x;
		left = null;
		right = null;
	}
}
}
