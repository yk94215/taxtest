package test;
import main.Cmd;
import main.resources.ArgsRead;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.ListIterator;

import static  org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
public class ArgsReadTest {
    @Test
    public void testGetCMD() throws Exception {
        ArgsRead argsRead = new ArgsRead("testData.txt");
        List list = argsRead.getCMD();
        Cmd cmd= (Cmd) list.get(0);
        assertEquals(cmd.getDistance(),123);
        assertEquals(cmd.getWating(),0);
        Cmd cmd2= (Cmd) list.get(9);
        assertEquals(cmd2.getDistance(),123);
        assertEquals(cmd2.getWating(),10);
    }
}