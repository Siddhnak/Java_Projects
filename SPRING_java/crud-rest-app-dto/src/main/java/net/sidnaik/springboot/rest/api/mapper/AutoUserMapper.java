package net.sidnaik.springboot.rest.api.mapper;

import net.sidnaik.springboot.rest.api.dto.UserDto;
import net.sidnaik.springboot.rest.api.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AutoUserMapper {

    AutoUserMapper MAPPER= Mappers.getMapper(AutoUserMapper.class);  //something he said mapperfactory

    UserDto mapToUserDto(User user);

    User mapToUser(UserDto userDto);

}
