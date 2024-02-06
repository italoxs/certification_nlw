package br.com.italoxsales.certification_nlw.modules.students.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.italoxsales.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;
import br.com.italoxsales.certification_nlw.modules.students.useCases.VerifyIfHasCertificationUseCase;

@RestController
@RequestMapping("/students")
public class StudentController {

  @Autowired
  private VerifyIfHasCertificationUseCase verifyIfHasCertificationUseCase;
  
  @PostMapping("/verifyIfHasCertification")
  public String verifyIfHasCertification(@RequestBody VerifyHasCertificationDTO verifyHasCertificationDTO) {
    var result = this.verifyIfHasCertificationUseCase.execute(verifyHasCertificationDTO);
    if(result) {
      return "Usuario ja fez a prova";
    }
      return "Usuario pode fazer a prova";
  }
}
