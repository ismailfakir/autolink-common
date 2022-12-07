package net.cloudcentrik.autolink.common;

import net.cloudcentrik.autolink.common.identifier.Pid;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PidTest {

    @Test
    public void testCreate()
    {
        Pid pid = Pid.create();
        assertEquals("autolink",pid.getDomain());
    }
}
