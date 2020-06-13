package net.classnotfound.fieldmapping;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMapping {

    public static final String ADDINFO = "addinfo";
    public static final String INFO = "info";

    @Test
    public void testSuccess() {
        Foo bar = Foo.builder().info(INFO).build();
        FooDto foo = FooMapper.INSTANCE.toDto(bar);
        Assertions.assertEquals("info", foo.getInfo());
    }

    @Test
    public void testFailed() {
        Foo bar = Foo.builder().addInfo("addinfo").build();
        FooDto foo = FooMapper.INSTANCE.toDto(bar);
        Assertions.assertEquals(ADDINFO, foo.getAddInfo());
    }

}
