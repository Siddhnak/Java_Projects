package com.spboot.DohaRiff.controller;

import com.spboot.DohaRiff.dto.DohaDto;
import com.spboot.DohaRiff.entity.DohaEntity;
import com.spboot.DohaRiff.service.DohaService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //within this spring MVC rest controller we can define the rest APIs.
@RequestMapping ("api/dohas")// base url
@AllArgsConstructor  //since we using constructor based DI

public class DohaController {
//this class needs DohaService as dep
    private DohaService dohaService;

    //Build Add Doha REST api's

    @PostMapping //to map incoming http Post req to this method
    public ResponseEntity<DohaDto>addDoha(@RequestBody DohaDto dohaDto){    //Let us pass DohaDto as an argument to this method
        DohaDto savedDoha= dohaService.addDoha(dohaDto);
        return new ResponseEntity<>(savedDoha, HttpStatus.CREATED);
        /*Now we have created addTodo method that returns savedTodo object along with the HTTP status code.*/
    }

    //Building Get Doha REST API
    @GetMapping("{id}")
public ResponseEntity<DohaDto> getDoha(@PathVariable("id") Long dohaId){
    DohaDto dohaDto = dohaService.getDoha(dohaId);
    return new ResponseEntity<>(dohaDto,HttpStatus.OK);
}
@GetMapping
    //Building GetAll Doha REST API
        public ResponseEntity<List<DohaDto>> getAllDohas(){
        List<DohaDto> dohas=dohaService.getAllDohas();
//        return new ResponseEntity<>(dohas,HttpStatus.OK);
//another way
            return ResponseEntity.ok(dohas);//implicit call to OK
    }

    //Building Update Doha REST API
    @PutMapping("{id}")
    public ResponseEntity<DohaDto> updateDoha(@RequestBody DohaDto dohaDto,@PathVariable("id") Long dohaId){
      DohaDto updatedDoha= dohaService.updateDoha(dohaDto,dohaId);
    return ResponseEntity.ok(updatedDoha);
    }

}
