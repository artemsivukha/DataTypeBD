package ru.example.conrtoller;

import org.springframework.web.bind.annotation.*;
import ru.example.dto.RangeDto;
import ru.example.dto.TypeDto;
import ru.example.model.Range;
import ru.example.model.Type;
import ru.example.repository.RangeRepository;
import ru.example.repository.TypeRepository;
import java.util.List;

@RestController
@RequestMapping ("/datatype")
public class TypeController {

    private final TypeRepository typeRepository;
    private final RangeRepository rangeRepository;

    public TypeController(TypeRepository typeRepository, RangeRepository rangeRepository) {
        this.typeRepository = typeRepository;
        this.rangeRepository = rangeRepository;
    }

    @GetMapping
    public List<Type> getTypes(){
        return typeRepository.findAll();
    }

    @GetMapping("{id}")
    public TypeDto getType(@PathVariable Long id){
        Type type = typeRepository.findById(id).orElseThrow(() -> new RuntimeException());
        TypeDto typeDto = new TypeDto();
        typeDto.setName(type.getName());
        typeDto.setType(type.getType());
        if (type.getRange() != null) {
            Range range = type.getRange();
            RangeDto rangeDto = new RangeDto();
            if (range.getBt() != null){
                rangeDto.setBt(range.getBt());
            }
            if (range.getMn() != null){
                rangeDto.setMn(range.getMn());
            }
            if (range.getMx() != null){
                rangeDto.setMx(range.getMx());
            }
            rangeDto.setDt(range.getDt());
            typeDto.setRangeDto(rangeDto);
        }
        return typeDto;
    }

    @PostMapping
    public void createType(@RequestBody TypeDto typeDto){

        RangeDto rangeDto = typeDto.getRangeDto();
        Range range = new Range();
        range.setBt(rangeDto.getBt());
        range.setMn(rangeDto.getMn());
        range.setMx(rangeDto.getMx());
        range.setDt(rangeDto.getDt());
//        Range newRange = rangeRepository.save(range);


        Type type = new Type();
        type.setType(typeDto.getType());
        type.setName(typeDto.getName());
        type.setRange(range);
        typeRepository.save(type);
    }
}
