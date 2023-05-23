import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> inorderTraversal(Zhongxu.TreeNode root) {List<Integer> p = new ArrayList<>();
        Deque<Zhongxu.TreeNode> deque = new LinkedList<Zhongxu.TreeNode>();
        while (root != null || !deque.isEmpty()) {
            while (root != null) {
                deque.push(root);
                root = root.left;
            }
            root = deque.pop();
            p.add(root.val);
            root = root.right;
        }
        return p;
    }


    public boolean isSameTree(XiangTongShu.TreeNode p, XiangTongShu.TreeNode q) {
        return true;
    }
}
