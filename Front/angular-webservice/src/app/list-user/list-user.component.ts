import { Component, OnInit } from '@angular/core';
import { Persons } from '../mock-persons';
import { Student } from '../student';
import { StudentService } from '../student.service';

@Component({
  selector: 'app-list-user',
  templateUrl: './list-user.component.html',
  styleUrls: ['./list-user.component.css']
})
export class ListUserComponent implements OnInit {
  persons!: Student[];
  constructor(
    private studentService: StudentService
  ) { }

  ngOnInit(): void {
    this.studentService.getStudents().subscribe(students => this.persons = students)
  }

}
