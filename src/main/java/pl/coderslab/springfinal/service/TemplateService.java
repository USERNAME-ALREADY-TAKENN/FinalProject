package pl.coderslab.springfinal.service;

import org.springframework.stereotype.Service;
import pl.coderslab.springfinal.entity.Publication;
import pl.coderslab.springfinal.entity.Template;
import pl.coderslab.springfinal.entity.User;

import java.util.List;
import java.util.Set;

public interface TemplateService {
    public void save(Template template);
    public void delete (Template template);
    public Template findOneById(Long id);
    public Template findOneByName(String name);
    public List<Template> findAll();
    public List<Template> findAllWithUser();
    public List<Template> findAllWithThisUser(User user);
    public List<Template> findAllWithThisPublication(Publication publication);

    public Template findOneByIdWithAllData(Long id);
    public Set<Template> findAllWithAllData();
    int countAllByUserId(long id);
    //find by created date
    //find by updated date
}