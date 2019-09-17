import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Tests {

    @Test
    public void linearTest(){
        assertTrue(Double.isInfinite(AssignmentOne.linearProblem(0,2,3)));
        assertEquals(3.5,AssignmentOne.linearProblem(2,-3,4),.01);
    }
    @Test
    public void quadratic(){
        double[] testarray = AssignmentOne.quadraticProblem(1,1,-6,0);
        assertTrue(testarray[0] == 2);
        assertEquals(2,testarray[1],0.1);
        assertEquals(-3,testarray[2],0.1);
        testarray = AssignmentOne.quadraticProblem(1,-4,7,0);
        assertTrue(testarray[0] == 0);

    }
    @Test
    public void cuberootPositive(){
        assertEquals(3,AssignmentOne.cubeRoot(27),.001);

    }
    @Test
    public void cuberootnegative(){

        assertEquals(-3,AssignmentOne.cubeRoot(-27),.001);
    }
}
