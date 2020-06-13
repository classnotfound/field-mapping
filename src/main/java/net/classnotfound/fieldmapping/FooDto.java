package net.classnotfound.fieldmapping;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FooDto {

    private String info;

    private String addInfo;
}
