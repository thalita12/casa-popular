package br.com.thalita.casapopular.familia.service;

import br.com.thalita.casapopular.familia.business.FamiliaAptaBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/familias-aptas")
public class FamiliaAptaService {

    @Autowired
    private FamiliaAptaBO familiaAptaBO;

    @RequestMapping(method = RequestMethod.GET)
    public Object buscarTodos() {
        return familiaAptaBO.buscarTodas();
    }

}
