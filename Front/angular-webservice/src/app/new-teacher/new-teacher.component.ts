import { Component, OnInit } from '@angular/core';
import { TeacherService } from '../teacher.service';

@Component({
  selector: 'app-new-teacher',
  templateUrl: './new-teacher.component.html',
  styleUrls: ['./new-teacher.component.css']
})
export class NewTeacherComponent implements OnInit {

  constructor(
    private teacherService: TeacherService
  ) { }

  ngOnInit(): void {
  }

  newTeacher(nom:string, prenom:string, site:string, mail:string): void{
    this.teacherService.newTeacher(nom, prenom, site,mail)
    //window.location.href="../"
  }
}
