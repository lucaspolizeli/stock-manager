package br.com.ftt.stockmanager.dto.provider;

import br.com.ftt.stockmanager.model.Provider;
import lombok.Data;

@Data
public class ProviderResponseDTO {
    private Long id;
    private String name;
    private String cnpj;
    private String address;

    public static ProviderResponseDTO parse(Provider providerToParse) {
        var provider = new ProviderResponseDTO();

        provider.setId(providerToParse.getId());
        provider.setName(providerToParse.getName());
        provider.setAddress(providerToParse.getAddress());
        provider.setCnpj(providerToParse.getCnpj());

        return provider;
    }
}
