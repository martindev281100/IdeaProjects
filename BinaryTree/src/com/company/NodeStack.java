package com.company;

import com.sun.source.tree.Tree;
import org.w3c.dom.Node;

import java.util.ArrayList;

public class NodeStack extends ArrayList<TreeNode> {
    public void push(TreeNode node) {
        this.add(0, node);
    }

    public TreeNode pop() {
        return this.remove(0);
    }

    public TreeNode top() {
        return this.get(0);
    }
}
