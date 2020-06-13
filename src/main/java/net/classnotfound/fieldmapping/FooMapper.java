package net.classnotfound.fieldmapping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FooMapper {

    FooMapper INSTANCE = Mappers.getMapper(FooMapper.class);

    //@Mapping(source="addInfo", target="addInfo") //->Unknown property "addInfo" in result type net.classnotfound.fieldmapping.FooDto. Did you mean "null"?
    FooDto toDto(Foo foo);
}
