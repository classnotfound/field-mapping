package net.classnotfound.fieldmapping;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMapping {

    @Test
    public void testSuccess() {
        Foo bar = Foo.builder().info("info").build();
        FooDto foo = FooMapper.INSTANCE.toDto(bar);
        Assertions.assertEquals("info", foo.getInfo());
    }

    @Test
    public void testFailed() {
        Foo bar = Foo.builder().addInfo("addinfo").build();
        FooDto foo = FooMapper.INSTANCE.toDto(bar);
        Assertions.assertEquals("addinfo", foo.getAddInfo());
    }

}
