import { Component, OnInit, Input } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Student } from '../student';
import { Persons } from '../mock-persons';

@Component({
  selector: 'app-modify-user',
  templateUrl: './modify-user.component.html',
  styleUrls: ['./modify-user.component.css']
})
export class ModifyUserComponent implements OnInit {
  static persons = Persons;
  stud!: Student;
  constructor(
    private route : ActivatedRoute,
  ) { }

  ngOnInit(): void {
    this.getPerson();
    console.log(this.stud);
  }

  getPerson(): void {
    const id = Number(this.route.snapshot.paramMap.get('id'));
    ModifyUserComponent.persons.forEach(student => {
      if (student.id == id) {
        this.stud = student
      }
    });
  }
}
