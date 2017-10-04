/*****************************************************
***  Class Name: BTreeBuild
***  Class Author: Gabriel Winkler
******************************************************
*** Purpose of the class: This class will initialize variables to be used with
*** the other classes.
******************************************************
*** Date: October 2nd, 2017
******************************************************
*** List of changes with dates:
*** October 2nd:  - Create the BTreeBuild class.
***               - Changed temp to word.
*******************************************************/
package WordSortAndCount;

/**
 *
 * @author Gabriel
 */
public class BTreeBuild {
    public String value;
    public int count;
    public BTreeBuild left;
    public BTreeBuild right;
    
    public void setValue(String word)
    {
        this.value = word;
        count = 1;
    }
}
