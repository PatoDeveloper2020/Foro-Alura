package foro.hub.api.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroTopico(
        @NotNull String idAutor,
        @NotBlank(message = "Debe ingresar un mensaje")
        String mensaje,
        @NotBlank(message = "Debe imgresar el nombre del curso")
        String nombreCurso,
        @NotBlank(message = "Debe ingresar el titulo")
        String titulo
) {
}
