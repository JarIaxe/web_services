import { Person } from "./person";
import { Student } from "./student";

export const Persons: Student[] = [
    { 
        id : 1, 
        nom : "Bossard", 
        prenom: "Louis-Marie", 
        age: 22, 
        mail: "lmbossard@groupe-isia.com",
        list_cours: [
            {
                nom_cours: "Test"
            },
            {
                nom_cours: "Test"
            },
            {
                nom_cours: "Test"
            },
        ]
    },
    { 
        id : 2, 
        nom : "Santigny", 
        prenom: "Maurine", 
        age: 25, 
        mail: 'msantigny@groupe-isia.com',
        list_cours: []
    },
    { 
        id : 3, 
        nom : "Ferragut", 
        prenom: "Lucas", 
        age: 24, 
        mail: "lferragut@groupe-isia.com",
        list_cours: []
    },
]