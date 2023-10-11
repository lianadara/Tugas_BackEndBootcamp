package com.multipolar.bootcamp.kyc.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Document
public class Customer implements Serializable {
    @Id
    private String id;
    @NotEmpty(message = "Task cannot be empty")
    private String nik;
    @NotEmpty(message = "Task cannot be empty")
    private String firstName;
    private String lastName;
    @NotEmpty(message = "Task cannot be empty")
    private String email;
    @NotEmpty(message = "Task cannot be empty")
    private String phoneNumber;
//    @NotNull(message = "Task cannot be empty")
    private LocalDate dateOfBirth;
}
