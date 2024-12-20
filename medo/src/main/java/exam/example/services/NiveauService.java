package exam.example.services;

import exam.example.entity.Niveau;
import exam.example.repository.NiveauRepository;

public class NiveauService {
    private NiveauRepository niveauRepository;

    public NiveauService(NiveauRepository niveauRepository) {
        this.niveauRepository = niveauRepository;
    }

    
    public void createNiveau(String nom) {
        Niveau niveau = new Niveau(nom);
        niveauRepository.addNiveau(niveau);
        System.out.println("Niveau créé avec succès !");
    }