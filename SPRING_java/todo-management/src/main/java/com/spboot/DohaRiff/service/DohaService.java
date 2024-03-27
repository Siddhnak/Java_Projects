package com.spboot.DohaRiff.service;

import com.spboot.DohaRiff.dto.DohaDto;

import java.util.List;

public interface DohaService {

    DohaDto addDoha(DohaDto dohaDto);//creating a method in interface

    DohaDto getDoha(Long id);
//    return null;

    List<DohaDto> getAllDohas(); //Lets provide the implementation in IMPL class

    DohaDto updateDoha(DohaDto dohaDto,Long id);

}
