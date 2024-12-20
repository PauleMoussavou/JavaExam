package exam.example.services;

import exam.example.entity.Cours;
import exam.example.repository.CoursRepository;

public class CoursService {
    private CoursRepository coursRepository;

    public CoursService(CoursRepository coursRepository) {
        this.coursRepository = coursRepository;
    }

    public void createCours(String nom, String professeur, String module) {
        Cours cours = new Cours(nom, professeur, module);
        coursRepository.addCours(cours);
        System.out.println("Cours créé avec succès !");
    }
