import { Component, OnInit } from '@angular/core';
import { Student } from '../student';
import { StudentService } from '../student.service';
import { Location } from '@angular/common';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-list-user',
  templateUrl: './list-user.component.html',
  styleUrls: ['./list-user.component.css']
})
export class ListUserComponent implements OnInit {
  persons!: Student[];
  constructor(
    private route : ActivatedRoute,
    private studentService: StudentService,
  ) { }

  ngOnInit(): void {
    this.studentService.getStudents().subscribe(students => {this.persons = students, console.log(this.persons)})
  }

  deleteUser(id:number): void{
    console.log(id)
    this.studentService.deleteUser(id).subscribe(text => {
      console.log(text); 
    });
    
  }

}
