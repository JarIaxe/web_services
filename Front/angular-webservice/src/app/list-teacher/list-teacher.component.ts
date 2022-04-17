import { Component, OnInit } from '@angular/core';
import { Teacher } from '../teacher';
import { TeacherService } from '../teacher.service';

@Component({
  selector: 'app-list-teacher',
  templateUrl: './list-teacher.component.html',
  styleUrls: ['./list-teacher.component.css']
})
export class ListTeacherComponent implements OnInit {
  teachers!: Teacher[]
  constructor(
    private teacherService: TeacherService
  ) { }

  ngOnInit(): void {
    this.teacherService.getTeachers().subscribe(teachers => {this.teachers = teachers})
  }

  deleteUser(id:number): void{
    console.log(id)
    this.teacherService.deleteTeacher(id).subscribe(text => {
      console.log(text); 
    });
    
  }

}
