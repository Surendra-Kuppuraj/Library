package com.library.mapper;

import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;

public final class MappingConverter {

  private static final ModelMapper mapper = new ModelMapper();

  public static <S, D> List<D> mapListConverter(final List<S> sourceList,
      final Class<D> destinationClass) {
    return sourceList.stream().map(entity -> entityConverter(entity, destinationClass))
        .collect(Collectors.toList());
  }

  public static <S, D> D entityConverter(final S entity, final Class<D> destinationClass) {
    return mapper.map(entity, destinationClass);
  }
}
