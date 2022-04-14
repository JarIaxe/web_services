import { Component, OnInit } from '@angular/core';
import { Persons } from '../mock-persons';
import { Student } from '../student';
import { StudentService } from '../student.service';
import { Location } from '@angular/common';

@Component({
  selector: 'app-list-user',
  templateUrl: './list-user.component.html',
  styleUrls: ['./list-user.component.css']
})
export class ListUserComponent implements OnInit {
  //persons = Persons;
  persons!: Student[];
  constructor(
    private studentService: StudentService,
    private location: Location
  ) { }

  ngOnInit(): void {
    this.studentService.getStudents().subscribe(students => this.persons = students)
  }

  deleteUser(id:number): void{
    console.log(id)
    window.location.reload
    //this.studentService.deleteUser(id);
  }

}
