/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong05.logic;

import javax.swing.event.TreeModelListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author USER
 */
public class TreeDemoModel implements TreeModel{
    DefaultTreeModel tree;
    DefaultMutableTreeNode rootNode;

    public TreeDemoModel() {
        //Khoi tao cay
        rootNode = buildTree("Car&Motor");
        tree = new DefaultTreeModel(rootNode);
    }
    
    private DefaultMutableTreeNode buildTree(String rootName){
        DefaultMutableTreeNode root = new DefaultMutableTreeNode(rootName);
        //Xay dung cac nut con  cho nut root
        DefaultMutableTreeNode car = new DefaultMutableTreeNode("Car");
        DefaultMutableTreeNode motor = new DefaultMutableTreeNode("Motor");
        //Dua vao nut Root
        root.add(car);
        root.add(motor);
        
        //xay dung cac nut con cho car
        DefaultMutableTreeNode honda = new DefaultMutableTreeNode("Honda");
        DefaultMutableTreeNode mazda = new DefaultMutableTreeNode("Mazda");
        DefaultMutableTreeNode toyota = new DefaultMutableTreeNode("Toyata"); 
        car.add(honda);
        car.add(mazda);
        car.add(toyota);
        
        //xay dung cac nut con cho motor
        DefaultMutableTreeNode suzuki = new DefaultMutableTreeNode("Suzuki");
        DefaultMutableTreeNode yamaha = new DefaultMutableTreeNode("Yamaha");
        motor.add(suzuki);
        motor.add(yamaha);
        
        //tra ve  nut goc cua cay
        return root;
    }

    public DefaultTreeModel getTree() {
        return tree;
    }

    public void setTree(DefaultTreeModel tree) {
        this.tree = tree;
    }

    public DefaultMutableTreeNode getRootNode() {
        return rootNode;
    }

    public void setRootNode(DefaultMutableTreeNode rootNode) {
        this.rootNode = rootNode;
    }
    
    

    @Override
    public Object getRoot() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.rootNode;
    }

    @Override
    public Object getChild(Object parent, int index) {
        return tree.getChild(parent, index);
    }

    @Override
    public int getChildCount(Object parent) {
        return tree.getChildCount(parent);
    }

    @Override
    public boolean isLeaf(Object node) {
        return tree.isLeaf(node);
    }

    @Override
    public void valueForPathChanged(TreePath path, Object newValue) {
       tree.valueForPathChanged(path, newValue);
    }

    @Override
    public int getIndexOfChild(Object parent, Object child) {
        return tree.getIndexOfChild(parent, child);
    }

    @Override
    public void addTreeModelListener(TreeModelListener l) {
       tree.addTreeModelListener(l);
    }

    @Override
    public void removeTreeModelListener(TreeModelListener l) {
        tree.removeTreeModelListener(l);
    }
    
}
