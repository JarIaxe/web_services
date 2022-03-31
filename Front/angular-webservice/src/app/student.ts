import { Cours } from "./cours";
import { Person } from "./person";

export interface Student extends Person{
    list_cours: Cours[];
}

let stud : Student;