import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Person {
    @NotBlank(message = "Name cannot be blank")
    @Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters")
    private String name;

    @NotBlank(message = "title cannot be blank")
    private String title;

    @Min(value = 18, message = "age must be no less than 18")
    private int age;

    @NotBlank(message = "Position cannot be blank")
    private String position;

    @NotBlank(message = "Deaptment cannot be blank")
    private String department;

    @NotBlank(message = "employeid cannot be blank")
    private String employeeid;
}
