package test;
import main.ExCuteCmd;
import main.resources.ArgsRead;
import org.junit.Test;

import java.util.List;

import static  org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
public class ExcuteCmdTest
{
@Test
    public void testExcute() throws Exception {
    ArgsRead argsRead = new ArgsRead("testData.txt");
    List list = argsRead.getCMD();
    ExCuteCmd exCuteCmd = new ExCuteCmd();
    String ret = exCuteCmd.excute(list);
    assertEquals( exCuteCmd.excute(list),"收费6元\n" +
            "收费7元\n" +
            "收费13元\n" +
            "收费7元\n");
    System.out.println(ret);

}
}
