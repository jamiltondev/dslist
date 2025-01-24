package com.estudo.dslist.dto;

import com.estudo.dslist.entities.Belonging;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReplacemantDTO {

    private Integer sourceIndex;
    private Integer destinationIndex;

}
