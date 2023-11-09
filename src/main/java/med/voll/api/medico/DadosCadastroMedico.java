package med.voll.api.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroMedico(
        @NotBlank                //Bean validation o atributo n pode ser nullo nem vazio
        String nome,
        @NotBlank
        @Email                   //confirma se é um email
        String email,
        @NotBlank
        String telefone,
        @NotBlank
        @Pattern(regexp = "\\d{4,6}")      //expressão regular pra ter de 4 a 6 digitor na string crm
        String crm,
        @NotNull
        Especialidade especialidade,
        @NotNull
        @Valid                     // para validar os objetos que estão dentro do DadosEndereco
        DadosEndereco endereco) {
}
