import model.Towel;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
public class MovementsTest {
    @Test
    public void TestMovementsMethod() {

//        1 disk
        Towel rook1 = new Towel(1);
        assertEquals(1, rook1.numberMoviments());

//        2 disks
        Towel rook2 = new Towel(2);
        assertEquals(3, rook2.numberMoviments());

//        3 disks
        Towel rook3 = new Towel(3);
        assertEquals(7, rook3.numberMoviments());

//        4 disks
        Towel rook4 = new Towel(4);
        assertEquals(15, rook4.numberMoviments());

//        5 disks
        Towel rook5 = new Towel(5);
        assertEquals(31, rook5.numberMoviments());

//        6 disks
        Towel rook6 = new Towel(6);
        assertEquals(63, rook6.numberMoviments());
    }
}
