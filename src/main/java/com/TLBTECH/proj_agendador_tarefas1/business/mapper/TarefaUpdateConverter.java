package com.TLBTECH.proj_agendador_tarefas1.business.mapper;

import com.TLBTECH.proj_agendador_tarefas1.business.dto.TarefasDTO;
import com.TLBTECH.proj_agendador_tarefas1.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface TarefaUpdateConverter {

    void updateTarefas(TarefasDTO dto, @MappingTarget TarefasEntity entity);
}
