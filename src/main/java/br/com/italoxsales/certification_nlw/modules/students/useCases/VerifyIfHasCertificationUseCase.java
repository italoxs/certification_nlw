package br.com.italoxsales.certification_nlw.modules.students.useCases;

import org.springframework.stereotype.Service;

import br.com.italoxsales.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;

@Service
public class VerifyIfHasCertificationUseCase {
  
  public boolean execute( VerifyHasCertificationDTO dto ) {
    if(dto.getEmail().equals("italo@teste.com") && dto.getTechnology().equals("JAVA")) {
      return true;
    }
    return false;
  }
}
