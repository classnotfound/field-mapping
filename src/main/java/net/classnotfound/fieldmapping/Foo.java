package net.classnotfound.fieldmapping;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Foo {

    private String info;

    private String addInfo;
}
