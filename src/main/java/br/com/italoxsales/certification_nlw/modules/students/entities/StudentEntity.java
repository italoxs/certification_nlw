package br.com.italoxsales.certification_nlw.modules.students.entities;

import java.util.List;
import java.util.UUID;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentEntity {

  private UUID id;
  private String email;
  private List<CertificationsStudentEntity> certificationStudentEntity;
}
