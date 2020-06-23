package br.com.ftt.stockmanager.dto.provider;

import br.com.ftt.stockmanager.model.Provider;
import lombok.Data;
import org.modelmapper.ModelMapper;

@Data
public class ProviderResponseDTO {
    private Long id;
    private String name;
    private String cnpj;
    private String address;

    public static ProviderResponseDTO parse(Provider providerToParse) {
        var modelMapper = new ModelMapper();
        return modelMapper.map(providerToParse, ProviderResponseDTO.class);
    }
}
