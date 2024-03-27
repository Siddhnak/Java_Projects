package com.spboot.DohaRiff.service.impl;

import com.spboot.DohaRiff.dto.DohaDto;
import com.spboot.DohaRiff.entity.DohaEntity;
import com.spboot.DohaRiff.repository.DohaRepository;
import com.spboot.DohaRiff.service.DohaService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor //toCreate param constructor
public class DohaServiceImpl implements DohaService {

    private DohaRepository dohaRepository;


  // Step 3Injecting the modelmapper object..
    private ModelMapper modelMapper;

    @Override
    public DohaDto addDoha(DohaDto dohaDto) {
        //first convert DohaDto into Todo entity.
//        DohaEntity dohaEntity = new DohaEntity();
//        dohaEntity.setTitle(dohaDto.getTitle());
//        dohaEntity.setDescription(dohaDto.getDescription());
//        dohaEntity.setSource(dohaDto.getSource());
//        dohaEntity.setAuthor(dohaDto.getAuthor());
//        dohaEntity.setUserComments(dohaDto.getUserComments());
//        dohaEntity.setIscompleted(dohaDto.isCompleted());

        //In a single line.. we converted Doha dto to entity
        DohaEntity dohaEntity = modelMapper.map(dohaDto, DohaEntity.class);  //commented the above due this line

        //save doha entity to db
        DohaEntity savedDoha = dohaRepository.save(dohaEntity);  //a1
        // let us call save method and then pass to entity object


// convert savedDoha JPA entity object into DohaDto
//        DohaDto savedDohaDto = new DohaDto();
//        savedDohaDto.setId(savedDoha.getId());
//        savedDohaDto.setTitle(savedDoha.getTitle());
//        savedDohaDto.setDescription(savedDoha.getDescription());
//        savedDohaDto.setSource(savedDoha.getSource());
//        savedDohaDto.setAuthor(savedDohaDto.getAuthor());
//        savedDohaDto.setUserComments(savedDohaDto.getUserComments());
        DohaDto savedDohaDto = modelMapper.map(savedDoha,DohaDto.class);
        return savedDohaDto;
    }

    @Override
    public DohaDto getDoha(Long id) {
    DohaEntity dohaEntity= dohaRepository.findById(id).get();

        return modelMapper.map(dohaEntity,DohaDto.class);
    }

    @Override
    public List<DohaDto> getAllDohas() {
        List<DohaEntity>dohaEntities =dohaRepository.findAll();

        return dohaEntities.stream().map((dohaEntity) -> modelMapper.map(dohaEntity,DohaDto.class)).collect(Collectors.toList());
    }

    @Override
    public DohaDto updateDoha(DohaDto dohaDto, Long id) {
       DohaEntity dohaEntity =  dohaRepository.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,"Doha Doesn't exist with the given ID: "+id));

//       dohaEntity.setTitle(dohaDto.getTitle());
//       dohaEntity.setAuthor(dohaDto.getAuthor());
//       dohaEntity.setSource(dohaEntity.getSource());
//       dohaEntity.setDescription(dohaEntity.getDescription());
//       dohaEntity.setUserComments(dohaEntity.getUserComments());

        // Update the properties of the DohaEntity with the values from dohaDto
        //Below by miss
        if (dohaDto.getTitle() != null) {
            dohaEntity.setTitle(dohaDto.getTitle());
        }
        if (dohaDto.getAuthor() != null) {
            dohaEntity.setAuthor(dohaDto.getAuthor());
        }
        if (dohaDto.getSource() != null) {
            dohaEntity.setSource(dohaDto.getSource());
        }
        if (dohaDto.getDescription() != null) {
            dohaEntity.setDescription(dohaDto.getDescription());
        }
        if (dohaDto.getUserComments() != null) {
            dohaEntity.setUserComments(dohaDto.getUserComments());
        }

      DohaEntity updatedDoha =  dohaRepository.save(dohaEntity);
      //Both insert and update can be performed.([See in Doha Entity and notes too] primary key..)


        return modelMapper.map(updatedDoha,DohaDto.class);
    }

}
//     ERROR -: "a1"     DohaEntity savedDoha = DohaRepository.save(dohaEntity);
//        "Non-static method 'save(S)' cannot be referenced from a static context"
/*
Soln-:
In your code snippet, you're trying to call the .save() method directly on the DohaRepository class itself, which is causing the error. Instead, you should call it on an instance of DohaRepository, which is typically injected via dependency injection.
*/

