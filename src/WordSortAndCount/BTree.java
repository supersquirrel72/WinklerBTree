/*****************************************************
***  Class Name: BTree
***  Class Author: Gabriel Winkler
******************************************************
*** Purpose of the class: This class will take the file from the GUI and 
*** add the words to a Binary Tree, sort them, count them and print them to 
*** the GUI.
******************************************************
*** Date: October 2nd, 2017
******************************************************
*** List of changes with dates:
*** October 2nd: Create the BTree class.
***               - Fix the global variable issue for BTreeBuild temp.
*** September 26th: Re-do the addBut button.
***               - Set circle to return an answer.
***               - Took out the Display button.
*******************************************************/
package WordSortAndCount;

/**
 *
 * @author Gabriel
 */
public class BTree {
    //first, need class "BTree". Go make the class, then come back.
    private BTreeBuild root;
        //need a method to add nodes
/*****************************************************
***  Method Name: addNode
***  Method Author: Gabriel Winkler
******************************************************
*** Purpose: This method will add a node to the tree based on the results
*** from the recAdd method.
******************************************************
*** Date: October 2nd, 2017
     * @param nodeValue
*****************************************************/
    public void addNode(String nodeValue)
    {// create 'temp
        //Is root null? If not, call another method.
        BTreeBuild temp = new BTreeBuild();
        //temp.value = nodeValue;
        temp.setValue(nodeValue);
        if(root == null)
        {
            root = temp;
        }
        else
        {
            recAdd(root, temp);
        }
    }
/*****************************************************
***  Method Name: recAdd
***  Method Author: Gabriel Winkler
******************************************************
*** Purpose: This method will add a node to the tree as long as the
*** text file is not empty.
******************************************************
*** Date: October 2nd, 2017
*****************************************************/
    private void recAdd(BTreeBuild curNode, BTreeBuild temp)
    {
        if(temp.value.compareTo(curNode.value) < 0)
        {
            if(curNode.left==null)
            {
            curNode.left = temp;
            }
            else
            {
            recAdd(curNode.left, temp);
            }
        }
        else if(temp.value.compareTo(curNode.value) > 0)
        {
        if(curNode.right==null)
            {
            curNode.right = temp;
            }
            else
            {
            recAdd(curNode.right, temp);
            }
        }
        else
        {
            curNode.count++;
        }
    }
/*****************************************************
***  Method Name: printOut
***  Method Author: Gabriel Winkler
******************************************************
*** Purpose: This method will call the results of the recPrintOut method.
******************************************************
*** Date: October 2nd, 2017
*****************************************************
*** Changes: 
*** October 3rd - I changed the method to only have one if statement instead
***               of two.
     * @return 
*****************************************************/
    public String printOut()
    {
    //Code to follow... Go do recPrintOut
        return recPrintOut(root);
    }
    private String recPrintOut(BTreeBuild cur)
    {
        String tmp = "";
        if(cur != null)
        {
            tmp += recPrintOut(cur.left);
            tmp += cur.value;
            tmp += "....." + cur.count + ", ";
            tmp += recPrintOut(cur.right);
        }
        return tmp;
    }
    
    
}
