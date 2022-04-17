import { Component, OnInit } from '@angular/core';
import { StudentService } from '../student.service';

@Component({
  selector: 'app-new-student',
  templateUrl: './new-student.component.html',
  styleUrls: ['./new-student.component.css']
})
export class NewStudentComponent implements OnInit {

  constructor(
    private studentService: StudentService
  ) { }

  ngOnInit(): void {
  }

  public newStudent(nom:string, prenom: string,cursus: string, site: string, mail: string):void {
    this.studentService.newStudent(nom, prenom, cursus, site, mail);
  }

}
