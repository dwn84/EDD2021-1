/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

/**
 *
 * @author samaniw
 */
public class BinaryNode {
    private int data;
    private BinaryNode leftNode;
    private BinaryNode rightNode;
    private boolean leftOrRight;

    public BinaryNode(int data) {
        this.data = data;
        this.leftNode = null;
        this.rightNode = null;
    }
    
    public boolean isLeaf(){
        return(leftNode==null && rightNode==null) ?true:false;
        
    }
    
    public boolean oneChild(){    
        if(leftNode!=null && rightNode==null){
            leftOrRight = false;
            return true;
        }else if(leftNode==null && rightNode!=null){
            leftOrRight = true;
            return true;
        }else{
            return false;
        }
    }
    

    /**
     * @return the data
     */
    public int getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(int data) {
        this.data = data;
    }

    /**
     * @return the leftOrRight
     */
    public boolean isLeftOrRight() {
        return leftOrRight;
    }

    /**
     * @param leftOrRight the leftOrRight to set
     */
    public void setLeftOrRight(boolean leftOrRight) {
        this.leftOrRight = leftOrRight;
    }
    
}
