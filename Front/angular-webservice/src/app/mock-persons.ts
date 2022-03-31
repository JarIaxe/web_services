import { Person } from "./person";
import { Student } from "./student";

export const Persons: Student[] = [
    { 
        id : 1, 
        nom : "Bossard", 
        prenom: "Louis-Marie", 
        age: 22, 
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
        list_cours: []
    },
    { 
        id : 3, 
        nom : "Ferragut", 
        prenom: "Lucas", 
        age: 24, 
        list_cours: []
    },
]