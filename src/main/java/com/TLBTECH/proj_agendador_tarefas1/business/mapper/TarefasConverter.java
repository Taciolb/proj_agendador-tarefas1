package com.TLBTECH.proj_agendador_tarefas1.business.mapper;

import com.TLBTECH.proj_agendador_tarefas1.business.dto.TarefasDTO;
import com.TLBTECH.proj_agendador_tarefas1.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TarefasConverter {

    TarefasEntity paraTarefaEntity(TarefasDTO dto);

    TarefasDTO paraTarefaDTO(TarefasEntity entity);

}
